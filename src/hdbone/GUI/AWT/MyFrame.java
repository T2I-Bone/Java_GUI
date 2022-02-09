package hdbone.GUI.AWT;

import java.awt.*;

// Fame测试
public class MyFrame {
    public static void main(String[] args) {
        // Frame 对象
        Frame frame =new Frame("Java图像界面窗口");
        frame.setVisible(true);// 设置可见性
        frame.setSize(400,400);// 设置窗口大小
        frame.setBackground(new Color(230, 233, 236, 255));// 设置背景颜色
        frame.setLocation(200,200);// 设置出现的初始位置
        frame.setResizable(true);// 可以拉伸
    }
}
