
package accesoDatos;

import entidades.Alquiler;
import java.sql.Connection;

public class AlquilerData {
    private Connection con = null;

    public AlquilerData() {
        con = Conexion.getConexion();
    }
    
    public void agregarAlquiler(Alquiler alquiler){
        
        String sql = "INSERT INTO alquiler( idInmueble, idCliente, idGarante, tipoCliente,"
                + " fechaInicio, fechaFin, precioInicial, clausula, fechaFirma, fechaRescision, estado) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
    }
    
}
