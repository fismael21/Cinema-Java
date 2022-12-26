
package model;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class Seat {
    private int ID;
    private String nombre;
    
    public Seat(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public Seat() {
        
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", nombre: " + nombre;
    }
    
}
