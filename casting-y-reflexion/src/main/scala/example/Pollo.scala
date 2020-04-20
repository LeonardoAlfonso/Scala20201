package example

class Pollo extends Ave
{
    /*Atributo*/
    override var _cansancio : Int = 100

    /*Métodos*/
    def volar(metros : Int) : Unit =
    {
        var calculo = 2*metros
        if (calculo > _cansancio*2)
        {   
            println("El Pollo no puede volar")
        }
        else
        {
            println("El pollo voló" + metros + " metros")
            _cansancio -= 10
        }
        println(_cansancio)
    }

    def dormir() : Unit = _cansancio = 100
}