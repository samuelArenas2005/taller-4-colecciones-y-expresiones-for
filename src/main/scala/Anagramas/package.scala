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

  def lOcFrase(f: Frase): Ocurrencias = List(('a', 2))

  lazy val diccionarioPorOcurrencias: Map[Ocurrencias, List[Palabra]] = {
    Map()
  }

  def anagramasDePalabra(palabra: Palabra): List[Palabra] = {
    List()
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
