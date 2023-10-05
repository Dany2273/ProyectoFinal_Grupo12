
package accesoDatos;

import entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentaData {
    
    Connection con = null;

    public VentaData() {
        con = Conexion.getConexion();
    }
    
    public void agregarVenta(Venta venta){
        String sql = "INSERT INTO venta( idInmueble, idCliente,idPropietario, fechaPagoInicial,"
                + " precioAcordado, pagoInicial, pagoRestante, estadoPago, fechaCancelacion,"
                + " importeGastos, importeComision) VALUES(?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
             ps.setInt(1, venta.getInmueble().getIdInmueble());
            ps.setInt(2, venta.getCliente().getIdCliente());
            ps.setInt(3, venta.getProp().getIdPropietario());
            ps.setDate(4, Date.valueOf(venta.getFechaPagoInicial()));
            ps.setDouble(5, venta.getPrecioAcordado());
            ps.setDouble(6, venta.getPagoInicial());
            ps.setDouble(7, venta.getPagoRestante());
            ps.setString(8, venta.getEstadoPago());
            ps.setDate(9, Date.valueOf(venta.getFechaCancelacion()));
            ps.setDouble(10, venta.getImporteGastos());
            ps.setDouble(11, venta.getImporteComision());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                venta.setIdVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta guardada correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
}
