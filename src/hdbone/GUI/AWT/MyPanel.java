package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyPanel {
    public static void main(String[] args) {
        // 框架
        Frame frame=new Frame();
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(Color.pink);
        // 布局
        // panel 也是一个component
        Panel panel=new Panel();
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(110, 150, 68));

        frame.add(panel);// 给frame 设置一个panel面板
        frame.setVisible(true);// 可见性

        // 强制关闭 System.exit(0);
        // 弄一个适配器（是需要重写少量的方法）
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //窗口关闭的时候需要做的事情！
                System.exit(0);
            }
        });
    }
}

