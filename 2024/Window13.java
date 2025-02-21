import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Window13 extends Window12 implements MouseListener{
     public Window13(String title){
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater((new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        }));
    }

    protected static void createAndShowGUI(){
        Window13 msw = new Window13("My Window 13");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeature();
    }

    public void addListeners(){
        super.addListeners();
        myImage.addMouseListener(this);
    }

    public void mousePressed(MouseEvent e){
        JOptionPane.showMessageDialog(this, "Type: " + e.getX() + "," + e.getY() , " ", JOptionPane.INFORMATION_MESSAGE);
    }
    public void mouseReleased(MouseEvent e){
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(this, "Type: " + e.getX() + "," + e.getY() , " ", JOptionPane.INFORMATION_MESSAGE);
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JOptionPane.showMessageDialog(this, "Type: " + e.getX() + "," + e.getY() , " ", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JOptionPane.showMessageDialog(this, "Type: " + e.getX() + "," + e.getY() , " ", JOptionPane.INFORMATION_MESSAGE);
    }
}
