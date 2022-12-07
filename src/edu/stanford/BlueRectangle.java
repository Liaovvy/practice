package edu.stanford;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: yuguo
 * @Date: 2022/1/5 - 01 - 05 - 20:40
 * @Description: edu.stanford
 * @version: 1.0
 */
public class BlueRectangle {
    public void run(){
        JFrame frame = new JFrame("BlueRectangle");
        frame.add(new BlueRectangleCanvas());
        frame.setBackground(Color.WHITE);
        frame.setSize(400,200);
        frame.setVisible(true);
    }
    private static class BlueRectangleCanvas extends JComponent{
        public void paintComponent(Graphics g){
            g.setColor(Color.blue);
            g.fillRect(100,50,200,100);
        }
    }

    public static void main(String[] args) {
        new BlueRectangle().run();
    }
}

