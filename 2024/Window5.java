import javax.swing.SwingUtilities;

public class Window5 extends Window3{
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
}
