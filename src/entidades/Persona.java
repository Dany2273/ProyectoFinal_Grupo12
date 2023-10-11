
package entidades;

import Enums.TipoCliente;

public class Persona {
    private TipoCliente tipo;
    private String nombre;
    private int dni;
    private long cuilCuit;
    private String lugarTrabajo;
    private String domicilio;
    private String ciudad;
    private String codigoPostal;
    private String telefono;
    private String mail;
    private boolean estado;

    public Persona() {
    }

    public Persona(TipoCliente tipo, String nombre, int dni, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.dni = dni;
        this.cuilCuit = cuilCuit;
        this.lugarTrabajo = lugarTrabajo;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.mail = mail;
        this.estado = estado;
    }

    public Persona(TipoCliente tipo, String nombre, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cuilCuit = cuilCuit;
        this.lugarTrabajo = lugarTrabajo;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.mail = mail;
        this.estado = estado;
    }

    public Persona(String nombre, int dni, long cuilCuit, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuilCuit = cuilCuit;
        this.domicilio = domicilio;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.mail = mail;
        this.estado = estado;
    }

    

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public long getCuilCuit() {
        return cuilCuit;
    }

    public void setCuilCuit(long cuilCuit) {
        this.cuilCuit = cuilCuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return ", Tipo Persona: " + tipo + ", Nombre: " + nombre + ", Dni: " + dni + ", Cuil/Cuit: " + cuilCuit ;
    }

    
}
