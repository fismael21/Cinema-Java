
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class DBSession extends DBConnection{
    
    private boolean estadoSesion = false;
    private boolean esAdministrador = false;
    
    public boolean activarSesionCliente(String usuario, String contrasena){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = getConnection();
        
        String usuarioCorrecto = "";
        String contrasenaCorrecta = "";
        Boolean estado = false;
        
        try{
            ps = connection.prepareStatement("SELECT usuario, contrasena FROM client_cinema");
            rs = ps.executeQuery();
            
            
            if(rs.next()){
                usuarioCorrecto = rs.getString(1);
                contrasenaCorrecta = rs.getString(2);
            }
            
            if(usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)){
                
                this.estadoSesion = true;
                estado = true;
                
            }else if(usuario.equals(usuarioCorrecto) || contrasena.equals(contrasenaCorrecta)){
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
            
        }catch(Exception ex){
            System.err.println("Error: " + ex);
        }
        
        return estado;
    }
    
    public boolean activarSesionAdministrador(String usuario, String contrasena){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection connection = getConnection();
        
        String usuarioCorrecto = "";
        String contrasenaCorrecta = "";
        Boolean estado = false;
        
        try{
            ps = connection.prepareStatement("SELECT usuario, contrasena FROM manager_cinema");
            rs = ps.executeQuery();
            
            
            if(rs.next()){
                usuarioCorrecto = rs.getString(1);
                contrasenaCorrecta = rs.getString(2);
            }
            
            if(usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)){
                //JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
                this.estadoSesion = true;
                this.esAdministrador = true;
                estado = true;
                
            }else if(usuario.equals(usuarioCorrecto) || contrasena.equals(contrasenaCorrecta)){
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
            
        }catch(Exception ex){
            System.err.println("Error: " + ex);
        }
        
        return estado;
    }

    public boolean isEstadoSesion() {
        return estadoSesion;
    }

    public boolean isEsAdministrador() {
        return esAdministrador;
    }
}
