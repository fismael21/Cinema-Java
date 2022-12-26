
package controller;

import database.DBMovie;
import database.DBOrder;
import database.DBSession;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Movie;
import model.Order;
import view.FrameOrder;
import view.FrameSeat;
import view.SelectionMovie;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class ControllerOrder implements ActionListener{
    private FrameOrder vistaOrden;
    private Order orden;
    private DBOrder dbOrden;
    private int clavePoster;
    private String tipoDeFuncion;
    private DBSession sesion;
    private String nombrePoster;
    
    public ControllerOrder(FrameOrder vistaOrden, Order orden, int clavePoster, DBSession sesion, String nombrePoster) {
        this.vistaOrden = vistaOrden;
        this.orden = orden;
        this.clavePoster = clavePoster;
        this.sesion = sesion;
        this.nombrePoster = nombrePoster;
        
        vistaOrden.getBotonContinuar().addActionListener(this);
        vistaOrden.getBotonRegresar().addActionListener(this);
        vistaOrden.getOpcionClasico().addActionListener(this);
        vistaOrden.getOpcion4DX().addActionListener(this);
        vistaOrden.getOpcion3D().addActionListener(this);
    }

    public void init(){
        vistaOrden.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaOrden.getBotonContinuar()){
            orden = generarOrden();
            //System.out.println(orden);
            
            if(orden != null){
                ControllerSeat controladorAsientos = new ControllerSeat(new FrameSeat(), orden, sesion, clavePoster, nombrePoster);
                controladorAsientos.init();
                vistaOrden.dispose();
            }else{
                System.out.println("Faltan datos por llenar");
            }
            
        }
        
        if(e.getSource() == vistaOrden.getBotonRegresar()){
            ControllerList controladorLista = new ControllerList(new SelectionMovie(), vistaOrden.getClaveVentana(), vistaOrden, sesion);
            controladorLista.init();
            vistaOrden.dispose();
        }
        
        if(e.getSource() == vistaOrden.getOpcionClasico()){
            tipoDeFuncion = "Clásico";
            System.out.println(tipoDeFuncion);
        }
        
        if(e.getSource() == vistaOrden.getOpcion4DX()){
            tipoDeFuncion = "4DX";
            System.out.println(tipoDeFuncion);
        }
        
        if(e.getSource() == vistaOrden.getOpcion3D()){
            tipoDeFuncion = "3D";
            System.out.println(tipoDeFuncion);
        }
    }
    
    private Order generarOrden(){
        
        if("Día".equals(vistaOrden.getCampoDia().getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Seleccione el día");
            
        }else if("Mes".equals(vistaOrden.getCampoMes().getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Seleccione el mes");
            
        }else if("Hora".equals(vistaOrden.getCampoHora().getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Seleccione la hora");
            
        }else if("".equals(tipoDeFuncion)){
            JOptionPane.showMessageDialog(null, "Seleccione tipo de función");
            
        }else{
            int numBoletos = Integer.parseInt(vistaOrden.getNumeroBoletos().getSelectedItem().toString());
            String dia = vistaOrden.getCampoDia().getSelectedItem().toString();
            String mes = vistaOrden.getCampoMes().getSelectedItem().toString();
            String hora = vistaOrden.getCampoHora().getSelectedItem().toString();

            DBMovie dbPelicula = new DBMovie();
            dbPelicula.obtenerPelicula(String.valueOf(clavePoster));

            Movie pelicula = new Movie();
            pelicula = dbPelicula.getMiPelicula();

            Order orden = new Order(pelicula, numBoletos, dia, mes, hora, tipoDeFuncion);
            double costoTotal = 0;

            if("Clásico".equals(tipoDeFuncion)){
                costoTotal = orden.getCLASICO() * numBoletos;

            }else if("4DX".equals(tipoDeFuncion)){
                costoTotal = orden.getCUATRODX()* numBoletos;

            }else if("3D".equals(tipoDeFuncion)){
                costoTotal = orden.getTRESD()* numBoletos;

            }else{
                System.out.println("Algo más...");
            }

            orden.setCostoTotal(costoTotal);
            
            return orden;
        }
        
        return null;
    }
    
}
