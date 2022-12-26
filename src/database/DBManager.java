
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Manager;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class DBManager extends DBConnection {
  PreparedStatement preparedStatement;

  public boolean insertarAdministrador(Manager administrador) {
    Connection connection = getConnection();

    try {
      preparedStatement = connection.prepareStatement(
          "insert into manager_cinema (nombre, apellido, correo_electronico, usuario, contrasena, fecha_nacimiento, clave_administrador) values (?,?,?,?,?,?,?)");
      preparedStatement.setString(1, administrador.getNombre());
      preparedStatement.setString(2, administrador.getApellido());
      preparedStatement.setString(3, administrador.getCorreoElectronico());
      preparedStatement.setString(4, administrador.getUsuario());
      preparedStatement.setString(5, administrador.getContrasena());
      preparedStatement.setString(6, String.valueOf(administrador.getFechaDeNacimiento()));
      preparedStatement.setInt(7, administrador.getClaveAdministrador());
      
      int result = preparedStatement.executeUpdate();

      return result != 0; // If result is different from 0, return "true".

    } catch (SQLException ex) {
      System.err.println("Error: " + ex.getMessage());
      return false;
    } finally {
      try {
        connection.close();
      } catch (SQLException ex) {
        System.err.println("Error: " + ex.getMessage());
      }
    }
  }
}
