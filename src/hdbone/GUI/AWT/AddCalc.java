package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 简易加法计算器
public class AddCalc {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

class Calculator extends Frame
{
    TextField num1,num2,num3;

    public void loadFrame(){
        // 3个文本框
        num1=new TextField(10);
        num2=new TextField(10);// 字符位
        num3=new TextField(20);
        // 1个按钮
        Button button=new Button("=");
        // 一个标签
        Label label=new Label("+");
        setLayout(new FlowLayout());
        // 添加即可
        // 布局
        add(num1);add(label);add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
        button.addActionListener(new MyCalculatorListener());
    }
    // 类部类
    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // 获取加数和被加数
            int n1=Integer.parseInt(num1.getText());
            int n2=Integer.parseInt(num2.getText());
            // + 运算后，放入地三个框
            num3.setText(""+(n1+n2));
            // 清除前两个框
            num1.setText("");
            num2.setText("");
        }
    }
}

