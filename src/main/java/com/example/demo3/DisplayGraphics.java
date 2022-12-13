package com.example.demo3;

import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas{


    public void paint(Graphics g) {

        setBackground(Color.white);

        g.drawOval(150,300,250,200);
        g.drawOval(210,120,120,90);
        g.drawOval(170,180,200,150);
        g.setColor(Color.WHITE);
        g.fillOval(180,225,182,100);
        g.fillOval(211,121,118,88);
        g.setColor(Color.BLACK);
        g.fillOval(271,290,10,10);
        g.fillOval(271,270,10,10);
        g.fillOval(271,250, 10,10);
        g.fillOval(251,157, 10,10);
        g.fillOval(291,157, 10,10);
        g.fillOval(300,180, 10,10);
        g.fillOval(287,186, 10,10);
        g.fillOval(268,186, 10,10);
        g.fillOval(250,180, 10,10);
        int xpoints[] = {280,350,280};
        int ypoints[] = {170, 173,177};
        int npoints = 3;
        g.fillPolygon(xpoints, ypoints, npoints);
    }
    public static void main(String[] args) {
        DisplayGraphics m=new DisplayGraphics();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(600,600);
        f.setVisible(true);
    }

}  