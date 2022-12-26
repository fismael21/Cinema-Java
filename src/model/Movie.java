
package model;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class Movie {
    private int ID;
    private String nombre;
    private String genero;
    private double duracion;
    private String fechaLanzamiento;
    private String fechaCreacion;

    public Movie(){
        
    }

    public Movie(String nombre, String genero, double duracion, String fechaLanzamiento, String fechaCreacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.fechaCreacion = fechaCreacion;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", genero: " + genero + ", duracion: " + duracion + ", fechaLanzamiento: " + fechaLanzamiento + ", fechaCreacion: " + fechaCreacion + "\n";
    }
    
    
}
