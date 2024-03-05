import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyWindow11 extends MyWindow10 implements ActionListener, ChangeListener, ListSelectionListener{


    JFileChooser fileChooser;

    public MyWindow11(String title) {
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
        MyWindow11 myWindow = new MyWindow11("My Window 11");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.addListeners();
        myWindow.setFrameFeature();
    }

    protected void addListeners() {
        savMenuItem.addActionListener(this);
        newFile.addActionListener(this);
        countrieslist.addListSelectionListener(this);
        slider.addChangeListener(this);
        blueText.addActionListener(this);
        customColor.addActionListener(this);
        exitMenu.addActionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        boolean isAdjusting = e.getValueIsAdjusting();
        StringBuffer message = new StringBuffer();
        if (!isAdjusting) {
            List<String> selectedCountries = countrieslist.getSelectedValuesList();
            int numSelected = selectedCountries.size();
            for (int i = 0; i < numSelected; i++) {
                message.append(selectedCountries.get(i) + " ");
            }
            JOptionPane.showMessageDialog(this, "Countries : " + message.toString());
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        if (!source.getValueIsAdjusting()) {
            double value = source.getValue();
            JOptionPane.showMessageDialog(this, "Slider : " + value);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        fileChooser = new JFileChooser();
        if(src == savMenuItem){
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                String filename = file.getName();
                JOptionPane.showMessageDialog(this, 
                            "Save : " + filename);
            }
        } else if(src == newFile){
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                String filename = file.getName();
                JOptionPane.showMessageDialog(this, 
                            "Open : " + filename);
            }
        } else if (src == exitMenu){
            System.exit(1);
        } else if (src == blueText){

        } else if (src == customColor){
            Color newColor = JColorChooser.showDialog(this,"Color : ", ta.getForeground()); // Default to current text color
            if (newColor != null) {
                ta.setForeground(newColor);
            }
        }
    }
}
