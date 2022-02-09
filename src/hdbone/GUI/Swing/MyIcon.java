package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

// 图标Icon
public class MyIcon extends JFrame implements Icon {
    private int width;
    private int height;
    public MyIcon(){

    }
    public MyIcon(int w,int h)
    {
        this.width=w;
        this.height=h;
    }

    public static void main(String[] args) {
        new MyIcon().init();
    }
    public void init()
    {
        MyIcon myIcon=  new MyIcon(100,100);
        this.setSize(400,400);
        JLabel jLabel=  new JLabel("icon",myIcon,SwingConstants.CENTER);
        myIcon.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container=getContentPane();
        container.add(jLabel);
        this.setVisible(true);

    }


    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
