
package model;

/**
 *
 * @author Fernando Ismael Canul Caballero
 * Es posible que esta clase sirva en el futuro como una clase padre o una interfaz
 */

public class Person {
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String usuario;
    private String contrasena;
    private String correoElectronico;

    public Person(String nombre, String apellido, int dia, int mes, int ano, String usuario, String contrasena, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = new Date(dia, mes, ano);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.correoElectronico = correoElectronico;
    }

    public Person(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nApellido: " + apellido + "\nFecha de nacimiento: " + fechaDeNacimiento + "\nUsuario: " + usuario + "\nContraseña: " + contrasena + "\nCorreo eléctronico: " + correoElectronico + "\n";
    }

}
