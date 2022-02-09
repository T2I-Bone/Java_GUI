package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

// 测试鼠标监听
public class MyMouseListener {
    public static void main(String[] args) {
        new MyFrame3("鼠标绘图");
    }
}

class MyFrame3 extends Frame{
    // 监听鼠标的位置
    // 存储所有点的坐标
    private ArrayList points;
    public MyFrame3(String title)
    {
        super(title);
        setBounds(200,200,600,400);
        points=new ArrayList<>();
        setVisible(true);// 设置可见
        this.addMouseListener(new MyMouseListener());// 鼠标监听器
    }

    @Override
    public void paint(Graphics g) {
        // 绘画
        Iterator iterator=points.iterator();
        while(iterator.hasNext())
        {
            Point point=(Point) iterator.next();
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);
        }
    }
    public void addPoint(Point point)
    {
        points.add(point);
    }
    // 添加一个点

    private class MyMouseListener extends MouseAdapter {
        // 鼠标点击 ： 按下，弹起，按住不放

        public void mousePressed(MouseEvent e)
        {
            MyFrame3 myFrame=(MyFrame3) e.getSource();
            //点击一下，就显示一个点
            myFrame.addPoint(new Point(e.getX(),e.getY()));

            myFrame.repaint();// 刷新页面
        }
    }
}