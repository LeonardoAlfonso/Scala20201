package optionTry

import clases._
import scala.util._

object ejemplo1 extends App
{
    /*Variables*/
    var gestorListas : ManejoListas = new ManejoListas
    var listaNumeros : List[Int] = List(1,2,3,4,5,8)
    var listaPrecios : List[String] = List("20000", "8000", "5000")

    /*Ejemplo 1*/
    // ejemploTry1()
    

    /*Ejemplo 2*/
    ejemploOption1()

    /*Ejemplo 3*/
    // ejemploOption2()

    /*Ejemplo 4*/
    //ejemploTry2()

    def ejemploTry1()
    {
        // gestorListas.entregarResultado(1, listaNumeros)
        var valor : Try[Int] = gestorListas.entregarResultado(1, listaNumeros)
        // if (valor.isSuccess)
        // {
        //     println(valor)
        //     println(valor.get)  
        // }
        // else
        // {
        //     println("El índice no existe en la lista")
        //     println(valor)
        // }

        // valor match
        // {
        //     case Success(v) => println("El resultado es " + v)
        //     case Failure(f) => println("Falló por " + f)
        // }
    }
    
    def ejemploOption1()
    {
        var valor2 : Option[Int] = gestorListas.buscarEnLista(7, listaNumeros)
        // gestorListas.buscarEnLista(7, listaNumeros)
        
        // if (valor2.isEmpty)  //valor2 == None
        // {
        //     println("No existe el elemento en la lista")
        // }
        // else //valor2 == Some(7)
        // {
        //     println("El valor es " + valor2.get)
        // }

        valor2 match
        {
            case Some(s) => println("El valor es " + s + " estoy en el match")
            case None => println("No existe el elemento en la lista del match")
        }
    }

    def ejemploOption2()
    {
        // var valorEnLista : Option[Int] = gestorListas.buscarEnLista(7, listaNumeros)
        // var nuevaLista : Option[List[Int]] = gestorListas.agregarElemento(valorEnLista, listaNumeros)
        // if (!nuevaLista.isEmpty)
        // {
        //     nuevaLista.get.foreach(n => println(n))
        // }      
    }

    def ejemploTry2()
    {
        var precioDividido : Try[Int] = gestorListas.divisionElementosLista(listaPrecios, 1, 2)
        precioDividido match
        {
            case Success(s) => println("Operación exitosa. Resultado:  " + s)
            case Failure(f) => println("El fallo fue " + f)
        }        
    }
}