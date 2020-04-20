package example

object PruebasCasting extends App
{
    var i : Int = 4
    obtenerNombreClase(i)
    var j = i.asInstanceOf[Double]
    obtenerNombreClase(j)
    var k = i.asInstanceOf[Char]
    obtenerNombreClase(k)
    // var pollo1 : Pollo = new Pollo
    // pollo1.volar(10)
    // var ave : Ave = new Ave
    // var pollo2 = ave.asInstanceOf[Pollo]
    // pollo2.volar(15)
    var pollo3 : Pollo = new Pollo
    pollo3.volar(11)
    var pollo4 = pollo3.asInstanceOf[Ave]
    pollo4.volar(15)
    obtenerNombreClase(pollo3)
    obtenerNombreClase(pollo4)



    def obtenerNombreClase[T](x:T)
    {
        println(x.getClass.getName)
    }


}
