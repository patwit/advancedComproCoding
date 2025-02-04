import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

public class Window8 extends Window7 implements ActionListener{
    public Window8(String title){
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
        Window8 msw = new Window7("My Window 8");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeature();
    }

    public void addListeners() {
        resetButton.addActionListener(this);
        okButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == resetButton) {
        } else if (src == okButton){

        }
    }


}
