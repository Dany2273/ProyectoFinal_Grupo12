
package accesoDatos;

import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteData {
    
    private Connection con = null;

    public ClienteData() {
        
        con = Conexion.getConexion();
        
    }
    
    public void agregarCliente(Cliente cliente){
        
        String sql = "INSERT INTO cliente(nombreRsocial, dni, cuilCuit, domicilio, lugarTrabajo, tipo, telefono, "
                + "mail, ciudad, codigoPostal, estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, cliente.getNombre());
            ps.setInt(2, cliente.getDni());
            ps.setInt(3, cliente.getCuilCuit());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getLugarTrabajo());
            ps.setString(6, cliente.getTipo().toString());
            ps.setString(7, cliente.getTelefono());
            ps.setString(8, cliente.getMail());
            ps.setString(9, cliente.getCiudad());
            ps.setString(10, cliente.getCodigoPostal());
            ps.setBoolean(11, cliente.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
             if (rs.next()) {
               cliente.setIdCliente(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Cliente guradado correctamente");
                //Generamos un mje de comprobacion, pero antes creamos un alumno en el main del proyecto
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }
    }
    
    public void buscarCliente(int cuilCuit){
        
    }
    
    public void buscarCliente(String nombre){
        
    }
    
}
