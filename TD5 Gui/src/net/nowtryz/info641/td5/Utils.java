package net.nowtryz.info641.td5;

import javax.swing.*;
import java.awt.*;

public class Utils {
    public static JFrame basicFrame(String name) {
        JFrame frame = new JFrame(name);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

        return frame;
    }
}
