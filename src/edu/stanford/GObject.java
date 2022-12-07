package edu.stanford;

import java.awt.*;

/**
 * @Auther: yuguo
 * @Date: 2022/1/6 - 01 - 06 - 19:51
 * @Description: edu.stanford
 * @version: 1.0
 */
public abstract class GObject {
    public GObject() {
        color = Color.BLACK;
    }
    public void setLocation(double x,double y){
        this.x = x;
        this.y = y;
        repaint();
    }

    public void setColor(Color color){
        this.color = color;
        repaint();
    }
    private void repaint() {
        if(gc != null) gc.repaint();
    }
    protected int round(double x){
        return (int)Math.round(x);
    }

    protected double x;
    protected double y;
    protected Color color;
    protected GCanvas gc;
}
