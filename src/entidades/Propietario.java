
package entidades;

import entidades.Persona;
import Enums.TipoCliente;

public class Propietario extends Persona {
    
    private int idPropietario;

    public Propietario() {
    }

    public Propietario(TipoCliente tipo, String nombre, int dni, int cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
    }

    public Propietario(TipoCliente tipo, String nombre, int cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
    }

    public Propietario(int idPropietario, TipoCliente tipo, String nombre, int dni, int cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idPropietario = idPropietario;
    }

    public Propietario(int idPropietario, TipoCliente tipo, String nombre, int cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idPropietario = idPropietario;
    }

   
    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
