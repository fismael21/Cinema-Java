
package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class FrameTicket extends javax.swing.JFrame {
    
    private final int claveVentana = 9;

    public FrameTicket() {
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
        panelImagen = new javax.swing.JPanel();
        movie1 = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        usuario = new javax.swing.JLabel();
        campoFolio = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        panelTitulo.setLayout(new java.awt.BorderLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Ticket");
        panelTitulo.add(titulo, java.awt.BorderLayout.CENTER);

        panelImagen.setBackground(new java.awt.Color(51, 51, 51));
        panelImagen.setLayout(new java.awt.GridBagLayout());

        movie1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ticket.png"))); // NOI18N
        movie1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        movie1.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelImagen.add(movie1, gridBagConstraints);

        panelForm.setBackground(new java.awt.Color(51, 51, 51));
        panelForm.setLayout(new java.awt.GridBagLayout());

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Folio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 10, 10);
        panelForm.add(usuario, gridBagConstraints);

        campoFolio.setEditable(false);
        campoFolio.setBackground(new java.awt.Color(102, 102, 102));
        campoFolio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campoFolio.setForeground(new java.awt.Color(255, 255, 255));
        campoFolio.setMinimumSize(new java.awt.Dimension(80, 22));
        campoFolio.setPreferredSize(new java.awt.Dimension(150, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 10, 10);
        panelForm.add(campoFolio, gridBagConstraints);

        botonAceptar.setBackground(new java.awt.Color(51, 51, 51));
        botonAceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptar.setText("Aceptar");
        botonAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAceptar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 10, 10);
        panelForm.add(botonAceptar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTicket().setVisible(true);
            }
        });
    }

    public JButton getBotonAceptar() {
        return botonAceptar;
    }

    public void setBotonAceptar(JButton botonAceptar) {
        this.botonAceptar = botonAceptar;
    }

    public JTextField getCampoFolio() {
        return campoFolio;
    }

    public void setCampoFolio(JTextField campoFolio) {
        this.campoFolio = campoFolio;
    }

    public int getClaveVentana() {
        return claveVentana;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JTextField campoFolio;
    private javax.swing.JLabel movie1;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
