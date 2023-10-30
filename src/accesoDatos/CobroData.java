
package accesoDatos;

import Enums.MesCorrespondiente;
import entidades.CobroAlquiler;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
            ps.setString(3, String.valueOf(cobro.getMesCobro()));
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
        
        public void eliminarCobro(int idCobroAlquiler) {
        String sql = "DELETE FROM cobroalquiler WHERE idCobroAlquiler = ?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idCobroAlquiler);
                
                int filas = ps.executeUpdate();
                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "El Cobro del Alquiler ha sido eliminado con exito.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cobroAlquiler");
        }
    }
    
public void modificarCobroAlquiler(CobroAlquiler cobro) {
        String sql = "UPDATE cobroalquiler SET  idAlquiler = ?, fehcaCobro = ?, mesCorrespondiente = ?, importe = ?, comisionCobro = ?, importeMora = ?,  numeroComprobante = ? WHERE idCobroAlquiler = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,cobro.getAlq().getIdAlquiler());
            ps.setDate(2, Date.valueOf(cobro.getFechaCobro()));
            ps.setString(3, String.valueOf(cobro.getMesCobro()));
            ps.setDouble(4, cobro.getImporte());
            ps.setDouble(5, cobro.getComision());
            ps.setDouble(6, cobro.getImporteMora());
            ps.setString(7, cobro.getNumComprobante());
            ps.setInt(7, cobro.getIdCobroAlquiler());
            

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Cobro de Alquiler modificado con exito.");

                /*Guardamos los cambios y ejecutamos desde el main*/
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cobroAlquiler" + ex);
        }

    }    

public CobroAlquiler buscarCobroIdCobro(int idCobroAlquiler) {
        
        CobroAlquiler cobro = null;
        String sql = "SELECT * FROM cobroalquiler WHERE idCobroAlquiler = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            AlquilerData alqD = new AlquilerData();
            ps.setInt(1, idCobroAlquiler);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            cobro = new CobroAlquiler();
            
            cobro.setIdCobroAlquiler(rs.getInt("idCobroAlquiler"));
            cobro.setAlq(alqD.buscarAlquiler(rs.getInt("idAlquier")));
            cobro.setFechaCobro(rs.getDate("fechaCobro").toLocalDate());
            cobro.setMesCobro(MesCorrespondiente.valueOf(rs.getString("mesCorrespondienete")));
            cobro.setImporte(rs.getDouble("importe"));
            cobro.setComision(rs.getDouble("comisionCobro"));
            cobro.setImporteMora(rs.getDouble("importeMora"));
            cobro.setNumComprobante(rs.getString("numeroComprobante"));        
            
                
            }else{
                JOptionPane.showMessageDialog(null, "No Existe el Cobro de Alquiler con ese ID ");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cobroAlquiler" + ex.getMessage());
        }
        return cobro;

    }
    
 
public List<CobroAlquiler> buscarcCobroIdAlquiler(int idAlquiler) {
        List<CobroAlquiler> ca = new ArrayList<>();
        CobroAlquiler cobro = null;
        String sql = "SELECT * FROM cobroalquiler WHERE idAlquiler = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            AlquilerData alqD = new AlquilerData();
            ps.setInt(1, idAlquiler);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            cobro = new CobroAlquiler();
            
            cobro.setIdCobroAlquiler(rs.getInt("idCobroAlquiler"));
            cobro.setAlq(alqD.buscarAlquiler(rs.getInt("idAlquier")));
            cobro.setFechaCobro(rs.getDate("fechaCobro").toLocalDate());
            cobro.setMesCobro(MesCorrespondiente.valueOf(rs.getString("mesCorrespondienete")));
            cobro.setImporte(rs.getDouble("importe"));
            cobro.setComision(rs.getDouble("comisionCobro"));
            cobro.setImporteMora(rs.getDouble("importeMora"));
            cobro.setNumComprobante(rs.getString("numeroComprobante"));        
            ca.add(cobro);
                
            
            ps.close();
        }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cobroAlquiler" + ex.getMessage());
        }
        return ca;

    }


public List<CobroAlquiler> buscarcCobroMotor(int idAlquiler, LocalDate fechaI, LocalDate fechaF){
        
        CobroAlquiler cobro = null;
        List<CobroAlquiler> ca = new ArrayList<>();
        
        
        if(idAlquiler != 0){
        
        String sql = "SELECT * FROM cobroAlquiler WHERE idAlquiler = ? AND fechaCobro >= ? AND fechaCobro <= ?";

       try {
            PreparedStatement ps = con.prepareStatement(sql);
            AlquilerData alqD = new AlquilerData();
            ps.setInt(1, idAlquiler);
            ps.setDate(2,Date.valueOf(fechaI));
            ps.setDate(3, Date.valueOf(fechaF));
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            cobro = new CobroAlquiler();
            
            cobro.setIdCobroAlquiler(rs.getInt("idCobroAlquiler"));
            cobro.setAlq(alqD.buscarAlquiler(rs.getInt("idAlquier")));
            cobro.setFechaCobro(rs.getDate("fechaCobro").toLocalDate());
            cobro.setMesCobro(MesCorrespondiente.valueOf(rs.getString("mesCorrespondienete")));
            cobro.setImporte(rs.getDouble("importe"));
            cobro.setComision(rs.getDouble("comisionCobro"));
            cobro.setImporteMora(rs.getDouble("importeMora"));
            cobro.setNumComprobante(rs.getString("numeroComprobante"));        
            ca.add(cobro);
                
            
            ps.close();
        }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cobroAlquiler" + ex.getMessage());
        }
        return ca;
        }else{
            
        String sql = "SELECT * FROM cobroAlquiler WHERE fechaCobro >= ? AND fechaCobro <= ?";

       try {
            PreparedStatement ps = con.prepareStatement(sql);
            AlquilerData alqD = new AlquilerData();
            ps.setDate(1,Date.valueOf(fechaI));
            ps.setDate(2, Date.valueOf(fechaF));
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            cobro = new CobroAlquiler();
            
            cobro.setIdCobroAlquiler(rs.getInt("idCobroAlquiler"));
            cobro.setAlq(alqD.buscarAlquiler(rs.getInt("idAlquier")));
            cobro.setFechaCobro(rs.getDate("fechaCobro").toLocalDate());
            cobro.setMesCobro(MesCorrespondiente.valueOf(rs.getString("mesCorrespondienete")));
            cobro.setImporte(rs.getDouble("importe"));
            cobro.setComision(rs.getDouble("comisionCobro"));
            cobro.setImporteMora(rs.getDouble("importeMora"));
            cobro.setNumComprobante(rs.getString("numeroComprobante"));        
            ca.add(cobro);
                
            
            ps.close();
        }
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cobroAlquiler" + ex.getMessage());
        }
        return ca;
        
        
        }

    }


public void eliminarCobroAlquiler(int idCobroAlquiler) {
        String sql = "DELETE FROM cobroalquiler WHERE idCobroAlquiler = ?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idCobroAlquiler);
                
                int filas = ps.executeUpdate();
                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "El Cobro de Alquiler ha sido eliminado con exito.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cobroalquiler");
        }
    }
}
