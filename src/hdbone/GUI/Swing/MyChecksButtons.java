package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyChecksButtons extends JFrame{
    public MyChecksButtons() {
        Container container=getContentPane();

        // 复选框（长方形的）
        JCheckBox checkBox1=new JCheckBox("checkbox1");
        JCheckBox checkBox2=new JCheckBox("checkbox2");
        JCheckBox checkBox3=new JCheckBox("checkbox3");

        container.add(checkBox1,BorderLayout.NORTH);
        container.add(checkBox2,BorderLayout.CENTER);
        container.add(checkBox3,BorderLayout.SOUTH);

        // 设置
        setVisible(true);
        setSize(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MyChecksButtons();
    }
}
