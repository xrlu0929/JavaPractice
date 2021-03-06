/**
 * Created by annaxlu on 7/6/17.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleGui implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui gui = new SimpleGui();
        gui.go();
    }
    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change colors");
        button.addActionListener(this);

        MyDrawPanel d = new MyDrawPanel(); //MyDrawPanel is another class, below.

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, d);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public void actionPerformed (ActionEvent event) {
        frame.repaint();
    }


}

class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 225);
        int green = (int) (Math.random() * 225);
        int blue = (int) (Math.random() * 225);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 225);
        green = (int) (Math.random() * 225);
        blue = (int) (Math.random() * 225);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }

}
