package optionTry

import clases._

object tiposGenericos extends App
{
    var pila1 : Pila[Int] = new Pila
    pila1.push(3)
    pila1.push(7)
    pila1.push(6)
    pila1.push(4)
    pila1.imprimir()

    var pila2 : Pila[String] = new Pila
    pila2.push("Pollo")
    pila2.push("Condor")
    pila2.push("Aguila")
    pila2.imprimir()

    var pila3 : Pila[Persona] = new Pila
    pila3.push(new Persona("Andrés", 15))
    pila3.push(new Persona("Santiago", 20))
    pila3.push(new Persona("Lucia", 3))
    pila3.imprimir()
}

