
package controller;

/*-------------------------------------------------------------------*/
import database.DBClient;
import database.DBManager;
import database.DBSession;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Client;
import model.Manager;
import view.SelectionMovie;
import view.SignUp;
import view.Welcome;

/*-------------------------------------------------------------------*/

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

//Controlador para registrar usuario o administrador
public class ControllerRegistration implements ActionListener {
    //View
    JFrame ventana;
    SignUp registro;
    
    //Model
    Client cliente;
    Manager administrador;
    
    //Database
    DBClient dbCliente;
    DBManager dbAdministrador;
    DBSession sesion;
    
    //Codigo
    private int codigoVentana;
    
    //Constructor
    public ControllerRegistration(SignUp registro, Client cliente, DBClient dbCliente, Manager administrador, DBManager dbAdministrador, int codigoVentana, JFrame ventana, DBSession sesion) {

        //View
        this.ventana = ventana;
        this.registro = registro;
        
        //Model
        this.cliente = cliente;
        this.administrador = administrador;
        
        //Database
        this.dbCliente = dbCliente;
        this.dbAdministrador = dbAdministrador;
        this.sesion = sesion;
        
        //Codigo
        this.codigoVentana = codigoVentana;
        
        //Añadiendo eventos a los botones
        registro.getBotonRegistrar().addActionListener(this);
        registro.getBotonRegresar().addActionListener(this);
    }

    //Constructor 2
    public ControllerRegistration(SignUp registro, Client cliente, DBClient dbCliente, Manager administrador, DBManager dbAdministrador, int codigoVentana) {

        //View
        this.registro = registro;
        
        //Model
        this.cliente = cliente;
        this.administrador = administrador;
        
        //Database
        this.dbCliente = dbCliente;
        this.dbAdministrador = dbAdministrador;

        //Codigo
        this.codigoVentana = codigoVentana;
        
        //Añadiendo eventos a los botones
        registro.getBotonRegistrar().addActionListener(this);
        registro.getBotonRegresar().addActionListener(this);
    }
    
    //Hace visible la ventana
    public void init() {
        registro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registro.getBotonRegistrar()) {
            
            int opcion = JOptionPane.showConfirmDialog(null, "¿Se está registrando como administrador?");

            switch(opcion){
                case 0: 
                    if(registrarAdministrador()){
                        irVentanaAnterior(codigoVentana);
                    }
                    break; //Si = 0
                case 1: 
                    if(registrarCliente()){
                        irVentanaAnterior(codigoVentana);
                    }
                    break; //No = 1
                    
                case 2: limpiarCampos(); break; //Cancelar = 2
                
                default: limpiarCampos(); break; 
            }
            
            
            
        }
        
