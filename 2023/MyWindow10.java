import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyWindow10 extends MyWindow8{

    protected JMenuItem savMenuItem, customColor, blueText;
    protected JSlider slider;

    public MyWindow10(String title) {
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
        MyWindow10 myWindow = new MyWindow10("My Window 10");
        myWindow.addComponents();
        myWindow.addMenus();
        myWindow.setFrameFeature();
    }

    public void addMenus(){
        super.addMenus();
        savMenuItem = new JMenuItem("Save");
        customColor = new JMenuItem("Custom");
        blueText = new JMenuItem("Blue");

        fileMenu.add(savMenuItem);
        editMenu.add(blueText);
        editMenu.add(customColor);
    }

    public void addComponents(){
        super.addComponents();
        slider = new JSlider(0, 20);
        slider.setValue(0);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setPaintTicks(true);

        buttonPanel2.add(slider, BorderLayout.CENTER);
    }
}
