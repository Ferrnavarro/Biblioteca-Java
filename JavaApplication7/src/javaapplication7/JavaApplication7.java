/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Login form1 = new Login();
        form1.setLocationRelativeTo(null);
        form1.setVisible(true);
    }
}
