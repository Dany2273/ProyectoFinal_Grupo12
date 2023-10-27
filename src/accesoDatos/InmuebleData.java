package accesoDatos;

<<<<<<< Updated upstream
=======
import Enums.Accesibilidad;
>>>>>>> Stashed changes
import Enums.TipoInmueble;
import Enums.Zona;
import entidades.Inmueble;
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

public class InmuebleData {

    Connection con = null;
    PropietarioData pData = null;
    Inmueble in = null;
    public InmuebleData() {
        con = Conexion.getConexion();
        pData = new PropietarioData();
        in = new Inmueble();
    }

    public void agregarInmueble(Inmueble inmueble) {
        String sql = "INSERT INTO inmueble(idPropietario, tipoInmueble, alquilerVenta, "
                + "direccion, zona, descripcion, superficie, precioTasado, accesibilidad, cantAmbientes,"
                + " cantDormitorios, cantBaños, patio, cochera, quincho, pileta, mascotas, niños,"
                + " disponible) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, inmueble.getProp().getIdPropietario());
            ps.setObject(2, inmueble.getTipo().toString());
            ps.setString(3, inmueble.getAlquilerVenta());
            ps.setString(4, inmueble.getDireccion());
            ps.setObject(5, inmueble.getZona().toString());
            ps.setString(6, inmueble.getDescripcion());
            ps.setInt(7, inmueble.getSuperficie());
            ps.setDouble(8, inmueble.getPrecioTasado());
            ps.setString(9, inmueble.getAccesibilidad().toString());
            ps.setInt(10, inmueble.getAmbientes());
            ps.setInt(11, inmueble.getDormitorios());
            ps.setInt(12, inmueble.getBaños());
            ps.setBoolean(13, inmueble.isPatio());
            ps.setBoolean(14, inmueble.isCochera());
            ps.setBoolean(15, inmueble.isQuincho());
            ps.setBoolean(16, inmueble.isPileta());
            ps.setBoolean(17, inmueble.isMascotas());
            ps.setBoolean(18, inmueble.isNiños());
            ps.setBoolean(19, inmueble.isDisponible());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                inmueble.setIdInmueble(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inmueble guardado correctamente");
            }

        } catch (SQLException ex) {
            Logger.getLogger(InmuebleData.class.getName()).log(Level.SEVERE, null, ex);
        }

<<<<<<< Updated upstream
    }

    public Inmueble buscarPropiedadId(int id) {
        String sql = "SELECT * FROM inmueble WHERE alquilerVenta = 'venta' AND disponible = 1";
=======
>>>>>>> Stashed changes
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                 in = new Inmueble();
                in.setIdInmueble(rs.getInt(id));
                Propietario pr = pData.buscarId(rs.getInt("idPropietario"));
                in.setProp(pr);
//                String tipo = rs.getString("tipoInmueble");//Primero obtengo el valor de la columna tipo
//                TipoInmueble tipoIn = TipoInmueble.valueOf(tipo); // Convierte la cadena a TipoCliente (Enum)
                in.setTipo(TipoInmueble.valueOf(rs.getString("tipoInmueble")));
                in.setAlquilerVenta(rs.getString("alquilerVenta"));
                in.setDireccion(rs.getString("direccion"));
                String zona = rs.getString("zona");
                Zona zon = Zona.valueOf(zona);
                in.setZona(zon);
                in.setDescripcion(rs.getString("descripcion"));
                in.setSuperficie(rs.getInt("superficie"));
                in.setPrecioTasado(rs.getDouble("precioTasado"));
                in.setAccesibilidad(rs.getString("accesibilidad"));
                in.setAmbientes(rs.getInt("cantAmbientes"));
                in.setDormitorios(rs.getInt("cantDormitorios"));
                in.setBaños(rs.getInt("cantBaños"));
                in.setPatio(rs.getBoolean("patio"));
                in.setCochera(rs.getBoolean("cochera"));
                in.setQuincho(rs.getBoolean("quincho"));
                in.setPileta(rs.getBoolean("pileta"));
                in.setMascotas(rs.getBoolean("mascotas"));
                in.setNiños(rs.getBoolean("niños"));
                in.setDisponible(rs.getBoolean("disponible"));
                
                
            }
         ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }

        return in;

    }

    public List<Inmueble> listarInmuebleVenta() {
        List<Inmueble> inmuebles = new ArrayList<>();
        String sql = "SELECT * FROM inmueble WHERE alquilerVenta = 'venta' AND disponible = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inmueble in = new Inmueble();
                in.setIdInmueble(rs.getInt("idInmueble"));
                Propietario pr = pData.buscarId(rs.getInt("idPropietario"));
                in.setProp(pr);
                String tipo = rs.getString("tipoInmueble");//Primero obtengo el valor de la columna tipo
                TipoInmueble tipoIn = TipoInmueble.valueOf(tipo); // Convierte la cadena a TipoCliente (Enum)
                in.setTipo(tipoIn);
                in.setAlquilerVenta(rs.getString("alquilerVenta"));
                in.setDireccion(rs.getString("direccion"));
                String zona = rs.getString("zona");
                Zona zon = Zona.valueOf(zona);
                in.setZona(zon);
                in.setDescripcion(rs.getString("descripcion"));
                in.setSuperficie(rs.getInt("superficie"));
                in.setPrecioTasado(rs.getDouble("precioTasado"));
                in.setAccesibilidad(rs.getString("accesibilidad"));
                in.setAmbientes(rs.getInt("cantAmbientes"));
                in.setDormitorios(rs.getInt("cantDormitorios"));
                in.setBaños(rs.getInt("cantBaños"));
                in.setPatio(rs.getBoolean("patio"));
                in.setCochera(rs.getBoolean("cochera"));
                in.setQuincho(rs.getBoolean("quincho"));
                in.setPileta(rs.getBoolean("pileta"));
                in.setMascotas(rs.getBoolean("mascotas"));
                in.setNiños(rs.getBoolean("niños"));
                in.setDisponible(rs.getBoolean("disponible"));

                inmuebles.add(in);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
        return inmuebles;

    }
    }
