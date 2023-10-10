package accesoDatos;

import Enums.TipoCliente;
import entidades.Cliente;
import entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    }//agrega un propietario fisico

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
    }//agrega un propietario juridico

    public void eliminarPropietario(int id) {//Solo vamos a hacer un eliminado logico, o sea, cambiar estado a 0.
        //Recibimos por parametro el id del propietario que va a ser eliminado

        String sql = "UPDATE propietario SET estado = 0 WHERE idPropietario = ?";

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

    }//puede eliminar tanto un propietario fisico como juridico

    public void modificarPropietarioPF(Propietario propietario) {//Recibe por parametro un Propietario ya existente en la BD

        String sql = "UPDATE propietario SET tipo = ?, nombreRsocial = ?, dni = ?,cuilCuit = ?, lugarTrabajo = ?, domicilio = ?, ciudad = ?, codigoPostal = ?, telefono = ?, mail = ? "
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
            ps.setInt(11, propietario.getIdPropietario());//muy importante sino no sabe cual id propietario modificar

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Propietario modificado con exito.");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
        }
    }//modifica un propietario fisico

    public void modificarPropietarioPJ(Propietario propietario) {//Recibe por parametro un Propietario ya existente en la BD

        String sql = "UPDATE propietario SET tipo = ?, nombreRsocial = ?,cuilCuit = ?, lugarTrabajo = ?, domicilio = ?, ciudad = ?, codigoPostal = ?, telefono = ?, mail = ? "
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
            ps.setInt(10, propietario.getIdPropietario());

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Propietario modificado con exito.");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Propietario");
        }
    }//modifica un propietario juridico

    public void reactivarPropietario(long cuilCuit) {

        String sql = "UPDATE propietario SET estado = 1 WHERE cuilCuit = ? AND estado = 0;";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setLong(1, cuilCuit);

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "El propietario ha sido Reactivado con exito.");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario");
        }

    }//reactiva o setea el "estado" 0 a 1 para que este quede activo

    public List<Propietario> listarProFisicosA() {//Metodo que devuelve una lista de propietarios
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE estado = 1  AND tipo = 'PERSONA_FISICA' ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));// que hermosa linea
                


                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(true);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario

               System.out.println(propietario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios

    }//activos propietarios fisicos

    public List<Propietario> listarProFisicosI() {//Metodo que devuelve una lista de propietarios
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE estado = 0 AND tipo = 'PERSONA_FISICA'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(false);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios

    }//inactivos propietarios fisicos

    public List<Propietario> listarProFisicosT() {//Metodo que devuelve una lista de propietarios
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE tipo = 'PERSONA_FISICA'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(rs.getBoolean("estado"));//obtiene el estado del propietario

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios completa tanto activos como inactivos

    }// lista activos e inactivos propietarios fisicos

    public List<Propietario> listarProJuridicosA() {//Metodo que devuelve una lista de propietarios
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT idPropietario, nombreRsocial,cuilCuit,lugarTrabajo,domicilio,ciudad,codigoPostal,telefono,mail,estado FROM propietario WHERE estado = 1 AND tipo= 'PERSONA_JURIDICA' ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(true);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios

    }//activos propietarios juridicos

    public List<Propietario> listarProJuridicosI() {//Metodo que devuelve una lista de propietarios
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT idPropietario, nombreRsocial,cuilCuit,lugarTrabajo,domicilio,ciudad,codigoPostal,telefono,mail,estado FROM propietario WHERE estado = 0 AND tipo = 'PERSONA_JURIDICA' ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(false);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios

    }// inactivos propietarios juridicos

    public List<Propietario> listarProJuridicosT() {//Metodo que devuelve una lista de propietarios
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT idPropietario, nombreRsocial,cuilCuit,lugarTrabajo,domicilio,ciudad,codigoPostal,telefono,mail,estado FROM propietario WHERE tipo = 'PERSONA_JURIDICA' ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(rs.getBoolean("estado"));//obtiene el estado del propietario

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios completa tanto activos como inactivos

    }//lista activos e inactivos propietarios juridicos

    public List<Propietario> listarProTodosActivos() {
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE estado = 1 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(true);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario
//System.out.println(propietario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios

    }//lista de todos los propietarios activos sean de cualquier tipo

    public List<Propietario> listarProTodosInactivos() {
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE estado = 0 ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(false);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario
System.out.println(propietario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios

    }//lista de todos los propietarios inactivos sean de cualquier tipo

    public List<Propietario> listarProTodos() {
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(rs.getBoolean("estado"));

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario
//System.out.println(propietario);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//Retorno la lista de propietarios

    }//lista de todos los propietarios de cualquier tipo y con cualquier estado

    public Propietario buscarProPorCuilC(long cuilCuit) {

        String sql = "SELECT * FROM propietario "
                + "WHERE cuilCuit = ? AND estado = 1";
        Propietario propietario = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, cuilCuit);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                propietario = new Propietario();

                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(true);
                

            } else {

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println(propietario);
        return propietario;
    }//busca un propietario tanto juridico como fisico
    
    public Propietario buscarId (int idProp){
        String sql = "SELECT * FROM propietario "
                + "WHERE idPropietario = ? AND estado = 1";
        Propietario propietario = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setLong(1, idProp);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                propietario = new Propietario();

                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(true);
                

            } else {

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println(propietario);
        return propietario;
    }

    public List<Propietario> propietariosActivosNombre(char letra) {
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE estado = 1 AND tipo = ? AND nombre LIKE ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // Configura el parámetro de la letra
            ps.setString(1, "tipo");
            ps.setString(2, letra + "%");
            
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(true);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//retorna el arraylist

    }//metodo necesario para poder hacer la busqueda por nombre en las vistas.

    public List<Propietario> propietariosInactivosNombre(char letra) {
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE estado = 0 AND tipo = ? AND nombre LIKE ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // Configura el parámetro de la letra
                ps.setString(1, "tipo");
            ps.setString(2, letra + "%");
        
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(false);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietario

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;//retorna el arraylist

    }//metodo necesario para poder hacer la busqueda por nombre en las vistas.

    public List<Propietario> listarTodosPorNombre(char letra) {
        List<Propietario> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE nombre LIKE ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // Configura el parámetro de la letra
            ps.setString(1, letra + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {
                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(rs.getBoolean("estado"));

                propietarios.add(propietario);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;

    }//lista todos los propietarios por nombre
    
     public List<Propietario> listarTodosPropietariosPorCuilCuit(char cuil) {
        List<Cliente> propietarios = new ArrayList<>();
        String sql = "SELECT * FROM propietario WHERE cuilCuit = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cuil + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Propietario propietario = new Propietario();//se crea un propietario y luego se le cargan sus datos
                propietario.setIdPropietario(rs.getInt("idPropietario"));
                propietario.setTipo(TipoCliente.valueOf(rs.getString("tipo")));
                propietario.setNombre(rs.getString("nombreRsocial"));
                propietario.setDni(rs.getInt("dni"));
                propietario.setCuilCuit(rs.getLong("cuilCuit"));
                propietario.setLugarTrabajo(rs.getString("lugarTrabajo"));
                propietario.setDomicilio(rs.getString("domicilio"));
                propietario.setCiudad(rs.getString("ciudad"));
                propietario.setCodigoPostal(rs.getString("codigoPostal"));
                propietario.setTelefono(rs.getString("telefono"));
                propietario.setMail(rs.getString("mail"));
                propietario.setEstado(true);

                propietarios.add(propietario);//En cada vuelta del While va a ir agregando un propietari
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla propietario" + ex.getMessage());
        }
        return propietarios;

    }
    
    
    
    //faltaria agregar algun metodo mas creo y tambien arreglar lo del rs.get valor del enum q no se como se hace
    


    
    
    
    

}
