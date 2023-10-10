
package accesoDatos;

import Enums.TipoAlquiler;
import Enums.Zona;
import accesoDatos.Conexion;
import entidades.Alquiler;
import entidades.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlquilerData {
    private Connection con = null;

    public AlquilerData() {
        con = Conexion.getConexion();
    }
    
    public void nuevoAlquiler(Alquiler alquiler){
        
        String sql = "INSERT INTO alquiler( idInmueble, idCliente, idGarante, tipoCliente,"
                + " fechaInicio, fechaFin,precioEstimativo,deposito,gastos,gastosRecision, precioInicial, clausula, fechaFirma, fechaRescision, estado) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                alquiler.setIdAlquiler(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alquiler guardado correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AlquilerData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void bajaAlquiler(int id){
        
        String sql="UPDATE alquiler SET estado = 0 WHERE idAlquiler= ?";
        
      try {
          PreparedStatement ps =con.prepareStatement(sql);
          ps.setInt(1, id);
          int exito = ps.executeUpdate();//Como la sentencia devuelve un entero se crea una variable tipo int
          if(exito ==1){
              JOptionPane.showMessageDialog(null,"Alquiler eliminado con exito");
          }
          ps.close();
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alquiler");
      }
    }
        
      public void ReingresoAlquiler(int id){
        
        String sql="UPDATE alquiler SET estado = 0 WHERE idAlquiler= ? AND estado = 0";
        
      try {
          PreparedStatement ps =con.prepareStatement(sql);
          ps.setInt(1, id);
          int exito = ps.executeUpdate();//Como la sentencia devuelve un entero se crea una variable tipo int
          
          if(exito ==1){
              JOptionPane.showMessageDialog(null,"Alquiler reingresado con exito");
          }
          ps.close();
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alquiler");
      }
    }   
   
    
    public List<Alquiler> ListarAlquileresDisp(){
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * FROM alquiler WHERE estado =1";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }
    
    public List<Alquiler> ListarAlquileresNoDisponible(){
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * FROM alquiler WHERE estado =0";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }
    
    public List<Alquiler> ListarTodosAlquileres(){
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * from alquiler";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
           
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }
    
    public List<Alquiler> ListarTodosAlquileresXtipo(String tipo){
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * FROM alquiler WHERE tipo = ?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
             ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }

    
   public List<Alquiler> ListarTodosAlquileresXPrecio(){ 
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * FROM alquiler WHERE precioEstimativo =?";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }

    
    public List<Alquiler> ListarTodosAlquileresXZona(){ 
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT alquiler*, Inmueble.zona" +
                 "INNER JOIN inmueble I ON alquiler.idInmueble = Inmueble.idInmueble";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
           
             // Obtengo los valores de la fila actual en el ResultSet
                int idInmueble = rs.getInt("idInmueble");
                int idCliente = rs.getInt("idCliente");
                int idGarante = rs.getInt("idGarante");
                String tipo = rs.getString("tipo");
                Date fechaInicio = rs.getDate("fechaInicio");
                Date fechaFin = rs.getDate("fechaFin");
                double precioEstimativo = rs.getDouble("precioEstimativo");
                double deposito = rs.getDouble("deposito");
                double gastos = rs.getDouble("gastos");
                double gastosRecision = rs.getDouble("gastosRecision");
                double precioInicial = rs.getDouble("PrecioInicial");
                String clausula = rs.getString("clausula");
                Date fechaFirma = rs.getDate("fechaFirma");
                Date fechaRecision = rs.getDate("fechaRecision");
                boolean estado = rs.getBoolean("estado");
                
                String zona = rs.getString("zona");
            
            
            //llena el objeto Alquiler con los valores obtenidos
            alquiler.getInmueble().setIdInmueble(idInmueble);
            alquiler.getCliente().setIdCliente(idCliente);
            alquiler.getGarante().setIdGarante(idGarante);
            alquiler.setTipo(TipoAlquiler.valueOf(tipo)); // Tipo es un enum
            alquiler.setFechaInicio(fechaInicio.toLocalDate()); // Convierte Date a LocalDate
            alquiler.setFechaFin(fechaFin.toLocalDate());
            alquiler.setPrecioEstimativo(precioEstimativo);
            alquiler.setDeposito(deposito);
            alquiler.setGastos(gastos);
            alquiler.setGastosRecision(gastosRecision);
            alquiler.setPrecioInicial(precioInicial);
            alquiler.setClausula(clausula);
            alquiler.setFechaFirma(fechaFirma.toLocalDate());
            alquiler.setFechaRescision(fechaRecision.toLocalDate());
            alquiler.setEstado(estado);
            
            
          alquiler.getInmueble().setZona(Zona.valueOf(zona)); //Zona es un enum
            
            
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }
    
    
       public List<Alquiler> ListarTodosAlquileresXPropietario(){ 
        List<Alquiler> alquileres =new ArrayList<>();
       String sql= "SELECT alquiler*, Inmueble.idPropietario" +
               "FROM alquiler A"+
                 "INNER JOIN inmueble I ON alquiler.idInmueble = Inmueble.idInmueble";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
           
           // Obtengo los valores de la fila actual en el ResultSet
              int idInmueble = rs.getInt("idInmueble");
                int idCliente = rs.getInt("idCliente");
                int idGarante = rs.getInt("idGarante");
                String tipo = rs.getString("tipo");
                Date fechaInicio = rs.getDate("fechaInicio");
                Date fechaFin = rs.getDate("fechaFin");
                double precioEstimativo = rs.getDouble("precioEstimativo");
                double deposito = rs.getDouble("deposito");
                double gastos = rs.getDouble("gastos");
                double gastosRecision = rs.getDouble("gastosRecision");
                double precioInicial = rs.getDouble("PrecioInicial");
                String clausula = rs.getString("clausula");
                Date fechaFirma = rs.getDate("fechaFirma");
                Date fechaRecision = rs.getDate("fechaRecision");
                boolean estado = rs.getBoolean("estado");
                
                int idPropietario = rs.getInt("idPropietario");
            
            
            //llena el objeto Alquiler con los valores obtenidos
            alquiler.getInmueble().setIdInmueble(idInmueble);
            alquiler.getCliente().setIdCliente(idCliente);
            alquiler.getGarante().setIdGarante(idGarante);
            alquiler.setTipo(TipoAlquiler.valueOf(tipo)); // Tipo es un enum
            alquiler.setFechaInicio(fechaInicio.toLocalDate()); // Convierte Date a LocalDate
            alquiler.setFechaFin(fechaFin.toLocalDate());
            alquiler.setPrecioEstimativo(precioEstimativo);
            alquiler.setDeposito(deposito);
            alquiler.setGastos(gastos);
            alquiler.setGastosRecision(gastosRecision);
            alquiler.setPrecioInicial(precioInicial);
            alquiler.setClausula(clausula);
            alquiler.setFechaFirma(fechaFirma.toLocalDate());
            alquiler.setFechaRescision(fechaRecision.toLocalDate());
            alquiler.setEstado(estado);
    
            alquiler.getInmueble().getProp().setIdPropietario(idPropietario);
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }
       
       
         public List<Alquiler> ListarTodosAlquileresXCliente(int idCliente){ 
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * FROM alquiler WHERE idCliente = ?";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
             ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
            
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }
    
    
    public Alquiler buscarAlquiler(int idAlquiler){
        String sql= "SELECT * FROM alquiler WHERE idAlquiler=?";
        
     Alquiler alquiler = null; //Variable alquiler para mostrar los datos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlquiler);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
    
            alquiler = new Alquiler();
             ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
          
            }else{
                JOptionPane.showMessageDialog(null, "No existe ese alquiler");
            }
            ps.close();
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquiler; 
    }
    
    
   public Alquiler buscarAlquilerXTipo(TipoAlquiler tipo){ 
      String sql= "SELECT * FROM alquiler WHERE tipoAlquiler =?";
              
        
     Alquiler alquiler = null; //Variable alquiler para mostrar los datos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipo.toString());

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
    
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
          
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra ese tipo de alquiler");
            }
            ps.close();
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquiler; 
    }
    
    
    
    public Alquiler buscarAlquilerXcliente(int idCliente){
        String sql= "SELECT * FROM alquiler WHERE idCliente =?";
     Alquiler alquiler = null; //Variable alquiler para mostrar los datos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
                 ps.setInt(1, idCliente);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
    
            alquiler = new Alquiler();
           ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
          
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra ese cliente");
            }
            ps.close();
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquiler; 
    }
    
    
   public Alquiler buscarAlquilerXprecio(double precioEstimativo){
        String sql= "SELECT *FROM alquiler WHERE precioEstimativo=?";
        
     Alquiler alquiler = null; //Variable alquiler para mostrar los datos

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, precioEstimativo);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
    
            alquiler = new Alquiler();
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
          
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra ese precio");
            }
            ps.close();
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquiler; 
    }
 
    
