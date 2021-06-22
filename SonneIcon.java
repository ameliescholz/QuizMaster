import java.awt.*;
import javax.swing.*;

public class SonneIcon implements Icon
{
      private final int WIDTH = 300;
      private final int HEIGHT = 300;

    private final BasicStroke stroke = new BasicStroke(5);

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

        doDrawing(g, x, y);
    }

    public void doDrawing(Graphics g, int x, int y) {

        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setColor(Color.yellow);
        g2d.fillOval(x, y, WIDTH, HEIGHT);
        
        g2d.dispose();
    }

    @Override
    public int getIconWidth() {
        return WIDTH;
    }

    @Override
    public int getIconHeight() {
        return HEIGHT;
    }
}

