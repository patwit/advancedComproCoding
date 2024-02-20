import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ReadImage extends JPanel{

    BufferedImage img;
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }

    public ReadImage() {
        try {
            img = ImageIO.read(getClass().getResource("./mickeymouse.jpg"));
        } catch (IOException e) {
           e.printStackTrace(System.err);
        }
    }
}
