
package accesoDatos;

import entidades.Escribano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EscribanoData {
     private Connection con = null;

    public EscribanoData() {
        con = Conexion.getConexion();
    }
     
      public void ingresarEscribano(Escribano escribano) {
        String sql = "INSERT INTO conyugue(nombre, dni, cuil, lugarTrabajo, domicilio, ciudad, "
                + "codigoPostal, telefono, mail, estado) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, escribano.getNombre());
            ps.setInt(2, escribano.getDni());
            ps.setLong(3, escribano.getCuilCuit());
            ps.setString(4, escribano.getLugarTrabajo());
            ps.setString(5, escribano.getDomicilio());
            ps.setString(6, escribano.getCiudad());
            ps.setString(7, escribano.getCodigoPostal());
            ps.setString(8, escribano.getTelefono());
            ps.setString(9, escribano.getMail());
            ps.setBoolean(10, true);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                escribano.setIdEscribano(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Conyugue guardado/a correctamente");
                //Generamos un mje de comprobacion, pero antes creamos un alumno en el main del proyecto
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla conyugue");
        }
    }
    
   public Escribano buscar(int id){
       String sql = "SELECT * FROM conyugue";
       Escribano escribano = null;
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                escribano = new Escribano();
                escribano.setIdEscribano(id);
                escribano.setNombre(rs.getString("nombre"));
                escribano.setDni(rs.getInt("dni"));
                escribano.setCuilCuit(rs.getInt("cuil"));
                escribano.setLugarTrabajo(rs.getString("lugarTrabajo"));
                escribano.setDomicilio(rs.getString("domicilio"));
                escribano.setCiudad(rs.getString("ciudad"));
                escribano.setCodigoPostal(rs.getString("codigoPostal"));
                escribano.setTelefono(rs.getString("telefono"));
                escribano.setMail(rs.getString("mail"));
                escribano.setEstado(true);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConyugueData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return escribano;
       
   }
     
}
