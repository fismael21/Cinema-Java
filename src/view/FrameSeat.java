
package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class FrameSeat extends javax.swing.JFrame {
    
    private final int claveVentana = 7;

    public FrameSeat() {
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
        panelAsiento = new javax.swing.JPanel();
        asiento1 = new javax.swing.JLabel();
        asiento2 = new javax.swing.JLabel();
        asiento3 = new javax.swing.JLabel();
        asiento4 = new javax.swing.JLabel();
        asiento5 = new javax.swing.JLabel();
        asiento6 = new javax.swing.JLabel();
        asiento7 = new javax.swing.JLabel();
        asiento8 = new javax.swing.JLabel();
        asiento9 = new javax.swing.JLabel();
        asiento10 = new javax.swing.JLabel();
        asiento11 = new javax.swing.JLabel();
        asiento12 = new javax.swing.JLabel();
        asiento13 = new javax.swing.JLabel();
        asiento14 = new javax.swing.JLabel();
        asiento15 = new javax.swing.JLabel();
        asiento16 = new javax.swing.JLabel();
        asiento18 = new javax.swing.JLabel();
        asiento17 = new javax.swing.JLabel();
        asiento19 = new javax.swing.JLabel();
        asiento20 = new javax.swing.JLabel();
        asiento21 = new javax.swing.JLabel();
        asiento22 = new javax.swing.JLabel();
        asiento23 = new javax.swing.JLabel();
        asiento24 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        botonContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTitulo.setBackground(new java.awt.Color(51, 51, 51));
        panelTitulo.setLayout(new java.awt.BorderLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Seleccione su Asiento");
        panelTitulo.add(titulo, java.awt.BorderLayout.CENTER);

        panelAsiento.setBackground(new java.awt.Color(51, 51, 51));
        panelAsiento.setLayout(new java.awt.GridBagLayout());

        asiento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asiento1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asiento1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento1, gridBagConstraints);

        asiento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento2, gridBagConstraints);

        asiento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 40);
        panelAsiento.add(asiento3, gridBagConstraints);

        asiento4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 10, 10);
        panelAsiento.add(asiento4, gridBagConstraints);

        asiento5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento5, gridBagConstraints);

        asiento6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento6, gridBagConstraints);

        asiento7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento7, gridBagConstraints);

        asiento8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento8, gridBagConstraints);

        asiento9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 40);
        panelAsiento.add(asiento9, gridBagConstraints);

        asiento10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 10, 10);
        panelAsiento.add(asiento10, gridBagConstraints);

        asiento11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento11, gridBagConstraints);

        asiento12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento12, gridBagConstraints);

        asiento13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento13, gridBagConstraints);

        asiento14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento14, gridBagConstraints);

        asiento15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 40);
        panelAsiento.add(asiento15, gridBagConstraints);

        asiento16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 10, 10);
        panelAsiento.add(asiento16, gridBagConstraints);

        asiento18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento18, gridBagConstraints);

        asiento17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelAsiento.add(asiento17, gridBagConstraints);

        asiento19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 30, 10);
        panelAsiento.add(asiento19, gridBagConstraints);

        asiento20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 30, 10);
        panelAsiento.add(asiento20, gridBagConstraints);

        asiento21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 40);
        panelAsiento.add(asiento21, gridBagConstraints);

        asiento22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 10, 10);
        panelAsiento.add(asiento22, gridBagConstraints);

        asiento23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 30, 10);
        panelAsiento.add(asiento23, gridBagConstraints);

        asiento24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asiento24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seat.png"))); // NOI18N
        asiento24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        asiento24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 30, 10);
        panelAsiento.add(asiento24, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelAsiento.add(botonRegresar, gridBagConstraints);

        botonContinuar.setBackground(new java.awt.Color(51, 51, 51));
        botonContinuar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonContinuar.setForeground(new java.awt.Color(255, 255, 255));
        botonContinuar.setText("Continuar");
        botonContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonContinuar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        panelAsiento.add(botonContinuar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(panelAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAsiento, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asiento1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asiento1MouseClicked
       
    }//GEN-LAST:event_asiento1MouseClicked

    public JLabel getAsiento1() {
        return asiento1;
    }

    public void setAsiento1(JLabel asiento1) {
        this.asiento1 = asiento1;
    }

    public JLabel getAsiento10() {
        return asiento10;
    }

    public void setAsiento10(JLabel asiento10) {
        this.asiento10 = asiento10;
    }

    public JLabel getAsiento11() {
        return asiento11;
    }

    public void setAsiento11(JLabel asiento11) {
        this.asiento11 = asiento11;
    }

    public JLabel getAsiento12() {
        return asiento12;
    }

    public void setAsiento12(JLabel asiento12) {
        this.asiento12 = asiento12;
    }

    public JLabel getAsiento13() {
        return asiento13;
    }

    public void setAsiento13(JLabel asiento13) {
        this.asiento13 = asiento13;
    }

    public JLabel getAsiento14() {
        return asiento14;
    }

    public void setAsiento14(JLabel asiento14) {
        this.asiento14 = asiento14;
    }

    public JLabel getAsiento15() {
        return asiento15;
    }

    public void setAsiento15(JLabel asiento15) {
        this.asiento15 = asiento15;
    }

    public JLabel getAsiento16() {
        return asiento16;
    }

    public void setAsiento16(JLabel asiento16) {
        this.asiento16 = asiento16;
    }

    public JLabel getAsiento17() {
        return asiento17;
    }

    public void setAsiento17(JLabel asiento17) {
        this.asiento17 = asiento17;
    }

    public JLabel getAsiento18() {
        return asiento18;
    }

    public void setAsiento18(JLabel asiento18) {
        this.asiento18 = asiento18;
    }

    public JLabel getAsiento19() {
        return asiento19;
    }

    public void setAsiento19(JLabel asiento19) {
        this.asiento19 = asiento19;
    }

    public JLabel getAsiento2() {
        return asiento2;
    }

    public void setAsiento2(JLabel asiento2) {
        this.asiento2 = asiento2;
    }

    public JLabel getAsiento20() {
        return asiento20;
    }

    public void setAsiento20(JLabel asiento20) {
        this.asiento20 = asiento20;
    }

    public JLabel getAsiento21() {
        return asiento21;
    }

    public void setAsiento21(JLabel asiento21) {
        this.asiento21 = asiento21;
    }

    public JLabel getAsiento22() {
        return asiento22;
    }

    public void setAsiento22(JLabel asiento22) {
        this.asiento22 = asiento22;
    }

    public JLabel getAsiento23() {
        return asiento23;
    }

    public void setAsiento23(JLabel asiento23) {
        this.asiento23 = asiento23;
    }

    public JLabel getAsiento24() {
        return asiento24;
    }

    public void setAsiento24(JLabel asiento24) {
        this.asiento24 = asiento24;
    }

    public JLabel getAsiento3() {
        return asiento3;
    }

    public void setAsiento3(JLabel asiento3) {
        this.asiento3 = asiento3;
    }

    public JLabel getAsiento4() {
        return asiento4;
    }

    public void setAsiento4(JLabel asiento4) {
        this.asiento4 = asiento4;
    }

    public JLabel getAsiento5() {
        return asiento5;
    }

    public void setAsiento5(JLabel asiento5) {
        this.asiento5 = asiento5;
    }

    public JLabel getAsiento6() {
        return asiento6;
    }

    public void setAsiento6(JLabel asiento6) {
        this.asiento6 = asiento6;
    }

    public JLabel getAsiento7() {
        return asiento7;
    }

    public void setAsiento7(JLabel asiento7) {
        this.asiento7 = asiento7;
    }

    public JLabel getAsiento8() {
        return asiento8;
    }

    public void setAsiento8(JLabel asiento8) {
        this.asiento8 = asiento8;
    }

    public JLabel getAsiento9() {
        return asiento9;
    }

    public void setAsiento9(JLabel asiento9) {
        this.asiento9 = asiento9;
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

    public int getClaveVentana() {
        return claveVentana;
    }

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSeat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asiento1;
    private javax.swing.JLabel asiento10;
    private javax.swing.JLabel asiento11;
    private javax.swing.JLabel asiento12;
    private javax.swing.JLabel asiento13;
    private javax.swing.JLabel asiento14;
    private javax.swing.JLabel asiento15;
    private javax.swing.JLabel asiento16;
    private javax.swing.JLabel asiento17;
    private javax.swing.JLabel asiento18;
    private javax.swing.JLabel asiento19;
    private javax.swing.JLabel asiento2;
    private javax.swing.JLabel asiento20;
    private javax.swing.JLabel asiento21;
    private javax.swing.JLabel asiento22;
    private javax.swing.JLabel asiento23;
    private javax.swing.JLabel asiento24;
    private javax.swing.JLabel asiento3;
    private javax.swing.JLabel asiento4;
    private javax.swing.JLabel asiento5;
    private javax.swing.JLabel asiento6;
    private javax.swing.JLabel asiento7;
    private javax.swing.JLabel asiento8;
    private javax.swing.JLabel asiento9;
    private javax.swing.JButton botonContinuar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JPanel panelAsiento;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
