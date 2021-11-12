package com.myCompany;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;

public class DesktopApp extends JFrame {
    public static String appName= commonUtility.getName();

    public DesktopApp(){
        super(appName);
        setLayout(new FlowLayout());
        add(new JLabel("welcome to "+appName));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640,480);
        setLocationRelativeTo(null);
    }
    public static void main(String... args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopApp().setVisible(true);
            }
        });
    }
}
