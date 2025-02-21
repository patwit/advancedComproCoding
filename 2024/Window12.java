import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Window12 extends Window11 implements KeyListener{
     public Window12(String title){
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
        Window12 msw = new Window12("My Window 12");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeature();
    }

    protected void addListeners(){
        super.addListeners();
        nameTF.addKeyListener(this);
    }

    public void keyTyped(KeyEvent e){
        JOptionPane.showMessageDialog(this, "Type: " + e.getKeyChar() , "Key Typed", JOptionPane.INFORMATION_MESSAGE);
    }
    public void keyPressed(KeyEvent e){
        JOptionPane.showMessageDialog(this, "Press: " + e.getKeyChar() , "Key Pressed", JOptionPane.INFORMATION_MESSAGE);
    }

    public void keyReleased(KeyEvent e){
        JOptionPane.showMessageDialog(this, "Release: " + e.getKeyChar() , "Key Released", JOptionPane.INFORMATION_MESSAGE);
    }

}
