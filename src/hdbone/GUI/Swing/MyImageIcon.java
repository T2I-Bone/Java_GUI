package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyImageIcon extends JFrame {
    public MyImageIcon() {
        // 获取图片的地址
        // 获取MyImageIcon 这个类的同级资源(反射)
        JLabel jLabel=new JLabel("这是一个qq头像");
        URL url=MyImageIcon.class.getResource("qq.jpg");
        ImageIcon imageIcon= new ImageIcon(url);
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Container container=getContentPane();
        container.add(jLabel);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MyImageIcon();
    }
}
