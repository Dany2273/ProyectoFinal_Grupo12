
package entidades;

import Enums.TipoCliente;

public class Cliente extends Persona {
    
    private int idCliente;

    public Cliente() {
    }

    public Cliente(TipoCliente tipo, String nombre, int dni, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
    }

    public Cliente(TipoCliente tipo, String nombre, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
    }

    public Cliente(int idCliente, TipoCliente tipo, String nombre, int dni, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, TipoCliente tipo, String nombre, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idCliente = idCliente;
    }

   

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "idCliente: " + idCliente + super.toString();
    }

   
}
 