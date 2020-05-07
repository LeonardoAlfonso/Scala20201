package clases

class Pila[A]
{
    private var listaPila : List[A] = Nil
    def push(elemento : A) : Unit = 
    {
        listaPila = elemento :: listaPila
    }
    def extraer() : A = 
    {
        var primero : A = listaPila.head
        var listaAuxiliar = listaPila.filter(e => e != primero)
        listaPila = listaAuxiliar
        return primero
    }
    def imprimir()
    {
        listaPila.foreach(p => println(p))
    }
}