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
public class Ayudantia extends javax.swing.JFrame {
 
   
    int cod_cuenta;
    boolean estado = true; // para manejar la estrella;
    String run;
    String valor;
    ImageIcon iconoOriginal;
    int amarilla;
    public Ayudantia(int amarilla,int cod_cuenta, String valor) {
        this.valor= valor;
        this.amarilla = amarilla;
        this.cod_cuenta = cod_cuenta;
        initComponents();
        this.setLocationRelativeTo(this);
        SetImageLabel(video, "src/imagenes/reproduccion.png");
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

        jPanel1 = new javax.swing.JPanel();
        Apuntes = new RoundedPanel(55);
        jLabel19 = new javax.swing.JLabel();
        ayudantia4 = new RoundedPanel(40);
        jLabel25 = new javax.swing.JLabel();
        atras = new RoundedPanel(55);
        jLabel17 = new javax.swing.JLabel();
        ayudantia3 = new RoundedPanel(40);
        jLabel24 = new javax.swing.JLabel();
        ayudantia2 = new RoundedPanel(40);
        jLabel23 = new javax.swing.JLabel();
        cursos = new RoundedPanel(55);
        jLabel26 = new javax.swing.JLabel();
        ayudantia1 = new RoundedPanel(40);
        jLabel21 = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        video = new javax.swing.JLabel();
        Foro = new RoundedPanel(55);
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(80);
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

        Apuntes.setBackground(new java.awt.Color(186, 164, 67));
        Apuntes.setForeground(new java.awt.Color(186, 164, 67));
        Apuntes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Apuntes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApuntesMouseClicked(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Apuntes");
        Apuntes.add(jLabel19);

        jPanel1.add(Apuntes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 240, 50));

        ayudantia4.setBackground(new java.awt.Color(255, 144, 77));
        ayudantia4.setForeground(new java.awt.Color(186, 164, 67));
        ayudantia4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayudantia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudantia4MouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Ayudantia 4");
        ayudantia4.add(jLabel25);

        jPanel1.add(ayudantia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 740, 190, -1));

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

        ayudantia3.setBackground(new java.awt.Color(255, 144, 77));
        ayudantia3.setForeground(new java.awt.Color(186, 164, 67));
        ayudantia3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayudantia3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudantia3MouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Ayudantia 3");
        ayudantia3.add(jLabel24);

        jPanel1.add(ayudantia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 660, 190, 40));

        ayudantia2.setBackground(new java.awt.Color(255, 144, 77));
        ayudantia2.setForeground(new java.awt.Color(186, 164, 67));
        ayudantia2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayudantia2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudantia2MouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Ayudantia 2");
        ayudantia2.add(jLabel23);

        jPanel1.add(ayudantia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 580, 190, -1));

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

        jPanel1.add(cursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, 260, 50));

        ayudantia1.setBackground(new java.awt.Color(193, 255, 114));
        ayudantia1.setForeground(new java.awt.Color(193, 255, 114));
        ayudantia1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ayudantia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayudantia1MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Ayudantia 1");
        ayudantia1.add(jLabel21);

        jPanel1.add(ayudantia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 500, 190, 40));
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 80, 80));

        video.setBackground(new java.awt.Color(98, 108, 126));
        video.setOpaque(true);
        jPanel1.add(video, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 1020, 520));

        Foro.setBackground(new java.awt.Color(186, 164, 67));
        Foro.setForeground(new java.awt.Color(186, 164, 67));
        Foro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Foro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForoMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 27)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Foro");
        Foro.add(jLabel22);

        jPanel1.add(Foro, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 220, 50));

        jPanel2.setBackground(new java.awt.Color(144, 150, 161));
        jPanel2.setForeground(new java.awt.Color(144, 150, 161));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 450, 240, 500));

        nombrelogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombrelogin.setForeground(new java.awt.Color(255, 255, 255));
        nombrelogin.setText("Login");
        jPanel1.add(nombrelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 295, -1, -1));

        fondo.setBackground(new java.awt.Color(98, 108, 126));
        fondo.setOpaque(true);
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 1360, 710));

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

    private void ApuntesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApuntesMouseClicked
        Apuntes apu = new Apuntes(amarilla,cod_cuenta,valor);
        this.dispose();
        apu.setVisible(true);
    }//GEN-LAST:event_ApuntesMouseClicked

    private void ForoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForoMouseClicked
         Foro foro = new Foro(amarilla,cod_cuenta,valor);
        this.dispose();
        foro.setVisible(true);
    }//GEN-LAST:event_ForoMouseClicked

    private void ayudantia2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudantia2MouseClicked
        ayudantia2.setBackground(new Color(193, 255, 114));
        ayudantia3.setBackground(new Color(255, 144, 77));
        ayudantia4.setBackground(new Color(255, 144, 77));
        ayudantia1.setBackground(new Color(255, 144, 77));
    }//GEN-LAST:event_ayudantia2MouseClicked

    private void ayudantia3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudantia3MouseClicked
        ayudantia3.setBackground(new Color(193, 255, 114));
        ayudantia4.setBackground(new Color(255, 144, 77));
        ayudantia2.setBackground(new Color(255, 144, 77));
        ayudantia1.setBackground(new Color(255, 144, 77));
    }//GEN-LAST:event_ayudantia3MouseClicked

    private void ayudantia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudantia4MouseClicked
        ayudantia4.setBackground(new Color(193, 255, 114));
        ayudantia3.setBackground(new Color(255, 144, 77));
        ayudantia2.setBackground(new Color(255, 144, 77));
        ayudantia1.setBackground(new Color(255, 144, 77));
    }//GEN-LAST:event_ayudantia4MouseClicked

    private void ayudantia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudantia1MouseClicked
        ayudantia1.setBackground(new Color(193, 255, 114));
        ayudantia3.setBackground(new Color(255, 144, 77));
        ayudantia4.setBackground(new Color(255, 144, 77));
        ayudantia2.setBackground(new Color(255, 144, 77));
    }//GEN-LAST:event_ayudantia1MouseClicked

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
    private javax.swing.JPanel Apuntes;
    private javax.swing.JPanel Foro;
    private javax.swing.JPanel atras;
    private javax.swing.JPanel ayudantia1;
    private javax.swing.JPanel ayudantia2;
    private javax.swing.JPanel ayudantia3;
    private javax.swing.JPanel ayudantia4;
    private javax.swing.JButton barra;
    private javax.swing.JButton campana;
    private javax.swing.JPanel cursos;
    private javax.swing.JButton estrella;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logged;
    private javax.swing.JButton nav;
    private javax.swing.JLabel nombrelogin;
    private javax.swing.JLabel video;
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
