package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myaction2 {
    public static void main(String[] args) {
        // 两个按钮，一个监听
        Frame frame= new Frame("Start-Stop");

        Button button1 =new Button("start");
        Button button2 =new Button("stop");

        button1.setActionCommand("button1-start");
        button2.setActionCommand("button2-stop");

        MyMonitor myMonitor=new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setSize(100,100);
    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // e.getActionCommand() 获得按钮的信息
        System.out.println("按钮被点击了："+e.getActionCommand());
        // if...
    }
}


