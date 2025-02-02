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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gauge
 */
public class Apuntes extends javax.swing.JFrame {
 
   

    int usuario;
    boolean estado = true; // para manejar la estrella;
    String run;
    String valor;
    ImageIcon iconoOriginal;
    int amarilla;
    public Apuntes(int amarilla,int usuario, String valor) {
        this.valor= valor;
        this.amarilla = amarilla;
        this.usuario = usuario;
        initComponents();
        this.setLocationRelativeTo(this);

//        SetImageLabel(icono, "src/imagenes/icono.png");
System.out.println(amarilla);
   System.out.println(amarilla);
        if (amarilla==1) {
            estrella.setIcon(new ImageIcon(getClass().getResource("/imagenes/estrella_a.png")));
            System.out.println(amarilla);
        } else {
            // Cambiar al ícono 2
           estrella.setIcon(new ImageIcon(getClass().getResource("/imagenes/estrella.png")));
        }       
 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        cursos = new RoundedPanel(55);
        jLabel21 = new javax.swing.JLabel();
        Ayudantia = new RoundedPanel(55);
        jLabel19 = new javax.swing.JLabel();
        Foro = new RoundedPanel(55);
        jLabel18 = new javax.swing.JLabel();
        atras = new RoundedPanel(55);
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        irapunte = new javax.swing.JButton();
        irapunte1 = new javax.swing.JButton();
        irapunte2 = new javax.swing.JButton();
        irapunte3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(80);
        icono = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        nombrelogin = new javax.swing.JLabel();
        barra = new javax.swing.JButton();
        nav = new javax.swing.JButton();
        estrella = new javax.swing.JButton();
        campana = new javax.swing.JButton();
        logged = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 69, 121));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cursos.setBackground(new java.awt.Color(102, 255, 255));
        cursos.setForeground(new java.awt.Color(186, 164, 67));
        cursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cursosMouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("► Mis Cursos ◄");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        cursos.add(jLabel21);

        jPanel1.add(cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 370, 260, 50));

        Ayudantia.setBackground(new java.awt.Color(186, 164, 67));
        Ayudantia.setForeground(new java.awt.Color(186, 164, 67));
        Ayudantia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ayudantia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudantiaMouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Ayudantia Grabadas");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        Ayudantia.add(jLabel19);

        jPanel1.add(Ayudantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 300, 50));

        Foro.setBackground(new java.awt.Color(186, 164, 67));
        Foro.setForeground(new java.awt.Color(186, 164, 67));
        Foro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Foro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForoMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Foro");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        Foro.add(jLabel18);

        jPanel1.add(Foro, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 250, 50));

        atras.setBackground(new java.awt.Color(186, 164, 67));
        atras.setForeground(new java.awt.Color(186, 164, 67));
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("ATRÁS");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        atras.add(jLabel17);

        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 300, 50));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, 1220, 40));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 820, 1220, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 1220, 10));

        irapunte.setBackground(null);
        irapunte.setOpaque(false);
        irapunte.setContentAreaFilled(false);
        irapunte.setBorderPainted(false);
        irapunte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        irapunte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        irapunte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irapunteActionPerformed(evt);
            }
        });
        jPanel1.add(irapunte, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 70, 90));

        irapunte1.setBackground(null);
        irapunte1.setOpaque(false);
        irapunte1.setContentAreaFilled(false);
        irapunte1.setBorderPainted(false);
        irapunte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        irapunte1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        irapunte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irapunte1ActionPerformed(evt);
            }
        });
        jPanel1.add(irapunte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 70, 90));

        irapunte2.setBackground(null);
        irapunte2.setOpaque(false);
        irapunte2.setContentAreaFilled(false);
        irapunte2.setBorderPainted(false);
        irapunte2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        irapunte2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        irapunte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irapunte2ActionPerformed(evt);
            }
        });
        jPanel1.add(irapunte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 730, 70, 90));

        irapunte3.setBackground(null);
        irapunte3.setOpaque(false);
        irapunte3.setContentAreaFilled(false);
        irapunte3.setBorderPainted(false);
        irapunte3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda.png"))); // NOI18N
        irapunte3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        irapunte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irapunte3ActionPerformed(evt);
            }
        });
        jPanel1.add(irapunte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 830, 70, 90));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("GUIAS Y PRUEBAS 2");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 1160, 60));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("GUIAS Y PRUEBAS 1");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 1150, 60));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("PREPARA TU EXAMEN");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 840, 1130, 60));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("APUNTES");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 330, 60));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("GUIAS Y PRUEBAS 3");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 740, 1130, 60));

        jPanel3.setBackground(new java.awt.Color(21, 69, 120));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 1290, 60));

        jPanel2.setForeground(new java.awt.Color(212, 213, 212));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 1290, 420));
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

        estrella.setBackground(null);
        estrella.setOpaque(false);
        estrella.setContentAreaFilled(false);
        estrella.setBorderPainted(false);
        estrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        estrella.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estrellaActionPerformed(evt);
            }
        });
        jPanel1.add(estrella, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 227, 60, 110));

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

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        General gen = new General(amarilla, usuario,valor);
        this.dispose();
        gen.setVisible(true);
    }//GEN-LAST:event_atrasMouseClicked

    private void AyudantiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudantiaMouseClicked
        Ayudantia ayu = new Ayudantia(amarilla, usuario,valor);
        this.dispose();
        ayu.setVisible(true);
    }//GEN-LAST:event_AyudantiaMouseClicked

    private void ForoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForoMouseClicked
        Foro foro = new Foro(amarilla, usuario,valor);
        this.dispose();
        foro.setVisible(true);
    }//GEN-LAST:event_ForoMouseClicked

    private void barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraActionPerformed

    }//GEN-LAST:event_barraActionPerformed

    private void navActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navActionPerformed

    private void estrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estrellaActionPerformed
         CuentaCON con = new CuentaCON();
         int idAsig=  con.obtenerIdAsignaturaPorNombre(valor); //busco la id de asigntura 
        if (amarilla==1) {
            // Cambiar al ícono 1
            amarilla = 0;
             try {
                 con.eliminarFavorito(usuario, idAsig); //elimino con esa id
             } catch (Exception ex) {
                 Logger.getLogger(General.class.getName()).log(Level.SEVERE, null, ex);
             }          
            estrella.setIcon(new ImageIcon(getClass().getResource("/imagenes/estrella.png")));
        } else {
            // Cambiar al ícono 2
           estrella.setIcon(new ImageIcon(getClass().getResource("/imagenes/estrella_a.png")));
           con.agregarRelacion(idAsig,usuario); //agrego a favorito la asignatura
           amarilla = 1;
        }        
    }//GEN-LAST:event_estrellaActionPerformed

    private void campanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campanaActionPerformed

    private void loggedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loggedActionPerformed

    private void irapunteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irapunteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irapunteActionPerformed

    private void irapunte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irapunte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irapunte1ActionPerformed

    private void irapunte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irapunte2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irapunte2ActionPerformed

    private void irapunte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irapunte3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irapunte3ActionPerformed

    private void cursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursosMouseClicked
        Favoritos favoritos = new Favoritos(usuario);
        this.dispose();
        favoritos.setVisible(true);
    }//GEN-LAST:event_cursosMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Favoritos favoritos = new Favoritos(usuario);
        this.dispose();
        favoritos.setVisible(true); //palabra favoritos
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
         Foro foro = new Foro(amarilla, usuario,valor);
        this.dispose();
        foro.setVisible(true);//palabra foro
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        Ayudantia ayu = new Ayudantia(amarilla, usuario,valor);
        this.dispose();
        ayu.setVisible(true); //palabra ayudantia
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        General gen = new General(amarilla, usuario,valor);
        this.dispose();
        gen.setVisible(true);//palabra atras
    }//GEN-LAST:event_jLabel17MouseClicked
    
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
    private javax.swing.JPanel Ayudantia;
    private javax.swing.JPanel Foro;
    private javax.swing.JPanel atras;
    private javax.swing.JButton barra;
    private javax.swing.JButton campana;
    private javax.swing.JPanel cursos;
    private javax.swing.JButton estrella;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JButton irapunte;
    private javax.swing.JButton irapunte1;
    private javax.swing.JButton irapunte2;
    private javax.swing.JButton irapunte3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
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