public List<Alquiler> buscarAlquilerXZona(Zona zona) {
    List<Alquiler> alquileres = new ArrayList<>();
    String sql = "SELECT A.*, I.zona " +
                 "FROM alquiler A " +
                 "INNER JOIN inmueble I ON A.idInmueble = I.idInmueble " +
                 "WHERE I.zona = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, zona.toString()); // Configura la zona en la consulta
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Alquiler alquiler = new Alquiler();
            
            // Obtén los valores de la fila actual en el ResultSet
            int idAlquiler = rs.getInt("idAlquiler");
            int idInmueble = rs.getInt("idInmueble");
            int idCliente = rs.getInt("idCliente");
            int idGarante = rs.getInt("idGarante");
            String tipo = rs.getString("tipoAlquiler");
            Date fechaInicio = rs.getDate("fechaInicio");
            Date fechaFin = rs.getDate("fechaFin");
            double precioEstimativo = rs.getDouble("precioEstimativo");
            double deposito = rs.getDouble("deposito");
            double gastos = rs.getDouble("gastos");
            double gastosRecision = rs.getDouble("gastosRecision");
            double precioInicial = rs.getDouble("precioInicial");
            String clausula = rs.getString("clausula");
            Date fechaFirma = rs.getDate("fechaFirma");
            Date fechaRecision = rs.getDate("fechaRecision");
            boolean estado = rs.getBoolean("estado");

            // Llena el objeto Alquiler con los valores obtenidos
            alquiler.setIdAlquiler(idAlquiler);
            alquiler.getInmueble().setIdInmueble(idInmueble);
            alquiler.getCliente().setIdCliente(idCliente);
            alquiler.getGarante().setIdGarante(idGarante);
            alquiler.setTipo(TipoAlquiler.valueOf(tipo)); // Configura el tipo de alquiler desde el ResultSet
            alquiler.setFechaInicio(fechaInicio.toLocalDate());
            alquiler.setFechaFin(fechaFin.toLocalDate());
            alquiler.setPrecioEstimativo(precioEstimativo);
            alquiler.setDeposito(deposito);
            alquiler.setGastos(gastos);
            alquiler.setGastosRecision(gastosRecision);
            alquiler.setPrecioInicial(precioInicial);
            alquiler.setClausula(clausula);
            alquiler.setFechaFirma(fechaFirma.toLocalDate());
            alquiler.setFechaRescision(fechaRecision.toLocalDate());
            alquiler.setEstado(estado);
            
            // Configura la zona en el inmueble del alquiler
            alquiler.getInmueble().setZona(Zona.valueOf(rs.getString("zona")));

            alquileres.add(alquiler);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alquiler: " + ex.getMessage());
    }
    return alquileres;
}
    
