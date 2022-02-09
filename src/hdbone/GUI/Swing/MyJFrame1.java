package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

public class MyJFrame1 {

    // init()  初始化
    public void init() {
        // JFrame 是一个顶层窗口，但需要一个容器实例化
        JFrame jframe=new JFrame("Jframe窗口");
        jframe.setVisible(true);
        jframe.setBounds(100,100,200,200);
        //关闭窗口
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLabel=new JLabel("welcome");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jframe.add(jLabel);
        Container container=jframe.getContentPane();
        container.setBackground(Color.lightGray);

    }

    public static void main(String[] args) {
        new MyJFrame1().init();
    }
}
