import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MyWindow9 extends MySimpleWindow{
    
    ReadImage imagePanel;
    JPanel buttonPanel;

    public MyWindow9(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected static void createAndShowGUI() {
        MyWindow9 myWindow = new MyWindow9("Picture Window");
        myWindow.addComponents();
        myWindow.setFrameFeature();
    }

    protected void addComponents(){
        super.addComponents();

        mainPanel.setLayout(new BorderLayout());
        buttonPanel = new JPanel();
        buttonPanel.add(resetButton);
        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);


        imagePanel = new ReadImage();
        imagePanel.setPreferredSize(new Dimension(600, 800));

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(imagePanel, BorderLayout.NORTH);

    }
}
