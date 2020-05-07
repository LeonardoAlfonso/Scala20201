package clases

import scala.util._

class ManejoListas
{
    def entregarResultado(indice : Int, lista : List[Int]) : Try[Int] =
    {
        var valor : Try[Int] = Try(lista(indice))   //Success - Failure
        return valor
    }

    def buscarEnLista(valor : Int, lista : List[Int]) : Option[Int] =
    {
        var primerValor : Option[Int] = lista.filter(n => n == valor).headOption
        // println(primerValor)
        return primerValor
    }


    def agregarElemento(valor : Option[Int], lista : List[Int]) : Option[List[Int]] = 
    {
        var nuevalista : Option[List[Int]] = None
        valor match
        {
            case Some(s) => nuevalista = Some(s :: lista)
            case None => println("El elemento a agregar viene vacío")
        }

        return nuevalista
    }

    def divisionElementosLista(listaPrecios : List[String], posicion1 : Int, posicion2 : Int) : Try[Int] =
    {        
        var resultado = Try(listaPrecios(posicion1).toInt / listaPrecios(posicion2).toInt)
        return resultado
    }
}