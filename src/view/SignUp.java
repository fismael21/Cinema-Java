
package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class SignUp extends javax.swing.JFrame {
    
    private final int claveVentana = 3;

    public SignUp() {
        initComponents();
        this.getContentPane().setBackground(new Color(51,51,51));
        this.setLocationRelativeTo(null);
        this.setTitle("CineFino");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_40.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelForma = new javax.swing.JPanel();
        apellido = new javax.swing.JLabel();
        fechaDeNacimiento = new javax.swing.JLabel();
        campoCorreoElectronico = new javax.swing.JTextField();
        campoContrasena = new javax.swing.JPasswordField();
        botonRegresar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        campoUsuario = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        correoElectronico = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        campoDia = new javax.swing.JComboBox<>();
        campoAno = new javax.swing.JComboBox<>();
        campoMes = new javax.swing.JComboBox<>();
        contrasena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        panelTitulo.setLayout(new java.awt.GridBagLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registrarse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        panelTitulo.add(titulo, gridBagConstraints);

        panelForma.setBackground(new java.awt.Color(51, 51, 51));
        panelForma.setLayout(new java.awt.GridBagLayout());

        apellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        apellido.setForeground(new java.awt.Color(255, 255, 255));
        apellido.setText("Apellido(s):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelForma.add(apellido, gridBagConstraints);

        fechaDeNacimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaDeNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        fechaDeNacimiento.setText("Fecha de nacimiento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 20);
        panelForma.add(fechaDeNacimiento, gridBagConstraints);

        campoCorreoElectronico.setBackground(new java.awt.Color(102, 102, 102));
        campoCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCorreoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        campoCorreoElectronico.setMinimumSize(new java.awt.Dimension(80, 22));
        campoCorreoElectronico.setPreferredSize(new java.awt.Dimension(230, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelForma.add(campoCorreoElectronico, gridBagConstraints);

        campoContrasena.setBackground(new java.awt.Color(102, 102, 102));
        campoContrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoContrasena.setForeground(new java.awt.Color(255, 255, 255));
        campoContrasena.setPreferredSize(new java.awt.Dimension(230, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelForma.add(campoContrasena, gridBagConstraints);

        botonRegresar.setBackground(new java.awt.Color(51, 51, 51));
        botonRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 10, 30, 10);
        panelForma.add(botonRegresar, gridBagConstraints);

        botonRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(50, 10, 30, 10);
        panelForma.add(botonRegistrar, gridBagConstraints);

        campoUsuario.setBackground(new java.awt.Color(102, 102, 102));
        campoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        campoUsuario.setMinimumSize(new java.awt.Dimension(80, 22));
        campoUsuario.setPreferredSize(new java.awt.Dimension(230, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelForma.add(campoUsuario, gridBagConstraints);

        campoApellido.setBackground(new java.awt.Color(102, 102, 102));
        campoApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoApellido.setForeground(new java.awt.Color(255, 255, 255));
        campoApellido.setMinimumSize(new java.awt.Dimension(80, 22));
        campoApellido.setPreferredSize(new java.awt.Dimension(230, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelForma.add(campoApellido, gridBagConstraints);

        correoElectronico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        correoElectronico.setForeground(new java.awt.Color(255, 255, 255));
        correoElectronico.setText("Correo eléctronico:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelForma.add(correoElectronico, gridBagConstraints);

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelForma.add(usuario, gridBagConstraints);

        campoNombre.setBackground(new java.awt.Color(102, 102, 102));
        campoNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(255, 255, 255));
        campoNombre.setMinimumSize(new java.awt.Dimension(80, 22));
        campoNombre.setPreferredSize(new java.awt.Dimension(230, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        panelForma.add(campoNombre, gridBagConstraints);

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre(s):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelForma.add(nombre, gridBagConstraints);

        campoDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelForma.add(campoDia, gridBagConstraints);

        campoAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2004", "2003", "2002", "2001", "2000", "1999", "1998" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        panelForma.add(campoAno, gridBagConstraints);

        campoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        panelForma.add(campoMes, gridBagConstraints);

        contrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        contrasena.setForeground(new java.awt.Color(255, 255, 255));
        contrasena.setText("Contraseña:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelForma.add(contrasena, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelForma, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelForma, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }
    
    //Getters and Setters

    public JButton getBotonRegistrar() {
        return botonRegistrar;
    }

    public void setBotonRegistrar(JButton botonRegistrar) {
        this.botonRegistrar = botonRegistrar;
    }
    
    public JButton getBotonRegresar() {
        return botonRegresar;
    }

    public void setBotonRegresar(JButton botonRegresar) {
        this.botonRegresar = botonRegresar;
    }

    public JComboBox<String> getCampoAno() {
        return campoAno;
    }

    public void setCampoAno(JComboBox<String> campoAno) {
        this.campoAno = campoAno;
    }

    public JTextField getCampoApellido() {
        return campoApellido;
    }

    public void setCampoApellido(JTextField campoApellido) {
        this.campoApellido = campoApellido;
    }

    public JPasswordField getCampoContrasena() {
        return campoContrasena;
    }

    public void setCampoContrasena(JPasswordField campoContrasena) {
        this.campoContrasena = campoContrasena;
    }

    public JTextField getCampoCorreoElectronico() {
        return campoCorreoElectronico;
    }

    public void setCampoCorreoElectronico(JTextField campoCorreoElectronico) {
        this.campoCorreoElectronico = campoCorreoElectronico;
    }

    public JComboBox<String> getCampoDia() {
        return campoDia;
    }

    public void setCampoDia(JComboBox<String> campoDia) {
        this.campoDia = campoDia;
    }

    public JComboBox<String> getCampoMes() {
        return campoMes;
    }

    public void setCampoMes(JComboBox<String> campoMes) {
        this.campoMes = campoMes;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(JTextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public JTextField getCampoUsuario() {
        return campoUsuario;
    }

    public void setCampoUsuario(JTextField campoUsuario) {
        this.campoUsuario = campoUsuario;
    }

    public int getClaveVentana() {
        return claveVentana;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> campoAno;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JPasswordField campoContrasena;
    private javax.swing.JTextField campoCorreoElectronico;
    private javax.swing.JComboBox<String> campoDia;
    private javax.swing.JComboBox<String> campoMes;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel contrasena;
    private javax.swing.JLabel correoElectronico;
    private javax.swing.JLabel fechaDeNacimiento;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelForma;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
