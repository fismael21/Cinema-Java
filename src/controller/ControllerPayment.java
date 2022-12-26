
package controller;

import database.DBSession;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Order;
import model.Payment;
import model.Ticket;
import view.Cancel;
import view.FramePayment;
import view.FrameSeat;
import view.FrameTicket;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class ControllerPayment implements ActionListener{
    private Order orden;
    private FramePayment ventanaPago;
    private Payment pago;
    private String tipoDeTarjeta = "";
    private DBSession sesion;
    private int clavePoster;
    private String nombrePoster;
    
    public ControllerPayment(Order orden, FramePayment ventanaPago, Payment pago, DBSession sesion, int clavePoster, String nombrePoster) {
        this.orden = orden;
        this.ventanaPago = ventanaPago;
        this.pago = pago;
        this.sesion = sesion;
        this.clavePoster = clavePoster;
        this.nombrePoster = nombrePoster;
        
        ventanaPago.getBotonIngresar().addActionListener(this);
        ventanaPago.getBotonRegresar().addActionListener(this);
        ventanaPago.getOpcionCredito().addActionListener(this);
        ventanaPago.getOpcionDebito().addActionListener(this);
    }

    public void init(){
        ventanaPago.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ventanaPago.getBotonIngresar()){
            pago = crearPago();
            
            if(pago != null){
                orden.setPago(pago);
            
                int folioTicket = (int) (Math.random() * 100000000);
                orden.setTicket(new Ticket(folioTicket));

                ControllerTicket controladorTicket = new ControllerTicket(new FrameTicket(), new Cancel(), orden.getTicket(), ventanaPago.getClaveVentana(), ventanaPago, orden, sesion);
                controladorTicket.init();

                ventanaPago.dispose();
            }else{
                System.out.println("Faltan datos por llenar");
            }
        }
        
        if(e.getSource() == ventanaPago.getBotonRegresar()){
            ControllerSeat controladorAsientos = new ControllerSeat(new FrameSeat(), orden, sesion, clavePoster, nombrePoster);
            controladorAsientos.init();
            ventanaPago.dispose();
        }
        
        if(e.getSource() == ventanaPago.getOpcionCredito()){
            tipoDeTarjeta = "Crédito";
            System.out.println(tipoDeTarjeta);
        }
        
        if(e.getSource() == ventanaPago.getOpcionDebito()){
            tipoDeTarjeta = "Débito";
            System.out.println(tipoDeTarjeta);
        }
    }
    
    private Payment crearPago(){
        
        if("".equals(ventanaPago.getCampoNombreDeTitular().getText())){
            JOptionPane.showMessageDialog(null, "Ingrese nombre del titular");
        }else if("".equals(tipoDeTarjeta)){
            JOptionPane.showMessageDialog(null, "Seleccione tipo de tarjeta");
        }else if("".equals(ventanaPago.getCampoNumeroDeTarjeta().getText())){
            JOptionPane.showMessageDialog(null, "Ingrese número de tarjeta");
        }else if("Mes".equals(ventanaPago.getCampoMes().getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Ingresa mes");
        }else if("Año".equals(ventanaPago.getCampoAno().getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Ingrese año");
        }else if("".equals(ventanaPago.getCampoCodigoDeSeguridad().getText())){
            JOptionPane.showMessageDialog(null, "Ingrese código de seguridad");
        }else{
            String nomTitular = ventanaPago.getCampoNombreDeTitular().getText();
            String numTarjeta = ventanaPago.getCampoNumeroDeTarjeta().getText();
            int mes = Integer.parseInt(ventanaPago.getCampoMes().getSelectedItem().toString());
            int ano = Integer.parseInt(ventanaPago.getCampoAno().getSelectedItem().toString());
            int codigoDeSeguridad = Integer.parseInt(ventanaPago.getCampoCodigoDeSeguridad().getText());

            Payment pago = new Payment(nomTitular, tipoDeTarjeta, numTarjeta, ano, mes, codigoDeSeguridad);
            return pago;
        }
        
        return null;
    }
    
}
