
package entidades;

import Enums.TipoAlquiler;
import Enums.TipoCliente;
import java.time.LocalDate;

public class Alquiler {
    private int idAlquiler;
    private Inmueble inmueble;
    private Cliente cliente;
    private Garante garante;
    private TipoCliente tipoC;//es un enum del paquete Enums TipoAlquiler castear con toString
    private TipoAlquiler tipo;//es un enum del paquete Enums TipoAlquiler castear con toString
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioEstimativo;
    private double deposito;
    private double gastos;
    private double gastosRecision;
    private double precioInicial;
    private String clausula;
    private LocalDate fechaFirma;
    private LocalDate fechaRescision;
    private boolean estado;

    public Alquiler() {
    }

    public Alquiler(Inmueble inmueble, Cliente cliente, Garante garante, TipoCliente tipoC, TipoAlquiler tipo, LocalDate fechaInicio, LocalDate fechaFin, double precioEstimativo, double deposito, double gastos, double gastosRecision, double precioInicial, String clausula, LocalDate fechaFirma, LocalDate fechaRescision, boolean estado) {
        this.inmueble = inmueble;
        this.cliente = cliente;
        this.garante = garante;
        this.tipoC = tipoC;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioEstimativo = precioEstimativo;
        this.deposito = deposito;
        this.gastos = gastos;
        this.gastosRecision = gastosRecision;
        this.precioInicial = precioInicial;
        this.clausula = clausula;
        this.fechaFirma = fechaFirma;
        this.fechaRescision = fechaRescision;
        this.estado = estado;
    }

    public Alquiler(int idAlquiler, Inmueble inmueble, Cliente cliente, Garante garante, TipoCliente tipoC, TipoAlquiler tipo, LocalDate fechaInicio, LocalDate fechaFin, double precioEstimativo, double deposito, double gastos, double gastosRecision, double precioInicial, String clausula, LocalDate fechaFirma, LocalDate fechaRescision, boolean estado) {
        this.idAlquiler = idAlquiler;
        this.inmueble = inmueble;
        this.cliente = cliente;
        this.garante = garante;
        this.tipoC = tipoC;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioEstimativo = precioEstimativo;
        this.deposito = deposito;
        this.gastos = gastos;
        this.gastosRecision = gastosRecision;
        this.precioInicial = precioInicial;
        this.clausula = clausula;
        this.fechaFirma = fechaFirma;
        this.fechaRescision = fechaRescision;
        this.estado = estado;
    }

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
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

    public Garante getGarante() {
        return garante;
    }

    public void setGarante(Garante garante) {
        this.garante = garante;
    }

    public TipoCliente getTipoC() {
        return tipoC;
    }

    public void setTipoC(TipoCliente tipoC) {
        this.tipoC = tipoC;
    }

    public TipoAlquiler getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlquiler tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioEstimativo() {
        return precioEstimativo;
    }

    public void setPrecioEstimativo(double precioEstimativo) {
        this.precioEstimativo = precioEstimativo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getGastosRecision() {
        return gastosRecision;
    }

    public void setGastosRecision(double gastosRecision) {
        this.gastosRecision = gastosRecision;
    }

    public double getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(double precioInicial) {
        this.precioInicial = precioInicial;
    }

    public String getClausula() {
        return clausula;
    }

    public void setClausula(String clausula) {
        this.clausula = clausula;
    }

    public LocalDate getFechaFirma() {
        return fechaFirma;
    }

    public void setFechaFirma(LocalDate fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    public LocalDate getFechaRescision() {
        return fechaRescision;
    }

    public void setFechaRescision(LocalDate fechaRescision) {
        this.fechaRescision = fechaRescision;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

  


    @Override
    public String toString() {
        return "idAlquiler=" + idAlquiler + ", inmueble=" + inmueble + ", cliente=" + cliente + ", garante=" + garante + ", tipo=" + tipo +  ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precioEstimativo="+precioEstimativo+",deposito="+deposito+",gastos ="+gastos+",gastosRecision ="+gastosRecision+ ",precioInicial=" + precioInicial + ", clausula=" + clausula + ", fechaFirma=" + fechaFirma + ", fechaRescision=" + fechaRescision + ", estado=" + estado + '}';
    }
    
    
    
}
