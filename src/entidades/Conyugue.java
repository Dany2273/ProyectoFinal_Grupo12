
package entidades;

import Enums.TipoCliente;

public class Conyugue extends Persona{
    private int idConyugue;

    public Conyugue() {
    }

    public Conyugue(int idConyugue, String nombre, int dni, long cuilCuit, String domicilio, String ciudad,
            String codigoPostal, String telefono, String mail, boolean estado) {
        super(nombre, dni, cuilCuit, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idConyugue = idConyugue;
    }

    public Conyugue(String nombre, int dni, long cuilCuit, String domicilio, String ciudad,
            String codigoPostal, String telefono, String mail, boolean estado) {
        super(nombre, dni, cuilCuit, domicilio, ciudad, codigoPostal, telefono, mail, estado);
    }

   

    

    public int getIdConyugue() {
        return idConyugue;
    }

    public void setIdConyugue(int idConyugue) {
        this.idConyugue = idConyugue;
    }

    @Override
    public String toString() {
        return  "idConyugue=" + idConyugue + super.toString();
    }
    
}
