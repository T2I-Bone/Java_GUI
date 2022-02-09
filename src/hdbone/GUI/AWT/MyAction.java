package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 事件监听
// 按下按钮，触发一些事件
public class MyAction {
    public static void main(String[] args) {
        Frame frame= new Frame();
        Button button=new Button();


        button.addActionListener(new ActionListener() {
            @Override
            // 当事件发生时，做什么
            public void actionPerformed(ActionEvent e) {
                System.out.println("你好呀");
            }
        });
        frame.add(button,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.pack();
        windowClose(frame);
    }

    // 关闭窗口的事件
    private static void windowClose(Frame frame)
    {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
