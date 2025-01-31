import javax.swing.*;
import java.awt.*;

public class MySimpleWindow2 extends JFrame{

    protected JButton cancelButton, okButton;
    protected JPanel mainPanel;

    public MySimpleWindow2(String title){
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
        MySimpleWindow2 msw = new MySimpleWindow2("My Simple Window");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void addComponents(){
        cancelButton = new JButton("Cancel");
        okButton = new JButton("OK");

        mainPanel = new JPanel();
        mainPanel.add(cancelButton);
        mainPanel.add(okButton);

        add(mainPanel);
    }

    protected void setFrameFeature(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
}
