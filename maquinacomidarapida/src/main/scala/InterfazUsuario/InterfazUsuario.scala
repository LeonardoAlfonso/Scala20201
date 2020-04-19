package InterfazUsuario

import scala.io._
import Alimentos._
import InsumosPlasticos._

object InterfazUsuario extends App
{
    var cerrarTienda : Boolean = false
    private var caja : Caja = new Caja
    private var tipoGrande : TipoTamano = new TipoTamano()
    tipoGrande.descripcion = "Grande"
    caja.agregarTamano(tipoGrande)

    while(!cerrarTienda)
    {
        println("Bienvenido a la configuración de comidas rápidas")
        println("Sus opciones son: \n 1->Crear Alimento \n 2->MostrarCatalogo \n 3->Salir")
        println("Escoja una opción: ")
        var opcion : Int = StdIn.readInt()
        if (opcion == 1)
        {
            crearAlimentoCatalogo()         
        }
        caja.mostrarCatalogo().foreach(p => println(p.descripcion + " " + p.referencia))
    }

    def crearAlimentoCatalogo() : Unit = 
    {
        println("Qué alimento desea crear? \n 1->Hamburguesa \n 2->Bebida 3->Papas")
        var opcionComida : Int = StdIn.readInt()

        if (opcionComida == 1)
        {
            println("Coloque el nombre de su hamburguesa")
            var nombre : String = StdIn.readLine()
            println("Coloque el precio de su hamburguesa")
            var precio : Double = StdIn.readDouble()
            var tipoTamano = elegirTamano()
            var hamburguesa : Hamburguesa = new Hamburguesa(tipoTamano, nombre, precio)
            caja.agregarAlimentoCatalogo(hamburguesa)
        }
    }

    def elegirTamano() : TipoTamano = 
    {
        var tamanos : List[TipoTamano] = caja.mostrarTamanos()
        println("Tamaños actuales: ")
        tamanos.foreach{ t => 
        {
            println("Referencia : " + t.idTipoTamano + " Descripción: " + t.descripcion)
        }}
        println("Escriba la referecia de su tamaño: ")
        var referencia : String = StdIn.readLine()
        var tipoTamanoElejido : TipoTamano = tamanos.filter(t => t.idTipoTamano == referencia).head
        return tipoTamanoElejido
    }

}