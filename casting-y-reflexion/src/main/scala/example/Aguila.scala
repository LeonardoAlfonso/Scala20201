package example

class Aguila extends Ave
{
    /*Atributo*/
    override var _cansancio : Int = 100

    /*Métodos*/
    def volar(metros : Int) : Unit =
    {
        var calculo = 0.1 * metros
        if (calculo > _cansancio * 8)
        {   
            println("El Aguila no puede volar")
        }
        else
        {
            println("El Aguila voló" + metros + " metros")
            _cansancio -= 1
        }
        println(_cansancio)
    }

    def dormir() : Unit = _cansancio = 100
}