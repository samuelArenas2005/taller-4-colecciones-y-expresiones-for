import Anagramas ._
diccionarioPorOcurrencia

val sentence = List("moco","sos")

val setenceOcurrence = lOcFrase(sentence)

val combinationsOcurrences = combinaciones(setenceOcurrence)

val a = "aabb"

val b = "ab"

complemento(lOcPal(a),lOcPal(b))

combinaciones(lOcPal(a))

diccionarioPorOcurrencia

lOcPal("zcasozs")
lOcPal("soscazz")

anagramasDePalabra("coom")



anagramasDeFrase(sentence)

val c = List("mocosos")

combinaciones(lOcFrase(c))

def ocurrenceToString(ocurrencias: Ocurrencias): String = ocurrencias match{
  case Nil => ""
  case (char,count)::tail => char.toString*count + ocurrenceToString(tail)
}

val d = ocurrenceToString(lOcFrase(c))

anagramasDePalabra(d)

"a" :: Nil

anagramasDePalabra("como")

diccionarioPorOcurrencia