package object Anagramas {

  type Palabra = String
  type Frase = List[Palabra]
  type Ocurrencias = List[(Char, Int)]

  val diccionario: List[Palabra] = List("cosas", "como", "yo", "y", "ocasos", "cayo", "mocosos", "roca", "moco", "sos")

  def lOcPal(p: Palabra): Ocurrencias = {
    for {
      (char, group) <- p.groupBy((x: Char) => x).toList
    } yield (char, group.length)
  }

  def lOcFrase(f: Frase): Ocurrencias = {
    val fraseAplanada =
      (for {
        palabra <- f
        character <- palabra
        if (character != ' ')
      } yield character).mkString;
    lOcPal(fraseAplanada)
  }

  lazy val diccionarioPorOcurrencia: Map[Ocurrencias, List[Palabra]] = diccionario.groupBy(x => lOcPal(x))
  
  def anagramasDePalabra(palabra: Palabra): List[Palabra] = diccionarioPorOcurrencia.getOrElse(lOcPal(palabra), List())
  
  
  def combinaciones(locurrencias: Ocurrencias): List[Ocurrencias] = locurrencias match{
      case Nil => List(Nil)
      case (char,count):: tail =>

        val tailCombinations = combinaciones(tail)

        val firstCombination = for{
          n <- 1 to count
        }yield (char, n)

        val addedCombinations = for {
          combination <- tailCombinations
          option <- firstCombination
        } yield option :: combination

        addedCombinations ++ tailCombinations
    }

  def complemento(lOc: Ocurrencias, slOC: Ocurrencias): Ocurrencias = {
    val slOCMap = slOC.toMap
    for {
      (char, count) <- lOc
      newCount = count - slOCMap.getOrElse(char, 0)
      if newCount != 0
    } yield (char, newCount)
  }

  def anagramasDeFrase(frase: Frase): List[Frase] = {

    val fraseOcurrencias = lOcFrase(frase)

    def aux(ocurrencias: Ocurrencias): List[Frase] = {
      if (ocurrencias.isEmpty) List(Nil)
      else {
        for {
          combinacion <- combinaciones(ocurrencias)
          palabras <- diccionarioPorOcurrencia.getOrElse(combinacion, Nil)
          resto <- aux(complemento(ocurrencias, combinacion))
        } yield palabras :: resto
      }
    }

    aux(fraseOcurrencias)
  }
}
