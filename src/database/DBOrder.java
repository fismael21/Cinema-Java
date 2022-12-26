
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Order;
import view.Cancel;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class DBOrder extends DBConnection{
    PreparedStatement preparedStatement;
    
    public boolean insertarOrden(Order orden, String asientos){
        Connection connection = getConnection();
        
        try{
            preparedStatement = connection.prepareStatement("insert into order_cinema (nombre_titular, numero_tarjeta, numero_comprobante, nombre_pelicula, fecha_hora, tipo_de_funcion, numero_boletos, asientos, costo_total) values (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, orden.getPago().getNomTitular());
            preparedStatement.setString(2, orden.getPago().getNumTarjeta());
            preparedStatement.setInt(3, orden.getTicket().getFolio());
            preparedStatement.setString(4, orden.getPelicula().getNombre());
            preparedStatement.setString(5, orden.getFechaPelicula());
            preparedStatement.setString(6, orden.getTipoDeFuncion());
            preparedStatement.setInt(7, orden.getNumBoletos());
            preparedStatement.setString(8, asientos);
            preparedStatement.setDouble(9, orden.getCostoTotal());
            
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
        
    public void eliminarOrden(Cancel cancelar){
        PreparedStatement ps = null;
        
        try{
            Connection connection = getConnection();
            
            ps = connection.prepareStatement("DELETE FROM order_cinema WHERE numero_comprobante=?");
            ps.setString(1, cancelar.getCampoFolio().getText());
            
            ps.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Orden eliminada.");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar.");
            System.err.println("Error: " + ex);
        }
    }
}
