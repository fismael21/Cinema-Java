
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Client;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */
public class DBClient extends DBConnection{
    PreparedStatement preparedStatement;
    
    public boolean insertarCliente(Client cliente){
        Connection connection = getConnection();
        
        try{
            preparedStatement = connection.prepareStatement("insert into client_cinema (nombre, apellido, correo_electronico, usuario, contrasena, fecha_nacimiento) values (?,?,?,?,?,?)");
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellido());
            preparedStatement.setString(3, cliente.getCorreoElectronico());
            preparedStatement.setString(4, cliente.getUsuario());
            preparedStatement.setString(5, cliente.getContrasena());
            preparedStatement.setString(6, String.valueOf(cliente.getFechaDeNacimiento()));
            
            int result = preparedStatement.executeUpdate();
            
            return result != 0; //If result is different from 0, return "true".
            
        }catch(SQLException ex){
            System.err.println("Error: " + ex.getMessage());
            return false;
        }finally{
            try {
                connection.close();
            } catch (SQLException ex) {
                System.err.println("Error: " + ex.getMessage());
            }
        }
    }
    
}
