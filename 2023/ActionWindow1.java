import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ActionWindow1 extends MyWindow4 implements ActionListener{


    public ActionWindow1(String string) {
        super(string);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        ActionWindow1 myWindow = new ActionWindow1("Action Window");
        myWindow.addComponents();
        myWindow.addListeners();
        myWindow.setFrameFeature();
    }

    protected void addListeners() {
        okButton.addActionListener(this);
        resetButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //if(e.getSource() == okButton){
        if(e.getActionCommand().equals("OK")){
            ta.append(nameTextField.getText() +"\n");
            ta.append(nationTF.getText() + "\n");

            // for radio buttons
            ta.append("Programming : ");
            if(javRadioButton.isSelected())
                ta.append("Java");
            else if(pythRadioButton.isSelected())
                ta.append("Python");
            else if(cppRadioButton.isSelected())
                ta.append("C++");
        } 
        //if(e.getSource() == resetButton)
        if(e.getActionCommand() == "Reset")
        { // reset button
            ta.setText("");
        }
        //if(e.getSource() == cancelButton){
        if(e.getActionCommand() == "Cancel")
        {
            nameTextField.setText("");
            nationTF.setText("");
            javRadioButton.setSelected(true);
            maleCB.setSelected(true);
            femalCB.setSelected(false);
            unCB.setSelected(false);
        }
    }
}
