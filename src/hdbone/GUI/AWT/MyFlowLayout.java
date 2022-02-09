package hdbone.GUI.AWT;

import java.awt.*;

// 测试流式布局
public class MyFlowLayout {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Button button1= new Button("button1");
        Button button2= new Button("button2");
        Button button3= new Button("button3");


        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        frame.setSize(200,200);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
    }
}
