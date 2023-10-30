
package entidades;

import Enums.Accesibilidad;
import Enums.TipoInmueble;
import Enums.Zona;
import entidades.Propietario;

public class Inmueble {
    private int idInmueble;
    private Propietario prop;
    private TipoInmueble tipo;
    private String alquilerVenta;
    private String direccion;
    private Zona zona;
    private String descripcion;
    private int superficie;
    private double precioTasado;    
    private Accesibilidad accesibilidad; 
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

    public Inmueble(Propietario prop, TipoInmueble tipo, String alquilerVenta, String direccion, Zona zona, String descripcion, int superficie, double precioTasado, Accesibilidad accesibilidad, int ambientes, int dormitorios, int baños, boolean patio, boolean cochera, boolean quincho, boolean pileta, boolean mascotas, boolean niños, boolean disponible) {
        this.prop = prop;
        this.tipo = tipo;
        this.alquilerVenta = alquilerVenta;
        this.direccion = direccion;
        this.zona = zona;
        this.descripcion = descripcion;
        this.superficie = superficie;
        this.precioTasado = precioTasado;
        this.accesibilidad = accesibilidad;
        this.ambientes = ambientes;
        this.dormitorios = dormitorios;
        this.baños = baños;
        this.patio = patio;
        this.cochera = cochera;
        this.quincho = quincho;
        this.pileta = pileta;
        this.mascotas = mascotas;
        this.niños = niños;
        this.disponible = disponible;
    }

    public Inmueble(int idInmueble, Propietario prop, TipoInmueble tipo, String alquilerVenta, String direccion, Zona zona, String descripcion, int superficie, double precioTasado, Accesibilidad accesibilidad, int ambientes, int dormitorios, int baños, boolean patio, boolean cochera, boolean quincho, boolean pileta, boolean mascotas, boolean niños, boolean disponible) {
        this.idInmueble = idInmueble;
        this.prop = prop;
        this.tipo = tipo;
        this.alquilerVenta = alquilerVenta;
        this.direccion = direccion;
        this.zona = zona;
        this.descripcion = descripcion;
        this.superficie = superficie;
        this.precioTasado = precioTasado;
        this.accesibilidad = accesibilidad;
        this.ambientes = ambientes;
        this.dormitorios = dormitorios;
        this.baños = baños;
        this.patio = patio;
        this.cochera = cochera;
        this.quincho = quincho;
        this.pileta = pileta;
        this.mascotas = mascotas;
        this.niños = niños;
        this.disponible = disponible;
    }

    

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
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

    public Accesibilidad getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(Accesibilidad accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
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
        return  "Tipo: " + tipo + ", Direccion: " + direccion + ", Zona=" + zona ;
    }
    

}
