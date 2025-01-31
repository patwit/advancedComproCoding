import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Window2 extends Window{

    protected JLabel nameLabel, passwordLabel;
    protected JTextField nameTF, passwordTF;
    protected JPanel topPanel, buttonPanel;


    public Window2(String title){
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
        Window2 msw = new Window2("My Window 2");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void addComponents(){
        super.addComponents();

        nameLabel = new JLabel("Name : ");
        passwordLabel = new JLabel("Password : ");
        nameTF = new JTextField();
        passwordTF = new JTextField();
        topPanel = new JPanel(new GridLayout(2, 2));
        topPanel.add(nameLabel);
        topPanel.add(nameTF);
        topPanel.add(passwordLabel);
        topPanel.add(passwordTF);

        buttonPanel = new JPanel();
        buttonPanel.add(resetButton);
        buttonPanel.add(okButton);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
    }

}
