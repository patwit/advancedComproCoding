import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

class MyWindow13 extends MyWindow12 {

    String filename, readData, message;
    public MyWindow13(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        MyWindow13 myWindow = new MyWindow13("My Window 13");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.addListeners();
        myWindow.setFrameFeature();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        fileChooser = new JFileChooser();
        
        if(obj ==  savMenuItem){
            try {
                    int returnVal = fileChooser.showSaveDialog(this);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        File file = fileChooser.getSelectedFile();
                        filename = file.getName();
                    }
                    saveFormData();
                    FileWriter writer = new FileWriter(filename);
                    writer.write(message);
                    writer.close();
                } catch (Exception ex) {
                    System.out.println("Exception is " + ex);
                    JOptionPane.showMessageDialog(this, "Error in writing to file " + filename);
                }
        } else {
            super.actionPerformed(e);
        }
    }

    @Override
    protected void addListeners(){
        super.addListeners();
        savMenuItem.addActionListener(this);
    }

    protected void saveFormData() {
        String name = nameTextField.getText();
        String nationality = nationTF.getText();
        String sport = favSportBox.getSelectedItem().toString();
        String programming = "";
        if (javRadioButton.isSelected()) {
            programming = "Java";
        } else if (pythRadioButton.isSelected()) {
            programming = "Python";
        } else if (cppRadioButton.isSelected()){
            programming = "C++";
        }

        String gender = "";
        if(maleCB.isSelected())
            gender = "Male";
        else if (femalCB.isSelected())
            gender = "Female";
        else if ( unCB.isSelected())
            gender = "Unidentify";
        String note = ta.getText();
        message = "Name : " + name + "\nNationality : " + nationality + "\nFavourite Sport : " 
            + sport + "\nProgramming : " + programming + "\nGender : " + gender + "\nNote : " 
            + note;
    }
}