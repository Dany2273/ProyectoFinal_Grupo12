package accesoDatos;

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
            ps.setString(9, inmueble.getAccesibilidad());
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

    }

    public Inmueble buscarPropiedadId(int id) {
        String sql = "SELECT * FROM inmueble WHERE alquilerVenta = 'venta' AND disponible = 1";
        
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
