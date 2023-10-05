
package accesoDatos;

import entidades.Inmueble;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class InmuebleData {
    
    Connection con = null;

    public InmuebleData() {
        con = Conexion.getConexion();
    }
    
    public void agregarInmueble(Inmueble inmueble){
        String sql = "INSERT INTO inmueble(idPropietario, tipoInmueble, alquilerVenta, "
                + "direccion, zona, descripcion, superficie, precioTasado, accesibilidad, cantAmbientes,"
                + " cantDomitorios, cantBaños, patio, cochera, quincho, pileta, mascotas, niños,"
                + " disponible) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, inmueble.getProp().getIdPropietario());
            ps.setObject(2,inmueble.getTipo());
            ps.setString(3, inmueble.getAlquilerVenta());
            ps.setString(4, inmueble.getDireccion());
            ps.setObject(5, inmueble.getZona());
            ps.setString(6, inmueble.getDescripcion());
            ps.setInt(7, inmueble.getSuperficie());
            ps.setDouble(8, inmueble.getPrecioTasado());
            ps.setString(9, inmueble.getAccesibilidad());
            ps.setInt(10, inmueble.getAmbientes());
            ps.setInt(11, inmueble.getDormitorios());
            ps.setInt(12, inmueble.getBaños());
            ps.setBoolean(13, inmueble.isPatio());
            ps.setBoolean(14, inmueble.isCochera());
            ps.setBoolean(15, inmueble.isQuincho());
            ps.setBoolean(16, inmueble.isPileta());
            ps.setBoolean(17, inmueble.isMascotas());
            ps.setBoolean(18, inmueble.isNiños());
            ps.setBoolean(19, inmueble.isDisponible());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                inmueble.setIdInmueble(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inmueble guardado correctamente");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