        //Regresa a la ventana anterior
        if (e.getSource() == registro.getBotonRegresar()) {
            irVentanaAnterior(codigoVentana);
        }
    }

    //Limpia los campos de las ventanas
    private void limpiarCampos() {
        registro.getCampoNombre().setText("");
        registro.getCampoApellido().setText("");
        registro.getCampoCorreoElectronico().setText("");
        registro.getCampoUsuario().setText("");
        registro.getCampoContrasena().setText("");
        registro.getCampoDia().setSelectedIndex(0);
        registro.getCampoMes().setSelectedIndex(0);
        registro.getCampoAno().setSelectedIndex(0);
    }

    //Registra un usuario en la tabla de usuarios
    private boolean registrarCliente() {
        
        boolean registroCompleto = false;
        
        if(validarFormulario()){
            String nombre = registro.getCampoNombre().getText();
            String apellido = registro.getCampoApellido().getText();
            String correoElectronico = registro.getCampoCorreoElectronico().getText();
            String usuario = registro.getCampoUsuario().getText();
            String contrasena = String.valueOf(registro.getCampoContrasena().getPassword());
            int dia = Integer.parseInt(registro.getCampoDia().getSelectedItem().toString());
            int mes = Integer.parseInt(registro.getCampoMes().getSelectedItem().toString());
            int ano = Integer.parseInt(registro.getCampoAno().getSelectedItem().toString());

            cliente = new Client(nombre, apellido, dia, mes, ano, usuario, correoElectronico, contrasena);
            System.out.println(cliente);
            
            
            if (dbCliente.insertarCliente(cliente)) {
                JOptionPane.showMessageDialog(null, "Usuario registrado satisfactoriamente.");
                registroCompleto = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de registrar sus datos.");
            }
        }
        
        return registroCompleto;
    }

    //Registra un administrador en la tabla de administradores
    private boolean registrarAdministrador() {
        
        boolean registroCompleto = false;
        
        if(validarFormulario()){
            String nombre = registro.getCampoNombre().getText();
            String apellido = registro.getCampoApellido().getText();
            String correoElectronico = registro.getCampoCorreoElectronico().getText();
            String usuario = registro.getCampoUsuario().getText();
            String contrasena = String.valueOf(registro.getCampoContrasena().getPassword());
            int dia = Integer.parseInt(registro.getCampoDia().getSelectedItem().toString());
            int mes = Integer.parseInt(registro.getCampoMes().getSelectedItem().toString());
            int ano = Integer.parseInt(registro.getCampoAno().getSelectedItem().toString());
            int claveAdministrador = (int) (Math.random() * 10000);

            administrador = new Manager(claveAdministrador, nombre, apellido, dia, mes, ano, usuario, correoElectronico,contrasena);
            System.out.println(administrador);

            if (dbAdministrador.insertarAdministrador(administrador)) {
                JOptionPane.showMessageDialog(null, "Administrador registrado satisfactoriamente.");
                JOptionPane.showMessageDialog(null, "Su clave de administrador es: " + claveAdministrador);
                registroCompleto = true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de registrar sus datos.");
            }
        }

        return registroCompleto;
    }
    
    //Valida que todos los campos no estén vacíos
    private boolean validarFormulario(){
        
        boolean formularioCompleto = true;
        
        if("".equals(registro.getCampoNombre().getText())){
            JOptionPane.showMessageDialog(null, "Ingresar nombre");
            formularioCompleto = false;
        }
        else if("".equals(registro.getCampoApellido().getText())){
            JOptionPane.showMessageDialog(null, "Ingresar apellido");
            formularioCompleto = false;
        }
        else if("".equals(registro.getCampoCorreoElectronico().getText())){
            JOptionPane.showMessageDialog(null, "Ingresar correo eléctronico");
            formularioCompleto = false;
        }
        else if("".equals(registro.getCampoNombre().getText())){
            JOptionPane.showMessageDialog(null, "Ingresar usuario");
            formularioCompleto = false;
            
        }
        else if("".equals(String.valueOf(registro.getCampoContrasena().getPassword()))){
            JOptionPane.showMessageDialog(null, "Ingresar contraseña");
            formularioCompleto = false;
            
        }
        else if("Día".equals(registro.getCampoDia().getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Ingresar día");
            formularioCompleto = false;
            
        }
        else if("Mes".equals(registro.getCampoMes().getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Ingresar mes");
            formularioCompleto = false;
            
        }
        else if("Año".equals(registro.getCampoAno().getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Ingresar año");
            formularioCompleto = false;
            
        }
        
        return formularioCompleto;
    }
    
    //Redirige a la ventana anterior
    private void irVentanaAnterior(int codigo){
        switch(codigo){
                
            case 1: MainController UI = new MainController(new Welcome(), new DBSession());
            UI.init();
            registro.dispose();
                
            break;
                
            case 2: ControllerList controladorLista = new ControllerList(new SelectionMovie(), registro.getClaveVentana(), registro, sesion);
            controladorLista.init();
            registro.dispose();
            
            break;
                
            default: break; 
        }
    }
    
}
