
package entidades;

import java.time.LocalDate;

public class PagoVenta {
    private int idPagoVenta;
    private Venta venta;
    private String descripcion;
    private String formaPago;
    private LocalDate fechaPago;
    private double montoPagado;
    private int cantidadCuotas;
    private double valorCuota;
    private LocalDate fecha1erVto;
    private double interesMora;//puede ser porcentaje o monto fijo
    private String moneda;
    private double honorarios;
    private double comision;
    
    

    public PagoVenta() {
    }

    public PagoVenta(Venta venta, String descripcion, String formaPago, LocalDate fechaPago, double montoPagado, int cantidadCuotas, double valorCuota, LocalDate fecha1erVto, double interesMora, String moneda, double honorarios, double comision) {
        this.venta = venta;
        this.descripcion = descripcion;
        this.formaPago = formaPago;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
        this.cantidadCuotas = cantidadCuotas;
        this.valorCuota = valorCuota;
        this.fecha1erVto = fecha1erVto;
        this.interesMora = interesMora;
        this.moneda = moneda;
        this.honorarios = honorarios;
        this.comision = comision;
    }

    public PagoVenta(int idPagoVenta, Venta venta, String descripcion, String formaPago, LocalDate fechaPago, double montoPagado, int cantidadCuotas, double valorCuota, LocalDate fecha1erVto, double interesMora, String moneda, double honorarios, double comision) {
        this.idPagoVenta = idPagoVenta;
        this.venta = venta;
        this.descripcion = descripcion;
        this.formaPago = formaPago;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
        this.cantidadCuotas = cantidadCuotas;
        this.valorCuota = valorCuota;
        this.fecha1erVto = fecha1erVto;
        this.interesMora = interesMora;
        this.moneda = moneda;
        this.honorarios = honorarios;
        this.comision = comision;
    }

    public PagoVenta(Venta venta, String descripcion, String formaPago, LocalDate fechaPago, double montoPagado, String moneda, double honorarios, double comision) {
        this.venta = venta;
        this.descripcion = descripcion;
        this.formaPago = formaPago;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
        this.moneda = moneda;
        this.honorarios = honorarios;
        this.comision = comision;
    }

    public PagoVenta(int idPagoVenta, Venta venta, String descripcion, String formaPago, LocalDate fechaPago, double montoPagado, String moneda, double honorarios, double comision) {
        this.idPagoVenta = idPagoVenta;
        this.venta = venta;
        this.descripcion = descripcion;
        this.formaPago = formaPago;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
        this.moneda = moneda;
        this.honorarios = honorarios;
        this.comision = comision;
    }
    
     public int getIdPagoVenta() {
        return idPagoVenta;
    }

    public void setIdPagoVenta(int idPagoVenta) {
        this.idPagoVenta = idPagoVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public LocalDate getFecha1erVto() {
        return fecha1erVto;
    }

    public void setFecha1erVto(LocalDate fecha1erVto) {
        this.fecha1erVto = fecha1erVto;
    }

    public double getInteresMora() {
        return interesMora;
    }

    public void setInteresMora(double interesMora) {
        this.interesMora = interesMora;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(double honorarios) {
        this.honorarios = honorarios;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
 @Override
    public String toString() {
        return "PagoVenta{" + "idPagoVenta=" + idPagoVenta + ", venta=" + venta + ", descripcion=" + descripcion + ", formaPago=" + formaPago + ", fechaPago=" + fechaPago + ", montoPagado=" + montoPagado + ", cantidadCuotas=" + cantidadCuotas + ", valorCuota=" + valorCuota + ", fecha1erVto=" + fecha1erVto + ", interesMora=" + interesMora + ", moneda=" + moneda + ", honorarios=" + honorarios + ", comision=" + comision + '}';
    }
   
}
