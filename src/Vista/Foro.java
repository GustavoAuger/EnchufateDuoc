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
public class Foro extends javax.swing.JFrame {
 
    int cod_cuenta;
    boolean estado = true; // para manejar la estrella;
    String run;
    String valor;
    ImageIcon iconoOriginal;
    int amarilla;
    public Foro(int amarilla,int cod_cuenta, String valor) {
        this.valor= valor;
        this.amarilla = amarilla;
        this.cod_cuenta = cod_cuenta;
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


 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        cursos = new RoundedPanel(55);
        jLabel22 = new javax.swing.JLabel();
        Ayudantia = new RoundedPanel(55);
        jLabel19 = new javax.swing.JLabel();
        Anadir = new RoundedPanel(55);
        jLabel18 = new javax.swing.JLabel();
        atras = new RoundedPanel(55);
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        Apuntes = new RoundedPanel(55);
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Numero_visitas = new javax.swing.JLabel();
        Numero_visitas1 = new javax.swing.JLabel();
        Visitas_fecha = new javax.swing.JLabel();
        irforo3 = new javax.swing.JButton();
        irforo2 = new javax.swing.JButton();
        irforo1 = new javax.swing.JButton();
        irforo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(80);
        icono = new javax.swing.JLabel();
        nombrelogin = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
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

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("► Mis Cursos ◄");
        cursos.add(jLabel22);

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
        Ayudantia.add(jLabel19);

        jPanel1.add(Ayudantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 300, 50));

        Anadir.setBackground(new java.awt.Color(153, 255, 153));
        Anadir.setForeground(new java.awt.Color(255, 153, 153));
        Anadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Añadir tema (+)");
        Anadir.add(jLabel18);

        jPanel1.add(Anadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 930, 250, 50));

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

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Conectar app Java a Oracle cloud");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, 1160, 60));

        Apuntes.setBackground(new java.awt.Color(186, 164, 67));
        Apuntes.setForeground(new java.awt.Color(186, 164, 67));
        Apuntes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Apuntes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApuntesMouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Apuntes");
        Apuntes.add(jLabel21);

        jPanel1.add(Apuntes, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 370, 250, 50));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Herencias y polimorfismo");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 1150, 60));

        Numero_visitas.setBackground(new java.awt.Color(255, 255, 255));
        Numero_visitas.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        Numero_visitas.setForeground(new java.awt.Color(0, 0, 0));
        Numero_visitas.setText("<html>102<br> <br> 205");
        jPanel1.add(Numero_visitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 670, 120, 280));

        Numero_visitas1.setBackground(new java.awt.Color(255, 255, 255));
        Numero_visitas1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        Numero_visitas1.setForeground(new java.awt.Color(0, 0, 0));
        Numero_visitas1.setText("<html>76<br> <br>   86");
        jPanel1.add(Numero_visitas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 520, 120, 170));

        Visitas_fecha.setBackground(new java.awt.Color(255, 255, 255));
        Visitas_fecha.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        Visitas_fecha.setForeground(new java.awt.Color(255, 255, 255));
        Visitas_fecha.setText("Visitas              Fecha   ");
        jPanel1.add(Visitas_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 490, 60));

        irforo3.setBackground(null);
        irforo3.setOpaque(false);
        irforo3.setContentAreaFilled(false);
        irforo3.setBorderPainted(false);
        irforo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/irforo.png"))); // NOI18N
        irforo3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        irforo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irforo3ActionPerformed(evt);
            }
        });
        jPanel1.add(irforo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 830, 70, 90));

        irforo2.setBackground(null);
        irforo2.setOpaque(false);
        irforo2.setContentAreaFilled(false);
        irforo2.setBorderPainted(false);
        irforo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/irforo.png"))); // NOI18N
        irforo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        irforo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irforo2ActionPerformed(evt);
            }
        });
        jPanel1.add(irforo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 730, 70, 90));

        irforo1.setBackground(null);
        irforo1.setOpaque(false);
        irforo1.setContentAreaFilled(false);
        irforo1.setBorderPainted(false);
        irforo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/irforo.png"))); // NOI18N
        irforo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        irforo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irforo1ActionPerformed(evt);
            }
        });
        jPanel1.add(irforo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 70, 90));

        irforo.setBackground(null);
        irforo.setOpaque(false);
        irforo.setContentAreaFilled(false);
        irforo.setBorderPainted(false);
        irforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/irforo.png"))); // NOI18N
        irforo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        irforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irforoActionPerformed(evt);
            }
        });
        jPanel1.add(irforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 70, 90));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("¿Cómo instalar Netbeans?");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 840, 1130, 60));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("FORO");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 330, 60));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Interfaces de usuario");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 740, 1130, 60));

        jPanel3.setBackground(new java.awt.Color(21, 69, 120));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 1290, 60));

        jPanel2.setForeground(new java.awt.Color(212, 213, 212));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 1290, 420));
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 80));

        nombrelogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombrelogin.setForeground(new java.awt.Color(255, 255, 255));
        nombrelogin.setText("Login");
        jPanel1.add(nombrelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 295, -1, -1));

        fondo.setBackground(new java.awt.Color(98, 108, 126));
        fondo.setOpaque(true);
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
        General gen = new General(amarilla,cod_cuenta,valor);
        this.dispose();
        gen.setVisible(true);
    }//GEN-LAST:event_atrasMouseClicked

    private void AyudantiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudantiaMouseClicked
        Ayudantia ayu = new Ayudantia(amarilla,cod_cuenta,valor);
        this.dispose();
        ayu.setVisible(true);
    }//GEN-LAST:event_AyudantiaMouseClicked

    private void ApuntesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApuntesMouseClicked
       Apuntes apu = new Apuntes(amarilla,cod_cuenta,valor);
        this.dispose();
        apu.setVisible(true);
    }//GEN-LAST:event_ApuntesMouseClicked

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
                 con.eliminarFavorito(cod_cuenta, idAsig); //elimino con esa id
             } catch (Exception ex) {
                 Logger.getLogger(General.class.getName()).log(Level.SEVERE, null, ex);
             }          
            estrella.setIcon(new ImageIcon(getClass().getResource("/imagenes/estrella.png")));
        } else {
            // Cambiar al ícono 2
           estrella.setIcon(new ImageIcon(getClass().getResource("/imagenes/estrella_a.png")));
           con.agregarRelacion(idAsig,cod_cuenta); //agrego a favorito la asignatura
           amarilla = 1;
        }        
    }//GEN-LAST:event_estrellaActionPerformed

    private void campanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campanaActionPerformed

    private void loggedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loggedActionPerformed

    private void irforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irforoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irforoActionPerformed

    private void irforo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irforo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irforo1ActionPerformed

    private void irforo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irforo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irforo2ActionPerformed

    private void irforo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irforo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_irforo3ActionPerformed

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
        




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Anadir;
    private javax.swing.JPanel Apuntes;
    private javax.swing.JPanel Ayudantia;
    private javax.swing.JLabel Numero_visitas;
    private javax.swing.JLabel Numero_visitas1;
    private javax.swing.JLabel Visitas_fecha;
    private javax.swing.JPanel atras;
    private javax.swing.JButton barra;
    private javax.swing.JButton campana;
    private javax.swing.JPanel cursos;
    private javax.swing.JButton estrella;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JButton irforo;
    private javax.swing.JButton irforo1;
    private javax.swing.JButton irforo2;
    private javax.swing.JButton irforo3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
