
package entidades;

import Enums.TipoInmueble;
import Enums.Caracteristicas;

public class Inmueble {
   
    private String direccion;
    private Propietario prop;
    private TipoInmueble tipo;
    private String accesibilidad;
    private Caracteristicas carac;
    private int superficie;
    private double precioTasado;
    private String zona;
    private String alquilerVenta;
    private String descripcion;
    private int ambientes;
    private int dormitorios;
    private int baños;
    private boolean patio;
    private boolean cochera;
    private boolean quincho;
    private boolean pileta;
    private boolean mascotas;
    private boolean niños;
     private boolean disponible;

    public Inmueble() {
    }

    public Inmueble(String direccion, Propietario prop, TipoInmueble tipo, 
            String accesibilidad, Caracteristicas carac, int superficie, double precioTasado,
            String zona, String alquilerVenta, String descripcion, int ambientes,
            int dormitorios, int baños, boolean patio, boolean cochera, boolean quincho, 
            boolean pileta, boolean mascotas, boolean niños, boolean disponible) {
        
        this.direccion = direccion;this.prop = prop;this.tipo = tipo; this.accesibilidad = accesibilidad;
        this.carac = carac;this.superficie = superficie; this.precioTasado = precioTasado;
        this.zona = zona;this.alquilerVenta = alquilerVenta;
        this.descripcion = descripcion;this.ambientes = ambientes;this.dormitorios = dormitorios;
        this.baños = baños;this.patio = patio;this.cochera = cochera;this.quincho = quincho;
        this.pileta = pileta;this.mascotas = mascotas;this.niños = niños;this.disponible = disponible;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

    public TipoInmueble getTipo() {
        return tipo;
    }

    public void setTipo(TipoInmueble tipo) {
        this.tipo = tipo;
    }

    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public Caracteristicas getCarac() {
        return carac;
    }

    public void setCarac(Caracteristicas carac) {
        this.carac = carac;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public double getPrecioTasado() {
        return precioTasado;
    }

    public void setPrecioTasado(double precioTasado) {
        this.precioTasado = precioTasado;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getAlquilerVenta() {
        return alquilerVenta;
    }

    public void setAlquilerVenta(String alquilerVenta) {
        this.alquilerVenta = alquilerVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public boolean isCochera() {
        return cochera;
    }

    public void setCochera(boolean cochera) {
        this.cochera = cochera;
    }

    public boolean isQuincho() {
        return quincho;
    }

    public void setQuincho(boolean quincho) {
        this.quincho = quincho;
    }

    public boolean isPileta() {
        return pileta;
    }

    public void setPileta(boolean pileta) {
        this.pileta = pileta;
    }

    public boolean isMascotas() {
        return mascotas;
    }

    public void setMascotas(boolean mascotas) {
        this.mascotas = mascotas;
    }

    public boolean isNiños() {
        return niños;
    }

    public void setNiños(boolean niños) {
        this.niños = niños;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + direccion + ", prop=" + prop + ", tipo=" + tipo + ", accesibilidad=" + 
                accesibilidad + ", carac=" + carac + ", superficie=" + superficie + ", precioTasado=" + precioTasado  + 
                ", zona=" + zona + ", alquilerVenta=" + alquilerVenta + ", descripcion=" + descripcion + 
                ", ambientes=" + ambientes + ", dormitorios=" + dormitorios + ", ba\u00f1os=" + baños + ", patio=" + 
                patio + ", cochera=" + cochera + ", quincho=" + quincho + ", pileta=" + pileta +
                ", mascotas=" + mascotas + ", ni\u00f1os=" + niños + ", disponible=" + disponible + '}';
    }
     
}
