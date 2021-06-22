import java.awt.*;
import javax.swing.*;


public class WolkeIcon implements Icon
{
    private final int WIDTH = 400;
    private final int HEIGHT = 400;

    private final BasicStroke stroke = new BasicStroke(5);

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {

        doDrawing(g, x, y);
    }

    public void doDrawing(Graphics g, int x, int y) {

        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setColor(Color.white);
        g2d.fillOval(x + 130, y + 70, 120, 90);
        g2d.fillOval(x + 20, y + 70, 120, 90);
        g2d.fillOval(x ,y+30,120,90);
        g2d.fillOval(x+100,y+40,120,90);
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

