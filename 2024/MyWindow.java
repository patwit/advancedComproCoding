import javax.swing.*;
import java.awt.*;


public class MyWindow extends MySimpleWindow2 {

    protected JPanel midPanel, buttonPanel;
    protected JLabel nameLabel, passwordLabel; 
    protected JTextField nameTF, passwordTF;


    public MyWindow(String title){
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
        MyWindow msw = new MyWindow("My Window");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void addComponents(){
        super.addComponents();

        buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);

        midPanel= new JPanel(new GridLayout(2,2));
        nameLabel = new JLabel("User Name:");
        passwordLabel = new JLabel("Passwoird :");
        nameTF = new JTextField(10);
        passwordTF = new JTextField(10);
        midPanel.add(nameLabel);
        midPanel.add(nameTF);
        midPanel.add(passwordLabel);
        midPanel.add(passwordTF);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(midPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }
}
