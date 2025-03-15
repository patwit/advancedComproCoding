import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Window15 extends JFrame implements ItemListener {

    private JComboBox<String> comboBox;
    private JLabel instructionLabel;
    private Image imageLabel;

    public Window15(String title) {
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
        Window15 msw = new Window15("My Window 15");
        msw.addComponents();
        //msw.addListeners();
        msw.setFrameFeature();
    }

    public void addComponents(){
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        instructionLabel = new JLabel("Select an animal: ");
        String[] animals = {"Cat", "Parot", "Toger"};
        comboBox = new JComboBox<>(animals);
        comboBox.addItemListener(this);
        topPanel.add(instructionLabel);
        topPanel.add(comboBox);

        // Create a label for displaying the image, center it in the frame.
        imageLabel = new JLabel();
        addImage("cat");
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setPreferredSize(new Dimension(800,600));
        
        // Add panels to the frame.
        add(topPanel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
    }
  

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }

    protected void setFrameFeature(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
}