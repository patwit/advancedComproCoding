import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class MyWindow12 extends MyWindow11 {

    String filename, readData;;
    public MyWindow12(String title) {
        super(title);
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
        MyWindow12 myWindow = new MyWindow12("My Window 12");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.addListeners();
        myWindow.setFrameFeature();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object srcObj = e.getSource();
        fileChooser = new JFileChooser();
        if (srcObj == newFile) {
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                filename = file.getName();
                System.out.println(filename);
            }
            readTxtData();
        } else {
            super.actionPerformed(e);
        }
    }

    protected void readTxtData() {
        System.out.println("Reading file" + filename);
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader r = new BufferedReader(reader);
            readData = "";
            ta.setText("");
            while ((readData = r.readLine()) != null) {
                System.out.println(readData);
            }
            reader.close();
        } catch (Exception ex) {
        }
    }
}
