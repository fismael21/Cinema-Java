
package controller;

import database.DBSession;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Client;
import model.Manager;
import view.SelectionMovie;
import view.SignIn;
import view.Welcome;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class ControllerConfirmation implements ActionListener {
    private SignIn iniciarSesion;
    private Client client;
    private Manager administrador;
    private int ventanaClave;
    private JFrame ventana;
    private DBSession sesion;
    
    public ControllerConfirmation(SignIn iniciarSesion, Client client, Manager administrador, int ventanaClave, JFrame ventana, DBSession sesion) {
        this.iniciarSesion = iniciarSesion;
        this.client = client;
        this.administrador = administrador;
        this.ventana = ventana;
        this.ventanaClave = ventanaClave;
        this.sesion = sesion;
        
        iniciarSesion.getBotonIngresar().addActionListener(this);
        iniciarSesion.getBotonRegresar().addActionListener(this);
    }
    
    public void init(){
        iniciarSesion.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == iniciarSesion.getBotonRegresar()){
            System.out.println("Botón regresar");
            
            switch(ventanaClave){
                case 1: MainController UI = new MainController(new Welcome(), new DBSession());
                        UI.init();
                        
                        iniciarSesion.dispose();
                    break;
                    
                case 2: ControllerList controladorLista = new ControllerList(new SelectionMovie(), iniciarSesion.getClaveVentana(), iniciarSesion, sesion);
                        controladorLista.init();
                        
                        iniciarSesion.dispose();
                    break;
                
                default: break;
            }
            
        }
        
        if(e.getSource() == iniciarSesion.getBotonIngresar()){
            System.out.println("Botón ingresar");
            String contrasena = String.valueOf(iniciarSesion.getCampoContrasena().getPassword());
            
            if(sesion.activarSesionCliente(iniciarSesion.getCampoUsuario().getText(), contrasena)){
                JOptionPane.showMessageDialog(null, "Bienvenido " + iniciarSesion.getCampoUsuario().getText());
                System.out.println(sesion.isEstadoSesion() + " - " + sesion.isEsAdministrador());
                
                regresarVentana();
                
            }else if(sesion.activarSesionAdministrador(iniciarSesion.getCampoUsuario().getText(), contrasena)){
                JOptionPane.showMessageDialog(null, "Bienvenido " + iniciarSesion.getCampoUsuario().getText());
                JOptionPane.showMessageDialog(null, "Ha iniciado sesión como administrador");
                System.out.println(sesion.isEstadoSesion() + " - " + sesion.isEsAdministrador());
                
                regresarVentana();
            }
            
        }
    
    }

    private void regresarVentana(){
        MainController UI = new MainController(new Welcome(), sesion);
        UI.init();
                        
        iniciarSesion.dispose();
    }
}
