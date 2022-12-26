
package model;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

//Client hereda de Person
public class Client extends Person{

    public Client(String nombre, String apellido, int dia, int mes, int ano, String usuario, String contrasena, String correoElectronico) {
        super(nombre, apellido, dia, mes, ano, usuario, contrasena, correoElectronico);
    }

    public Client(){
        
    }
}
