import javax.swing.*;
import java.awt.*;

public class UIExample2 extends JFrame{

    // name : ___________
    //  cancel   OK

    protected JButton okButton, cancelButton;
    protected JPanel buttonPanel, namePanel, mainPanel;
    protected JLabel nameLabel;
    protected JTextField nameTextField;

    public UIExample2(String string){
        super(string);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater((new Runnable() {
            public void run(){
                createAndShowGUI();
            }
        }));
    }

    protected static void createAndShowGUI(){
        UIExample2 msw = new UIExample2("My Simple Window");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void addComponents(){
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        nameLabel = new JLabel("Name : ");
        nameTextField = new JTextField(20);

        buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);
        
        namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(mainPanel);
    }

    protected void setFrameFeature(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
}