
package entidades;

import Enums.TipoCliente;

public class Escribano extends Persona {
    private int idEscribano;

    public Escribano() {
    }

    public Escribano(int idEscribano, String nombre, int dni, long cuilCuit, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(nombre, dni, cuilCuit, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idEscribano = idEscribano;
    }

    public Escribano(String nombre, int dni, long cuilCuit, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(nombre, dni, cuilCuit, domicilio, ciudad, codigoPostal, telefono, mail, estado);
    }

    public int getIdEscribano() {
        return idEscribano;
    }

    public void setIdEscribano(int idEscribano) {
        this.idEscribano = idEscribano;
    }

    

   

    @Override
    public String toString() {
        return  "idEscribano=" + idEscribano + super.toString();
    }
    
}
