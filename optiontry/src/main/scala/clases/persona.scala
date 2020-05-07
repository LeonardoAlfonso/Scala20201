package clases

class Persona(n : String, e : Int)
{
    private var _nombre : String = n
    private var _edad : Int = e

    def nombre = _nombre
    def edad = _edad

    def nombre_= (nuevoNombre : String) = _nombre = nuevoNombre
    def edad_= (nuevaEdad : Int) = _edad = nuevaEdad
}
