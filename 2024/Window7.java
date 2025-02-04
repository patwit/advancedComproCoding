import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class Window7 extends Window6{

    protected JPanel imagePanel, newBottomPanel;
    protected ReadWindowImage myImage;

    public Window7(String title){
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
        Window7 msw = new Window7("My Window 7");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeature();
    }

    @Override
    protected void addComponents(){
        super.addComponents();

        myImage = new ReadWindowImage("kku.jpg");
        myImage.setPreferredSize(new Dimension(600, 450));
        newBottomPanel = new JPanel(new BorderLayout());
        newBottomPanel.add(myImage, BorderLayout.NORTH);
        newBottomPanel.add(buttonPanel, BorderLayout.CENTER);

        mainPanel.add(newBottomPanel, BorderLayout.SOUTH);

    }

}
