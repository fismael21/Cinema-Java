
package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class FramePayment extends javax.swing.JFrame {
    
    private final int claveVentana = 8;

    public FramePayment() {
        initComponents();
        this.getContentPane().setBackground(new Color(51,51,51));
        this.setLocationRelativeTo(null);
        this.setTitle("CineFino");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_40.png")));
    }

    private void agregarButtonGroup(){
        ButtonGroup grupoBoton = new ButtonGroup();
        grupoBoton.add(opcionDebito);
        grupoBoton.add(opcionCredito);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelForma = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        campoNombreDeTitular = new javax.swing.JTextField();
        codigoDeSeguridad = new javax.swing.JLabel();
        tipoDeTarjeta = new javax.swing.JLabel();
        campoNumeroDeTarjeta = new javax.swing.JTextField();
        botonRegresar = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        numeroDeTarjeta = new javax.swing.JLabel();
        campoCodigoDeSeguridad = new javax.swing.JTextField();
        campoAno = new javax.swing.JComboBox<>();
        campoMes = new javax.swing.JComboBox<>();
        fechaDeExpiracion = new javax.swing.JLabel();
        opcionCredito = new javax.swing.JRadioButton();
        opcionDebito = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        panelTitulo.setLayout(new java.awt.GridBagLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Método de Pago");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 0);
        panelTitulo.add(titulo, gridBagConstraints);

        panelForma.setBackground(new java.awt.Color(51, 51, 51));
        panelForma.setLayout(new java.awt.GridBagLayout());

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre del titular:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelForma.add(nombre, gridBagConstraints);

        campoNombreDeTitular.setBackground(new java.awt.Color(102, 102, 102));
        campoNombreDeTitular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNombreDeTitular.setForeground(new java.awt.Color(255, 255, 255));
        campoNombreDeTitular.setMinimumSize(new java.awt.Dimension(80, 22));
        campoNombreDeTitular.setPreferredSize(new java.awt.Dimension(230, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        panelForma.add(campoNombreDeTitular, gridBagConstraints);

        codigoDeSeguridad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codigoDeSeguridad.setForeground(new java.awt.Color(255, 255, 255));
        codigoDeSeguridad.setText("Código de seguridad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 20);
        panelForma.add(codigoDeSeguridad, gridBagConstraints);

        tipoDeTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoDeTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        tipoDeTarjeta.setText("Tipo de tarjeta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelForma.add(tipoDeTarjeta, gridBagConstraints);

        campoNumeroDeTarjeta.setBackground(new java.awt.Color(102, 102, 102));
        campoNumeroDeTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoNumeroDeTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        campoNumeroDeTarjeta.setMinimumSize(new java.awt.Dimension(80, 22));
        campoNumeroDeTarjeta.setPreferredSize(new java.awt.Dimension(230, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        panelForma.add(campoNumeroDeTarjeta, gridBagConstraints);

        botonRegresar.setBackground(new java.awt.Color(51, 51, 51));
        botonRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 10, 30, 10);
        panelForma.add(botonRegresar, gridBagConstraints);

        botonIngresar.setBackground(new java.awt.Color(51, 51, 51));
        botonIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Ingresar");
        botonIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(50, 10, 30, 10);
        panelForma.add(botonIngresar, gridBagConstraints);

        numeroDeTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numeroDeTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        numeroDeTarjeta.setText("Número de tarjeta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelForma.add(numeroDeTarjeta, gridBagConstraints);

        campoCodigoDeSeguridad.setBackground(new java.awt.Color(102, 102, 102));
        campoCodigoDeSeguridad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoCodigoDeSeguridad.setForeground(new java.awt.Color(255, 255, 255));
        campoCodigoDeSeguridad.setMinimumSize(new java.awt.Dimension(80, 22));
        campoCodigoDeSeguridad.setPreferredSize(new java.awt.Dimension(110, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        panelForma.add(campoCodigoDeSeguridad, gridBagConstraints);

        campoAno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2004", "2003", "2002", "2001", "2000", "1999", "1998" }));
        campoAno.setPreferredSize(new java.awt.Dimension(82, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 35);
        panelForma.add(campoAno, gridBagConstraints);

        campoMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        campoMes.setPreferredSize(new java.awt.Dimension(82, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelForma.add(campoMes, gridBagConstraints);

        fechaDeExpiracion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechaDeExpiracion.setForeground(new java.awt.Color(255, 255, 255));
        fechaDeExpiracion.setText("Fecha de expiración:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 20);
        panelForma.add(fechaDeExpiracion, gridBagConstraints);

        opcionCredito.setBackground(new java.awt.Color(51, 51, 51));
        opcionCredito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opcionCredito.setForeground(new java.awt.Color(255, 255, 255));
        opcionCredito.setText("Crédito");
        opcionCredito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionCredito.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelForma.add(opcionCredito, gridBagConstraints);

        opcionDebito.setBackground(new java.awt.Color(51, 51, 51));
        opcionDebito.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opcionDebito.setForeground(new java.awt.Color(255, 255, 255));
        opcionDebito.setText("Débito");
        opcionDebito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionDebito.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        panelForma.add(opcionDebito, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelForma, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelForma, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePayment().setVisible(true);
            }
        });
    }

    public JButton getBotonIngresar() {
        return botonIngresar;
    }

    public void setBotonIngresar(JButton botonIngresar) {
        this.botonIngresar = botonIngresar;
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

    public JTextField getCampoCodigoDeSeguridad() {
        return campoCodigoDeSeguridad;
    }

    public void setCampoCodigoDeSeguridad(JTextField campoCodigoDeSeguridad) {
        this.campoCodigoDeSeguridad = campoCodigoDeSeguridad;
    }

    public JComboBox<String> getCampoMes() {
        return campoMes;
    }

    public void setCampoMes(JComboBox<String> campoMes) {
        this.campoMes = campoMes;
    }

    public JTextField getCampoNombreDeTitular() {
        return campoNombreDeTitular;
    }

    public void setCampoNombreDeTitular(JTextField campoNombreDeTitular) {
        this.campoNombreDeTitular = campoNombreDeTitular;
    }

    public JTextField getCampoNumeroDeTarjeta() {
        return campoNumeroDeTarjeta;
    }

    public void setCampoNumeroDeTarjeta(JTextField campoNumeroDeTarjeta) {
        this.campoNumeroDeTarjeta = campoNumeroDeTarjeta;
    }

    public JRadioButton getOpcionCredito() {
        return opcionCredito;
    }

    public void setOpcionCredito(JRadioButton opcionCredito) {
        this.opcionCredito = opcionCredito;
    }

    public JRadioButton getOpcionDebito() {
        return opcionDebito;
    }

    public void setOpcionDebito(JRadioButton opcionDebito) {
        this.opcionDebito = opcionDebito;
    }

    public int getClaveVentana() {
        return claveVentana;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> campoAno;
    private javax.swing.JTextField campoCodigoDeSeguridad;
    private javax.swing.JComboBox<String> campoMes;
    private javax.swing.JTextField campoNombreDeTitular;
    private javax.swing.JTextField campoNumeroDeTarjeta;
    private javax.swing.JLabel codigoDeSeguridad;
    private javax.swing.JLabel fechaDeExpiracion;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numeroDeTarjeta;
    private javax.swing.JRadioButton opcionCredito;
    private javax.swing.JRadioButton opcionDebito;
    private javax.swing.JPanel panelForma;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel tipoDeTarjeta;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
