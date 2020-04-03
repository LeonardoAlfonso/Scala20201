package Alimentos

import scala.util.Random

class TipoTamano
{
    /*Atributos*/
    var _idTipoTamano : String = this.generarId()
    var _descripcion : String = _

    /*Getters*/
    def idTipoTamano = _idTipoTamano
    def descripcion = _descripcion

    /*Setters*/
    def descripcion_= (nuevaDescripcion : String) = _descripcion = nuevaDescripcion

    /*Métodos*/
    private def generarId() : String = 
    {
        var codigo : String = Random.alphanumeric.take(6).mkString("")
        return codigo
    }
}