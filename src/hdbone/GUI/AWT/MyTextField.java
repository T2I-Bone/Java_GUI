package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextField {
    public static void main(String[] args) {
        new MyFrame2();
    }
}

class MyFrame2 extends Frame {
    public MyFrame2()
    {
        TextField textField=new TextField();
        add(textField);
        // 监听文本框
        MyActionListener2 myActionListener2=new MyActionListener2();
        textField.addActionListener(myActionListener2);
        textField.setEchoChar('*');// 设置替换文本
        setVisible(true);
        pack();
    }
}

class MyActionListener2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field=(TextField) e.getSource();// 获得资源
        // 向下转型为任何类
        System.out.println(field.getText());// 输入框的文本信息
        field.setText("");// 每次写完后都 清空
    }
}