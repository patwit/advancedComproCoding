import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Window extends JFrame{
    // ประกาศตัวแปร
    protected JButton resetButton, okButton;
    protected JPanel mainPanel;

    public Window(String title){
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
        Window msw = new Window("My Window");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void addComponents(){
        resetButton = new JButton("Reset");
        okButton = new JButton("OK");
        mainPanel = new JPanel();
        mainPanel.add(resetButton);
        mainPanel.add(okButton);

        add(mainPanel);
    }

    protected void setFrameFeature(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

}
