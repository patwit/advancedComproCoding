import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class Window6 extends Window5{
    public Window6(String title){
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
        Window6 msw = new Window6("My Window 6");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeature();
    }

    @Override
    protected void addMenus() {
        super.addMenus();
        
       ImageIcon openIcon = new ImageIcon(getClass().getResource("/images/open_icon.png"));
       
        openMI.setIcon(openIcon);
        
    }

}
