package object Anagramas {

  type Palabra = String
  type Frase = List[Palabra]
  type Ocurrencias = List[(Char, Int)]

  val diccionario: List[Palabra] = List("cosas", "como", "yo", "y", "ocasos", "cayo", "mocosos", "roca", "moco", "sos")

  def lOcPal(p: Palabra): Ocurrencias = {
    (for {
      (char, group) <- p.groupBy((x: Char) => x).toList
    } yield (char, group.length)).distinct
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

  lazy val diccionarioPorOcurrencia: Map[Ocurrencias, List[Palabra]] = {
    for {
      (conjuntoPalabras, ocurrencias) <- diccionario.groupBy(x => lOcPal(x).toSet)
    } yield (conjuntoPalabras.toList, ocurrencias)
  }

  def anagramasDePalabra(pal: Palabra): List[Palabra] = {
    (for {
      lista <- diccionarioPorOcurrencia.get(lOcPal(pal))
    } yield lista).getOrElse(List())
  }

  def combinaciones(locurrencias: Ocurrencias): List[Ocurrencias] = {
    List()
  }

  def complemento(lOc: Ocurrencias, slOC: Ocurrencias): Ocurrencias = {
    List(('a', 2))
  }

  def anagramasDeFrase(sentence: Frase): List[Frase] = {
    List()
  }
}
