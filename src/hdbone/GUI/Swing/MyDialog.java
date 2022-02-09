package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 测试弹窗
// 默认有关闭事件
public class MyDialog extends JFrame {
    public MyDialog()
    {
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container= this.getContentPane();
        container.setLayout(null);
        JButton button=new JButton("点击弹出一个对话框");

        button.setBounds(30,30,200,50);
        container.add(button);

        // 点击一个按钮的时候，弹出一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new dialog();
            }
        });
    }
    public static void main(String[] args) {
        new MyDialog();
    }
}

// 弹窗
class dialog extends JDialog{
    public dialog(){
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        // 弹窗不需要特意地设置关闭
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container= this.getContentPane();
        container.setLayout(null);
        container.add(new Label("你好呀" ));
    }
}