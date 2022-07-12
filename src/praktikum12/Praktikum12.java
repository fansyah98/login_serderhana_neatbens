/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum12;

/**
 * 
 * 
 * 
 *
 * @author LAB-MULTIMEDIA
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


        
public class Praktikum12 extends JPanel {

    private final Image image;
    
    public Praktikum12()
    {
        image = new ImageIcon(getClass().getResource("t.jpg")).getImage();
    }
    
    protected void pain (Graphics gambar){
        super.paintComponent(gambar);
        Graphics2D gd = (Graphics2D) gambar.create();
        gd.drawImage(image , 0, 0, getWidth() , getHeight() , null ) ; 
        gd.dispose();
        
    }
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
