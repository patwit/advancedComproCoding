import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Window11 extends Window10 implements ActionListener{
    public Window11(String title){
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
        Window11 msw = new Window11("My Window 11");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeature();
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        openMI.addActionListener(this);
        saveMI.addActionListener(this);
        copyMI.addActionListener(this);
        valueOnlyMI.addActionListener(this);
        defaultPasteMI.addActionListener(this);
    }


     @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object src = e.getSource();

        if (src == openMI) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Opened: " + selectedFile.getAbsolutePath(), "File Opened", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (src == saveMI) {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(this, "Saved: " + selectedFile.getAbsolutePath(), "File Saved", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JMenuItem menuItem = (JMenuItem) src;
            JOptionPane.showMessageDialog(this, "Menu Item Pressed: " + menuItem.getText(), "Menu Selection", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
