package accesoDatos;

import Enums.TipoCliente;
import entidades.Cliente;
import entidades.Garante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class GaranteData {

    Connection con = null;

    public GaranteData() {
        con = Conexion.getConexion();
    }

    public void agregarGaranteFisico(Garante garante) {

        String sql = "INSERT INTO garante(tipo, nombreRsocial, dni, cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setObject(1, garante.getTipo().toString());
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");

        }

    }

    public void agregarGaranteJuridico(Garante garante) {

        String sql = "INSERT INTO cliente(tipo, nombreRsocial,cuilCuit, domicilio,ciudad,"
                + " codigoPostal, lugarTrabajo,  telefono, mail,  estado) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setObject(1, garante.getTipo().toString());
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");

        }
    }


public void modificarGaranteFisico(Garante garante) {
        String sql = "UPDATE garante SET tipo= ?,nombreRsocial=? ,dni=?,cuilCuit=?,domicilio=?,ciudad=?,codigoPostal=?,lugarTrabajo=?,telefono=?,mail=?"
                + "WHERE idGarante= ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, garante.getTipo().toString());
            ps.setString(2, garante.getNombre());
            ps.setInt(3, garante.getDni());
            ps.setInt(4, garante.getCuilCuit());
            ps.setString(5, garante.getDomicilio());
            ps.setString(6, garante.getCiudad());
            ps.setString(7, garante.getCodigoPostal());
            ps.setString(8, garante.getLugarTrabajo());
            ps.setString(9, garante.getTelefono());
            ps.setString(10, garante.getMail());
            ps.setInt(11, garante.getIdGarante());
          
         

         int exito = ps.executeUpdate();
         
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Garante modificado correctamente");
            
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar");
        }
     
     
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante: " + ex.getMessage());
    }

    }


    
    public void modificarGaranteJuridico(Garante garante) {
        String sql = "UPDATE garante SET tipo= ?,nombreRsocial=? ,dni=?,cuilCuit=?,domicilio=?,ciudad=?,codigoPostal=?,lugarTrabajo=?,telefono=?,mail=?"
                + "WHERE idGarante= ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setObject(1, garante.getTipo().toString());
            ps.setString(2, garante.getNombre());
            ps.setInt(3, garante.getDni());
            ps.setInt(4, garante.getCuilCuit());
            ps.setString(5, garante.getDomicilio());
            ps.setString(6, garante.getCiudad());
            ps.setString(7, garante.getCodigoPostal());
            ps.setString(8, garante.getLugarTrabajo());
            ps.setString(9, garante.getTelefono());
            ps.setString(10, garante.getMail());
            ps.setInt(11, garante.getIdGarante());
          
         

         int exito = ps.executeUpdate();
         
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Garante modificado correctamente");
            
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar");
        }
     
     
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante: " + ex.getMessage());
    }

    }

 public List<Garante> ListarTodosGarantes() {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    }
    
  public List<Garante> ListarTodosGarantesActivos() {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                 
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    }
 
  
  public List<Garante> ListarTodosGarantesNoActivos() {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    }
  
  public List<Garante> ListarTodosGarantesXNombre(String nombre) {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE nombreRsocial = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, nombre + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                   garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    }
  
  
  public List<Garante> ListarTodosGarantesActivosPorNombre(String nombre){//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE nombreRsocial = ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, nombre + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                   garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    }
  
  public List<Garante> ListarTodosGarantesNoActivosXNombre(String nombre) {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE nombreRsocial =? AND estado=0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
                  ps.setString(1, nombre + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                  garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    }
  
  public List<Garante> ListarTodosGarantesPorCuilCuit(char cuil) {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE cuilCuit =?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
               ps.setString(1, cuil + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                 garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    }
  
  
  public List<Garante> ListarTodosGarantesActivosXCuilCuit(char cuil) {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE cuilCuit = ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, cuil + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                  garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    } 
  
   public List<Garante> ListarTodosGarantesNoActivosXCuilCuit(char cuil) {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE cuilCuit = ? AND estado = 0";

        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
          
              ps.setString(1, cuil + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                  garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    } 
  
    public List<Garante> ListarTodosGarantesDni(char dni) {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE dni= ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, dni + "%");
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                  garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    } 
    
     public List<Garante> ListarTodosGarantesActivosXDni(char dni) {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE dni = ? AND estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
              ps.setString(1, dni + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                  garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    } 
    
      public List<Garante> ListarTodosGarantesNoActivosXDni(char dni) {//Devuelve una lista de alumnos
        List<Garante> garantes = new ArrayList<>();
        String sql = "SELECT *FROM garante WHERE dni= ? AND estado = 0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
              ps.setString(1, dni + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Garante garante = new Garante();
                garante.setIdGarante(rs.getInt("idGarante"));
                String tipoClienteStr= rs.getString ("tipo");
              TipoCliente tipoCliente = TipoCliente.valueOf(tipoClienteStr);
             garante.setTipo(tipoCliente);
                ps.setObject(1, garante.getTipo().toString());
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

                garantes.add(garante);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante" + ex.getMessage());
        }
        return garantes; //retorna la lista de garantes
    } 
    public Garante buscarGarante(int id) {
        String sql = "SELECT tipo, nombreRsocial, dni, cuilCuit, domicilio, ciudad, codigoPostal,lugarTrabajo,telefono,mail,estado"
                + "FROM garante WHERE idGarante =?";

        Garante garante = null; //Variable garante para mostrar los datos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                garante = new Garante();

                ps.setObject(1, garante.getTipo().toString());
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
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese garante");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");
        }
        return garante;
    }

    public Garante buscarGarantePorNombre(String nombre) {
        String sql = "SELECT tipo, nombreRsocial, dni, cuilCuit, domicilio, ciudad, codigoPostal,lugarTrabajo,telefono,mail,estado"
                + "FROM garante WHERE nombreRsocial =?";

        Garante garante = null; //Variable garante para mostrar los datos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(3, nombre);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                garante = new Garante();

                ps.setObject(1, garante.getTipo().toString());
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
            } else {
                JOptionPane.showMessageDialog(null, "No existe un garante con ese nombre");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");
        }
        return garante;
    }

    
    public Garante buscarGarantePorDni(int id) {
        String sql = "SELECT tipo, nombreRsocial, dni, cuilCuit, domicilio, ciudad, codigoPostal,lugarTrabajo,telefono,mail,estado"
                + "FROM garante WHERE dni =?";

        Garante garante = null; //Variable garante para mostrar los datos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                garante = new Garante();
 
                ps.setInt(1, garante.getIdGarante());
                ps.setObject(2, garante.getTipo().toString());
                ps.setString(3, garante.getNombre());
                ps.setInt(4, garante.getDni());
                ps.setInt(5, garante.getCuilCuit());
                ps.setString(6, garante.getDomicilio());
                ps.setString(7, garante.getCiudad());
                ps.setString(8, garante.getCodigoPostal());
                ps.setString(9, garante.getLugarTrabajo());
                ps.setString(10, garante.getTelefono());
                ps.setString(11, garante.getMail());
                ps.setBoolean(12, garante.isEstado());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese garante");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");
        }
        return garante;
        
    }
    
     public Garante buscarGarantePorCuilCuit(char cuilCuit) {
        String sql = "SELECT tipo, nombreRsocial, dni, cuilCuit, domicilio, ciudad, codigoPostal,lugarTrabajo,telefono,mail,estado"
                + "FROM garante WHERE cuilCuit =?";

        Garante garante = null; //Variable garante para mostrar los datos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cuilCuit);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                garante = new Garante();
 
                ps.setInt(1, garante.getIdGarante());
                ps.setObject(2, garante.getTipo().toString());
                ps.setString(3, garante.getNombre());
                ps.setInt(4, garante.getDni());
                ps.setInt(5, garante.getCuilCuit());
                ps.setString(6, garante.getDomicilio());
                ps.setString(7, garante.getCiudad());
                ps.setString(8, garante.getCodigoPostal());
                ps.setString(9, garante.getLugarTrabajo());
                ps.setString(10, garante.getTelefono());
                ps.setString(11, garante.getMail());
                ps.setBoolean(12, garante.isEstado());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese garante");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");
        }
        return garante;
        
    }
    
    public void eliminarGarante(int id) {
        String sql = "UPDATE garante SET estado= 0 WHERE idGarante = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero se crea una variable tipo int
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Garante eliminado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante");
        }
    }
}
