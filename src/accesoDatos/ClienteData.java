
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
        
        String sql = "INSERT INTO cliente(tipo, nombreRsocial, dni, cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setObject(1, cliente.getTipo());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getDni());
            ps.setInt(4, cliente.getCuilCuit());
            ps.setString(5, cliente.getDomicilio());
            ps.setString(6, cliente.getCiudad());
            ps.setString(7, cliente.getCodigoPostal());
            ps.setString(8, cliente.getLugarTrabajo());
            ps.setString(9, cliente.getTelefono());
            ps.setString(10, cliente.getMail());
            ps.setBoolean(11, cliente.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
             if (rs.next()) {
               cliente.setIdCliente(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Cliente guardado correctamente");
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
