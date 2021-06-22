import java.awt.*;
import javax.swing.*;
	

public class BaumIcon implements Icon
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

        g2d.setColor(new Color(185,122,87));
        g2d.fillRect(x+50, y+20, 50, 150);
        g2d.setColor(Color.green);
        g2d.fillOval(x, y+20, 70, 70);
        g2d.fillOval(x+30, y, 90, 90);
        g2d.fillOval(x+70, y+20, 70, 70);
        g2d.setColor(new Color(0,128,0));
        g2d.drawOval(x, y+20, 70, 70);
        g2d.drawOval(x+30, y, 90, 90);
        g2d.drawOval(x+70, y+20, 70, 70);
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

