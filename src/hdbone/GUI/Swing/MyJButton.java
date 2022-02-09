package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyJButton extends JFrame {
    public MyJButton() {
        Container container=getContentPane();
        URL resource=MyJButton.class.getResource("qq.jpg");
        Icon icon =new ImageIcon(resource);//  图标
        JButton jButton= new JButton();
        jButton.setIcon(icon);
        jButton.setToolTipText("图片按钮");
        container.add(jButton);
        setVisible(true);
        setSize(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyJButton();
    }
}
