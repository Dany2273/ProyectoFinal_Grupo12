package accesoDatos;

import entidades.Garante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class GaranteData {

    Connection con = null;

    public GaranteData() {
        con = Conexion.getConexion();
    }

    public void agregarGarante(Garante garante) {

        String sql = "INSERT INTO garante(tipo, nombreRsocial, dni, cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setObject(1, garante.getTipo());
            ps.setString(2, garante.getNombre());
            ps.setInt(3, garante.getDni());
            ps.setInt(4, garante.getCuilCuit());
            ps.setString(5, garante.getDomicilio());
            ps.setString(6, garante.getCiudad());
            ps.setString(7, garante.getCodigoPostal());
            ps.setString(8, garante.getLugarTrabajo());
            ps.setString(9, garante.getTelefono());
            ps.setString(10, garante.getMail());
            ps.setBoolean(11, garante.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                garante.setIdGarante(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Garante guardado correctamente");
                //Generamos un mje de comprobacion, pero antes creamos un alumno en el main del proyecto
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");

        }
    }
}
