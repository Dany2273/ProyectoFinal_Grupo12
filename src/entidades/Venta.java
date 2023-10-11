
package entidades;

import java.time.LocalDate;

public class Venta {
    private int idVenta;
    private LocalDate fecha;
    private Inmueble inmueble;
    private Propietario propietario;
    private Cliente cliente;
    private Conyugue conyugue;
    private Escribano escribano;
    private double precioVenta;
    private String moneda;
    private String detallesVenta;
    private String estadoEscriturizacion;
   

    public Venta() {
    }

    public Venta(LocalDate fecha, Inmueble inmueble, Propietario propietario, Cliente cliente, Escribano escribano, double precioVenta, String moneda, String detallesVenta, String estadoEscriturizacion) {
        this.fecha = fecha;
        this.inmueble = inmueble;
        this.propietario = propietario;
        this.cliente = cliente;
        this.escribano = escribano;
        this.precioVenta = precioVenta;
        this.moneda = moneda;
        this.detallesVenta = detallesVenta;
        this.estadoEscriturizacion = estadoEscriturizacion;
    }

    public Venta(int idVenta, LocalDate fecha, Inmueble inmueble, Propietario propietario, Cliente cliente, Escribano escribano, double precioVenta, String moneda, String detallesVenta, String estadoEscriturizacion) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.inmueble = inmueble;
        this.propietario = propietario;
        this.cliente = cliente;
        this.escribano = escribano;
        this.precioVenta = precioVenta;
        this.moneda = moneda;
        this.detallesVenta = detallesVenta;
        this.estadoEscriturizacion = estadoEscriturizacion;
    }

    public Venta(LocalDate fecha, Inmueble inmueble, Propietario propietario, Cliente cliente, Conyugue conyugue, Escribano escribano, double precioVenta, String moneda, String detallesVenta, String estadoEscriturizacion) {
        this.fecha = fecha;
        this.inmueble = inmueble;
        this.propietario = propietario;
        this.cliente = cliente;
        this.conyugue = conyugue;
        this.escribano = escribano;
        this.precioVenta = precioVenta;
        this.moneda = moneda;
        this.detallesVenta = detallesVenta;
        this.estadoEscriturizacion = estadoEscriturizacion;
    }

    public Venta(int idVenta, LocalDate fecha, Inmueble inmueble, Propietario propietario, Cliente cliente, Conyugue conyugue, Escribano escribano, double precioVenta, String moneda, String detallesVenta, String estadoEscriturizacion) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.inmueble = inmueble;
        this.propietario = propietario;
        this.cliente = cliente;
        this.conyugue = conyugue;
        this.escribano = escribano;
        this.precioVenta = precioVenta;
        this.moneda = moneda;
        this.detallesVenta = detallesVenta;
        this.estadoEscriturizacion = estadoEscriturizacion;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conyugue getConyugue() {
        return conyugue;
    }

    public void setConyugue(Conyugue conyugue) {
        this.conyugue = conyugue;
    }

    public Escribano getEscribano() {
        return escribano;
    }

    public void setEscribano(Escribano escribano) {
        this.escribano = escribano;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(String detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    public String getEstadoEscriturizacion() {
        return estadoEscriturizacion;
    }

    public void setEstadoEscriturizacion(String estadoEscriturizacion) {
        this.estadoEscriturizacion = estadoEscriturizacion;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha=" + fecha + ", inmueble=" + inmueble + ", propietario=" + propietario + ", cliente=" + cliente + ", conyugue=" + conyugue + ", escribano=" + escribano + ", precioVenta=" + precioVenta + ", moneda=" + moneda + ", detallesVenta=" + detallesVenta + ", estadoEscriturizacion=" + estadoEscriturizacion + '}';
    }

   
   
}
