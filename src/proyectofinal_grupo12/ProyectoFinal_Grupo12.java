
package proyectofinal_grupo12;

import Enums.TipoCliente;
import static Enums.TipoCliente.PERSONA_FISICA;
import static Enums.TipoCliente.PERSONA_JURIDICA;
import Vistas.Menu;
import accesoDatos.ClienteData;
import accesoDatos.ConyugueData;
import accesoDatos.InmuebleData;
import accesoDatos.PagoVentaData;
import accesoDatos.PropietarioData;
import accesoDatos.VentaData;
import entidades.Cliente;
import entidades.Conyugue;
import entidades.PagoVenta;
import entidades.Propietario;
import entidades.Venta;
import java.time.LocalDate;

public class ProyectoFinal_Grupo12 {

    public static void main(String[] args) {
        
        Menu menu = new Menu();
        menu.setVisible(true);
        
        
//        ClienteData cData = new ClienteData();
//        PropietarioData pData = new PropietarioData();
        //  Cliente cli1 = new Cliente(TipoCliente.PERSONA_JURIDICA, "Pizzeria", 30609980024L, "Pizzeria", "Belgrano 1023", "Escobar", "1921", "1190229012", "pizzeria@gmail.com", true);

//        Cliente cli4 = new Cliente(TipoCliente.PERSONA_JURIDICA, "Eventos", 30127893214L, "Eventos", "Ayacucho 820", "Tigre", "1652", "1142022631", "eventos@gmail.com", true);
//        Cliente cli7 = new Cliente(TipoCliente.PERSONA_JURIDICA, "Local", 30937439004L, "Local", "Santa Fe 2090", "San Fernando", "1580", "1177226299", "local@gmail.com", true);
//       cData.agregarClienteFisico(cli1);
//       cData.agregarClienteFisico(cli2);
//       cData.agregarClienteFisico(cli3);
//       cData.agregarClienteJuridico(cli7);
//       cData.agregarClienteJuridico(cli4);
//       cData.agregarClienteJuridico(cli);
//       cData.modificarClienteJuridico(cli);
//       cData.eliminarCliente(1);
//       cData.buscarCliente(1);
//       cData.buscarClientePorCuilCuit('3');
/*Para buscar un cliente creamos una variable cliente donde guardamos los
       datos encontrados*/
//       Cliente clienteEncontrado = cData.buscarClientePorNombre("Sandra");
//        if(clienteEncontrado != null){//Con el if evitamos caer en el NullPointerException
//            System.out.println(clienteEncontrado.toString());
//            
//        }
//            for(Cliente c : cData.listarTodosClientes()){
//                System.out.println(c.getNombre());
//                System.out.println(c.getCuilCuit());
//                System.out.println(c.getTelefono());
//                System.out.println(c.getDomicilio());
//            }
////          cData.eliminarCliente(8);
//        Venta venta = new Venta();
//        VentaData vData = new VentaData();
//        
//        vData.eliminarVenta(1, 1, 1);


//PRUEBA DE TODOS LOS METODOS DE PROPIETARIODATA---------------------------------------------------*****************************------------------------------


//creo PROPIETARIO FISICO

//Propietario pro = new Propietario(TipoCliente.PERSONA_FISICA, "emiliana", 54321, 654321, "lugare", "domie", "ciue", "19001lpe", "221000001", "emiliana@gmail.com", true);

//AGREGAR PROPIETARIO FISICO

//pData.agregarPropietarioPF(pro);//OK

//CREO PROPIETARIO JURIDICO---daba error en el campo cuilCuit porque la base de datos no tenia activada que reciba null

//Propietario pro = new Propietario(TipoCliente.PERSONA_JURIDICA, "nombr", 3, "lugarTrabajo", "domicilio", "ciudad", "codigoPostal", "telefono", "mail", true);

//AGREGAR PROPIETARIO JURIDICO

//pData.agregarPropietarioPJ(pro);//OK

//ELIMINAR PROPIETARIO POR ID

//pData.eliminarPropietario(3);//OK

//MODIFICAR PROPIETARIO FISICO RECIBE UN id

//Propietario pro = new Propietario(8,TipoCliente.PERSONA_FISICA, "juano", 3702501, 22222, "lugare", "domie", "ciue", "19001lpe", "221000001", "emiliana@gmail.com", true);

//pData.modificarPropietarioPF(pro); //OK

//MODIFICAR PROPIETARIO JURIDICO RECIBE UN id

//Propietario pro = new Propietario(18,TipoCliente.PERSONA_JURIDICA, "juano", 2222212, "lugare", "domie", "ciue", "19001lpe", "221000001", "emiliana@gmail.com", true);

//pData.modificarPropietarioPJ(pro); // OK

//REACTIVAR PROPIETARIO POR ID

//pData.reactivarPropietario(3); //OK

//LISTAR PROPIETARIOS FISICOS 

//ACTIVOS
//pData.listarProFisicosA();//OK
//INACTIVOS
//pData.listarProFisicosI();//OK
//TODOS
//pData.listarProFisicosT();//OK

//LISTAR PROPIETARIOS JURIDICOS

//ACTIVOS
//pData.listarProJuridicosA();//OK
//INACTIVOS
//pData.listarProJuridicosI();//OK
//TODOS
//pData.listarProJuridicosT();//OK

//LISTAR TODOS TANTO JURIDICOS COMO FISICOS

//ACTIVOS
//pData.listarProTodosActivos();//OK
//INACTIVOS
//pData.listarProTodosInactivos();//OK
//TODOS
//pData.listarProTodos();//OK

//BUSCAR PROPIETARIO POR CUIL ACTIVOS, SI EL CUIL INGRESADO ES DE UN INACTIVO ENTONCES DEVUELVE NULL, AHI HAY Q AGREGAR LA OPCION DE REACTIVAR

//pData.buscarProPorCuilC();//OK

//BUSCAR PROPIETARIO POR ID ACTIVOS

//pData.buscarId();//OK


//-------------------------------------****************************--------------------------------------------------------
//      InmuebleData iData = new InmuebleData();
//      Conyugue co = new Conyugue();
//      ConyugueData coData = new ConyugueData();
//      co = coData.buscar(1);
//      Cliente c = new Cliente(co, PERSONA_FISICA, "Daniel", 123211, 1213111, "Particular", "Paso 123", "Tigre", "12121", "920129211", "sjiaisais", true);
//      cData.agregarClienteFisico(c);


//Venta venta = new Venta(LocalDate.of(2023, 12, 12), iData.buscarInmueble(1), pData.buscarId(1), cData.buscarCliente(1), null, null, 100, "pesos", "venta total", "pendiente");
//       
   VentaData vData = new VentaData();
   Venta ven = new Venta();
       ven = vData.buscarVenta(1);
        System.out.println(ven);
//        PagoVentaData pData = new PagoVentaData();
//        PagoVenta pago = new PagoVenta(ven, "onoanosaa", "efectivo", LocalDate.of(2023, 10, 10), 1000000, "peso", 10000, 10000);
//        
//        pData.agregarPagoVenta(pago);

    }
    
}
