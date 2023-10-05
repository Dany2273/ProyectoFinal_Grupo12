
package accesoDatos;

import entidades.Alquiler;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlquilerData {
    private Connection con = null;

    public AlquilerData() {
        con = Conexion.getConexion();
    }
    
    public void nuevoAlquiler(Alquiler alquiler){
        
        String sql = "INSERT INTO alquiler( idInmueble, idCliente, idGarante, tipoCliente,"
                + " fechaInicio, fechaFin, precioInicial, clausula, fechaFirma, fechaRescision, estado) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioInicial());
            ps.setString(8, alquiler.getClausula());
            ps.setDate(9, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(10, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(11, alquiler.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                alquiler.setIdAlquiler(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alquiler guardado correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlquilerData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
