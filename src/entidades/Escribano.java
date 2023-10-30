
package entidades;

public class Escribano extends Persona {
    private int idEscribano;

    public Escribano() {
    }

    public Escribano(int idEscribano, String nombre, int dni, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(nombre, dni, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
        this.idEscribano = idEscribano;
    }

    public Escribano(String nombre, int dni, long cuilCuit, String lugarTrabajo, String domicilio, String ciudad, String codigoPostal, String telefono, String mail, boolean estado) {
        super(nombre, dni, cuilCuit, lugarTrabajo, domicilio, ciudad, codigoPostal, telefono, mail, estado);
    }

    

    public int getIdEscribano() {
        return idEscribano;
    }

    public void setIdEscribano(int idEscribano) {
        this.idEscribano = idEscribano;
    }

    

   

    @Override
    public String toString() {
        return   super.toString();
    }
    
}
