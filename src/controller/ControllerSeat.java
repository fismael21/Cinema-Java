
package controller;

import database.DBSession;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.Order;
import model.Payment;
import model.Seat;
import view.FrameOrder;
import view.FramePayment;
import view.FrameSeat;
import view.SelectionMovie;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class ControllerSeat implements ActionListener, MouseListener {
    private FrameSeat vistaAsiento;
    private Order orden;
    private LinkedList<Seat> asientos = new LinkedList<>();
    private DBSession sesion;
    private int clavePoster;
    private String nombrePoster;
    
    public ControllerSeat(FrameSeat vistaAsiento, Order orden, DBSession sesion, int clavePoster, String nombrePoster) {
        this.vistaAsiento = vistaAsiento;
        this.orden = orden;
        this.sesion = sesion;
        this.clavePoster = clavePoster;
        this.nombrePoster = nombrePoster;
        
        this.vistaAsiento.getBotonContinuar().addActionListener(this);
        this.vistaAsiento.getBotonRegresar().addActionListener(this);

        agregarMouseListener();
    }

    public void init() {
        vistaAsiento.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaAsiento.getBotonContinuar()) {
            orden.setAsientos(retornarArrayList());

            ControllerPayment controladorPago = new ControllerPayment(orden, new FramePayment(), new Payment(), sesion, clavePoster, nombrePoster);
            controladorPago.init();
            vistaAsiento.dispose();
        }

        if (e.getSource() == vistaAsiento.getBotonRegresar()) {
            ControllerOrder controlodadorOrden = new ControllerOrder(new FrameOrder(nombrePoster), new Order(), clavePoster, sesion, nombrePoster);
            controlodadorOrden.init();
            vistaAsiento.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        agregarMouseClicked(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        agregarMouseEntered(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        agregarMouseExited(e);
    }

    private void agregarMouseListener() {
        vistaAsiento.getAsiento1().addMouseListener(this);
        vistaAsiento.getAsiento2().addMouseListener(this);
        vistaAsiento.getAsiento3().addMouseListener(this);
        vistaAsiento.getAsiento4().addMouseListener(this);
        vistaAsiento.getAsiento5().addMouseListener(this);
        vistaAsiento.getAsiento6().addMouseListener(this);
        vistaAsiento.getAsiento7().addMouseListener(this);
        vistaAsiento.getAsiento8().addMouseListener(this);
        vistaAsiento.getAsiento9().addMouseListener(this);
        vistaAsiento.getAsiento10().addMouseListener(this);
        vistaAsiento.getAsiento11().addMouseListener(this);
        vistaAsiento.getAsiento12().addMouseListener(this);
        vistaAsiento.getAsiento13().addMouseListener(this);
        vistaAsiento.getAsiento14().addMouseListener(this);
        vistaAsiento.getAsiento15().addMouseListener(this);
        vistaAsiento.getAsiento16().addMouseListener(this);
        vistaAsiento.getAsiento17().addMouseListener(this);
        vistaAsiento.getAsiento18().addMouseListener(this);
        vistaAsiento.getAsiento19().addMouseListener(this);
        vistaAsiento.getAsiento20().addMouseListener(this);
        vistaAsiento.getAsiento21().addMouseListener(this);
        vistaAsiento.getAsiento22().addMouseListener(this);
        vistaAsiento.getAsiento23().addMouseListener(this);
        vistaAsiento.getAsiento24().addMouseListener(this);
    }

    private void removerMouseListener() {
        vistaAsiento.getAsiento1().removeMouseListener(this);
        vistaAsiento.getAsiento2().removeMouseListener(this);
        vistaAsiento.getAsiento3().removeMouseListener(this);
        vistaAsiento.getAsiento4().removeMouseListener(this);
        vistaAsiento.getAsiento5().removeMouseListener(this);
        vistaAsiento.getAsiento6().removeMouseListener(this);
        vistaAsiento.getAsiento7().removeMouseListener(this);
        vistaAsiento.getAsiento8().removeMouseListener(this);
        vistaAsiento.getAsiento9().removeMouseListener(this);
        vistaAsiento.getAsiento10().removeMouseListener(this);
        vistaAsiento.getAsiento11().removeMouseListener(this);
        vistaAsiento.getAsiento12().removeMouseListener(this);
        vistaAsiento.getAsiento13().removeMouseListener(this);
        vistaAsiento.getAsiento14().removeMouseListener(this);
        vistaAsiento.getAsiento15().removeMouseListener(this);
        vistaAsiento.getAsiento16().removeMouseListener(this);
        vistaAsiento.getAsiento17().removeMouseListener(this);
        vistaAsiento.getAsiento18().removeMouseListener(this);
        vistaAsiento.getAsiento19().removeMouseListener(this);
        vistaAsiento.getAsiento20().removeMouseListener(this);
        vistaAsiento.getAsiento21().removeMouseListener(this);
        vistaAsiento.getAsiento22().removeMouseListener(this);
        vistaAsiento.getAsiento23().removeMouseListener(this);
        vistaAsiento.getAsiento24().removeMouseListener(this);
    }

    private void agregarMouseClicked(MouseEvent evento) {
        if (evento.getSource() == vistaAsiento.getAsiento1()) {
            System.out.println("Asiento 1");
            vistaAsiento.getAsiento1().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento1().removeMouseListener(this);
            Seat asiento = new Seat(1, "Asiento 1");
            asientos.add(asiento);
            System.out.println(asientos.size());
            
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento2()) {
            System.out.println("Asiento 2");
            vistaAsiento.getAsiento2().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento2().removeMouseListener(this);
            Seat asiento = new Seat(2, "Asiento 2");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento3()) {
            System.out.println("Asiento 3");
            vistaAsiento.getAsiento3().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento3().removeMouseListener(this);
            Seat asiento = new Seat(3, "Asiento 3");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento4()) {
            System.out.println("Asiento 4");
            vistaAsiento.getAsiento4().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento4().removeMouseListener(this);
            Seat asiento = new Seat(4, "Asiento 4");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento5()) {
            System.out.println("Asiento 5");
            vistaAsiento.getAsiento5().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento5().removeMouseListener(this);
            Seat asiento = new Seat(5, "Asiento 5");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento6()) {
            System.out.println("Asiento 6");
            vistaAsiento.getAsiento6().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento6().removeMouseListener(this);
            Seat asiento = new Seat(6, "Asiento 6");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento7()) {
            System.out.println("Asiento 7");
            vistaAsiento.getAsiento7().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento7().removeMouseListener(this);
            Seat asiento = new Seat(7, "Asiento 7");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento8()) {
            System.out.println("Asiento 8");
            vistaAsiento.getAsiento8().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento8().removeMouseListener(this);
            Seat asiento = new Seat(8, "Asiento 8");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento9()) {
            System.out.println("Asiento 9");
            vistaAsiento.getAsiento9().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento9().removeMouseListener(this);
            Seat asiento = new Seat(9, "Asiento 9");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento10()) {
            System.out.println("Asiento 10");
            vistaAsiento.getAsiento10().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento10().removeMouseListener(this);
            Seat asiento = new Seat(10, "Asiento 10");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento11()) {
            System.out.println("Asiento 11");
            vistaAsiento.getAsiento11().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento11().removeMouseListener(this);
            Seat asiento = new Seat(11, "Asiento 11");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento12()) {
            System.out.println("Asiento 12");
            vistaAsiento.getAsiento12().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento12().removeMouseListener(this);
            Seat asiento = new Seat(12, "Asiento 12");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento13()) {
            System.out.println("Asiento 13");
            vistaAsiento.getAsiento13().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento13().removeMouseListener(this);
            Seat asiento = new Seat(13, "Asiento 13");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento14()) {
            System.out.println("Asiento 14");
            vistaAsiento.getAsiento14().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento14().removeMouseListener(this);
            Seat asiento = new Seat(14, "Asiento 14");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento15()) {
            System.out.println("Asiento 15");
            vistaAsiento.getAsiento15().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento15().removeMouseListener(this);
            Seat asiento = new Seat(15, "Asiento 15");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento16()) {
            System.out.println("Asiento 16");
            vistaAsiento.getAsiento16().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento16().removeMouseListener(this);
            Seat asiento = new Seat(16, "Asiento 16");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento17()) {
            System.out.println("Asiento 17");
            vistaAsiento.getAsiento17().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento17().removeMouseListener(this);
            Seat asiento = new Seat(17, "Asiento 17");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento18()) {
            System.out.println("Asiento 18");
            vistaAsiento.getAsiento18().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento18().removeMouseListener(this);
            Seat asiento = new Seat(18, "Asiento 18");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento19()) {
            System.out.println("Asiento 19");
            vistaAsiento.getAsiento19().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento19().removeMouseListener(this);
            Seat asiento = new Seat(19, "Asiento 19");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento20()) {
            System.out.println("Asiento 20");
            vistaAsiento.getAsiento20().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento20().removeMouseListener(this);
            Seat asiento = new Seat(20, "Asiento 20");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento21()) {
            System.out.println("Asiento 21");
            vistaAsiento.getAsiento21().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento21().removeMouseListener(this);
            Seat asiento = new Seat(21, "Asiento 21");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento22()) {
            System.out.println("Asiento 22");
            vistaAsiento.getAsiento22().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento22().removeMouseListener(this);
            Seat asiento = new Seat(22, "Asiento 22");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento23()) {
            System.out.println("Asiento 23");
            vistaAsiento.getAsiento23().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento23().removeMouseListener(this);
            Seat asiento = new Seat(23, "Asiento 23");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
        if (evento.getSource() == vistaAsiento.getAsiento24()) {
            System.out.println("Asiento 24");
            vistaAsiento.getAsiento24().setBorder(BorderFactory.createLineBorder(Color.red, 1, false));
            vistaAsiento.getAsiento24().removeMouseListener(this);
            Seat asiento = new Seat(24, "Asiento 24");
            asientos.add(asiento);
            System.out.println(asientos.size());
            establecerMaximoAsientos();
        }
    }

    private void agregarMouseEntered(MouseEvent evento) {
        if (evento.getSource() == vistaAsiento.getAsiento1()) {
            vistaAsiento.getAsiento1().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento2()) {
            vistaAsiento.getAsiento2().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento3()) {
            vistaAsiento.getAsiento3().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento4()) {
            vistaAsiento.getAsiento4().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento5()) {
            vistaAsiento.getAsiento5().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento6()) {
            vistaAsiento.getAsiento6().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento7()) {
            vistaAsiento.getAsiento7().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento8()) {
            vistaAsiento.getAsiento8().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento9()) {
            vistaAsiento.getAsiento9().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento10()) {
            vistaAsiento.getAsiento10().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento11()) {
            vistaAsiento.getAsiento11().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento12()) {
            vistaAsiento.getAsiento12().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento13()) {
            vistaAsiento.getAsiento13().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento14()) {
            vistaAsiento.getAsiento14().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento15()) {
            vistaAsiento.getAsiento15().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento16()) {
            vistaAsiento.getAsiento16().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento17()) {
            vistaAsiento.getAsiento17().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento18()) {
            vistaAsiento.getAsiento18().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento19()) {
            vistaAsiento.getAsiento19().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento20()) {
            vistaAsiento.getAsiento20().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento21()) {
            vistaAsiento.getAsiento21().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento22()) {
            vistaAsiento.getAsiento22().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento23()) {
            vistaAsiento.getAsiento23().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento24()) {
            vistaAsiento.getAsiento24().setBorder(BorderFactory.createLineBorder(Color.green, 1, false));
        }
    }

    private void agregarMouseExited(MouseEvent evento) {
        if (evento.getSource() == vistaAsiento.getAsiento1()) {
            vistaAsiento.getAsiento1().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento2()) {
            vistaAsiento.getAsiento2().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento3()) {
            vistaAsiento.getAsiento3().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento4()) {
            vistaAsiento.getAsiento4().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento5()) {
            vistaAsiento.getAsiento5().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento6()) {
            vistaAsiento.getAsiento6().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento7()) {
            vistaAsiento.getAsiento7().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento8()) {
            vistaAsiento.getAsiento8().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento9()) {
            vistaAsiento.getAsiento9().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento10()) {
            vistaAsiento.getAsiento10().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento11()) {
            vistaAsiento.getAsiento11().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento12()) {
            vistaAsiento.getAsiento12().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento13()) {
            vistaAsiento.getAsiento13().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento14()) {
            vistaAsiento.getAsiento14().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento15()) {
            vistaAsiento.getAsiento15().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento16()) {
            vistaAsiento.getAsiento16().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento17()) {
            vistaAsiento.getAsiento17().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento18()) {
            vistaAsiento.getAsiento18().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento19()) {
            vistaAsiento.getAsiento19().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento20()) {
            vistaAsiento.getAsiento20().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento21()) {
            vistaAsiento.getAsiento21().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento22()) {
            vistaAsiento.getAsiento22().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento23()) {
            vistaAsiento.getAsiento23().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
        if (evento.getSource() == vistaAsiento.getAsiento24()) {
            vistaAsiento.getAsiento24().setBorder(BorderFactory.createLineBorder(new Color(0, 204, 204), 1, false));
        }
    }

    public LinkedList<Seat> retornarArrayList() {
        return asientos;
    }

    private void establecerMaximoAsientos() {
        System.out.println(orden.getNumBoletos());
        
        if (asientos.size() >= orden.getNumBoletos()) {
            JOptionPane.showMessageDialog(null, "Solo puede seleccionar " + asientos.size() + " asientos.");
            removerMouseListener();
        }
    }
}
