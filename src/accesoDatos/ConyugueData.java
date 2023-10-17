package accesoDatos;

import entidades.Conyugue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConyugueData {

    private Connection con = null;

    public ConyugueData() {
        con = Conexion.getConexion();
    }

    public void ingresarConyugue(Conyugue conyugue) {
        String sql = "INSERT INTO conyugue(nombre, dni, cuil, lugarTrabajo, domicilio, ciudad, "
                + "codigoPostal, telefono, mail, estado) VALUES(?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, conyugue.getNombre());
            ps.setInt(2, conyugue.getDni());
            ps.setLong(3, conyugue.getCuilCuit());
            ps.setString(4, conyugue.getLugarTrabajo());
            ps.setString(5, conyugue.getDomicilio());
            ps.setString(6, conyugue.getCiudad());
            ps.setString(7, conyugue.getCodigoPostal());
            ps.setString(8, conyugue.getTelefono());
            ps.setString(9, conyugue.getMail());
            ps.setBoolean(10, true);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                conyugue.setIdConyugue(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Conyugue guardado/a correctamente");
                //Generamos un mje de comprobacion, pero antes creamos un alumno en el main del proyecto
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla conyugue");
        }
    }
    
   public Conyugue buscar(int id){
       String sql = "SELECT * FROM conyugue WHERE idConyugue = ?";
       Conyugue co = null;
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                co = new Conyugue();
                co.setIdConyugue(id);
                co.setNombre(rs.getString("nombre"));
                co.setDni(rs.getInt("dni"));
                co.setCuilCuit(rs.getLong("cuil"));
                co.setLugarTrabajo(rs.getString("lugarTrabajo"));
                co.setDomicilio(rs.getString("domicilio"));
                co.setCiudad(rs.getString("ciudad"));
                co.setCodigoPostal(rs.getString("codigoPostal"));
                co.setTelefono(rs.getString("telefono"));
                co.setMail(rs.getString("mail"));
                co.setEstado(true);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConyugueData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return co;
       
   }
}