public List<Alquiler> buscarAlquilerPorDescripcion(String descripcion) {
    List<Alquiler> alquileres = new ArrayList<>();
    String sql = "SELECT A.*, I.zona " +
                 "FROM alquiler A " +
                 "INNER JOIN inmueble I ON A.idInmueble = I.idInmueble " +
                 "WHERE I.descripcion LIKE ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, "%" + descripcion + "%"); // Configura la descripción en la consulta
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
                Alquiler alquiler = new Alquiler();
            
            // Obtén los valores de la fila actual en el ResultSet
            int idAlquiler = rs.getInt("idAlquiler");
            int idInmueble = rs.getInt("idInmueble");
            int idCliente = rs.getInt("idCliente");
            int idGarante = rs.getInt("idGarante");
            String tipo = rs.getString("tipoAlquiler");
            Date fechaInicio = rs.getDate("fechaInicio");
            Date fechaFin = rs.getDate("fechaFin");
            double precioEstimativo = rs.getDouble("precioEstimativo");
            double deposito = rs.getDouble("deposito");
            double gastos = rs.getDouble("gastos");
            double gastosRecision = rs.getDouble("gastosRecision");
            double precioInicial = rs.getDouble("precioInicial");
            String clausula = rs.getString("clausula");
            Date fechaFirma = rs.getDate("fechaFirma");
            Date fechaRecision = rs.getDate("fechaRecision");
            boolean estado = rs.getBoolean("estado");

            // Llena el objeto Alquiler con los valores obtenidos
            alquiler.setIdAlquiler(idAlquiler);
            alquiler.getInmueble().setIdInmueble(idInmueble);
            alquiler.getCliente().setIdCliente(idCliente);
            alquiler.getGarante().setIdGarante(idGarante);
            alquiler.setTipo(TipoAlquiler.valueOf(tipo)); // Configura el tipo de alquiler desde el ResultSet
            alquiler.setFechaInicio(fechaInicio.toLocalDate());
            alquiler.setFechaFin(fechaFin.toLocalDate());
            alquiler.setPrecioEstimativo(precioEstimativo);
            alquiler.setDeposito(deposito);
            alquiler.setGastos(gastos);
            alquiler.setGastosRecision(gastosRecision);
            alquiler.setPrecioInicial(precioInicial);
            alquiler.setClausula(clausula);
            alquiler.setFechaFirma(fechaFirma.toLocalDate());
            alquiler.setFechaRescision(fechaRecision.toLocalDate());
            alquiler.setEstado(estado);
            
            alquiler.getInmueble().setDescripcion(rs.getString("descripcion")); // Configura la descripción
            
            alquileres.add(alquiler);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar alquileres por descripción: " + ex.getMessage());
    }
    
    return alquileres;
}
    
            
public void modificarAlquiler(Alquiler alquiler) {
        String sql = "UPDATE alquiler SET idInmueble = ?,idCliente = ?,idGarante = ?,tipoCliente = ?,tipoAlquiler = ?,fechaInicio = ?,fechaFin=?,precioEstimativo = ?, deposito = ?,gastos = ?,gastosRecision =?,precioInicial = ?,clausula = ?,fechaFirma= ?,fechaRescision =?,estado=?"
+ "WHERE idAlquiler=? AND estado=1";


        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setObject(4, alquiler.getTipo().toString());
            ps.setDate(5,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(6, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(7, alquiler.getPrecioEstimativo());
            ps.setDouble(8, alquiler.getDeposito());
            ps.setDouble(9, alquiler.getGastos());
            ps.setDouble(10, alquiler.getGastosRecision());
            ps.setDouble(11, alquiler.getPrecioInicial());
            ps.setString(12, alquiler.getClausula());
            ps.setDate(13, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(14, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(15, alquiler.isEstado());
          
            
    
         int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Alquiler modificado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido modificar");
        }
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alquiler: " + ex.getMessage());
    }

    }

}







