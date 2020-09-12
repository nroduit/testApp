package org.test;

import java.awt.BorderLayout;

import javax.swing.*;

public class TestApp {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Test App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel label = new JLabel(new ImageIcon(TestApp.class.getResource("binary.jpg")));
            JPanel panel = new JPanel();
            panel.add(label);
            BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
            panel.setLayout(boxLayout);

            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.pack();
            frame.toFront();
            frame.setVisible(true);
        });
    }
}