
package entidades;

import entidades.Cliente;
import java.time.LocalDate;

public class Venta {
    private int idVenta;
    private Inmueble inmueble;
    private Cliente cliente;
    private Propietario prop;
    private LocalDate fechaPagoInicial;
    private double precioAcordado;
    private double pagoInicial;
    private double pagoRestante;
    private String estadoPago;
    private LocalDate fechaCancelacion;
    private double importeGastos;
    private double importeComision;

    public Venta() {
    }

    public Venta(int idVenta, Inmueble inmueble, Cliente cliente, Propietario prop, LocalDate fechaPagoInicial, double precioAcordado, double pagoInicial,double pagoRestante, String estadoPago, LocalDate fechaCancelacion, double importeGastos, double importeComision) {
        this.idVenta = idVenta;
        this.inmueble = inmueble;
        this.cliente = cliente;
        this.prop = prop;
        this.fechaPagoInicial = fechaPagoInicial;
        this.precioAcordado = precioAcordado;
        this.pagoInicial = pagoInicial;
        this.estadoPago = estadoPago;
        this.fechaCancelacion = fechaCancelacion;
        this.importeGastos = importeGastos;
        this.importeComision = importeComision;
        this.pagoRestante = pagoRestante;
    }

    public Venta(Inmueble inmueble, Cliente cliente, Propietario prop, LocalDate fechaPagoInicial, double precioAcordado, double pagoInicial,double pagoRestante, String estadoPago, LocalDate fechaCancelacion, double importeGastos, double importeComision) {
        this.inmueble = inmueble;
        this.cliente = cliente;
        this.prop = prop;
        this.fechaPagoInicial = fechaPagoInicial;
        this.precioAcordado = precioAcordado;
        this.pagoInicial = pagoInicial;
        this.estadoPago = estadoPago;
        this.fechaCancelacion = fechaCancelacion;
        this.importeGastos = importeGastos;
        this.importeComision = importeComision;
        this.pagoRestante = pagoRestante;
    }

    public double getPagoRestante() {
        return pagoRestante;
    }

    public void setPagoRestante(double pagoRestante) {
        this.pagoRestante = pagoRestante;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

    public LocalDate getFechaPagoInicial() {
        return fechaPagoInicial;
    }

    public void setFechaPagoInicial(LocalDate fechaPagoInicial) {
        this.fechaPagoInicial = fechaPagoInicial;
    }

    public double getPrecioAcordado() {
        return precioAcordado;
    }

    public void setPrecioAcordado(double precioAcordado) {
        this.precioAcordado = precioAcordado;
    }

    public double getPagoInicial() {
        return pagoInicial;
    }

    public void setPagoInicial(double pagoInicial) {
        this.pagoInicial = pagoInicial;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public LocalDate getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(LocalDate fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public double getImporteGastos() {
        return importeGastos;
    }

    public void setImporteGastos(double importeGastos) {
        this.importeGastos = importeGastos;
    }

    public double getImporteComision() {
        return importeComision;
    }

    public void setImporteComision(double importeComision) {
        this.importeComision = importeComision;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", inmueble=" + inmueble + ", cliente=" + cliente + ", prop=" + prop + ", fechaPagoInicial=" + fechaPagoInicial + ", precioAcordado=" + precioAcordado + ", pagoInicial=" + pagoInicial + ", estadoPago=" + estadoPago + ", fechaCancelacion=" + fechaCancelacion + ", importeGastos=" + importeGastos + ", importeComision=" + importeComision + '}';
    }
    
    
    
    }
