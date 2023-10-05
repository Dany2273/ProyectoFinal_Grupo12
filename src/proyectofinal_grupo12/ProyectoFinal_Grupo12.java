
package proyectofinal_grupo12;

import Enums.TipoCliente;
import accesoDatos.ClienteData;
import accesoDatos.Conexion;
import entidades.Cliente;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class ProyectoFinal_Grupo12 {

    public static void main(String[] args) {
        // TODO code application logic here
        
//        Connection con = Conexion.getConexion();
        
        Cliente cli = new Cliente(TipoCliente.PERSONA_FISICA, "Pablo", 312, 3124, "Rivadavia 321", "Tigre", "1413", "Personal", "01178782919", "juanperez@gmail.com", true);
//        JOptionPane.showMessageDialog(null, cli.toString());
        
       ClienteData cData = new ClienteData();
        cData.agregarCliente(cli);
    }
    
}
