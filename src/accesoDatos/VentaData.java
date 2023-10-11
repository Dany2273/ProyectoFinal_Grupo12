package accesoDatos;

import Enums.TipoInmueble;
import Enums.Zona;
import entidades.Cliente;
import entidades.Inmueble;
import entidades.Propietario;
import entidades.Venta;
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

public class VentaData {

    private Connection con = null;
    private InmuebleData iData = null;
    private ClienteData cData = null;
    private PropietarioData pData = null;

    public VentaData() {
        con = Conexion.getConexion();
        iData = new InmuebleData();
        cData = new ClienteData();
        pData = new PropietarioData();
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
            ps.setInt(5, venta.getConyugue().getIdConyugue());
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
            ps.setInt(5, venta.getConyugue().getIdConyugue());
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

    public void eliminarVenta(int idInmueble, int idCliente, int idPropietario) {
        String sql = "DELETE FROM venta WHERE idInmueble = ? AND idCliente = ? AND idPropietario = ?";

        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idInmueble);
                ps.setInt(2, idCliente);
                ps.setInt(3, idPropietario);

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
        String sql = "SELECT * FROM venta WHERE idCliente = ?";

        Venta venta = null;
        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    venta = new Venta();

                    venta.setIdVenta(id);
                    Inmueble inm = iData.buscarInmueble(rs.getInt("idInmueble"));
                    Cliente cli = cData.buscarCliente(rs.getInt("idCliente"));
                    Propietario pro = pData.buscarId(rs.getInt("idPropietario"));
                    venta.setInmueble(inm);
                    venta.setCliente(cli);
                    venta.setPropietario(pro);
                    venta.setFecha(rs.getDate("fechaVenta").toLocalDate());
                    venta.setPrecioVenta(rs.getDouble("precioVenta"));
                } else {
                    JOptionPane.showMessageDialog(null, "No existe la venta en la base de datos.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }
        return venta;

    }

    public List<Venta> obtenerVentas() {

        List<Venta> ventas = new ArrayList<>();
        String sql = "SELECT * FROM venta";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                    Inmueble inm = iData.buscarInmueble(rs.getInt("idInmueble"));
                    Cliente cli = cData.buscarCliente(rs.getInt("idCliente"));
                    Propietario pro = pData.buscarId(rs.getInt("idPropietario"));
                    venta.setInmueble(inm);
                    venta.setCliente(cli);
                    venta.setPropietario(pro);
                    venta.setFecha(rs.getDate("fechaVenta").toLocalDate());
                    venta.setPrecioVenta(rs.getDouble("precioVenta"));

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
                venta.setIdVenta(id);
                    Inmueble inm = iData.buscarInmueble(rs.getInt("idInmueble"));
                    Cliente cli = cData.buscarCliente(rs.getInt("idCliente"));
                    Propietario pro = pData.buscarId(rs.getInt("idPropietario"));
                    venta.setInmueble(inm);
                    venta.setCliente(cli);
                    venta.setPropietario(pro);
                    venta.setFecha(rs.getDate("fechaVenta").toLocalDate());
                    venta.setPrecioVenta(rs.getDouble("precioVenta"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }
        return ventas;
    }

    public List<Inmueble> obtenerInmueblesNoVendidos(int id) {

        List<Inmueble> inmueble = new ArrayList<>();
        String sql = "SELECT * FROM inmueble WHERE idInmueble NOT IN (SELECT idInmueble FROM venta)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inmueble in = new Inmueble();

                in.setIdInmueble(rs.getInt("idInmueble"));
                Propietario pro = pData.buscarId(rs.getInt("idPropietario"));
                in.setProp(pro);
                in.setTipo(TipoInmueble.valueOf(rs.getString("tipoInmueble")));
                in.setDireccion(rs.getString("direccion"));
                in.setZona(Zona.valueOf(rs.getString("zona")));
                in.setPrecioTasado(rs.getDouble("precioTasado"));

                inmueble.add(in);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }
        return inmueble;
    }
}
