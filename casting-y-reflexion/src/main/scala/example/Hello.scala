package example

import scala.io._

object Hello extends App 
{
    println("Digite el nombre de la clase relacionada con aves")
    var nombreClase : String = StdIn.readLine()
    val foo = Class.forName(nombreClase)  
    val bar = foo.newInstance(); //val bar : Object = foo.newInstance()
    val ter = bar.asInstanceOf[Ave]
    println(foo)
    println(bar)
    // bar.volar(4)
    println(ter)
    ter.volar(3)
}
