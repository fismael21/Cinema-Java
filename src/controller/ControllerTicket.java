
package controller;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.DBOrder;
import database.DBSession;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Order;
import model.Ticket;
import view.Cancel;
import view.FrameTicket;
import view.SelectionMovie;
import view.Welcome;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */
public class ControllerTicket implements ActionListener {
    private FrameTicket folioTicket;
    private Cancel cancelarTicket;
    private Ticket ticket;
    private int claveVentana;
    private JFrame ventana;
    private Order orden;
    private DBSession sesion;
    
    public ControllerTicket(FrameTicket folioTicket, Cancel cancelarTicket, Ticket ticket, int claveVentana, JFrame ventana, Order orden, DBSession sesion) {
        this.folioTicket = folioTicket;
        this.cancelarTicket = cancelarTicket;
        this.ticket = ticket;
        this.claveVentana = claveVentana;
        this.ventana = ventana;
        this.orden = orden;
        this.sesion = sesion;
        
        folioTicket.getBotonAceptar().addActionListener(this);
        cancelarTicket.getBotonCancelarTicket().addActionListener(this);
        cancelarTicket.getBotonRegresar().addActionListener(this);
    }
    
    public ControllerTicket(FrameTicket folioTicket, Cancel cancelarTicket, Ticket ticket, int claveVentana, JFrame ventana, DBSession sesion) {
        this.folioTicket = folioTicket;
        this.cancelarTicket = cancelarTicket;
        this.ticket = ticket;
        this.claveVentana = claveVentana;
        this.ventana = ventana;
        this.sesion = sesion;
        
        folioTicket.getBotonAceptar().addActionListener(this);
        cancelarTicket.getBotonCancelarTicket().addActionListener(this);
        cancelarTicket.getBotonRegresar().addActionListener(this);
    }
    
    public void init(){
        if(claveVentana == 1){
            cancelarTicket.setVisible(true);
        }
        if(claveVentana == 2){
            cancelarTicket.setVisible(true);
        }
        if(claveVentana == 8){
            folioTicket.getCampoFolio().setText(String.valueOf(ticket.getFolio()));
            folioTicket.setVisible(true);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == cancelarTicket.getBotonRegresar()){
            switch(claveVentana){
                case 1: MainController UI = new MainController(new Welcome(), sesion);
                    UI.init();
                    cancelarTicket.dispose();
                    break;
                case 2: ControllerList controladorLista = new ControllerList(new SelectionMovie(), cancelarTicket.getClaveVentana(), cancelarTicket, sesion);
                    controladorLista.init();
                    cancelarTicket.dispose();
                    break;
                default: break;
            }
        }
        
        if(e.getSource() == folioTicket.getBotonAceptar()){
            try {
                generarReportePDF();
                DBOrder bdOrder = new DBOrder();
                bdOrder.insertarOrden(orden, listarAsientos());
 
                JOptionPane.showMessageDialog(null, "Su comprobante ha sido generado.");
                abrirPDF();
                System.exit(0);
            } catch (FileNotFoundException ex) {
                System.err.println("Error: " + ex);
            } catch (DocumentException ex) {
                System.err.println("Error: " + ex);
            }
        }
        
        if(e.getSource() == cancelarTicket.getBotonCancelarTicket()){
            if("".equals(cancelarTicket.getCampoFolio().getText())){
                JOptionPane.showMessageDialog(null, "Ingresar folio");
            }else{
                DBOrder dbOrder = new DBOrder();
                dbOrder.eliminarOrden(cancelarTicket);
                cancelarTicket.getCampoFolio().setText("");
            }
            
        }
    
    }
    
    private void generarReportePDF() throws FileNotFoundException, DocumentException{
        Document documento = new Document();
        
        FileOutputStream documentoPDF = new FileOutputStream("Comprobante.pdf");
        PdfWriter.getInstance(documento, documentoPDF);
   
        documento.open();
        
        Paragraph titulo = new Paragraph("Comprobante de Compra\n\n", FontFactory.getFont("arial", 12, Font.BOLD, BaseColor.BLACK));
        
        documento.add(titulo);
        
        PdfPTable tabla = new PdfPTable(9);
        tabla.setWidthPercentage(100);
        
        //Headers
        tabla.addCell(editarTextPDF("Nombre del titular",1));
        tabla.addCell(editarTextPDF("Número de Tarjeta",1));
        tabla.addCell(editarTextPDF("Número de comprobante",1));
        tabla.addCell(editarTextPDF("Película",1));
        tabla.addCell(editarTextPDF("Fecha y hora",1));
        tabla.addCell(editarTextPDF("Tipo de función",1));
        tabla.addCell(editarTextPDF("Número de boletos",1));
        tabla.addCell(editarTextPDF("Asientos",1));
        tabla.addCell(editarTextPDF("Costo total",1));
        
        //Datos de la orden
        tabla.addCell(editarTextPDF(orden.getPago().getNomTitular(), 0));
        tabla.addCell(editarTextPDF(orden.getPago().getNumTarjeta(), 0));
        tabla.addCell(editarTextPDF(String.valueOf(orden.getTicket().getFolio()), 0));
        tabla.addCell(editarTextPDF(orden.getPelicula().getNombre(), 0));
        tabla.addCell(editarTextPDF(orden.getFechaPelicula(), 0));
        tabla.addCell(editarTextPDF(orden.getTipoDeFuncion(), 0));
        tabla.addCell(editarTextPDF(String.valueOf(orden.getNumBoletos()), 0));
        tabla.addCell(editarTextPDF(listarAsientos(), 0));
        tabla.addCell(editarTextPDF(String.valueOf(orden.getCostoTotal()), 0));
        
        documento.add(tabla);
        
        documento.close();
    }
    
    private Paragraph editarTextPDF(String texto, int grosor){
        Paragraph parrafo = new Paragraph(texto, FontFactory.getFont("arial", 7, grosor, BaseColor.BLACK));
        return parrafo;
    }
    
    private String listarAsientos(){
        
        String asientos = "";
        
        for(int i = 0; i < orden.getAsientos().size(); i++){
            asientos = asientos + orden.getAsientos().get(i).getNombre() + "\n";
        }
       
        return asientos;
    }
    
    private void abrirPDF(){
        
        try{
            File archivoPDF = new File("Comprobante.pdf");
            
            if(archivoPDF.exists()){
                if(Desktop.isDesktopSupported()){
                    Desktop.getDesktop().open(archivoPDF);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No soportado.");
                }
            }
            else{
                System.out.println("El archivo no existe.");
            }
            
        }catch(Exception ex){
            System.err.println("Error" + ex);
        }
        
    }
}
