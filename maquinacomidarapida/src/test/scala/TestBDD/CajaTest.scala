import org.scalatest.GivenWhenThen
import org.scalatest.FeatureSpec
import Alimentos._
import InterfazUsuario._

class CajaTest extends FeatureSpec with GivenWhenThen
{
    var tipoGrande : TipoTamano = new TipoTamano
    var tipoMediano : TipoTamano = new TipoTamano
    var tipoPequeno : TipoTamano = new TipoTamano
    var caja : Caja = new Caja
    tipoGrande.descripcion = "Grande"    
    tipoMediano.descripcion = "Mediana"    
    tipoPequeno.descripcion = "Pequeño"    

    feature("Crear Hamburguesa")
    {
        scenario("Hamburguesa Ranchera con valor de $20000")
        {
            Given("Dada una hamburguesa ranchera con valor de $20000")
            var hamburguesaRanchera : Hamburguesa = new Hamburguesa(tipoMediano, "Ranchera", 20000)

            When("Se agrega la hamburguesa")
            caja.agregarAlimentoCatalogo(hamburguesaRanchera)

            Then("El catálogo no se encuentra vacío")
            var catalogo : List[Alimento] = caja.mostrarCatalogo()
            assert(catalogo.length < 0)
        }
    }
}
