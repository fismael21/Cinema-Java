
package controller;

import com.sun.media.jfxmedia.logging.Logger;
import database.DBClient;
import database.DBManager;
import database.DBSession;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Client;
import model.Manager;
import model.Ticket;
import view.Cancel;
import view.FrameManager;
import view.FrameTicket;
import view.SelectionMovie;
import view.SignIn;
import view.SignUp;
import view.Welcome;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class MainController implements ActionListener {
    
    private Welcome bienvenida;
    private DBSession sesion;
    
    public MainController(Welcome bienvenida, DBSession sesion) {
        this.bienvenida = bienvenida;
        this.sesion = sesion;
        
        bienvenida.getBotonCancelar().addActionListener(this);
        bienvenida.getBotonIngresar().addActionListener(this);
        bienvenida.getBotonCartelera().addActionListener(this);
        bienvenida.getBotonRegistrar().addActionListener(this);
        bienvenida.getBotonAdministrar().addActionListener(this);
        bienvenida.getBotonSalir().addActionListener(this);
    }

    public void init(){
        bienvenida.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == bienvenida.getBotonAdministrar()){
            
            if(sesion.isEsAdministrador()){
                System.out.println("Botón Administrar");
                ControllerManager controladorAdministrador = new ControllerManager(new FrameManager(), new Manager(), bienvenida.getClaveVentana(), bienvenida, sesion);
                controladorAdministrador.init();
                bienvenida.getOracleVideo().stop();
                bienvenida.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Debes iniciar sesión primero como administrador");
            }
            
        }
        
        if(e.getSource() == bienvenida.getBotonCancelar()){
            System.out.println("Botón Cancelar Ticket");
            ControllerTicket controladorTicket = new ControllerTicket(new FrameTicket(), new Cancel(), new Ticket(), bienvenida.getClaveVentana(), bienvenida, sesion);
            controladorTicket.init();
            bienvenida.getOracleVideo().stop();
            bienvenida.setVisible(false);
        }
        
        if(e.getSource() == bienvenida.getBotonCartelera()){
            
            if(sesion.isEsAdministrador()){
                JOptionPane.showMessageDialog(null, "No puede acceder como administrador");
            }
            else{
                System.out.println("Botón Cartelera");
                ControllerList controladorLista = new ControllerList(new SelectionMovie(), bienvenida.getClaveVentana(), bienvenida, sesion);
                controladorLista.init();
                bienvenida.getOracleVideo().stop();
                bienvenida.setVisible(false);
            }
            
        }
        
        if(e.getSource() == bienvenida.getBotonIngresar()){
            System.out.println("Botón Ingresar");
            ControllerConfirmation controladorConfirmar = new ControllerConfirmation(new SignIn(), new Client(), new Manager(), bienvenida.getClaveVentana(), bienvenida, sesion);
            controladorConfirmar.init();
            
            bienvenida.getOracleVideo().stop();
            bienvenida.setVisible(false);
        }
        
        if(e.getSource() == bienvenida.getBotonRegistrar()){
            
            if(sesion.isEstadoSesion()){
                JOptionPane.showMessageDialog(null, "No puede registrarse porque inició sesión");
            }else{
                System.out.println("Botón Registrar");
                ControllerRegistration controladorRegistro = new ControllerRegistration(new SignUp(), new Client(), new DBClient(), new Manager(), new DBManager(), bienvenida.getClaveVentana(), bienvenida, sesion);
                controladorRegistro.init();

                bienvenida.getOracleVideo().stop();
                bienvenida.setVisible(false);
            }
            
        }
        
        if(e.getSource() == bienvenida.getBotonSalir()){
            System.exit(0);
        }
    }
    
}
