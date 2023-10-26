package accesoDatos;

import entidades.PagoVenta;
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

public class PagoVentaData {

    private Connection con = null;
    private VentaData vData = null;

    public PagoVentaData() {
        con = Conexion.getConexion();
    }

   public void agregarPagoVenta(PagoVenta pago) {
        String sql = "INSERT INTO pagoventa(idVenta, descripcion, formaPago, fechaPago, "
                + "montoPagado, cantidadCuotas, valorCuota, fecha1erVto, interesMora, moneda, honorarios,"
                + " comision) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pago.getVenta().getIdVenta());
            ps.setString(2, pago.getDescripcion());
            ps.setString(3, pago.getFormaPago());
            ps.setDate(4, Date.valueOf(pago.getFechaPago()));
            ps.setDouble(5, pago.getMontoPagado());
            ps.setInt(6, pago.getCantidadCuotas());
            ps.setDouble(7, pago.getValorCuota());
            if (pago.getFecha1erVto() != null) {
                ps.setDate(8, Date.valueOf(pago.getFecha1erVto()));
            } else {
                ps.setNull(8, java.sql.Types.DATE); // Establece el valor como NULL en la base de datos
            }
            ps.setDouble(9, pago.getInteresMora());
            ps.setString(10, pago.getMoneda());
            ps.setDouble(11, pago.getHonorarios());
            ps.setDouble(12, pago.getComision());

            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                pago.setIdPagoVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pago guardado correctamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla PagoVenta."+ex);
        }
    }

    public void modificarPagoVenta(PagoVenta pago) {
        String sql = "UPDATE pagoventa ,descripcion = ?,formaPago = ?, fechaPago = ?,montoPagado = ?,"
                + "cantidadCuotas = ?,valorCuota = ?,fecha1erVto = ?, interesMora = ?,moneda = ?,"
                + "honorarios = ?,comision = ? WHERE idPagoVenta = ? AND SET idVenta = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, pago.getVenta().getIdVenta());
            ps.setString(2, pago.getDescripcion());
            ps.setString(3, pago.getFormaPago());
            ps.setDate(4, Date.valueOf(pago.getFechaPago()));
            ps.setDouble(5, pago.getMontoPagado());
            ps.setInt(6, pago.getCantidadCuotas());
            ps.setDouble(7, pago.getValorCuota());
            ps.setDate(8, Date.valueOf(pago.getFecha1erVto()));
            ps.setDouble(9, pago.getInteresMora());
            ps.setString(10, pago.getMoneda());
            ps.setDouble(11, pago.getHonorarios());
            ps.setDouble(12, pago.getComision());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "El pago ha sido modificada con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla PagoVenta.");
        }
    }

    public void eliminarPagoVenta(int idVenta) {
        String sql = "DELETE FROM pagoventa WHERE idVenta = ?";
        try {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, idVenta);
                int filas = ps.executeUpdate();
                if (filas > 0) {
                    JOptionPane.showMessageDialog(null, "El pago ha sido eliminado con exito.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla PagoVenta.");
        }
    }

    public List<PagoVenta> listarPagosVentas() {
        List<PagoVenta> pagos = new ArrayList<>();

        String sql = "SELECT * FROM pagoventa";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PagoVenta pago = new PagoVenta();
                pago.setIdPagoVenta(rs.getInt("idPagoVenta"));
                Venta ven = vData.buscarVenta(rs.getInt("idVenta"));
                pago.setVenta(ven);
                pago.setDescripcion(rs.getString("descripcion"));
                pago.setFormaPago(rs.getString("formaPago"));
                pago.setFechaPago(rs.getDate("fechaPago").toLocalDate());
                pago.setMontoPagado(rs.getDouble("montoPagado"));
                pago.setCantidadCuotas(rs.getInt("cantidadCuotas"));
                pago.setValorCuota(rs.getDouble("valorCuota"));
                pago.setFecha1erVto(rs.getDate("fecha1erVto").toLocalDate());
                pago.setInteresMora(rs.getDouble("interesMora"));
                pago.setMoneda(rs.getString("moneda"));
                pago.setHonorarios(rs.getDouble("honorarios"));
                pago.setComision(rs.getDouble("comision"));

                pagos.add(pago);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pagoVenta.");
        }

        return pagos;

    }
}
