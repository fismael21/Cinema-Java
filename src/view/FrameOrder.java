
package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class FrameOrder extends javax.swing.JFrame {
    
    private final int claveVentana = 6;
    private ButtonGroup grupoBotones = new ButtonGroup();
    
    public FrameOrder(String nombrePoster) {
        initComponents();
        this.getContentPane().setBackground(new Color(51,51,51));
        this.setLocationRelativeTo(null);
        this.setTitle("CineFino");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo_40.png")));
        
        agregarButtonGroup();
        establecerPoster(nombrePoster);
    }

    private void agregarButtonGroup(){    
        grupoBotones.add(opcionClasico);
        grupoBotones.add(opcion4DX);
        grupoBotones.add(opcion3D);
    }
    
    private void establecerPoster(String nombrePoster){
        moviePoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + nombrePoster)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        moviePoster = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        botonContinuar = new javax.swing.JButton();
        campoDia = new javax.swing.JComboBox<>();
        campoMes = new javax.swing.JComboBox<>();
        numeroBoletos = new javax.swing.JComboBox<>();
        numBoletos = new javax.swing.JLabel();
        opcionClasico = new javax.swing.JRadioButton();
        opcion4DX = new javax.swing.JRadioButton();
        tipoFuncion = new javax.swing.JLabel();
        opcion3D = new javax.swing.JRadioButton();
        campoHora = new javax.swing.JComboBox<>();
        panel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(51, 51, 51));
        panel.setLayout(new java.awt.GridBagLayout());

        moviePoster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moviePoster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/01.png"))); // NOI18N
        moviePoster.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        moviePoster.setPreferredSize(new java.awt.Dimension(180, 260));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(moviePoster, gridBagConstraints);

        botonRegresar.setBackground(new java.awt.Color(51, 51, 51));
        botonRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(botonRegresar, gridBagConstraints);

        botonContinuar.setBackground(new java.awt.Color(51, 51, 51));
        botonContinuar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuar.setText("Continuar");
        botonContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonContinuar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(botonContinuar, gridBagConstraints);

        campoDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Día", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        campoDia.setPreferredSize(new java.awt.Dimension(76, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(campoDia, gridBagConstraints);

        campoMes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        campoMes.setPreferredSize(new java.awt.Dimension(76, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(campoMes, gridBagConstraints);

        numeroBoletos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numeroBoletos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        numeroBoletos.setPreferredSize(new java.awt.Dimension(88, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 15, 15);
        panel.add(numeroBoletos, gridBagConstraints);

        numBoletos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numBoletos.setForeground(new java.awt.Color(255, 255, 255));
        numBoletos.setText("Número de boletos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 0);
        panel.add(numBoletos, gridBagConstraints);

        opcionClasico.setBackground(new java.awt.Color(51, 51, 51));
        opcionClasico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opcionClasico.setForeground(new java.awt.Color(255, 255, 255));
        opcionClasico.setText("Clásico");
        opcionClasico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcionClasico.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(opcionClasico, gridBagConstraints);

        opcion4DX.setBackground(new java.awt.Color(51, 51, 51));
        opcion4DX.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opcion4DX.setForeground(new java.awt.Color(255, 255, 255));
        opcion4DX.setText("4DX");
        opcion4DX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcion4DX.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(opcion4DX, gridBagConstraints);

        tipoFuncion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoFuncion.setForeground(new java.awt.Color(255, 255, 255));
        tipoFuncion.setText("Tipo de función");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(tipoFuncion, gridBagConstraints);

        opcion3D.setBackground(new java.awt.Color(51, 51, 51));
        opcion3D.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        opcion3D.setForeground(new java.awt.Color(255, 255, 255));
        opcion3D.setText("3D");
        opcion3D.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcion3D.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(opcion3D, gridBagConstraints);

        campoHora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "11:00", "12:30", "16:20", "18:30", "21:00" }));
        campoHora.setPreferredSize(new java.awt.Dimension(76, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        panel.add(campoHora, gridBagConstraints);

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(new java.awt.BorderLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("¡Ordena tu Compra!");
        panel2.add(titulo, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameOrder("01.png").setVisible(true);
            }
        });
    }

    public JButton getBotonContinuar() {
        return botonContinuar;
    }

    public void setBotonContinuar(JButton botonContinuar) {
        this.botonContinuar = botonContinuar;
    }

    public JButton getBotonRegresar() {
        return botonRegresar;
    }

    public void setBotonRegresar(JButton botonRegresar) {
        this.botonRegresar = botonRegresar;
    }

    public JComboBox<String> getCampoDia() {
        return campoDia;
    }

    public void setCampoDia(JComboBox<String> campoDia) {
        this.campoDia = campoDia;
    }

    public JComboBox<String> getCampoHora() {
        return campoHora;
    }

    public void setCampoHora(JComboBox<String> campoHora) {
        this.campoHora = campoHora;
    }

    public JComboBox<String> getCampoMes() {
        return campoMes;
    }

    public void setCampoMes(JComboBox<String> campoMes) {
        this.campoMes = campoMes;
    }

    public JComboBox<String> getNumeroBoletos() {
        return numeroBoletos;
    }

    public void setNumeroBoletos(JComboBox<String> numeroBoletos) {
        this.numeroBoletos = numeroBoletos;
    }

    public JRadioButton getOpcion3D() {
        return opcion3D;
    }

    public void setOpcion3D(JRadioButton opcion3D) {
        this.opcion3D = opcion3D;
    }

    public JRadioButton getOpcion4DX() {
        return opcion4DX;
    }

    public void setOpcion4DX(JRadioButton opcion4DX) {
        this.opcion4DX = opcion4DX;
    }

    public JRadioButton getOpcionClasico() {
        return opcionClasico;
    }

    public void setOpcionClasico(JRadioButton opcionClasico) {
        this.opcionClasico = opcionClasico;
    }

    public ButtonGroup getGrupoBotones() {
        return grupoBotones;
    }

    public void setGrupoBotones(ButtonGroup grupoBotones) {
        this.grupoBotones = grupoBotones;
    }
    
    
    public int getClaveVentana() {
        return claveVentana;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> campoDia;
    private javax.swing.JComboBox<String> campoHora;
    private javax.swing.JComboBox<String> campoMes;
    private javax.swing.JLabel moviePoster;
    private javax.swing.JLabel numBoletos;
    private javax.swing.JComboBox<String> numeroBoletos;
    private javax.swing.JRadioButton opcion3D;
    private javax.swing.JRadioButton opcion4DX;
    private javax.swing.JRadioButton opcionClasico;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel tipoFuncion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
