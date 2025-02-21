import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import java.awt.*;

public class Window9 extends Window8{

    protected JComboBox<String> comboBox;
    protected JList<String> list;
    protected JSlider slider;
    protected JPanel extraPanel, sliderPanel, comboPabel, listPanel;
    protected JLabel sliderLabel, comboLabel, listLabel;


     public Window9(String title){
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
        Window9 msw = new Window9("My Window 9");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeature();
    }

@Override
    protected void addComponents() {
        super.addComponents();
        
        comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        comboLabel = new JLabel("Combo:");
        comboPabel = new JPanel();
        comboPabel.add(comboLabel);
        comboPabel.add(comboBox);
        
        list = new JList<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"});
        listLabel  = new JLabel("List");
        listPanel = new JPanel();
        listPanel.add(listLabel);
        listPanel.add(list);

        slider = new JSlider(0, 100, 50);
        slider = new JSlider(0, 10, 5);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        sliderLabel  = new JLabel("Slider");
        sliderPanel = new JPanel();
        sliderPanel.add(sliderLabel);
        sliderPanel.add(slider);

        extraPanel = new JPanel(new BorderLayout());
        extraPanel.add(comboPabel, BorderLayout.NORTH);
        extraPanel.add(listPanel, BorderLayout.CENTER);
        extraPanel.add(sliderPanel, BorderLayout.SOUTH);
        newBottomPanel.add(extraPanel, BorderLayout.SOUTH);
    }
}
