import javax.swing.JPanel;

public class Image extends JPanel{
    private Image image; // The image to be drawn

    /**
     * Optional constructor that takes an image path
     */
    public Image(String imagePath) {
        setImage(imagePath);
    }

    /**
     * If you want to set or change the image after creation, call this method.
     */
    public void setImage(String imagePath) {
        // Load the image using the default toolkit
        image = Toolkit.getDefaultToolkit().getImage(imagePath);
        // Trigger a repaint so the panel is updated
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Always call the superclass version first

        // Draw the image if it's not null
        if (image != null) {
            // For example, draw it centered in the panel
            int x = (getWidth() - image.getWidth(this)) / 2;
            int y = (getHeight() - image.getHeight(this)) / 2;
            g.drawImage(image, x, y, this);
        }
    }
}
