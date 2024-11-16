/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.CuentaCON;
import java.util.Date;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gauge
 */
public class Favoritos extends javax.swing.JFrame {
 
   
    private Registrar login; //variable login para ocultar o mostrar la ventana
    String run;
    String valor;
    int amarilla;
    int cod_cuenta;
    boolean estado = true;
    ImageIcon iconoOriginal;
  
    public Favoritos(int cod_cuenta) {
        this.cod_cuenta = cod_cuenta;
 
        initComponents();
        this.setLocationRelativeTo(this);
//        SetImageLabel(icono, "src/imagenes/icono.png");
        String asignatura;
        
//        DefaultTableModel modelox = (DefaultTableModel) this.tabla_Cursos.getModel(); //tabla
//        modelox.setRowCount(0);
        CuentaCON controlador = new CuentaCON();
        DefaultListModel<String> lista = controlador.obtenerAsignaturasFavoritas(cod_cuenta); //crea una lista con todass las asignaturas favoritas

            Fav_elementos.setModel(lista);
                   
 
    }


 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        Lista_fav = new javax.swing.JScrollPane();
        Fav_elementos = new javax.swing.JList<>();
        Inicio = new RoundedPanel(55);
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(80);
        icono = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        nombrelogin = new javax.swing.JLabel();
        barra = new javax.swing.JButton();
        nav = new javax.swing.JButton();
        campana = new javax.swing.JButton();
        logged = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 69, 121));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lista_fav.setBorder(null);

        Fav_elementos.setBackground(new java.awt.Color(212, 213, 212));
        Fav_elementos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Fav_elementos.setForeground(new java.awt.Color(51, 51, 51));
        Fav_elementos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fav_elementos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Fav_elementosMouseClicked(evt);
            }
        });
        Lista_fav.setViewportView(Fav_elementos);

        jPanel1.add(Lista_fav, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 1200, 260));

        Inicio.setBackground(new java.awt.Color(186, 164, 67));
        Inicio.setForeground(new java.awt.Color(186, 164, 67));
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("INICIO");
        Inicio.add(jLabel17);

        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 300, 50));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("MIS CURSOS ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 220, 60));

        jPanel3.setBackground(new java.awt.Color(21, 69, 120));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 1290, 60));

        jPanel2.setForeground(new java.awt.Color(212, 213, 212));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 1290, 340));
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 80));

        fondo.setBackground(new java.awt.Color(98, 108, 126));
        fondo.setOpaque(true);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 1350, 710));

        nombrelogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombrelogin.setForeground(new java.awt.Color(255, 255, 255));
        nombrelogin.setText("Login");
        jPanel1.add(nombrelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 295, -1, -1));

        barra.setBackground(null);
        barra.setOpaque(false);
        barra.setContentAreaFilled(false);
        barra.setBorderPainted(false);
        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/barra.png"))); // NOI18N
        barra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraActionPerformed(evt);
            }
        });
        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 225, 610, 110));

        nav.setBackground(null);
        nav.setOpaque(false);
        nav.setContentAreaFilled(false);
        nav.setBorderPainted(false);
        nav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nav.png"))); // NOI18N
        nav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navActionPerformed(evt);
            }
        });
        jPanel1.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 225, 60, 110));

        campana.setBackground(null);
        campana.setOpaque(false);
        campana.setContentAreaFilled(false);
        campana.setBorderPainted(false);
        campana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campana.png"))); // NOI18N
        campana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        campana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campanaActionPerformed(evt);
            }
        });
        jPanel1.add(campana, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 227, 60, 110));

        logged.setBackground(null);
        logged.setOpaque(false);
        logged.setContentAreaFilled(false);
        logged.setBorderPainted(false);
        logged.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoN.png"))); // NOI18N
        logged.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggedActionPerformed(evt);
            }
        });
        jPanel1.add(logged, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 220, 60, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -240, 1410, 1010));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        Inicio ini = new Inicio(cod_cuenta);
        this.dispose();
        ini.setVisible(true);
    }//GEN-LAST:event_InicioMouseClicked

    private void barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraActionPerformed

    }//GEN-LAST:event_barraActionPerformed

    private void navActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navActionPerformed

    private void campanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campanaActionPerformed

    private void loggedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loggedActionPerformed

    private void Fav_elementosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fav_elementosMouseClicked
        int index = Fav_elementos.getSelectedIndex();
        int amarilla = 0;
        String valor = (String) Fav_elementos.getModel().getElementAt(index);
        if(index>-1){
        
        CuentaCON controlador = new CuentaCON();
        DefaultListModel<String> modelo = controlador.obtenerAsignaturasFavoritas(cod_cuenta); //crea una lista con todass las asignaturas favoritas
        for (int i = 0; i < modelo.size(); i++) { //
            if (modelo.getElementAt(i).equals(valor)) { //intenta encontrar una coincidencia del nombre seleccionado con la lista de asignaturas fav. si hace match aplicara favorito (estrella amarilla)
                amarilla = 1;
                break; // Detiene el bucle una vez que se encuentra la coincidencia y continua con la nueva pestaña. confirmando que ese elmento es o no favorito
        }
}       
  
        General general = new General(amarilla,cod_cuenta,valor);
        general.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_Fav_elementosMouseClicked
    
    private void SetImageLabel(JLabel fondo, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon =new ImageIcon(image.getImage().getScaledInstance(fondo.getWidth(),fondo.getHeight(), Image.SCALE_DEFAULT));
        fondo.setIcon(icon);
        this.repaint();

    }
        public class RoundedPanel extends JPanel {
    private int radius;

    public RoundedPanel(int radius) {
        this.radius = radius;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics2D = (Graphics2D) g.create();

        graphics2D.setColor(getBackground());
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2D.fillRoundRect(0, 0, width - 1, height - 1, radius, radius);

        graphics2D.dispose();
    }
}
        
    /**
     * @param args the command line arguments
     */





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Fav_elementos;
    private javax.swing.JPanel Inicio;
    private javax.swing.JScrollPane Lista_fav;
    private javax.swing.JButton barra;
    private javax.swing.JButton campana;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logged;
    private javax.swing.JButton nav;
    private javax.swing.JLabel nombrelogin;
    // End of variables declaration//GEN-END:variables

private Image crearImagenOpaca(Image img, float opacidad) {
    BufferedImage imagenOpaca = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
    Graphics2D g2 = imagenOpaca.createGraphics();
    g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacidad));
    g2.drawImage(img, 0, 0, null);
    g2.dispose();
    return imagenOpaca;
}
}
