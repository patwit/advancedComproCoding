import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MyWindow14 extends MyWindow13{

    Player player, readPlayer;
    public MyWindow14(String title) {
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
        MyWindow14 myWindow = new MyWindow14("My Window 14");
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
                    saveFormDataObject();
                    final FileOutputStream fileOut = new FileOutputStream(filename);
                    final ObjectOutputStream out = new ObjectOutputStream(fileOut);
                    out.writeObject(player);
                    out.close();
                    fileOut.close();
                } catch (Exception ex) {
                    System.out.println("Exception is " + ex);
                    JOptionPane.showMessageDialog(this, "Error in writing to file " + filename);
                }
        } else if(obj == newFile){
            System.out.println("Reading object");
            try {
                int returnVal = fileChooser.showOpenDialog(this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    filename = file.getName();
                }
                final FileInputStream fileIn = new FileInputStream(filename);
                final ObjectInputStream in = new ObjectInputStream(fileIn);
                readPlayer = (Player) in.readObject();
                System.out.println("Name : " + readPlayer.getName());
                in.close();
                fileIn.close();
            } catch (Exception ex) {
                System.out.println("Exception is " + ex);
                JOptionPane.showMessageDialog(this, "Error in writing to file " + filename);
            }
        } else
        {
            super.actionPerformed(e);
        }
    }

    protected void saveFormDataObject() {
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

        player = new Player(name, nationality, sport, programming, gender, note);
    }

    
}
