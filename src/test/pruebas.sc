val p = "casa"
type Palabra = String
type Frase = List[Palabra]
type Ocurrencias = List[(Char, Int)]

val a = "casa"

p.groupBy((x: Char) => x).toList.map( (x:Char,y:String) => (x,y.length))

for {
  (char, group) <- p.groupBy((x: Char) => x).toList
} yield (char, group.length)