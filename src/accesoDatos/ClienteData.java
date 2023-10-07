package accesoDatos;

import Enums.TipoCliente;
import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteData {

    private Connection con = null;

    public ClienteData() {

        con = Conexion.getConexion();

    }

    public void agregarClienteFisico(Cliente cliente) {

        String sql = "INSERT INTO cliente(tipo, nombreRsocial, dni, cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
//            System.out.println(cliente.toString());
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
//            System.out.println(cliente.toString());

            ps.setString(1, cliente.getTipo().toString());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getDni());
            ps.setLong(4, cliente.getCuilCuit());
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }
    }

    public void agregarClienteJuridico(Cliente cliente) {

        String sql = "INSERT INTO cliente(tipo, nombreRsocial,cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
//            System.out.println(cliente.toString());
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
//            System.out.println(cliente.toString());

            ps.setString(1, cliente.getTipo().toString());
            ps.setString(2, cliente.getNombre());
            ps.setLong(3, cliente.getCuilCuit());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getCiudad());
            ps.setString(6, cliente.getCodigoPostal());
            ps.setString(7, cliente.getLugarTrabajo());
            ps.setString(8, cliente.getTelefono());
            ps.setString(9, cliente.getMail());
            ps.setBoolean(10, cliente.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Cliente guardado correctamente");
                //Generamos un mje de comprobacion, pero antes creamos un alumno en el main del proyecto
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }
    }

    public void modificarClienteFisico(Cliente cliente) {
        String sql = "UPDATE cliente SET  tipo= ?,nombreRsocial = ?,dni=? ,cuilCuit= ?,domicilio = ?,ciudad = ?"
                + ",codigoPostal = ?,lugarTrabajo = ?,telefono= ?,mail= ? WHERE idCliente = ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cliente.getTipo().toString());
            ps.setString(2, cliente.getNombre());
            ps.setInt(3, cliente.getDni());
            ps.setLong(4, cliente.getCuilCuit());
            ps.setString(5, cliente.getDomicilio());
            ps.setString(6, cliente.getCiudad());
            ps.setString(7, cliente.getCodigoPostal());
            ps.setString(8, cliente.getLugarTrabajo());
            ps.setString(9, cliente.getTelefono());
            ps.setString(10, cliente.getMail());
            ps.setInt(11, cliente.getIdCliente());

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Cliente modificado con exito.");

                /*Guardamos los cambios y ejecutamos desde el main*/
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex);
        }

    }

    public void modificarClienteJuridico(Cliente cliente) {
        String sql = "UPDATE cliente SET  tipo= ?,nombreRsocial = ?,cuilCuit= ?,domicilio = ?,ciudad = ?"
                + ",codigoPostal = ?,lugarTrabajo = ?,telefono= ?,mail= ? WHERE idCliente = ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cliente.getTipo().toString());
            ps.setString(2, cliente.getNombre());
            ps.setLong(3, cliente.getCuilCuit());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getCiudad());
            ps.setString(6, cliente.getCodigoPostal());
            ps.setString(7, cliente.getLugarTrabajo());
            ps.setString(8, cliente.getTelefono());
            ps.setString(9, cliente.getMail());
            ps.setInt(10, cliente.getIdCliente());

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Cliente modificado con exito.");

                /*Guardamos los cambios y ejecutamos desde el main*/
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex);
        }

    }

    public void eliminarCliente(int id) {
        String sql = "UPDATE cliente SET estado = 0 WHERE idCliente = ?";
        //Solo vamos a hacer un eliminado logico, o sea, cambiar estado a 0.
        //Recibimos por parametro el id del alumno que va a ser eliminado
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Cliente eliminado con exito.");

                /*Guardamos los cambios y ejecutamos desde el main*/
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }

    }

    public Cliente buscarCliente(int id) {
        String sql = "SELECT tipo, nombreRsocial, dni, cuilCuit, domicilio, ciudad, codigoPostal,"
                + " lugarTrabajo, telefono, mail, estado FROM cliente WHERE idCliente = ?";
        Cliente cliente = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);//Reemplazamos el comodin "?" por el id del alumno que ingresamos por parametro

            /*Cada vez que necesitemos buscar y mostrar datos necesitamos usar la 
            sentencia ResulSet, que nos va a mostrar el resultado en la terminal*/
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {//Comprobamos si hay algun elemento

                cliente = new Cliente();//Creo un alumno con el constructor vacio
                //Y a continuacion le seteo todos los datos
                cliente.setIdCliente(id);
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));
                System.out.println(cliente.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese Cliente");
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public Cliente buscarClientePorDni(char dni) {
        String sql = "SELECT tipo, nombreRsocial, dni, cuilCuit, domicilio, ciudad, codigoPostal,"
                + " lugarTrabajo, telefono, mail, estado FROM cliente WHERE dni = ?";
        Cliente cliente = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);//Reemplazamos el comodin "?" por el id del alumno que ingresamos por parametro

            /*Cada vez que necesitemos buscar y mostrar datos necesitamos usar la 
            sentencia ResulSet, que nos va a mostrar el resultado en la terminal*/
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {//Comprobamos si hay algun elemento

                cliente = new Cliente();//Creo un alumno con el constructor vacio
                //Y a continuacion le seteo todos los datos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt(dni));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese Cliente");
            }
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public Cliente buscarClientePorCuilCuit(char cuilCuit) {
        String sql = "SELECT tipo, nombreRsocial, dni, cuilCuit, domicilio, ciudad, codigoPostal,"
                + " lugarTrabajo, telefono, mail, estado FROM cliente WHERE cuilCuit = ?";
        Cliente cliente = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cuilCuit);//Reemplazamos el comodin "?" por el id del alumno que ingresamos por parametro

            /*Cada vez que necesitemos buscar y mostrar datos necesitamos usar la 
            sentencia ResulSet, que nos va a mostrar el resultado en la terminal*/
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {//Comprobamos si hay algun elemento

                cliente = new Cliente();//Creo un alumno con el constructor vacio
                //Y a continuacion le seteo todos los datos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(cuilCuit);
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese Cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public Cliente buscarClientePorNombre(String nombre) {
        String sql = "SELECT tipo, nombreRsocial, dni, cuilCuit, domicilio, ciudad, codigoPostal,"
                + " lugarTrabajo, telefono, mail, estado FROM cliente WHERE nombreRsocial = ?";
        Cliente cliente = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);//Reemplazamos el comodin "?" por el id del alumno que ingresamos por parametro

            /*Cada vez que necesitemos buscar y mostrar datos necesitamos usar la 
            sentencia ResulSet, que nos va a mostrar el resultado en la terminal*/
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {//Comprobamos si hay algun elemento

                cliente = new Cliente();//Creo un alumno con el constructor vacio
                //Y a continuacion le seteo todos los datos
//                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese Cliente");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public List<Cliente> listarTodosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
//                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public List<Cliente> listarTodosClientesActivos() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
//                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;

    }

    public List<Cliente> listarTodosClientesNoActivos() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;

    }

    public List<Cliente> listarTodosClientesPorNombre(String nombre) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE nombreRsocial = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nombre + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public List<Cliente> listarClientesActivosPorNombre(String nombre) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE nombreRsocial = ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nombre + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;

    }

    public List<Cliente> listarClientesNoActivosPorNombre(String nombre) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE nombreRsocial = ? AND estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nombre + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;

    }

    public List<Cliente> listarTodosClientesPorCuilCuit(char cuil) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE cuilCuit = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cuil + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;

    }

    public List<Cliente> listarClientesActivosPorCuilCuit(char cuil) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE cuilCuit = ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cuil + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public List<Cliente> listarClientesNoActivosPorCuilCuit(char cuil) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE cuilCuit = ? AND estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, cuil + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public List<Cliente> listarTodosClientesDni(char dni) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE cuilCuit = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;

    }

    public List<Cliente> listarClientesActivosDni(char dni) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE cuilCuit = ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;

    }

    public List<Cliente> listarClientesNoActivosDni(char dni) {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente WHERE cuilCuit = ? AND estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni + "%");
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
                cliente.setIdCliente(rs.getInt("idCliente"));
                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
                cliente.setTipo(tipoCliente);
                cliente.setNombre(rs.getString("nombreRsocial"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setCuilCuit(rs.getLong("cuilCuit"));
                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setCodigoPostal(rs.getString("codigoPostal"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setMail(rs.getString("mail"));
                cliente.setEstado(rs.getBoolean("estado"));

                clientes.add(cliente);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;

    }

//    public List<Cliente> listarClientesPorTipo(String tipo) {
//        List<Cliente> clientes = new ArrayList<>();
//        String sql = "SELECT * FROM cliente WHERE tipo = ?";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setString(1, tipo + "%");
//            ResultSet rs = ps.executeQuery();
//            /*Como el ResultSet va a devolver mas de una fila,
//            recorremos el resultado con un While.*/
//            while (rs.next()) {
//
//                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
//                cliente.setIdCliente(rs.getInt("idCliente"));
//                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
//                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
//                cliente.setTipo(tipoCliente);
//                cliente.setNombre(rs.getString("nombreRsocial"));
//                cliente.setDni(rs.getInt("dni"));
//                cliente.setCuilCuit(rs.getLong("cuilCuit"));
//                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
//                cliente.setDomicilio(rs.getString("domicilio"));
//                cliente.setCiudad(rs.getString("ciudad"));
//                cliente.setCodigoPostal(rs.getString("codigoPostal"));
//                cliente.setTelefono(rs.getString("telefono"));
//                cliente.setMail(rs.getString("mail"));
//                cliente.setEstado(rs.getBoolean("estado"));
//
//                clientes.add(cliente);
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return clientes;
//
//    }
//
//    public List<Cliente> listarClientesPorTipoActivos(String tipo) {
//        List<Cliente> clientes = new ArrayList<>();
//        String sql = "SELECT * FROM cliente WHERE tipo = ? AND estado = 1";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setString(1, tipo + "%");
//            ResultSet rs = ps.executeQuery();
//            /*Como el ResultSet va a devolver mas de una fila,
//            recorremos el resultado con un While.*/
//            while (rs.next()) {
//
//                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
//                cliente.setIdCliente(rs.getInt("idCliente"));
//                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
//                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
//                cliente.setTipo(tipoCliente);
//                cliente.setNombre(rs.getString("nombreRsocial"));
//                cliente.setDni(rs.getInt("dni"));
//                cliente.setCuilCuit(rs.getLong("cuilCuit"));
//                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
//                cliente.setDomicilio(rs.getString("domicilio"));
//                cliente.setCiudad(rs.getString("ciudad"));
//                cliente.setCodigoPostal(rs.getString("codigoPostal"));
//                cliente.setTelefono(rs.getString("telefono"));
//                cliente.setMail(rs.getString("mail"));
//                cliente.setEstado(rs.getBoolean("estado"));
//
//                clientes.add(cliente);
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return clientes;
//
//    }
//
//    public List<Cliente> listarClientesPorTipoNoActivos(TipoCliente tipo) {
//        List<Cliente> clientes = new ArrayList<>();
//        String sql = "SELECT * FROM cliente WHERE tipo = ? AND estado = 0";
//
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//
//            ps.setString(1, tipo + "%");
//            ResultSet rs = ps.executeQuery();
//            /*Como el ResultSet va a devolver mas de una fila,
//            recorremos el resultado con un While.*/
//            while (rs.next()) {
//
//                Cliente cliente = new Cliente();//Creo un alumno y voy seteando los atributos
//                cliente.setIdCliente(rs.getInt("idCliente"));
//                String tipoClienteStr = rs.getString("tipo");//Primero obtengo el valor de la columna tipo
//                TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr); // Convierte la cadena a TipoCliente (Enum)
//                cliente.setTipo(tipoCliente);
//                cliente.setNombre(rs.getString("nombreRsocial"));
//                cliente.setDni(rs.getInt("dni"));
//                cliente.setCuilCuit(rs.getLong("cuilCuit"));
//                cliente.setLugarTrabajo(rs.getString("lugarTrabajo"));
//                cliente.setDomicilio(rs.getString("domicilio"));
//                cliente.setCiudad(rs.getString("ciudad"));
//                cliente.setCodigoPostal(rs.getString("codigoPostal"));
//                cliente.setTelefono(rs.getString("telefono"));
//                cliente.setMail(rs.getString("mail"));
//                cliente.setEstado(rs.getBoolean("estado"));
//
//                clientes.add(cliente);
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return clientes;
//
//    }
//
}
