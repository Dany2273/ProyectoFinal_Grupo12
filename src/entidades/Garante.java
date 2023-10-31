
package entidades;

import Enums.TipoCliente;

public class Garante extends Persona {

    private int idGarante;

    public Garante() {
        
    }

    public Garante(TipoCliente tipo, String nombre, int dni, long cuilCuit, String domicilio, String ciudad, String codigoPostal, String lugarTrabajo, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, domicilio, ciudad, codigoPostal, lugarTrabajo, telefono, mail, estado);
    }

    public Garante(TipoCliente tipo, String nombre, long cuilCuit, String domicilio, String ciudad, String codigoPostal, String lugarTrabajo, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, domicilio, ciudad, codigoPostal, lugarTrabajo, telefono, mail, estado);
    }
    

    public Garante(int idGarante, TipoCliente tipo, String nombre, int dni, long cuilCuit, String domicilio,
            String ciudad, String codigoPostal, String lugarTrabajo, String telefono, String mail, boolean estado) {
        super(tipo, nombre, dni, cuilCuit, domicilio, ciudad, codigoPostal, lugarTrabajo, telefono, mail, estado);
        this.idGarante = idGarante;
    }

    public Garante(int idGarante, TipoCliente tipo, String nombre, long cuilCuit, String domicilio, String ciudad,
            String codigoPostal, String lugarTrabajo, String telefono, String mail, boolean estado) {
        super(tipo, nombre, cuilCuit, domicilio, ciudad, codigoPostal, lugarTrabajo, telefono, mail, estado);
        this.idGarante = idGarante;
    }

    public int getIdGarante() {
        return idGarante;
    }

    public void setIdGarante(int idGarante) {
        this.idGarante = idGarante;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
