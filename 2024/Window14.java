import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Window14  extends Window11 implements ActionListener{

    protected JMenu colorMenu;
    protected JMenuItem customMI;
    protected JColorChooser choosingColor;

    public Window14(String title){
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
        Window14 msw = new Window14("My Window 14");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeature();
    }

    protected void addListeners(){
        super.addListeners();

        customMI.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e2){
        super.actionPerformed(e2);
        String command = e2.getActionCommand();
        if(command.equals("Custom"){
            choosingColor = new JColorChooser(dataTA.getForeground());
            Color cl = choosingColor.getColor();
            nameTF.setForeground(cl);
        }
    }
}
