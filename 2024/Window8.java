import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
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
        Window8 msw = new Window8("My Window 8");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeature();
    }

    protected void addListeners() {
        resetButton.addActionListener(this);
        okButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        //String command = e.getActionCommand();
        if (src == resetButton) {
            nameTF.setText("");
        } else if (src == okButton){
            System.out.println("Name : " + nameTF.getText() + "\npassword : " + passwordTF.getText());
            String temp = "Name : " + nameTF.getText() + "\npassword : " + passwordTF.getText();
            nameTF.setText("");
            passwordTF.setText("");
            JOptionPane.showMessageDialog(this, temp, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }


}
