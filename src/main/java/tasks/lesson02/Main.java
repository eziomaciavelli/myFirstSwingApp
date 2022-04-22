package tasks.lesson02;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

//JComponent
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new myComponent());
    }

    static class myComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("HB Retail", 20, 30);
            Point2D p1 = new Point2D.Double(70, 70);
            Point2D p2 = new Point2D.Double(170, 170);
            Line2D l2 = new Line2D.Double(p1, p2);
            g2.draw(l2);
            Ellipse2D el = new Ellipse2D.Double(70, 70, 170, 170);
            g2.setPaint(Color.red);
            g2.draw(el);
            Rectangle2D r2 = new Rectangle2D.Double(70, 70, 170, 170);
            g2.draw(r2);
            Image image = new ImageIcon("img/hack.png").getImage();
            g2.drawImage(image, 30, 50, null);

        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / -250, 250, dimension.width / 2 + 150, 500);
        return jFrame;
    }
}
