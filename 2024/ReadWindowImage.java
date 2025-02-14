
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;


public class ReadWindowImage extends JPanel{
    BufferedImage img;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }

    public ReadWindowImage() {
        try {
            img = ImageIO.read(getClass().getResource("./images/Football.jpg"));
        } catch (IOException e) {
           e.printStackTrace(System.err);
        }
    }

    public ReadWindowImage(String fileName) {
        String name = "./images/" + fileName;
        try {
            img = ImageIO.read(getClass().getResource(name));
        } catch (IOException e) {
           e.printStackTrace(System.err);
        }
    }
}