
package entidades;

import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private Inmueble inmueble;
    private Propietario prop;
    private LocalDate fechaCompra;
    private double precio;

    public Venta() {
    }

    public Venta(Cliente cliente, Inmueble inmueble, Propietario prop, LocalDate fechaCompra, double precio) {
        this.cliente = cliente;
        this.inmueble = inmueble;
        this.prop = prop;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", inmueble=" + inmueble + ", prop=" + prop + ", fechaCompra=" + fechaCompra + ", precio=" + precio + '}';
    }
    
}
