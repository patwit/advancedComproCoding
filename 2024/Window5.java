import javax.swing.*;

public class Window5 extends Window3{

    protected JMenuBar menuBar;
    protected JMenu fileMenu, editMenu, pasteMI;
    protected JMenuItem openMI, saveMI, copyMI, valueOnlyMI, defaultPasteMI;

    public Window5(String title){
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
        Window5 msw = new Window5("My Window 5");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeature();
    }

    protected void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        openMI = new JMenuItem("open");
        saveMI = new JMenuItem("save");
        copyMI = new JMenuItem("copy");
        pasteMI = new JMenu("paste");
        valueOnlyMI = new JMenuItem("value only");
        defaultPasteMI = new JMenuItem("default paste");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        editMenu.add(copyMI);
        editMenu.add(pasteMI);
        pasteMI.add(valueOnlyMI);
        pasteMI.add(defaultPasteMI);

        setJMenuBar(menuBar);
    }
}
