import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Window10 extends Window9 implements ActionListener, ItemListener, ListSelectionListener, ChangeListener{
    public Window10(String title){
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
        Window10 msw = new Window10("My Window 10");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeature();
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        comboBox.addItemListener(this);
        list.addListSelectionListener(this);
        slider.addChangeListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboBox && e.getStateChange() == ItemEvent.SELECTED) {
            JOptionPane.showMessageDialog(this, "Selected ComboBox Item: " + comboBox.getSelectedItem(), "ComboBox Selection", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting() && e.getSource() == list) {
            JOptionPane.showMessageDialog(this, "Selected List Item: " + list.getSelectedValue(), "List Selection", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            JSlider Temp = (JSlider) e.getSource();
            if (!Temp.getValueIsAdjusting()) {
                JOptionPane.showMessageDialog(this, "Slider Value: " + slider.getValue(), "Slider Change", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
