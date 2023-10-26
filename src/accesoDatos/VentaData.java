package accesoDatos;

import Enums.TipoInmueble;
import Enums.Zona;
import entidades.Cliente;
import entidades.Conyugue;
import entidades.Escribano;
import entidades.Inmueble;
import entidades.Propietario;
import entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentaData {

     private Connection con = null;
    private InmuebleData iData = null;
    private ClienteData cData = null;
    private PropietarioData pData = null;
    private ConyugueData coData = null;
    private EscribanoData eData = null;

    public VentaData() {
        con = Conexion.getConexion();
        iData = new InmuebleData();
        cData = new ClienteData();
        pData = new PropietarioData();
        coData = new ConyugueData();
        eData = new EscribanoData();
    }

   public void agregarVenta(Venta venta) {
        String sql = "INSERT INTO venta( fechaVenta, idInmueble, idPropietario, idCliente, "
                + "idConyugue, idEscribano, precioVenta, moneda, detallesVenta, estadoEscriturizacion)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getInmueble().getIdInmueble());
            ps.setInt(3, venta.getPropietario().getIdPropietario());
            ps.setInt(4, venta.getCliente().getIdCliente());

            // Comprueba si el conyugue es nulo y, si no lo es, establece su valor en la sentencia preparada.
            if (venta.getConyugue() != null) {
                ps.setInt(5, venta.getConyugue().getIdConyugue());
            } else {
                ps.setNull(5, Types.INTEGER); // Establece el valor como nulo en la base de datos.
            }

            ps.setInt(6, venta.getEscribano().getIdEscribano());
            ps.setDouble(7, venta.getPrecioVenta());
            ps.setString(8, venta.getMoneda());
            ps.setString(9, venta.getDetallesVenta());
            ps.setString(10, venta.getEstadoEscriturizacion());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                venta.setIdVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta guardada correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarVenta(Venta venta) {
        String sql = "UPDATE venta SET fechaVenta = ?,idInmueble = ?,idPropietario = ?,idCliente = ?,idConyugue = ?,"
                + "idEscribano = ?,precioVenta = ?,moneda = ?,detallesVenta = ?,estadoEscriturizacion = ?"
                + "WHERE idVenta = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getInmueble().getIdInmueble());
            ps.setInt(3, venta.getPropietario().getIdPropietario());
            ps.setInt(4, venta.getCliente().getIdCliente());
             // Comprueba si el conyugue es nulo y, si no lo es, establece su valor en la sentencia preparada.
            if (venta.getConyugue() != null) {
                ps.setInt(5, venta.getConyugue().getIdConyugue());
            } else {
                ps.setNull(5, Types.INTEGER); // Establece el valor como nulo en la base de datos.
            }
            ps.setInt(6, venta.getEscribano().getIdEscribano());
            ps.setDouble(7, venta.getPrecioVenta());
            ps.setString(8, venta.getMoneda());
            ps.setString(9, venta.getDetallesVenta());
            ps.setString(10, venta.getEstadoEscriturizacion());
            ps.setInt(11, venta.getIdVenta());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La venta ha sido modificada con exito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }
    }

    public void eliminarVenta(int id) {
        String sql = "DELETE FROM venta WHERE idVenta = ?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);

                int filas = ps.executeUpdate();
                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "La venta ha sido eliminada con exito.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }
    }

    public Venta buscarVenta(int id) {
        String sql = "SELECT * FROM venta WHERE idVenta = ?";

        Venta venta = null;
        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    venta = new Venta();

                    venta.setIdVenta(id);
                    Inmueble inm = iData.buscarPropiedadId(rs.getInt("idInmueble"));
                    Cliente cli = cData.buscarCliente(rs.getInt("idCliente"));
                    Propietario pro = pData.buscarId(rs.getInt("idPropietario"));
                    Conyugue cony = coData.buscar(rs.getInt("idConyugue"));
                    Escribano esc = eData.buscar(rs.getInt("idEscribano"));

                    venta.setFecha(rs.getDate("fechaVenta").toLocalDate());
                    venta.setInmueble(inm);
                    venta.setPropietario(pro);
                    venta.setCliente(cli);
                    venta.setConyugue(cony);
                    venta.setEscribano(esc);
                    venta.setPrecioVenta(rs.getDouble("precioVenta"));
                    venta.setMoneda(rs.getString("moneda"));
                    venta.setDetallesVenta(rs.getString("detallesVenta"));
                    venta.setEstadoEscriturizacion(rs.getString("estadoEscriturizacion"));

                } else {
                    JOptionPane.showMessageDialog(null, "No existe la venta en la base de datos.");
                }
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }
        return venta;

    }

    public List<Venta> obtenerVentas() {

        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM venta";
        Venta venta = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                venta = new Venta();

                venta.setIdVenta(rs.getInt("idVenta"));
                Inmueble inm = iData.buscarPropiedadId(rs.getInt("idInmueble"));
                Cliente cli = cData.buscarCliente(rs.getInt("idCliente"));
                Propietario pro = pData.buscarId(rs.getInt("idPropietario"));
                Conyugue cony = coData.buscar(rs.getInt("idConyugue"));
                Escribano esc = eData.buscar(rs.getInt("idEscribano"));

                venta.setFecha(rs.getDate("fechaVenta").toLocalDate());
                venta.setInmueble(inm);
                venta.setPropietario(pro);
                venta.setCliente(cli);
                venta.setConyugue(cony);
                venta.setEscribano(esc);
                venta.setPrecioVenta(rs.getDouble("precioVenta"));
                venta.setMoneda(rs.getString("moneda"));
                venta.setDetallesVenta(rs.getString("detallesVenta"));
                venta.setEstadoEscriturizacion(rs.getString("estadoEscriturizacion"));

                ventas.add(venta);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }

        return ventas;

    }

    public List<Venta> obtenerVentasPorCliente(int id) {

        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE idCliente = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta venta = new Venta();

                venta.setIdVenta(rs.getInt("idVenta"));
                Inmueble inm = iData.buscarPropiedadId(rs.getInt("idInmueble"));
                Cliente cli = cData.buscarCliente(rs.getInt("idCliente"));
                Propietario pro = pData.buscarId(rs.getInt("idPropietario"));
                Conyugue cony = coData.buscar(rs.getInt("idConyugue"));
                Escribano esc = eData.buscar(rs.getInt("idEscribano"));

                venta.setFecha(rs.getDate("fechaVenta").toLocalDate());
                venta.setInmueble(inm);
                venta.setPropietario(pro);
                venta.setCliente(cli);
                venta.setConyugue(cony);
                venta.setEscribano(esc);
                venta.setPrecioVenta(rs.getDouble("precioVenta"));
                venta.setMoneda(rs.getString("moneda"));
                venta.setDetallesVenta(rs.getString("detallesVenta"));
                venta.setEstadoEscriturizacion(rs.getString("estadoEscriturizacion"));

                ventas.add(venta);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta."+ex);
        }
        return ventas;
    }

    public List<Venta> obtenerVentasPorPropietario(int id) {

        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM venta WHERE idPropietario = ?";
        Venta venta = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                venta = new Venta();

                venta.setIdVenta(rs.getInt("idVenta"));
                Inmueble inm = iData.buscarPropiedadId(rs.getInt("idInmueble"));
                Cliente cli = cData.buscarCliente(rs.getInt("idCliente"));
                Propietario pro = pData.buscarId(rs.getInt("idPropietario"));
                Conyugue cony = coData.buscar(rs.getInt("idConyugue"));
                Escribano esc = eData.buscar(rs.getInt("idEscribano"));

                venta.setFecha(rs.getDate("fechaVenta").toLocalDate());
                venta.setInmueble(inm);
                venta.setPropietario(pro);
                venta.setCliente(cli);
                venta.setConyugue(cony);
                venta.setEscribano(esc);
                venta.setPrecioVenta(rs.getDouble("precioVenta"));
                venta.setMoneda(rs.getString("moneda"));
                venta.setDetallesVenta(rs.getString("detallesVenta"));
                venta.setEstadoEscriturizacion(rs.getString("estadoEscriturizacion"));

                ventas.add(venta);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta."+ex);
        }
        return ventas;
    }
}
