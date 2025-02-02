import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Window4 extends Window3{

    protected JPanel centerPanel, radioPanel, radioLabelPanel;
    protected JRadioButton javaRB, pythonRB, cppRB;
    protected JLabel favProgramLabel;
    protected ButtonGroup favProgramButtonGroup;

    public Window4(String title){
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
        Window4 msw = new Window4("My Window 4");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void addComponents(){
        super.addComponents();

        javaRB = new JRadioButton("Java");
        pythonRB = new JRadioButton("Python");
        cppRB = new JRadioButton("C++");
        favProgramLabel = new JLabel("Favourite Program Language : ");
        radioPanel = new JPanel();
        radioPanel.add(javaRB);
        radioPanel.add(pythonRB);
        radioPanel.add(cppRB);
        favProgramButtonGroup = new ButtonGroup();
        favProgramButtonGroup.add(javaRB);
        favProgramButtonGroup.add(pythonRB);
        favProgramButtonGroup.add(cppRB);
        radioLabelPanel = new JPanel(new BorderLayout());
        radioLabelPanel.add(favProgramLabel, BorderLayout.NORTH);
        radioLabelPanel.add(radioPanel, BorderLayout.CENTER);
        
        centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(dataPanel, BorderLayout.NORTH);
        centerPanel.add(radioLabelPanel, BorderLayout.CENTER);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
    }
} 

