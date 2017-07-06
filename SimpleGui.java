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

        MyDrawPanel d = new MyDrawPanel(); //MyDrawPanel is another class, uploaded.

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, d);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    public void actionPerformed (ActionEvent event) {
        frame.repaint();
    }


}

