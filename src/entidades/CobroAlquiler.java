
package entidades;

import Enums.MesCorrespondiente;
import entidades.Alquiler;
import java.time.LocalDate;

public class CobroAlquiler {
    private int idCobroAlquiler;
    private Alquiler alq;
    private LocalDate fechaCobro;
    private MesCorrespondiente mesCobro;
    private double importe;
    private double comision;
    private double importeMora;
    private String numComprobante;

    public CobroAlquiler() {
    }

    public CobroAlquiler(Alquiler alq, LocalDate fechaCobro, MesCorrespondiente mesCobro, double importe, double comision, double importeMora, String numComprobante) {
        
        this.alq = alq;
        this.fechaCobro = fechaCobro;
        this.mesCobro = mesCobro;
        this.importe = importe;
        this.comision = comision;
        this.importeMora = importeMora;
        this.numComprobante = numComprobante;
    }

    public CobroAlquiler(int idCobroAlquiler, Alquiler alq, LocalDate fechaCobro, MesCorrespondiente mesCobro, double importe, double comision, double importeMora, String numComprobante) {
        this.idCobroAlquiler = idCobroAlquiler;
        this.alq = alq;
        this.fechaCobro = fechaCobro;
        this.mesCobro = mesCobro;
        this.importe = importe;
        this.comision = comision;
        this.importeMora = importeMora;
        this.numComprobante = numComprobante;
    }

    public int getIdCobroAlquiler() {
        return idCobroAlquiler;
    }

    public void setIdCobroAlquiler(int idCobroAlquiler) {
        this.idCobroAlquiler = idCobroAlquiler;
    }

    public Alquiler getAlq() {
        return alq;
    }

    public void setAlq(Alquiler alq) {
        this.alq = alq;
    }

    public LocalDate getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(LocalDate fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public MesCorrespondiente getMesCobro() {
        return mesCobro;
    }

    public void setMesCobro(MesCorrespondiente mesCobro) {
        this.mesCobro = mesCobro;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getImporteMora() {
        return importeMora;
    }

    public void setImporteMora(double importeMora) {
        this.importeMora = importeMora;
    }

    public String getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(String numComprobante) {
        this.numComprobante = numComprobante;
    }

    @Override
    public String toString() {
        return "CobroAlquiler{"+idCobroAlquiler + ", alq=" + alq + ", fechaCobro=" + fechaCobro + ", mesCobro=" + mesCobro + ", importe=" + importe + ", comision=" + comision + ", importeMora=" + importeMora + ", numComprobante=" + numComprobante + '}';
    }
}
