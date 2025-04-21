import Anagramas ._

//PALABRAS PARA EL USO DE LAS PRUEBAS
val p1 = "abcdefghijklmnñopqrstuvwxyz"
val p2 = "camaron"
val p3 = "roncama"
val p4 = ""
val p5 = "y"
val p6 = "aaaa"


// CASOS DE PRUEBA PARA lOcPal
lOcPal(p1)  //Valor esperado: List((a,1),(b,1)....(z,1)
lOcPal(p2)  //Valor esperado: List((n,1), (a,2), (m,1), (c,1), (r,1), (o,1))
lOcPal(p3)  //Valor esperado:  List((n,1), (a,2), (m,1), (c,1), (r,1), (o,1))
lOcPal(p4)  //Valor esperado: List()
lOcPal(p5)  //Valor esperado: List((y,1))
lOcPal(p6)  //Valor esperado: List((a,4))

//CASOS DE PRUBEA PARA complemento

//OCURRENCIAS PARA EL USO DE LAS PRUEBAS
val o1 = lOcPal("camaron")
val o2 = lOcPal("ron")
val o6 = lOcPal("cama")
val o3 = lOcPal("")
val o4 = lOcPal("camaron")
val o5:Ocurrencias = List(('m',1), ('c',1), ('n',1), ('a',2), ('o',1), ('r',1))

complemento(o1,o2) //Valor esperado:List((a,2), (m,1), (c,1))
complemento(o1,o6) //valor esperado: List((n,1), (r,1), (o,1))
complemento(o1,o3) //Valor esperado:List((n,1), (a,2), (m,1), (c,1), (r,1), (o,1))
complemento(o1,o4) //valor esperado: List()
complemento(o1,o5) //valor esperado: List()


//CASOS DE PRUBEA PARA anagramaDeFrase

//FRASES PARA EL USO DE LAS PRUEBAS
val f1:Frase = List("sos","como","yo")
val f2:Frase = List("cosas", "como", "yo", "y", "ocasos")

val f3:Frase = List("roca","sos")

val f4:Frase = List("roca","lupa")
val f5:Frase = List("cayo","yaco")

val f6:Frase = List("como","como")
val f7:Frase = List("sos","sos","sos")

val f8:Frase = List()

val f9:Frase = List("mocosos")
val f10:Frase = List("sos")

val anagramaf1 = anagramasDeFrase(f1)
anagramaf1.forall(p => lOcFrase(p) == lOcFrase(f1)) // verifica que para toda ocurrencia de
// cada frase del anagrama se cumpla que son iguales a la ocurrencia de la frase original,
// de ser asi entonces si son anagramas. (aplica para todos los anagramas y a continuació)

val anagramaf2 = anagramasDeFrase(f2)
anagramaf2.forall(p => lOcFrase(p) == lOcFrase(f2))

val anagramaf3 = anagramasDeFrase(f3)
anagramaf3.forall(p => lOcFrase(p) == lOcFrase(f3))

val anagramaf4 = anagramasDeFrase(f4)
anagramaf4.forall(p => lOcFrase(p) == lOcFrase(f4))

val anagramaf5 = anagramasDeFrase(f5)
anagramaf5.forall(p => lOcFrase(p) == lOcFrase(f5))

val anagramaf6 = anagramasDeFrase(f6)
anagramaf6.forall(p => lOcFrase(p) == lOcFrase(f6))

val anagramaf7 = anagramasDeFrase(f7)
anagramaf7.forall(p => lOcFrase(p) == lOcFrase(f7))

val anagramaf8 = anagramasDeFrase(f8)
anagramaf8.forall(p => lOcFrase(p) == lOcFrase(f8))

val anagramaf9 = anagramasDeFrase(f9)
anagramaf9.forall(p => lOcFrase(p) == lOcFrase(f9))

val anagramaf10 = anagramasDeFrase(f10)
anagramaf10.forall(p => lOcFrase(p) == lOcFrase(f10))


