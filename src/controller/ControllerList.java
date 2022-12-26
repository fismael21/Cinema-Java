
package controller;

import database.DBClient;
import database.DBManager;
import database.DBSession;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Client;
import model.Manager;
import model.Order;
import model.Ticket;
import view.Cancel;
import view.FrameOrder;
import view.FrameTicket;
import view.SelectionMovie;
import view.SignIn;
import view.SignUp;
import view.Welcome;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */
public class ControllerList implements ActionListener, MouseListener{

    private SelectionMovie seleccionPelicula;
    private JFrame ventana;
    private int codigoVentana;
    private DBSession sesion;
    
    public ControllerList(SelectionMovie seleccionPelicula, int codigoVentana, JFrame ventana, DBSession sesion){
        this.seleccionPelicula = seleccionPelicula;
        this.codigoVentana = codigoVentana;
        this.ventana = ventana;
        this.sesion = sesion;
        
        agregarMouseListener();
        
        seleccionPelicula.getBotonRegistrar().addActionListener(this);
        seleccionPelicula.getBotonIngresar().addActionListener(this);
        seleccionPelicula.getBotonRegresar().addActionListener(this);
        seleccionPelicula.getBotonCancelarBoleto().addActionListener(this);
    }
    
    public void init() {
        seleccionPelicula.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == seleccionPelicula.getBotonRegistrar()){
            
            ControllerRegistration controladorRegistro = new ControllerRegistration(new SignUp(), new Client(), new DBClient(), new Manager(), new DBManager(), seleccionPelicula.getClaveVentana(), seleccionPelicula, sesion);
            controladorRegistro.init();
            
            seleccionPelicula.dispose();
        }
        
        if(e.getSource() == seleccionPelicula.getBotonIngresar()){
            System.out.println("Botón Ingresar");
            ControllerConfirmation controladorConfirmar = new ControllerConfirmation(new SignIn(), new Client(), new Manager(), seleccionPelicula.getClaveVentana(), seleccionPelicula, new DBSession());
            controladorConfirmar.init();
    
            seleccionPelicula.setVisible(false);
        }
        
        if(e.getSource() == seleccionPelicula.getBotonRegresar()){
            MainController UI = new MainController(new Welcome(), sesion);
            UI.init();
            seleccionPelicula.dispose();
        }
        
        if(e.getSource() == seleccionPelicula.getBotonCancelarBoleto()){
            System.out.println("Botón Cancelar Ticket");
            ControllerTicket controladorTicket = new ControllerTicket(new FrameTicket(), new Cancel(), new Ticket(), seleccionPelicula.getClaveVentana(), seleccionPelicula, sesion);
            controladorTicket.init();
            
            seleccionPelicula.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        agregarMouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //System.out.println("");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        agregarMouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        agregarMouseExited(e);
    }
    
    private void agregarMouseListener(){
        seleccionPelicula.getMovie1().addMouseListener(this);
        seleccionPelicula.getMovie2().addMouseListener(this);
        seleccionPelicula.getMovie3().addMouseListener(this);
        seleccionPelicula.getMovie4().addMouseListener(this);
        seleccionPelicula.getMovie5().addMouseListener(this);
        seleccionPelicula.getMovie6().addMouseListener(this);
        seleccionPelicula.getMovie7().addMouseListener(this);
        seleccionPelicula.getMovie8().addMouseListener(this);
        seleccionPelicula.getMovie9().addMouseListener(this);
        seleccionPelicula.getMovie10().addMouseListener(this);
        seleccionPelicula.getMovie11().addMouseListener(this);
        seleccionPelicula.getMovie12().addMouseListener(this);
    }
    
