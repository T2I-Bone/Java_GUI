package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyButtons extends JFrame{
    public MyButtons()
    {
        Container container=getContentPane();

        // 单选框
        // 将按钮分组
        ButtonGroup group=new ButtonGroup();
        // 一个组中只能选一个
        JRadioButton jRadioButton1=new JRadioButton("Radiobutton1");
        JRadioButton jRadioButton2 =new JRadioButton("Radiobutton2");
        JRadioButton jRadioButton3=new JRadioButton("Radiobutton3");
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        group.add(jRadioButton3);// 绑定

        container.add(jRadioButton1,BorderLayout.NORTH);
        container.add(jRadioButton2,BorderLayout.CENTER);
        container.add(jRadioButton3,BorderLayout.SOUTH);

        // 设置
        setVisible(true);
        setSize(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new MyButtons();
    }
}
