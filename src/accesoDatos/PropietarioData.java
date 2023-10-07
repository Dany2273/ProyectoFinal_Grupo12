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

    public void agregarPropietarioPF(Propietario propietario) {
        String sql = "INSERT INTO propietario(tipo, nombreRsocial, dni, cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setObject(1, propietario.getTipo().toString());
            ps.setString(2, propietario.getNombre());
            ps.setInt(3, propietario.getDni());
            ps.setLong(4, propietario.getCuilCuit());
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
                
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");

        }
    }

    public void agregarPropietarioPJ(Propietario propietario) {
        String sql = "INSERT INTO propietario(tipo, nombreRsocial, cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setObject(1, propietario.getTipo().toString());
            ps.setString(2, propietario.getNombre());
            ps.setLong(3, propietario.getCuilCuit());
            ps.setString(4, propietario.getDomicilio());
            ps.setString(5, propietario.getCiudad());
            ps.setString(6, propietario.getCodigoPostal());
            ps.setString(7, propietario.getLugarTrabajo());
            ps.setString(8, propietario.getTelefono());
            ps.setString(9, propietario.getMail());
            ps.setBoolean(10, propietario.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                propietario.setIdPropietario(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Propietario guardado correctamente");
               
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");

        }
    }

    public void eliminarPropietario(int id) {//Solo vamos a hacer un eliminado logico, o sea, cambiar estado a 0.
        //Recibimos por parametro el id del propietario que va a ser eliminado

        String sql = "UPDATE Propietario SET estado = 0 WHERE idPropietario = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Propietario eliminado con exito.");

               
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
        }

    }

    public void modificarPropietarioPF(Propietario propietario) {//Recibe por parametro un Propietario ya existente en la BD

        String sql = "UPDATE propietario SET tipo = ?, nombreRsocial = ?, dni = ?,cuilCuit = ?, lugarTrabajo = ?, domicilio = ?, ciudad = ?, codigoPostal = ?, telefono = ?, mail = ?, estado = ? "
                + "WHERE idPropietario = ?";
        //Nuevamente como los datos se recibe por parametros, utilizamos un caracter comodin
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, propietario.getTipo().toString());
            ps.setString(2, propietario.getNombre());
            ps.setInt(3, propietario.getDni());
            ps.setLong(4, propietario.getCuilCuit());
            ps.setString(5, propietario.getLugarTrabajo());
            ps.setString(6, propietario.getDomicilio());
            ps.setString(7, propietario.getCiudad());
            ps.setString(8, propietario.getCodigoPostal());
            ps.setString(9, propietario.getTelefono());
            ps.setString(10, propietario.getMail());
            ps.setBoolean(11, propietario.isEstado());
            ps.setInt(12, propietario.getIdPropietario());//muy importante sino no sabe cual id propietario modificar

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Propietario modificado con exito.");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
        }
    }

    public void modificarPropietarioPJ(Propietario propietario) {//Recibe por parametro un Propietario ya existente en la BD

        String sql = "UPDATE propietario SET tipo = ?, nombreRsocial = ?,cuilCuit = ?, lugarTrabajo = ?, domicilio = ?, ciudad = ?, codigoPostal = ?, telefono = ?, mail = ?, estado = ? "
                + "WHERE idPropietario = ?";
        //Nuevamente como los datos se recibe por parametros, utilizamos un caracter comodin
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, propietario.getTipo().toString());
            ps.setString(2, propietario.getNombre());
            ps.setLong(3, propietario.getCuilCuit());
            ps.setString(4, propietario.getLugarTrabajo());
            ps.setString(5, propietario.getDomicilio());
            ps.setString(6, propietario.getCiudad());
            ps.setString(7, propietario.getCodigoPostal());
            ps.setString(8, propietario.getTelefono());
            ps.setString(9, propietario.getMail());
            ps.setBoolean(10, propietario.isEstado());
            ps.setInt(11, propietario.getIdPropietario());

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Propietario modificado con exito.");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
        }
    }

}
