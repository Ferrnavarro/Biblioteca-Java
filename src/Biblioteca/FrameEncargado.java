/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import FrameEncargado.Ingreso.Panels.*;
import FrameEncargado.Configuracion.Panels.*;
import static FrameEncargado.Configuracion.Panels.EditarUsuario.getConection;
import FrameEncargado.Informacion.Panels.*;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author Juan
 */
public class FrameEncargado extends javax.swing.JFrame {
    
     
 public static final String URL="jdbc:mysql://localhost:3306/biblioteca";
public static final String USERNAME="root";
public static final String PASSWORD="";
PreparedStatement ps;
PreparedStatement psAutor;
PreparedStatement psDoc;
ResultSet rs;

 static int bandera=0;
public static Connection getConection(){
    Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection(URL,USERNAME,PASSWORD);
        System.out.println("Conexion exitosa.....");
    }
    catch(Exception ex1){
        System.out.println("Error: "+ ex1);
    }
    return con;
}
    /**
     * Creates new form NewJFrame
     */
    
    //Variables globales
    String carnet;
    public FrameEncargado() {
        initComponents();
        setLocationRelativeTo(null);
            handClick_Labels();
            setImagen("");
        
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            label4.setText("ULTIMA CONEXION " + dateFormat.format(date));
            
            jPanel11.setBackground(new Color(39,41,54));
            jLabel6.setBackground(new Color(39,41,54));
    }
    
    public FrameEncargado(String carnet)
    {
        this();
        this.carnet = carnet;
        label1.setText(carnet);
    }
    
    private void setImagen(String codigo){
            final int label_size = 130;
            ImageIcon icono = new ImageIcon(getClass().getResource("/Bolbasaur.jpg"));
            Image imagen = icono.getImage().getScaledInstance(label_size, label_size,Image.SCALE_AREA_AVERAGING);
            
            jLabel4.setIcon(new ImageIcon(imagen));

            BufferedImage image;
        
            image = toBufferedImage(imagen);
        
            Area clip = new Area( new Rectangle(0, 0, image.getWidth(), image.getHeight()) );
            Area oval = new Area( new Ellipse2D.Double(0, 0, image.getWidth() - 1, image.getHeight() - 1) );
            clip.subtract( oval );
            Graphics g2d = image.createGraphics();
            g2d.setClip( clip );
            g2d.setColor(new Color(49,52,67));
            g2d.fillRect(0, 0, image.getWidth(), image.getHeight());
            
            jLabel4.setIcon(new ImageIcon(image));
    }
    
    
    public static BufferedImage toBufferedImage(Image img)
{
    // Create a buffered image with transparency
    BufferedImage bimage = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);

    // Draw the image on to the buffered image
    Graphics2D bGr = bimage.createGraphics();
    bGr.drawImage(img, 0, 0, null);
    bGr.dispose();

    // Return the buffered image
    return bimage;
}
    
    private void handClick_Labels(){
        jLabel36.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel37.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel17.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel33.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel32.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel19.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel40.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel41.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel16.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel42.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel43.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        label4 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 52, 67));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(39, 41, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(54, 73, 94));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Proyecto");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel15.setBackground(new java.awt.Color(151, 153, 150));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(151, 153, 150));
        jLabel15.setText("JAVA");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weibo.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-minimize-window-32.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 30, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-maximize-window-32.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-close-window-32_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 30, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 40));

        jPanel3.setBackground(new java.awt.Color(49, 52, 67));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(49, 52, 67));
        jLabel4.setForeground(new java.awt.Color(49, 52, 67));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unknow.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, 140));

        label1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(151, 153, 150));
        label1.setText("Usuario");
        jPanel3.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        label3.setFont(new java.awt.Font("Dotum", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(151, 153, 150));
        label3.setText("Ingresado como:");
        jPanel3.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        label3.getAccessibleContext().setAccessibleName("Ha ingresado como:");

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 230));

        jPanel4.setBackground(new java.awt.Color(49, 52, 67));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(49, 52, 67));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(54, 73, 94));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("INICIO");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 13, 65, 33));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-home-32.png"))); // NOI18N
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 230, 60));

        jPanel12.setBackground(new java.awt.Color(49, 52, 67));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-category-32.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 50));

        jLabel9.setBackground(new java.awt.Color(54, 73, 94));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CATEGORIA");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
        });
        jPanel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 33));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OpenBook.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
        });
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 50));

        jLabel33.setBackground(new java.awt.Color(54, 73, 94));
        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("EJEMPLAR");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
        });
        jPanel12.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 33));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_cuadrado.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
        });
        jPanel12.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 12, 50, 50));

        jLabel35.setBackground(new java.awt.Color(54, 73, 94));
        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("          INGRESAR");
        jPanel12.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 20, 160, 33));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-user-male-32.png"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
        });
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 50));

        jLabel37.setBackground(new java.awt.Color(54, 73, 94));
        jLabel37.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("USUARIO");
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
        });
        jPanel12.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 33));

        jPanel4.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 60));

        jPanel13.setBackground(new java.awt.Color(49, 52, 67));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(54, 73, 94));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EDITAR PRESTAMO");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        jPanel13.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 34));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foldermax.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
        });
        jPanel13.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 40, 40));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config.png"))); // NOI18N
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        jLabel39.setBackground(new java.awt.Color(54, 73, 94));
        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("CONFIGURACION");
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 34));

        jLabel40.setBackground(new java.awt.Color(54, 73, 94));
        jLabel40.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("EDITAR USUARIO");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
        });
        jPanel13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 54, -1, 40));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-admin-settings-male-32.png"))); // NOI18N
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
        });
        jPanel13.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 40, 50));

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 50));

        jPanel14.setBackground(new java.awt.Color(49, 52, 67));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(54, 73, 94));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CALCULAR MORA");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        jPanel14.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 34));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mora.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });
        jPanel14.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 40, -1));

        jLabel42.setBackground(new java.awt.Color(54, 73, 94));
        jLabel42.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("LIBROS POPULARES");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel42MouseEntered(evt);
            }
        });
        jPanel14.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 160, 34));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star.png"))); // NOI18N
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel43MouseEntered(evt);
            }
        });
        jPanel14.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, -1));

        jLabel44.setBackground(new java.awt.Color(54, 73, 94));
        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("INFORMACION");
        jPanel14.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 34));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info.png"))); // NOI18N
        jPanel14.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, -1));

        jPanel4.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 50));

        jPanel15.setBackground(new java.awt.Color(49, 52, 67));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prestamos.png"))); // NOI18N
        jPanel15.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 50));

        jLabel10.setBackground(new java.awt.Color(54, 73, 94));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRESTAMOS");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel15.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 50));

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 230, 50));

        jPanel10.setBackground(new java.awt.Color(49, 52, 67));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-arrow-32.png"))); // NOI18N
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 13, 30, -1));

        jLabel8.setBackground(new java.awt.Color(54, 73, 94));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DEVOLUCIONES");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 13, -1, 34));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 230, 60));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 450));

        jPanel9.setBackground(new java.awt.Color(39, 41, 54));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 710, 950, 60));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, -1));

        jPanel5.setBackground(new java.awt.Color(49, 52, 67));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 990, 680));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 720));

        jPanel6.setBackground(new java.awt.Color(39, 41, 54));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(54, 73, 94));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Proyecto");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel21.setBackground(new java.awt.Color(151, 153, 150));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(151, 153, 150));
        jLabel21.setText("JAVA");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weibo.png"))); // NOI18N
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-minimize-window-32.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 30, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-maximize-window-32.png"))); // NOI18N
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 30, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 40));

        jPanel7.setBackground(new java.awt.Color(39, 41, 54));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setBackground(new java.awt.Color(54, 73, 94));
        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Proyecto");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel27.setBackground(new java.awt.Color(151, 153, 150));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(151, 153, 150));
        jLabel27.setText("JAVA");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/weibo.png"))); // NOI18N
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-minimize-window-32.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 30, 40));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-maximize-window-32.png"))); // NOI18N
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 30, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 40));

        jPanel17.setBackground(new java.awt.Color(39, 41, 54));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(39, 41, 54));

        label4.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel17.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 720, 1230, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        jPanel10.setBackground(new Color(39,41,54));
        jLabel5.setBackground(new Color(39,41,54));
        jPanel11.setBackground(new Color(49,52,67));
        jLabel6.setBackground(new Color(49,52,67));
        jPanel12.setBackground(new Color(49,52,67));
        jLabel7.setBackground(new Color(49,52,67));
        jPanel13.setBackground(new Color(49,52,67));
        jLabel8.setBackground(new Color(49,52,67));
        jPanel14.setBackground(new Color(49,52,67));
        jLabel9.setBackground(new Color(49,52,67));
        jPanel15.setBackground(new Color(49,52,67));
        jLabel10.setBackground(new Color(49,52,67));
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        jPanel11.setBackground(new Color(39,41,54));
        jLabel6.setBackground(new Color(39,41,54));
        jPanel10.setBackground(new Color(49,52,67));
        jLabel5.setBackground(new Color(49,52,67));
        jPanel12.setBackground(new Color(49,52,67));
        jLabel7.setBackground(new Color(49,52,67));
        jPanel13.setBackground(new Color(49,52,67));
        jLabel8.setBackground(new Color(49,52,67));
        jPanel14.setBackground(new Color(49,52,67));
        jLabel9.setBackground(new Color(49,52,67));
        jPanel15.setBackground(new Color(49,52,67));
        jLabel10.setBackground(new Color(49,52,67));
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        
        
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        
        
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        
    }//GEN-LAST:event_jPanel14MouseClicked

    private void abrirMenu_ingresar(){
        jPanel12.setBackground(new Color(39,41,54));
        jLabel7.setBackground(new Color(39,41,54));
        jPanel11.setBackground(new Color(49,52,67));
        jLabel6.setBackground(new Color(49,52,67));
        jPanel10.setBackground(new Color(49,52,67));
        jLabel5.setBackground(new Color(49,52,67));
        jPanel13.setBackground(new Color(49,52,67));
        jLabel8.setBackground(new Color(49,52,67));
        jPanel14.setBackground(new Color(49,52,67));
        jLabel9.setBackground(new Color(49,52,67));
        jPanel15.setBackground(new Color(49,52,67));
        jLabel10.setBackground(new Color(49,52,67));
        
        int w= jPanel12.getSize().width;
        int y= jPanel12.getSize().height;
        if(y!=560)
        jPanel12.setSize(w, y+500);
    }
    
    private void cerrarMenu_ingresar(){
        jPanel12.setBackground(new Color(49,52,67));
        jLabel7.setBackground(new Color(49,52,67));
        
        int w= jPanel12.getSize().width;
        int y= jPanel12.getSize().height;
        
        if(y==560)
        jPanel12.setSize(w, y-500);
    }
    
    
    
    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        jPanel15.setBackground(new Color(39,41,54));
        jLabel10.setBackground(new Color(39,41,54));
        jPanel12.setBackground(new Color(49,52,67));
        jLabel7.setBackground(new Color(49,52,67));
        jPanel11.setBackground(new Color(49,52,67));
        jLabel6.setBackground(new Color(49,52,67));
        jPanel10.setBackground(new Color(49,52,67));
        jLabel5.setBackground(new Color(49,52,67));
        jPanel13.setBackground(new Color(49,52,67));
        jLabel8.setBackground(new Color(49,52,67));
        jPanel14.setBackground(new Color(49,52,67));
        jLabel9.setBackground(new Color(49,52,67));
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        abrirMenu_ingresar();
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        jPanel12.setBackground(new Color(49,52,67));
        jLabel7.setBackground(new Color(49,52,67));
        jPanel11.setBackground(new Color(49,52,67));
        jLabel6.setBackground(new Color(49,52,67));
        jPanel10.setBackground(new Color(49,52,67));
        jLabel5.setBackground(new Color(49,52,67));
        jPanel13.setBackground(new Color(49,52,67));
        jLabel8.setBackground(new Color(49,52,67));
        jPanel14.setBackground(new Color(49,52,67));
        jLabel9.setBackground(new Color(49,52,67));
        jPanel15.setBackground(new Color(49,52,67));
        jLabel10.setBackground(new Color(49,52,67));
        
        int w= jPanel12.getSize().width;
        int y= jPanel12.getSize().height;
        
        jPanel12.setSize(w, y-500);
    }//GEN-LAST:event_jPanel12MouseExited

    private void abrirMenu_configurar(){
        jPanel13.setBackground(new Color(39,41,54));
        jLabel8.setBackground(new Color(39,41,54));
        jPanel12.setBackground(new Color(49,52,67));
        jLabel7.setBackground(new Color(49,52,67));
        jPanel11.setBackground(new Color(49,52,67));
        jLabel6.setBackground(new Color(49,52,67));
        jPanel10.setBackground(new Color(49,52,67));
        jLabel5.setBackground(new Color(49,52,67));
        jPanel14.setBackground(new Color(49,52,67));
        jLabel9.setBackground(new Color(49,52,67));
        jPanel15.setBackground(new Color(49,52,67));
        jLabel10.setBackground(new Color(49,52,67));
        
        int w= jPanel13.getSize().width;
        int y= jPanel13.getSize().height;
        if(y!=550)
        jPanel13.setSize(w, y+500);
    }
    
    private void cerrarMenu_configurar(){
        jPanel13.setBackground(new Color(49,52,67));
        jLabel8.setBackground(new Color(49,52,67));
        
        int w= jPanel13.getSize().width;
        int y= jPanel13.getSize().height;
        if(y==550)
        jPanel13.setSize(w, y-500);
    }
    
    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        abrirMenu_configurar();
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        cerrarMenu_configurar();
    }//GEN-LAST:event_jPanel13MouseExited

    private void abrirMenu_informacion(){
        jPanel14.setBackground(new Color(39,41,54));
        jLabel9.setBackground(new Color(39,41,54));
        jPanel12.setBackground(new Color(49,52,67));
        jLabel7.setBackground(new Color(49,52,67));
        jPanel11.setBackground(new Color(49,52,67));
        jLabel6.setBackground(new Color(49,52,67));
        jPanel10.setBackground(new Color(49,52,67));
        jLabel5.setBackground(new Color(49,52,67));
        jPanel13.setBackground(new Color(49,52,67));
        jLabel8.setBackground(new Color(49,52,67));
        jPanel15.setBackground(new Color(49,52,67));
        jLabel10.setBackground(new Color(49,52,67));
        
        int w= jPanel14.getSize().width;
        int y= jPanel14.getSize().height;
        if(y!=550)
        jPanel14.setSize(w, y+500);
    }
    
    private void cerrarMenu_informacion(){
        jPanel14.setBackground(new Color(49,52,67));
        jLabel9.setBackground(new Color(49,52,67));
        
        int w= jPanel14.getSize().width;
        int y= jPanel14.getSize().height;
        if(y==550)
        jPanel14.setSize(w, y-500);
    }
    
    
    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        abrirMenu_informacion();
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        cerrarMenu_configurar();
    }//GEN-LAST:event_jPanel14MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Login nuevo_login = new Login();
        nuevo_login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void mostrarPanel_AgregarUsuario() throws SQLException{
                  Connection con =null;
        try{
            con = getConection();
            ps = con.prepareStatement("Select tipodeusuario from usuarios where carnet=?");
            ps.setString(1,this.carnet);
                    rs = ps.executeQuery();
                    rs.next();
                    if (rs.getInt("tipodeusuario") == 3){
        this.jPanel5.removeAll();
        IngresarUsuario nuevo_usuario = new IngresarUsuario();
        this.jPanel5.setLayout(new FlowLayout());
        this.jPanel5.add(nuevo_usuario);
        SwingUtilities.updateComponentTreeUI(this);        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No puedes ingresar aqui");
                    }
        } 
        catch(Exception e){
        } 
    }
    
    private void mostrarPanel_EditarUsuario(){
                 Connection con =null;
        try{
            con = getConection();
            ps = con.prepareStatement("Select tipodeusuario from usuarios where carnet=?");
            ps.setString(1,this.carnet);
                    rs = ps.executeQuery();
                    rs.next();
                    if (rs.getInt("tipodeusuario") == 3){
         this.jPanel5.removeAll();
        EditarUsuario editar = new EditarUsuario();
        this.jPanel5.setLayout(new FlowLayout());
        this.jPanel5.add(editar);
        SwingUtilities.updateComponentTreeUI(this);  }
                    else{
                        JOptionPane.showMessageDialog(null, "No puedes ingresar aqui");
                    }
        } 
        catch(Exception e){
        } 
       
    }
    
    private void mostrarPanel_EditarPrestamo(){
         Connection con =null;
        try{
            con = getConection();
            ps = con.prepareStatement("Select tipodeusuario from usuarios where carnet=?");
            ps.setString(1,this.carnet);
                    rs = ps.executeQuery();
                    rs.next();
                    if (rs.getInt("tipodeusuario") == 3){
         this.jPanel5.removeAll();
        EditarPrestamo editar = new EditarPrestamo();
        this.jPanel5.setLayout(new FlowLayout());
        this.jPanel5.add(editar);
        SwingUtilities.updateComponentTreeUI(this); }
                    else{
                        JOptionPane.showMessageDialog(null, "No puedes ingresar aqui");
                    }
        } 
        catch(Exception e){
        } 
       
    
       
    }
    
    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        try {
            mostrarPanel_AgregarUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(FrameEncargado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel37MouseClicked

    private void mostrarPanel_CalcularMora(){
       
        this.jPanel5.removeAll();
        CalcularMora mora = new CalcularMora();
        this.jPanel5.setLayout(new FlowLayout());
        this.jPanel5.add(mora);
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    private void mostrarPanel_LibrosPopulares(){
        this.jPanel5.removeAll();
        LibrosPopulares libros = new LibrosPopulares();
        this.jPanel5.setLayout(new FlowLayout());
        this.jPanel5.add(libros);
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    private void mostrarPanel_AgregarCategoria(){
        
        this.jPanel5.removeAll();
        IngresarCategoria nueva_categoria = new IngresarCategoria();
        this.jPanel5.setLayout(new FlowLayout());
        this.jPanel5.add(nueva_categoria);
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        mostrarPanel_AgregarCategoria();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
        abrirMenu_ingresar();
    }//GEN-LAST:event_jLabel37MouseEntered

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        abrirMenu_ingresar();
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        cerrarMenu_ingresar();
        cerrarMenu_configurar();
        cerrarMenu_informacion();
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        abrirMenu_ingresar();
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        mostrarPanel_AgregarCategoria();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void mostrarPanel_Ejemplar(){
         Connection con =null;
        try{
            con = getConection();
            ps = con.prepareStatement("Select tipodeusuario from usuarios where carnet=?");
            ps.setString(1,this.carnet);
                    rs = ps.executeQuery();
                    rs.next();
                    if (rs.getInt("tipodeusuario") == 3){
         this.jPanel5.removeAll();
        IngresarEjemplar nuevo_ejemplar = new IngresarEjemplar();
        this.jPanel5.setLayout(new FlowLayout());
        this.jPanel5.add(nuevo_ejemplar);
        SwingUtilities.updateComponentTreeUI(this); }
                    else{
                        JOptionPane.showMessageDialog(null, "No puedes ingresar aqui");
                    }
        } 
        
        catch(Exception e){
        } 
        
        
    }
    
    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        mostrarPanel_Ejemplar();
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        abrirMenu_ingresar();
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        abrirMenu_ingresar();
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        abrirMenu_ingresar();
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
        abrirMenu_configurar();
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
        abrirMenu_configurar();
    }//GEN-LAST:event_jLabel41MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        abrirMenu_configurar();
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        abrirMenu_configurar();
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
       abrirMenu_informacion();
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        abrirMenu_informacion();
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseEntered
        abrirMenu_informacion();
    }//GEN-LAST:event_jLabel42MouseEntered

    private void jLabel43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseEntered
        abrirMenu_informacion();
    }//GEN-LAST:event_jLabel43MouseEntered

    private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
        abrirMenu_ingresar();
    }//GEN-LAST:event_jLabel34MouseEntered

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
     try {
         mostrarPanel_AgregarUsuario();
     } catch (SQLException ex) {
         Logger.getLogger(FrameEncargado.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
       mostrarPanel_Ejemplar();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        mostrarPanel_EditarUsuario();
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        mostrarPanel_EditarUsuario();
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        mostrarPanel_EditarPrestamo();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        mostrarPanel_EditarPrestamo();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        mostrarPanel_CalcularMora();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        mostrarPanel_CalcularMora();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        mostrarPanel_LibrosPopulares();
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        mostrarPanel_LibrosPopulares();
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        mostrarPanel_IngresoPrestamos();
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEncargado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables

    private void mostrarPanel_IngresoPrestamos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.jPanel5.removeAll();
        IngresarPrestamo ingresar = new IngresarPrestamo();
        this.jPanel5.setLayout(new FlowLayout());
        this.jPanel5.add(ingresar);
        SwingUtilities.updateComponentTreeUI(this);
        
    }
}
