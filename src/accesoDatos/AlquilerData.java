
package accesoDatos;

import Enums.TipoAlquiler;
import Enums.TipoCliente;
import Enums.Zona;
import accesoDatos.Conexion;
import entidades.Alquiler;
import entidades.Cliente;
import entidades.Garante;
import entidades.Inmueble;
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
    InmuebleData inmData = null;
    ClienteData cliData = null;
    GaranteData garData = null;

    public AlquilerData() {
        con = Conexion.getConexion();
        inmData = new InmuebleData();
        cliData = new ClienteData();
        garData = new GaranteData();
    }

    public void nuevoAlquiler(Alquiler alquiler){
        
        String sql = "INSERT INTO alquiler( idInmueble, idCliente, idGarante, tipoCliente,"
                + " tipoAlquiler, fechaInicio, fechaFin,precioEstimativo,deposito,gastos,gastosRecision, precioInicial, "
                + "clausula, fechaFirma, fechaRecision, estado) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
//       povv +000iop{Falta tipo alquiler
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alquiler.getInmueble().getIdInmueble());
            ps.setInt(2, alquiler.getCliente().getIdCliente());
            ps.setInt(3, alquiler.getGarante().getIdGarante());
            ps.setString(4, alquiler.getTipoC().toString());
            ps.setString(5,alquiler.getTipo().toString());
             ps.setDate(6,Date.valueOf(alquiler.getFechaInicio()));
            ps.setDate(7, Date.valueOf(alquiler.getFechaFin()));
            ps.setDouble(8, alquiler.getPrecioEstimativo());
            ps.setDouble(9, alquiler.getDeposito());
            ps.setDouble(10, alquiler.getGastos());
            ps.setDouble(11, alquiler.getGastosRecision());
            ps.setDouble(12, alquiler.getPrecioInicial());
            ps.setString(13, alquiler.getClausula());
            ps.setDate(14, Date.valueOf(alquiler.getFechaFirma()));
            ps.setDate(15, Date.valueOf(alquiler.getFechaRescision()));
            ps.setBoolean(16, alquiler.isEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                alquiler.setIdAlquiler(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alquiler guardado correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alquiler"+ex);
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
          Inmueble inm= inmData.buscarPropiedadId(rs.getInt("idInmueble"));
          alquiler.setIdAlquiler(rs.getInt("idAlquiler"));
            alquiler.setInmueble(inm);
            alquiler.getCliente().setIdCliente(rs.getInt("idCliente"));
            alquiler.getGarante().setIdGarante(rs.getInt("idGarante"));
            alquiler.setTipo(TipoAlquiler.valueOf(rs.getString("tipoAlquiler")));
            alquiler.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
            alquiler.setFechaFin(rs.getDate("fechaFin").toLocalDate());
            alquiler.setPrecioEstimativo(rs.getDouble("precioEstimativo"));
            alquiler.setDeposito(rs.getDouble("deposito"));
            alquiler.setGastos(rs.getDouble("gastos"));
            alquiler.setGastosRecision(rs.getDouble("gastosRecision"));
            alquiler.setPrecioInicial(rs.getDouble("precioInicial"));
            alquiler.setClausula(rs.getString("clausula"));
            alquiler.setFechaFirma(rs.getDate("fechaFirma").toLocalDate());
            alquiler.setFechaRescision(rs.getDate("fechaRecision").toLocalDate());
            alquiler.setEstado(rs.getBoolean("estado"));
            
            alquileres.add(alquiler);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alquiler: " + ex.getMessage());
    }
    return alquileres;
    }
    
    public List<Alquiler> ListarAlquileresNoDisponible(){
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * FROM alquiler WHERE estado =0";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
                while(rs.next()){
           Alquiler alquiler = new Alquiler();
          Inmueble inm= inmData.buscarPropiedadId(rs.getInt("idInmueble"));
          alquiler.setIdAlquiler(rs.getInt("idAlquiler"));
            alquiler.setInmueble(inm);
            alquiler.getCliente().setIdCliente(rs.getInt("idCliente"));
            alquiler.getGarante().setIdGarante(rs.getInt("idGarante"));
            alquiler.setTipo(TipoAlquiler.valueOf(rs.getString("tipoAlquiler")));
             alquiler.setTipoC(TipoCliente.valueOf(rs.getString("TipoCliente")));
            alquiler.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
            alquiler.setFechaFin(rs.getDate("fechaFin").toLocalDate());
            alquiler.setPrecioEstimativo(rs.getDouble("precioEstimativo"));
            alquiler.setDeposito(rs.getDouble("deposito"));
            alquiler.setGastos(rs.getDouble("gastos"));
            alquiler.setGastosRecision(rs.getDouble("gastosRecision"));
            alquiler.setPrecioInicial(rs.getDouble("precioInicial"));
            alquiler.setClausula(rs.getString("clausula"));
            alquiler.setFechaFirma(rs.getDate("fechaFirma").toLocalDate());
            alquiler.setFechaRescision(rs.getDate("fechaRecision").toLocalDate());
            alquiler.setEstado(rs.getBoolean("estado"));
            
            alquileres.add(alquiler);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alquiler: " + ex.getMessage());
    }
    return alquileres;
    }
    
    public List<Alquiler> ListarTodosAlquileres(){
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * from alquiler";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
              while(rs.next()){
           Alquiler alquiler = new Alquiler();
           
                alquiler.setIdAlquiler(rs.getInt("idAlquiler"));   
             Inmueble inm= inmData.buscarPropiedadId(rs.getInt("idInmueble"));
            alquiler.setInmueble(inm);
            Cliente cli = cliData.buscarCliente(rs.getInt("IdCliente"));
            alquiler.setCliente(cli);
            Garante gar =garData.buscarGarante(rs.getInt("IdGarante"));
        
            alquiler.setGarante(gar);
             alquiler.setIdAlquiler(rs.getInt("idAlquiler"));
            
                String tipoC = rs.getString("tipoCliente");

                String tipoA =rs.getString("tipoAlquiler");
            
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
                
             
            
            
            //llena el objeto Alquiler con los valores obtenidos
           
            alquiler.setTipo(TipoAlquiler.valueOf(tipoA)); // Tipo es un enum
           alquiler.setTipoC(TipoCliente.valueOf(tipoC));
//            alquiler.setTipoC(TipoCliente.valueOf(tipoC));
            alquiler.setFechaInicio(fechaInicio.toLocalDate()); // Convierte Date a LocalDate
            alquiler.setFechaFin(fechaFin.toLocalDate());
            alquiler.setPrecioEstimativo(precioEstimativo);
            alquiler.setDeposito(deposito);
            alquiler.setGastos(gastos);
            alquiler.setGastosRecision(gastosRecision);
            alquiler.setPrecioInicial(precioInicial);
            alquiler.setClausula(clausula);
            alquiler.setFechaFirma(fechaFirma.toLocalDate());
          
             if(fechaRecision!= null){
                alquiler.setFechaRescision(fechaRecision.toLocalDate());
                
            }else{
                alquiler.setEstado(estado);
            }
            alquiler.setEstado(estado);
          
   
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alquiler"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }
    
     public List<Alquiler> ListarTodosAlquileresXtipo(TipoAlquiler tipoA){
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * FROM alquiler WHERE tipoAlquiler = ?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, tipoA.toString());
            ResultSet rs = ps.executeQuery();
            
            
            while(rs.next()){
                Alquiler alquiler =new Alquiler();
            Inmueble inmueble = inmData.buscarPropiedadId(rs.getInt("idInmueble"));
           Cliente cliente =cliData.buscarCliente(rs.getInt("idCliente"));
          Garante garante =garData.buscarGarante(rs.getInt("idGarante"));
        alquiler.setIdAlquiler(rs.getInt("idAlquiler"));
              String tipo = rs.getString("tipoAlquiler");
              String tipoC = rs.getString("tipoCliente");
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
                
                
                
               alquiler.setInmueble(inmueble);
            alquiler.setCliente(cliente);
            alquiler.setGarante(garante);
             TipoAlquiler tipoAlquiler= TipoAlquiler.valueOf(tipo);
          alquiler.setTipo(tipoAlquiler);
            alquiler.setTipoC(TipoCliente.valueOf(tipoC)); // Tipo es un enum
            alquiler.setFechaInicio(fechaInicio.toLocalDate()); // Convierte Date a LocalDate
            alquiler.setFechaFin(fechaFin.toLocalDate());
            alquiler.setPrecioEstimativo(precioEstimativo);
            alquiler.setDeposito(deposito);
            alquiler.setGastos(gastos);
            alquiler.setGastosRecision(gastosRecision);
            alquiler.setPrecioInicial(precioInicial);
            alquiler.setClausula(clausula);
            alquiler.setFechaFirma(fechaFirma.toLocalDate());
         
             if(fechaRecision!= null){
                alquiler.setFechaRescision(fechaRecision.toLocalDate());
                
            }else{
                
            }
         alquiler.setEstado(estado);
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alquiler"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }


    
   
    
   public List<Alquiler> ListarTodosAlquileresXZona(Zona zona){ 
        List<Alquiler> alquileres =new ArrayList<>();
        String sql= "SELECT * FROM alquiler JOIN inmueble ON (alquiler.idInmueble= inmueble.idInmueble) WHERE inmueble.Zona = ?";

    try {
            PreparedStatement ps=con.prepareStatement(sql);
             ps.setString(1, zona.toString());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
         Alquiler alquiler = new Alquiler();
           Inmueble inmueble = inmData.buscarPropiedadId(rs.getInt("idInmueble"));
           //OBSERVAR IDCLIENTE
           Cliente cliente =cliData.buscarCliente(rs.getInt("idCliente"));
          Garante garante =garData.buscarGarante(rs.getInt("idGarante"));
           alquiler.setIdAlquiler(rs.getInt("idAlquiler"));
//             inmueble.getZona();
            String tipoA =rs.getString("tipoAlquiler");
                String tipoC = rs.getString("tipoCliente");
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
//                String zonaa=rs.getString("Zona");
          
            
            //llena el objeto Alquiler con los valores obtenidos
           alquiler.setInmueble(inmueble);
            alquiler.setCliente(cliente);
            alquiler.setGarante(garante);
            alquiler.setTipo(TipoAlquiler.valueOf(tipoA)); // Tipo es un enum
            alquiler.setTipoC(TipoCliente.valueOf(tipoC)); // Tipo es un enum
            alquiler.setFechaInicio(fechaInicio.toLocalDate()); // Convierte Date a LocalDate
            alquiler.setFechaFin(fechaFin.toLocalDate());
            alquiler.setPrecioEstimativo(precioEstimativo);
            alquiler.setDeposito(deposito);
            alquiler.setGastos(gastos);
            alquiler.setGastosRecision(gastosRecision);
            alquiler.setPrecioInicial(precioInicial);
            alquiler.setClausula(clausula);
            alquiler.setFechaFirma(fechaFirma.toLocalDate());
//            zona = Zona.valueOf(zonaa);
//            inmueble.setZona(zona);
      
            
            
             if(fechaRecision!= null){
                alquiler.setFechaRescision(fechaRecision.toLocalDate());
                
            }else{
                    alquiler.setFechaRescision(null);
               
            }
          alquiler.setEstado(estado);
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alquiler"+ex.getMessage());
        }
        return alquileres; //retorna la lista de alquileres
    }
    
    
    
       public List<Alquiler> ListarTodosAlquileresXPropietario(int idProp){ 
        List<Alquiler> alquileres =new ArrayList<>();
        String sql = "SELECT * FROM alquiler JOIN inmueble ON (alquiler.idInmueble = inmueble.idInmueble) WHERE inmueble.idPropietario = ?";
        
//       String sql= "SELECT alquiler*, Inmueble.idPropietario" +
//               "FROM alquiler A"+
//                 "INNER JOIN inmueble I ON alquiler.idInmueble = Inmueble.idInmueble";
    try {
            PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, idProp);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
           Alquiler alquiler = new Alquiler();
           Inmueble inmueble = inmData.buscarPropiedadId(rs.getInt("idInmueble"));
           Cliente cliente =cliData.buscarCliente(rs.getInt("idCliente"));
          Garante garante =garData.buscarGarante(rs.getInt("idGarante"));
           alquiler.setIdAlquiler(rs.getInt("idAlquiler"));
           // Obtengo los valores de la fila actual en el ResultSet
//            
                  String tipoA =rs.getString("tipoAlquiler");
                String tipoC = rs.getString("tipoCliente");
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
                
                int idPropietario = rs.getInt("idPropietario");
            
            
            //llena el objeto Alquiler con los valores obtenidos
          alquiler.setInmueble(inmueble);
            alquiler.setCliente(cliente);
            alquiler.setGarante(garante);
             alquiler.setTipo(TipoAlquiler.valueOf(tipoA)); // Tipo es un enum
            alquiler.setTipoC(TipoCliente.valueOf(tipoC)); // Tipo es un enum // Tipo es un enum
            alquiler.setFechaInicio(fechaInicio.toLocalDate()); // Convierte Date a LocalDate
            alquiler.setFechaFin(fechaFin.toLocalDate());
            alquiler.setPrecioEstimativo(precioEstimativo);
            alquiler.setDeposito(deposito);
            alquiler.setGastos(gastos);
            alquiler.setGastosRecision(gastosRecision);
            alquiler.setPrecioInicial(precioInicial);
            alquiler.setClausula(clausula);
            alquiler.setFechaFirma(fechaFirma.toLocalDate());
         
              if(fechaRecision!= null){
                alquiler.setFechaRescision(fechaRecision.toLocalDate());
                
            }else{
                alquiler.setFechaRescision(null);
            }
          alquiler.setEstado(estado);
    
            alquiler.getInmueble().getProp().setIdPropietario(idPropietario);
           alquileres.add(alquiler);
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alquiler"+ex.getMessage());
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
           
           // Obtengo los valores de la fila actual en el ResultSet
              int idInmueble = rs.getInt("idInmueble");
             
                int idGarante = rs.getInt("idGarante");
              String tipoA =rs.getString("tipoAlquiler");
                String tipoC = rs.getString("tipoCliente");
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
               alquiler.setTipo(TipoAlquiler.valueOf(tipoA)); // Tipo es un enum
            alquiler.setTipoC(TipoCliente.valueOf(tipoC)); // Tipo es un enum
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
              if(fechaRecision!= null){
                alquiler.setFechaRescision(fechaRecision.toLocalDate());
                
            }else{
                alquiler.setEstado(estado);
            }
            alquiler.setEstado(estado);
    
            alquiler.getInmueble().getProp().setIdPropietario(idPropietario);
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
            
             while(rs.next()){
     
           
           // Obtengo los valores de la fila actual en el ResultSet
              int idInmueble = rs.getInt("idInmueble");
                int idCliente = rs.getInt("idCliente");
                int idGarante = rs.getInt("idGarante");
             String tipoA =rs.getString("tipoAlquiler");
                String tipoC = rs.getString("tipoCliente");
             
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
                
                int idPropietario = rs.getInt("idPropietario");
            
            
            //llena el objeto Alquiler con los valores obtenidos
            alquiler.getInmueble().setIdInmueble(idInmueble);
            alquiler.getCliente().setIdCliente(idCliente);
            alquiler.getGarante().setIdGarante(idGarante);
              alquiler.setTipo(TipoAlquiler.valueOf(tipoA)); // Tipo es un enum
            alquiler.setTipoC(TipoCliente.valueOf(tipoC)); // Tipo es un enum
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
              if(fechaRecision!= null){
                alquiler.setFechaRescision(fechaRecision.toLocalDate());
                
            }else{
                alquiler.setEstado(estado);
            }
            alquiler.setEstado(estado);
    
            alquiler.getInmueble().getProp().setIdPropietario(idPropietario);
         
            }
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquiler; //retorna la lista de alquileres
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
           // ObtÃ©n los valores de la fila actual en el ResultSet
            int idAlquiler = rs.getInt("idAlquiler");
            int idInmueble = rs.getInt("idInmueble");
            int idGarante = rs.getInt("idGarante");
         String tipoA =rs.getString("tipoAlquiler");
                String tipoC = rs.getString("tipoCliente");
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
              alquiler.setTipo(TipoAlquiler.valueOf(tipoA)); // Tipo es un enum
            alquiler.setTipoC(TipoCliente.valueOf(tipoC)); // Tipo es un enum
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
              if(fechaRecision!= null){
                alquiler.setFechaRescision(fechaRecision.toLocalDate());
                
            }else{
                alquiler.setEstado(estado);
            }
            alquiler.setEstado(estado);
          
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentra ese precio");
            }
            ps.close();
        } catch (SQLException ex) {
     JOptionPane.showMessageDialog(null, "Error al acceder a la tabla garante"+ex.getMessage());
        }
        return alquiler; 
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







