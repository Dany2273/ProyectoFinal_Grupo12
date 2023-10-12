package entidades;

import Enums.TipoCliente;

public class Cliente extends Persona {

    private int idCliente;
    private Conyugue conyugue;

    public Cliente() {
    }

    public Cliente(Conyugue conyugue, TipoCliente tipo, String nombre, int dni, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.conyugue = conyugue;
    }

    public Cliente(int idCliente, Conyugue conyugue, TipoCliente tipo, String nombre, int dni, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idCliente = idCliente;
        this.conyugue = conyugue;
    }

    public Cliente(int idCliente, TipoCliente tipo, String nombre, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idCliente = idCliente;
    }

    public Cliente(TipoCliente tipo, String nombre, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Conyugue getConyugue() {
        return conyugue;
    }

    public void setConyugue(Conyugue conyugue) {
        this.conyugue = conyugue;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", conyugue=" + conyugue + super.toString();
    }

}
