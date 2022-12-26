
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Movie;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class DBMovie extends DBConnection {
    PreparedStatement ps;
    ResultSet rs;
    private Movie miPelciula;
    
    public void obtenerPelicula(String clavePelicula){
        try{
            Movie pelicula = new Movie();
            Connection connection = getConnection();
            ps = connection.prepareStatement("SELECT * FROM movie_cinema WHERE idMovie=?");
            ps.setString(1, clavePelicula);
            rs = ps.executeQuery();
            
            while(rs.next()){
                pelicula.setID(rs.getInt("idMovie"));
                pelicula.setNombre(rs.getString("nombre"));
                pelicula.setGenero(rs.getString("genero"));
                pelicula.setDuracion(rs.getDouble("duracion"));
                pelicula.setFechaLanzamiento(rs.getString("fecha_lanzamiento"));
                pelicula.setFechaCreacion(rs.getString("fecha_creacion"));
            }
           
            //System.out.println(pelicula);
            this.miPelciula = pelicula;
            connection.close();
        }catch(SQLException ex){
            System.err.println("Error: " + ex);
            
        }
            
    }
    
    public Movie getMiPelicula(){
        return this.miPelciula;
    }
   
}