    private void agregarMouseClicked(MouseEvent evento){
        int opcion;
        if(evento.getSource() == seleccionPelicula.getMovie1()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver The Matrix?");
            irVentanaOrden(1, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie2()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver A Beautiful Mind?");
            irVentanaOrden(2, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie3()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver One Piece Film Red?");
            irVentanaOrden(3, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie4()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver Hachiko?");
            irVentanaOrden(4, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie5()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver The Pianist?");
            irVentanaOrden(5, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie6()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver The Net?");
            irVentanaOrden(6, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie7()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver Troy?");
            irVentanaOrden(7, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie8()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver The Grudge?");
            irVentanaOrden(8, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie9()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver Ginger Snaps ?");
            irVentanaOrden(9, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie10()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver The Silence of the Lambs?");
            irVentanaOrden(10, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie11()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver The Intership?");
            irVentanaOrden(11, opcion);
        }
        if(evento.getSource() == seleccionPelicula.getMovie12()){
            opcion = JOptionPane.showConfirmDialog(seleccionPelicula, "¿Le gustaría ver The Social Network?");
            irVentanaOrden(12, opcion);
        }
        
    }
    
    private void agregarMouseEntered(MouseEvent evento){
        if(evento.getSource() == seleccionPelicula.getMovie1()){
            seleccionPelicula.getMovie1().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie2()){
            seleccionPelicula.getMovie2().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie3()){
            seleccionPelicula.getMovie3().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie4()){
            seleccionPelicula.getMovie4().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie5()){
            seleccionPelicula.getMovie5().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie6()){
            seleccionPelicula.getMovie6().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie7()){
            seleccionPelicula.getMovie7().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie8()){
            seleccionPelicula.getMovie8().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie9()){
            seleccionPelicula.getMovie9().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie10()){
            seleccionPelicula.getMovie10().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie11()){
            seleccionPelicula.getMovie11().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie12()){
            seleccionPelicula.getMovie12().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
    }
    
    private void agregarMouseExited(MouseEvent evento){
        if(evento.getSource() == seleccionPelicula.getMovie1()){
            seleccionPelicula.getMovie1().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie2()){
            seleccionPelicula.getMovie2().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie3()){
            seleccionPelicula.getMovie3().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie4()){
            seleccionPelicula.getMovie4().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie5()){
            seleccionPelicula.getMovie5().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie6()){
            seleccionPelicula.getMovie6().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie7()){
            seleccionPelicula.getMovie7().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie8()){
            seleccionPelicula.getMovie8().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie9()){
            seleccionPelicula.getMovie9().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie10()){
            seleccionPelicula.getMovie10().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie11()){
            seleccionPelicula.getMovie11().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
        if(evento.getSource() == seleccionPelicula.getMovie12()){
            seleccionPelicula.getMovie12().setBorder(BorderFactory.createLineBorder(Color.white, 1, false));
        }
    }
    
    private void irVentanaOrden(int clavePelicula, int opcion){
        switch(opcion){
            case 0: 
                System.out.println("Sí");
                ControllerOrder controlodadorOrden;
                String nombrePoster;
                switch(clavePelicula){
                    case 1: 
                            nombrePoster = "01.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 1, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 2: 
                            nombrePoster = "02.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 2, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 3: 
                            nombrePoster = "03.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 3, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 4: 
                            nombrePoster = "04.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 4, sesion,nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 5: 
                            nombrePoster = "05.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 5, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 6: 
                            nombrePoster = "06.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 6, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 7: 
                            nombrePoster = "07.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 7, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 8: 
                            nombrePoster = "08.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 8, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 9: 
                            nombrePoster = "09.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 9, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 10: 
                            nombrePoster = "10.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 10, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 11: 
                            nombrePoster = "11.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 11, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    case 12: 
                            nombrePoster = "12.png";
                            controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), 12, sesion, nombrePoster);
                            controlodadorOrden.init();
                            seleccionPelicula.dispose();
                        break;
                    default: break;
                }
                break;
            case 1: 
                System.out.println("No");
                break;
            case 2: 
                System.out.println("Cancelar");
                break;
            default: break;
        }
    }
}
