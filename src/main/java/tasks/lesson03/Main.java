package tasks.lesson03;

import javax.swing.*;
import java.awt.*;

//ActionListener
public class Main {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("HB Reatil Start");
        jPanel.add(jButton);
        jButton.addActionListener(e -> jPanel.setBackground(Color.GREEN));
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}