<<<<<<< Updated upstream
=======
    
    public List<Inmueble> buscarPropiedades(Inmueble inm, int superficieI, int superficieF, double precioI, double precioF) {
        List<Inmueble> in = new ArrayList<>();
        String sql = "SELECT * FROM inmueble WHERE tipoInmueble = ? OR alquilerVenta = ? OR zona = ? OR (superficie >= ? AND supercifie <= ?) OR (precioTasado >= ? AND precioTasado <= ? )OR accesibilidad = ? OR cantAmbientes = ? OR" + 
                " cantDormitorios = ? OR cantBaños = ? OR patio = ? OR cochera = ? OR quincho = ? OR pileta = ? OR mascocotas = ? OR niños = ? AND disponible = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // Busqueda completa si no se elije alguno de las opciones se compara con null
            ps.setString(1, inm.getTipo().toString());
            ps.setString(2, inm.getAlquilerVenta());
            ps.setString(3, inm.getZona().toString());
            ps.setInt(4, superficieI);
            ps.setInt(5, superficieF);
            ps.setDouble(6, precioI);
            ps.setDouble(7, precioF);
            ps.setString(8, inm.getAccesibilidad().toString());
            ps.setInt(9, inm.getAmbientes());
            ps.setInt(10, inm.getDormitorios());
            ps.setInt(11, inm.getBaños());
            ps.setBoolean(12, inm.isPatio());
            ps.setBoolean(13, inm.isCochera());
            ps.setBoolean(14, inm.isQuincho());
            ps.setBoolean(15, inm.isPileta());
            ps.setBoolean(16, inm.isMascotas());
            ps.setBoolean(17, inm.isNiños());
            ps.setBoolean(18, inm.isDisponible());
            
            ResultSet rs = ps.executeQuery();
            /*Como el ResultSet va a devolver mas de una fila,
            recorremos el resultado con un While.*/
            while (rs.next()) {

                Inmueble inmueble = new Inmueble();//Creo un inmuebley voy seteando los atributos
                PropietarioData propD = new PropietarioData();
                
                inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setProp(propD.buscarId(rs.getInt("idPropietario")));//Hascer metodo que debuelva el Objeto Propietario con el id pasado
                inmueble.setTipo(TipoInmueble.valueOf(rs.getString("tipoInmueble")));
                inmueble.setAlquilerVenta(rs.getString("alquilerVenta"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setZona(Zona.valueOf(rs.getString("zona")));
                inmueble.setDescripcion(rs.getString("descripcion"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecioTasado(rs.getDouble("precioTasado"));
                inmueble.setAccesibilidad(Accesibilidad.valueOf(rs.getString("accesibilidad")));
                inmueble.setAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setDormitorios(rs.getInt("cantDormitorios"));
                inmueble.setBaños(rs.getInt("cantBaños"));
                inmueble.setPatio(rs.getBoolean("patio"));
                inmueble.setCochera(rs.getBoolean("cochera"));
                inmueble.setQuincho(rs.getBoolean("quincho"));
                inmueble.setPileta(rs.getBoolean("pileta"));
                inmueble.setMascotas(rs.getBoolean("mascotas"));
                inmueble.setNiños(rs.getBoolean("niños"));
                inmueble.setDisponible(rs.getBoolean("disponoble"));
                in.add(inmueble);

    }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmuebles" + ex.getMessage());
}
        return in;

    }
    
    
    public Inmueble buscarPropiedadId(int idInmueble) {
        
        Inmueble inmueble = null;
        String sql = "SELECT * FROM inmueble WHERE idInmueble = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            PropietarioData propD = new PropietarioData();
            ps.setInt(1, idInmueble);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            inmueble = new Inmueble();
            
            inmueble.setIdInmueble(rs.getInt("idInmueble"));
                inmueble.setProp(propD.buscarId(rs.getInt("idPropietario")));//Hascer metodo que debuelva el Objeto Propietario con el id pasado
                inmueble.setTipo(TipoInmueble.valueOf(rs.getString("tipoInmueble")));
                inmueble.setAlquilerVenta(rs.getString("alquilerVenta"));
                inmueble.setDireccion(rs.getString("direccion"));
                inmueble.setZona(Zona.valueOf(rs.getString("zona")));
                inmueble.setDescripcion(rs.getString("descripcion"));
                inmueble.setSuperficie(rs.getInt("superficie"));
                inmueble.setPrecioTasado(rs.getDouble("precioTasado"));
                inmueble.setAccesibilidad(Accesibilidad.valueOf(rs.getString("accesibilidad")));
                inmueble.setAmbientes(rs.getInt("cantAmbientes"));
                inmueble.setDormitorios(rs.getInt("cantDormitorios"));
                inmueble.setBaños(rs.getInt("cantBaños"));
                inmueble.setPatio(rs.getBoolean("patio"));
                inmueble.setCochera(rs.getBoolean("cochera"));
                inmueble.setQuincho(rs.getBoolean("quincho"));
                inmueble.setPileta(rs.getBoolean("pileta"));
                inmueble.setMascotas(rs.getBoolean("mascotas"));
                inmueble.setNiños(rs.getBoolean("niños"));
                inmueble.setDisponible(rs.getBoolean("disponoble"));
                
            }else{
                JOptionPane.showMessageDialog(null, "No Existe el Inmueble con ese ID ");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inmuebles" + ex.getMessage());
        }
        return inmueble;

    }


    public void modificarInmueble(Inmueble inmueble) {
        String sql = "UPDATE inmueble SET  idPropietario = ?, tipoInmueble = ?, alquilerVenta = ?, direccion = ?, zona = ?, descripcion = ?,  superficie = ?, precioTasado = ?, accesibilidad = ?, cantAmbientes = ?," + 
                " cantDormitorios = ?, cantBaños = ?, patio = ?, cochera = ?, quincho = ?, pileta = ?, mascocotas = ?, niños = ?, disponible = ? WHERE idInmueble = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, inmueble.getProp().getIdPropietario());
            ps.setObject(2,inmueble.getTipo().toString());
            ps.setString(3, inmueble.getAlquilerVenta());
            ps.setString(4, inmueble.getDireccion());
            ps.setObject(5, inmueble.getZona().toString());
            ps.setString(6, inmueble.getDescripcion());
            ps.setInt(7, inmueble.getSuperficie());
            ps.setDouble(8, inmueble.getPrecioTasado());
            ps.setString(9, inmueble.getAccesibilidad().toString());
            ps.setInt(10, inmueble.getAmbientes());
            ps.setInt(11, inmueble.getDormitorios());
            ps.setInt(12, inmueble.getBaños());
            ps.setBoolean(13, inmueble.isPatio());
            ps.setBoolean(14, inmueble.isCochera());
            ps.setBoolean(15, inmueble.isQuincho());
            ps.setBoolean(16, inmueble.isPileta());
            ps.setBoolean(17, inmueble.isMascotas());
            ps.setBoolean(18, inmueble.isNiños());
            ps.setBoolean(19, inmueble.isDisponible());
            ps.setInt(20, inmueble.getIdInmueble());
            

            int exito = ps.executeUpdate();//Como la sentencia devuelve un entero creamos una variable tipo Int

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Cliente modificado con exito.");

                /*Guardamos los cambios y ejecutamos desde el main*/
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente" + ex);
        }

    }
    
    public void eliminarInmueble(int idInmueble) {
        String sql = "DELETE FROM inmueble WHERE idInmueble = ?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idInmueble);
                
                int filas = ps.executeUpdate();
                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "El Inmueble ha sido eliminada con exito.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inmueble");
        }
    }
    
    
    
}
>>>>>>> Stashed changes
