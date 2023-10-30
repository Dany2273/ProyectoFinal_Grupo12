
package accesoDatos;

import Vistas.Menu;
import accesoDatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    Connection con = null;

    public Login() {
        con = Conexion.getConexion();
    }
    
    public void validarUsuario(JTextField usuario, JPasswordField contraseña){
        String consulta = "SELECT * FROM `login` WHERE login.usuario = (?) AND login.contraseña = (?)";
        try {
           
            
             ResultSet rs = null;
            PreparedStatement ps = null;
            ps=con.prepareStatement(consulta);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(usuario.getText().equals("Camila")){
                    JOptionPane.showMessageDialog(null, "Bienvenida: "+usuario.getText());
                }else{
                    JOptionPane.showMessageDialog(null, "Bienvenido: "+usuario.getText());
                }
                
                Menu menu = new Menu();
                menu.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrectos, vuelva a intentar!");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e);
        }
    }
    
}
