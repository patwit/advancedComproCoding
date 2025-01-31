import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Window3 extends Window2{

    protected JLabel datLabel;
    protected JPanel dataPanel;
    protected JTextArea dataTA;
    protected JScrollPane dataTAScroller;

    public Window3(String title){
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
        Window3 msw = new Window3("My Window 3");
        msw.addComponents();
        msw.setFrameFeature();
    }

    protected void addComponents(){
        super.addComponents();
        datLabel = new JLabel("Data : ");
        dataTA = new JTextArea(5, 15);
        dataTA.setLineWrap(true);
        dataTA.setWrapStyleWord(true);
        dataTAScroller = new JScrollPane(dataTA);
        dataPanel = new JPanel();
        dataPanel.add(datLabel);
        dataPanel.add(dataTAScroller);

        mainPanel.add(dataPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
    }
}
