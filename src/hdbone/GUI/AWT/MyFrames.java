package hdbone.GUI.AWT;

import java.awt.*;

// 多个Frame
public class MyFrames {
    public static void main(String[] args) {
        Myframe myframe1=new Myframe(100,100,200,200,Color.lightGray);
        Myframe myframe2=new Myframe(300,100,200,200,Color.blue);
        Myframe myframe3=new Myframe(100,300,200,200,Color.pink);
        Myframe myframe4=new Myframe(300,300,200,200,Color.white);
    }
}

class Myframe extends Frame {
    static int id=0;
    public Myframe(int x,int y,int w,int h,Color bgc)
    {
        super("Myframe"+(++id));
        setBackground(bgc);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
