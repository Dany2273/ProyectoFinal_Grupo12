
package accesoDatos;

import entidades.CobroAlquiler;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CobroData {
    
    Connection con = null;

    public CobroData() {
        con = Conexion.getConexion();
    }
    
    public void nuevoCobro(CobroAlquiler cobro){
        String sql = "INSERT INTO cobroalquiler(idAlquiler, fechaCobro, mesCorrespondiente,"
                + " importe, comisionCobro, importeMora, numeroComprobante) VALUES(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,cobro.getAlq().getIdAlquiler());
            ps.setDate(2, Date.valueOf(cobro.getFechaCobro()));
            ps.setString(3, cobro.getMesCobro());
            ps.setDouble(4, cobro.getImporte());
            ps.setDouble(5, cobro.getComision());
            ps.setDouble(6, cobro.getImporteMora());
            ps.setString(7, cobro.getNumComprobante());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                cobro.setIdCobroAlquiler(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cobro de alquiler ingresado correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(CobroData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
