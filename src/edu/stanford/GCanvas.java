package edu.stanford;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @Auther: yuguo
 * @Date: 2022/1/6 - 01 - 06 - 19:50
 * @Description: edu.stanford
 * @version: 1.0
 */
public class GCanvas extends JComponent {
    public GCanvas() {
        contents = new ArrayList<GObject>();
    }

    public GCanvas(double width,double height){
        this();
        setSize((int)Math.round(width),(int)Math.round(height));
        setPreferredSize(getSize());
    }
    public void add(GObject gobj){
        synchronized (contents){
            contents.add(gobj);
            gobj.gc = this;
        }
        repaint();
    }
    @Override
    public void paintComponent(Graphics g){
        synchronized (contents){
            for(GObject gobj : contents){
      //          gobj.paint(g);
            }
        }
    }
    private ArrayList<GObject> contents;
}
