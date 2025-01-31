import java.awt.*;
import javax.swing.*;

public class Window4 extends Window3{

    protected JPanel centerPanel, RadioPanel;
    //protected JRadio

    public Window4(String title){
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
        Window4 msw = new Window4("My Window 4");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void addComponents(){
        super.addComponents();
    }
} 

