
package model;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

//* Manager hereda de Person
public class Manager extends Person{

    private int claveAdministrador;

    public Manager(int claveAdministrador, String nombre, String apellido, int dia, int mes, int ano, String usuario, String contrasena, String correoElectronico) {
        super(nombre, apellido, dia, mes, ano, usuario, contrasena, correoElectronico);
        this.claveAdministrador = claveAdministrador;
    }

    public Manager(){
        
    }
    
    public int getClaveAdministrador() {
        return claveAdministrador;
    }

    public void setClaveAdministrador(int claveAdministrador) {
        this.claveAdministrador = claveAdministrador;
    }

    @Override
    public String toString() {
        return "Clave de administrador: " + claveAdministrador + "\n";
    }
    
}
