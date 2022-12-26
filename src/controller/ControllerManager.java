
package controller;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import database.DBConnection;
import database.DBSession;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Manager;
import view.FrameManager;
import view.Welcome;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class ControllerManager extends DBConnection implements ActionListener{
    private FrameManager frameManager;
    private Manager manager;
    private int claveVentana;
    private JFrame ventana;
    private DBSession sesion;
    
    DefaultTableModel tableModel = new DefaultTableModel();
    
    public ControllerManager(FrameManager frameManager, Manager manager, int claveVentana, JFrame ventana, DBSession sesion){
        this.frameManager = frameManager;
        this.manager = manager;
        this.claveVentana = claveVentana;
        this.ventana = ventana;
        this.sesion = sesion;
        
        frameManager.getBotonBuscar().addActionListener(this);
        frameManager.getBotonEliminar().addActionListener(this);
        frameManager.getBotonRegresar().addActionListener(this);
        frameManager.getBotonLimpiar().addActionListener(this);
        frameManager.getBotonActualizar().addActionListener(this);
    }

    public void init(){
        frameManager.setVisible(true);      
        cargarTabla();
        cargarDatos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frameManager.getBotonBuscar()){
            limpiarTabla();
            buscarUsuario();
        }
        
        if(e.getSource() == frameManager.getBotonLimpiar()){
            limpiarTabla();
            limpiarCampos();
        }
        
        if(e.getSource() == frameManager.getBotonEliminar()){
            eliminarCliente();
            limpiarCampos();
        }
        
        if(e.getSource() == frameManager.getBotonActualizar()){
            actualizarTabla();
            limpiarCampos();
        }
        
        if(e.getSource() == frameManager.getBotonRegresar()){
            MainController UI = new MainController(new Welcome(), sesion);
            UI.init();
            frameManager.dispose();
        }
    }
    
    private void cargarTabla(){
        frameManager.getTableUser().setModel(tableModel);
        
        tableModel.addColumn("ID");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Apellido");
        tableModel.addColumn("Correo eléctronico");
        tableModel.addColumn("Usuario");
        tableModel.addColumn("Fecha de Nacimiento");
    }
    
    private void cargarDatos(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            Connection connection = getConnection();
            
            ps = connection.prepareStatement("SELECT idclient, nombre, apellido, correo_electronico, usuario, fecha_nacimiento FROM client_cinema");
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMD = (ResultSetMetaData) rs.getMetaData();
            int columns = rsMD.getColumnCount();
            
            while(rs.next()){
                Object row[] = new Object[columns];
                for(int i = 0; i < columns; i++){
                    row[i] = rs.getObject(i + 1);
                }
                tableModel.addRow(row);
            }
            
        }catch(SQLException ex){
            System.err.println("Error: " + ex);
        }
    }
    
    private void buscarUsuario(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String campo = frameManager.getCampoID().getText();
        String where = "";
        
        if(!"".equals(campo)){
            where = "WHERE idclient=" + campo + ";";
        }
        
        try{
            Connection connection = getConnection();
            
            ps = connection.prepareStatement("SELECT idclient, nombre, apellido, correo_electronico, usuario, fecha_nacimiento FROM client_cinema " + where);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMD = (ResultSetMetaData) rs.getMetaData();
            int columns = rsMD.getColumnCount();
            
            while(rs.next()){
                Object row[] = new Object[columns];
                for(int i = 0; i < columns; i++){
                    row[i] = rs.getObject(i + 1);
                }
                tableModel.addRow(row);
            }
            
        }catch(SQLException ex){
            System.err.println("Error: " + ex);
        }
        
    }
    
    private void limpiarTabla(){
        while (tableModel.getRowCount()>0){
            tableModel.removeRow(0);
        }
       
    }
    
    private void actualizarTabla(){
        limpiarTabla();
        cargarDatos();
        
    }
    
    private void eliminarCliente(){
        PreparedStatement ps = null;
        
        try{
            Connection connection = getConnection();
            
            ps = connection.prepareStatement("DELETE FROM client_cinema WHERE idclient=?");
            ps.setString(1, frameManager.getCampoID().getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente eliminado.");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar.");
            System.err.println("Error: " + ex);
        }
        
        
    }
    
    private void limpiarCampos(){
        frameManager.getCampoID().setText("");
        frameManager.getCampoUsuario().setText("");
    }
}
