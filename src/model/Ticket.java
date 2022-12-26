
package model;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class Ticket {
    private int folio;

    public Ticket(int folio) {
        this.folio = folio;
    }
    
    public Ticket(){
        
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }
    
}
