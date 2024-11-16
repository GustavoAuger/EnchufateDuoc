/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.CuentaCON;
import Modelo.Cuenta;
import Ultilidades.CustomListRenderer;
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
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;

/**
 *
 * @author gauge
 */
public class Inicio extends javax.swing.JFrame {
 
   
    private Registrar login; //variable login para ocultar o mostrar la ventana
    String run;
    ImageIcon iconoOriginal;
    int cod_cuenta;
    public Inicio(int cod_cuenta) {
        this.cod_cuenta = cod_cuenta;
        
        initComponents();
        
        this.setLocationRelativeTo(this);
        SetImageLabel(fondo, "src/imagenes/fondo.png");
//        SetImageLabel(icono, "src/imagenes/icono.png");

 
    }

 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        separadorr = new javax.swing.JSeparator();
        Panelasignaturas = new javax.swing.JScrollPane();
        asignaturas = new javax.swing.JList<>();
        PanelEscuela = new javax.swing.JScrollPane();
        escuela = new javax.swing.JList<>();
        cursos = new RoundedPanel(55);
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        colapsar = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(80);
        nombrelogin = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        barra = new javax.swing.JButton();
        nav = new javax.swing.JButton();
        campana = new javax.swing.JButton();
        logged = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 69, 121));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 Blk BT", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busca tu escuela");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 410, 290, 80));

        separadorr.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(separadorr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 555, 340, 20));
        separadorr.setVisible(false);

        Panelasignaturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panelasignaturas.setBorder(null);

        asignaturas.setBackground(new java.awt.Color(214, 217, 223));
        asignaturas.setBorder(null);
        asignaturas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        asignaturas.setForeground(new java.awt.Color(102, 102, 102));
        asignaturas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Desarrollo de Software de escritorio", "Diseño de prototipos", "Consulta de base de datos", "Matemática Aplicada", "Programación Web", "Modelamiento de Base de Datos", "Estadística descriptiva" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        asignaturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asignaturas.setVisibleRowCount(3);
        asignaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                asignaturasMouseClicked(evt);
            }
        });
        Panelasignaturas.setViewportView(asignaturas);

        jPanel1.add(Panelasignaturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 555, 340, 330));
        Panelasignaturas.setVisible(false);

        escuela.setBackground(new java.awt.Color(214, 217, 223));
        escuela.setBorder(null);
        escuela.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        escuela.setForeground(new java.awt.Color(0, 0, 0));
        escuela.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<html>Escuela de informática<br>y telecomunicaciones", "<html>Escuela de construcción<FONT SIZE=8><br></FONT>", "<html>Escuela de salud <FONT SIZE=8><br></FONT>", "<html>Escuela de diseño<FONT SIZE=8><br></FONT>", "<html>Escuela de turismo <br>y hoteleria", "<html>Escuela de Comunicación<FONT SIZE=8><br></FONT>", "<html>Escuela de Gastronomía<FONT SIZE=8><br></FONT>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        escuela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        escuela.setVisibleRowCount(3);
        escuela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escuelaMouseClicked(evt);
            }
        });
        PanelEscuela.setViewportView(escuela);

        PanelEscuela.setBorder(null);

        jPanel1.add(PanelEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 490, 340, 400));

        cursos.setBackground(new java.awt.Color(102, 255, 255));
        cursos.setForeground(new java.awt.Color(255, 51, 51));
        cursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cursosMouseClicked(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("► Mis Cursos ◄");
        cursos.add(jLabel26);

        jPanel1.add(cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 335, 260, 50));

        jPanel3.setBackground(new java.awt.Color(21, 69, 120));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 400, 340, 90));

        colapsar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        colapsar.setText("Colapsar");
        colapsar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        colapsar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colapsarMouseClicked(evt);
            }
        });
        jPanel1.add(colapsar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 895, -1, -1));
        colapsar.setVisible(false);
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, 340, 520));

        nombrelogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombrelogin.setForeground(new java.awt.Color(255, 255, 255));
        nombrelogin.setText("Login");
        jPanel1.add(nombrelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 295, -1, -1));
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 80));
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 1350, 710));

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

    private void barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraActionPerformed

    }//GEN-LAST:event_barraActionPerformed

    private void escuelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escuelaMouseClicked
//      Codigo para colapsar paneles de asignaturas
          if (!Panelasignaturas.isVisible()) {
             Panelasignaturas.setVisible(true);
             int index = escuela.getSelectedIndex();
          String valor = (String) escuela.getModel().getElementAt(index);
          escuela.setListData(new String[]{valor});
          colapsar.setVisible(true);
          separadorr.setVisible(true);
          }
          
          

    }//GEN-LAST:event_escuelaMouseClicked

    private void colapsarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colapsarMouseClicked
          colapsar.setVisible(false);
          separadorr.setVisible(false);
          Panelasignaturas.setVisible(false);
          escuela.setListData(new String[]{
"<html>Escuela de informática<br>y telecomunicaciones",
"<html>Escuela de construcción<FONT SIZE=8><br></FONT>",
"<html>Escuela de salud <FONT SIZE=8><br></FONT>",
"<html>Escuela de diseño<FONT SIZE=8><br></FONT>",
"<html>Escuela de turismo <br>y hoteleria",
"<html>Escuela de Comunicación<FONT SIZE=8><br></FONT>",
"<html>Escuela de Gastronomía<FONT SIZE=8><br></FONT>",
                });
    }//GEN-LAST:event_colapsarMouseClicked

    private void asignaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignaturasMouseClicked
        int index = asignaturas.getSelectedIndex();
        int amarilla = 0;
        String valor = (String) asignaturas.getModel().getElementAt(index);
        if(index>-1){
        
        CuentaCON controlador = new CuentaCON();
        DefaultListModel<String> modelo = controlador.obtenerAsignaturasFavoritas(cod_cuenta); //crea una lista con todass las asignaturas favoritas
        for (int i = 0; i < modelo.size(); i++) { //
            if (modelo.getElementAt(i).equals(valor)) { //intenta encontrar una coincidencia del nombre seleccionado con la lista de asignaturas fav. si hace match aplicara favorito (estrella amarilla)
                System.out.println(valor);
                amarilla = 1;
                break; // Detiene el bucle una vez que se encuentra la coincidencia y continua con la nueva pestaña.
        }
}       
  
        General general = new General(amarilla,cod_cuenta,valor);
        general.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_asignaturasMouseClicked

    private void loggedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loggedActionPerformed

    private void campanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campanaActionPerformed

    private void navActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navActionPerformed

    private void cursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursosMouseClicked
        Favoritos favoritos = new Favoritos(cod_cuenta);
        this.dispose();
        favoritos.setVisible(true);
    }//GEN-LAST:event_cursosMouseClicked
    
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
    private javax.swing.JScrollPane PanelEscuela;
    private javax.swing.JScrollPane Panelasignaturas;
    private javax.swing.JList<String> asignaturas;
    private javax.swing.JButton barra;
    private javax.swing.JButton campana;
    private javax.swing.JLabel colapsar;
    private javax.swing.JPanel cursos;
    private javax.swing.JList<String> escuela;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logged;
    private javax.swing.JButton nav;
    private javax.swing.JLabel nombrelogin;
    private javax.swing.JSeparator separadorr;
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
