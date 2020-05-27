package Strategy

class YenPeso extends ICambioMoneda
{
    //Métodos
    def realizarCambio(moneda : Double) : Double =
    {
        val transformacion : Double = moneda / 5000
        return transformacion
    }
}