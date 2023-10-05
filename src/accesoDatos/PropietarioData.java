
package accesoDatos;

import entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PropietarioData {
    
    Connection con = null;

    public PropietarioData() {
        con = Conexion.getConexion();
    }
    public void agregarPropietario(Propietario propietario){
        String sql = "INSERT INTO cliente(tipo, nombreRsocial, dni, cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setObject(1, propietario.getTipo().toString());
            ps.setString(2, propietario.getNombre());
            ps.setInt(3, propietario.getDni());
            ps.setInt(4, propietario.getCuilCuit());
            ps.setString(5, propietario.getDomicilio());
            ps.setString(6, propietario.getCiudad());
            ps.setString(7, propietario.getCodigoPostal());
            ps.setString(8, propietario.getLugarTrabajo());
            ps.setString(9, propietario.getTelefono());
            ps.setString(10, propietario.getMail());
            ps.setBoolean(11, propietario.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                propietario.setIdPropietario(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Propietario guardado correctamente");
                //Generamos un mje de comprobacion, pero antes creamos un alumno en el main del proyecto
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");

        }
    }
}
