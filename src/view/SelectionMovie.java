
package view;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Fernando Ismael Canul Caballero
 */

public class SelectionMovie extends javax.swing.JFrame {
    
    private final int claveVentana = 2;

    public SelectionMovie() {
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

        panel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        panel2 = new javax.swing.JPanel();
        movie1 = new javax.swing.JLabel();
        movie2 = new javax.swing.JLabel();
        movie3 = new javax.swing.JLabel();
        movie4 = new javax.swing.JLabel();
        movie5 = new javax.swing.JLabel();
        movie6 = new javax.swing.JLabel();
        movie7 = new javax.swing.JLabel();
        movie8 = new javax.swing.JLabel();
        movie9 = new javax.swing.JLabel();
        movie10 = new javax.swing.JLabel();
        movie11 = new javax.swing.JLabel();
        movie12 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        botonRegresar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        botonCancelarBoleto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(51, 51, 51));
        panel1.setLayout(new java.awt.BorderLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("CineFino");
        panel1.add(titulo, java.awt.BorderLayout.CENTER);

        scrollPane.setBorder(null);

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setPreferredSize(new java.awt.Dimension(160, 920));
        panel2.setLayout(new java.awt.GridBagLayout());

        movie1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/01.png"))); // NOI18N
        movie1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie1.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie1, gridBagConstraints);

        movie2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/02.png"))); // NOI18N
        movie2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie2.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie2, gridBagConstraints);

        movie3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/03.png"))); // NOI18N
        movie3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie3.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie3, gridBagConstraints);

        movie4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/04.png"))); // NOI18N
        movie4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie4.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie4, gridBagConstraints);

        movie5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/05.png"))); // NOI18N
        movie5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie5.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie5, gridBagConstraints);

        movie6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/06.png"))); // NOI18N
        movie6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie6.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie6, gridBagConstraints);

        movie7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/07.png"))); // NOI18N
        movie7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie7.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie7, gridBagConstraints);

        movie8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/08.png"))); // NOI18N
        movie8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie8.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie8, gridBagConstraints);

        movie9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/09.png"))); // NOI18N
        movie9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie9.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie9, gridBagConstraints);

        movie10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/10.png"))); // NOI18N
        movie10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie10.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie10, gridBagConstraints);

        movie11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/11.png"))); // NOI18N
        movie11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie11.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie11, gridBagConstraints);

        movie12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movie12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/12.png"))); // NOI18N
        movie12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        movie12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movie12.setPreferredSize(new java.awt.Dimension(22, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 158;
        gridBagConstraints.ipady = 228;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panel2.add(movie12, gridBagConstraints);

        scrollPane.setViewportView(panel2);

        panel3.setBackground(new java.awt.Color(51, 51, 51));

        botonRegresar.setBackground(new java.awt.Color(51, 51, 51));
        botonRegresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresar.setFocusPainted(false);

        botonRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrar.setFocusPainted(false);

        botonIngresar.setBackground(new java.awt.Color(51, 51, 51));
        botonIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Iniciar Sesión");
        botonIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonIngresar.setFocusPainted(false);

        botonCancelarBoleto.setBackground(new java.awt.Color(51, 51, 51));
        botonCancelarBoleto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonCancelarBoleto.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelarBoleto.setText("Cancelar Boleto");
        botonCancelarBoleto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCancelarBoleto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCancelarBoleto.setFocusPainted(false);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelarBoleto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCancelarBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionMovie().setVisible(true);
            }
        });
    }

    public JButton getBotonCancelarBoleto() {
        return botonCancelarBoleto;
    }

    public void setBotonCancelarBoleto(JButton botonCancelarBoleto) {
        this.botonCancelarBoleto = botonCancelarBoleto;
    }

    public JButton getBotonIngresar() {
        return botonIngresar;
    }

    public void setBotonIngresar(JButton botonIngresar) {
        this.botonIngresar = botonIngresar;
    }

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

    public JLabel getMovie1() {
        return movie1;
    }

    public void setMovie1(JLabel movie1) {
        this.movie1 = movie1;
    }

    public JLabel getMovie10() {
        return movie10;
    }

    public void setMovie10(JLabel movie10) {
        this.movie10 = movie10;
    }

    public JLabel getMovie11() {
        return movie11;
    }

    public void setMovie11(JLabel movie11) {
        this.movie11 = movie11;
    }

    public JLabel getMovie12() {
        return movie12;
    }

    public void setMovie12(JLabel movie12) {
        this.movie12 = movie12;
    }

    public JLabel getMovie2() {
        return movie2;
    }

    public void setMovie2(JLabel movie2) {
        this.movie2 = movie2;
    }

    public JLabel getMovie3() {
        return movie3;
    }

    public void setMovie3(JLabel movie3) {
        this.movie3 = movie3;
    }

    public JLabel getMovie4() {
        return movie4;
    }

    public void setMovie4(JLabel movie4) {
        this.movie4 = movie4;
    }

    public JLabel getMovie5() {
        return movie5;
    }

    public void setMovie5(JLabel movie5) {
        this.movie5 = movie5;
    }

    public JLabel getMovie6() {
        return movie6;
    }

    public void setMovie6(JLabel movie6) {
        this.movie6 = movie6;
    }

    public JLabel getMovie7() {
        return movie7;
    }

    public void setMovie7(JLabel movie7) {
        this.movie7 = movie7;
    }

    public JLabel getMovie8() {
        return movie8;
    }

    public void setMovie8(JLabel movie8) {
        this.movie8 = movie8;
    }

    public JLabel getMovie9() {
        return movie9;
    }

    public void setMovie9(JLabel movie9) {
        this.movie9 = movie9;
    }

    public int getClaveVentana() {
        return claveVentana;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarBoleto;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel movie1;
    private javax.swing.JLabel movie10;
    private javax.swing.JLabel movie11;
    private javax.swing.JLabel movie12;
    private javax.swing.JLabel movie2;
    private javax.swing.JLabel movie3;
    private javax.swing.JLabel movie4;
    private javax.swing.JLabel movie5;
    private javax.swing.JLabel movie6;
    private javax.swing.JLabel movie7;
    private javax.swing.JLabel movie8;
    private javax.swing.JLabel movie9;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
