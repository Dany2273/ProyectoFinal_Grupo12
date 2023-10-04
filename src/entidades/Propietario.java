
package entidades;

import Enums.TipoCliente;

public class Propietario extends Persona {
    
    private int idPropietario;

    public Propietario() {
    }

    public Propietario(int idPropietario, TipoCliente tipo, String nombre, int dni, int cuilCuit, String domicilio, 
            String ciudad, String codigoPostal, String lugarTrabajo, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, domicilio, ciudad, codigoPostal, lugarTrabajo, telefono, mail, estado);
        this.idPropietario = idPropietario;
    }

    public Propietario(int idPropietario, TipoCliente tipo, String nombre, int cuilCuit, String domicilio, 
            String ciudad, String codigoPostal, String lugarTrabajo, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, domicilio, ciudad, codigoPostal, lugarTrabajo, telefono, mail, estado);
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
        return "idPropietario=" + idPropietario + super.toString();
    }
    
}
