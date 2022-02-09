package hdbone.GUI.AWT;

import java.awt.*;

public class MyGridLayout {
    public static void main(String[] args) {
        Frame frame=new Frame("GridLayout");
        Button bt1=new Button("bt1");
        Button bt2=new Button("bt2");
        Button bt3=new Button("bt3");
        Button bt4=new Button("bt4");
        Button bt5=new Button("bt5");
        Button bt6=new Button("bt6");
        frame.setLayout(new GridLayout(3,2));
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(bt5);
        frame.add(bt6);

        frame.pack();// 自动将布局选择一个合适的位置
        frame.setVisible(true);

    }
}
