package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// 键盘的监听
public class MyKeyboard {
    public static void main(String[] args) {
        new keyFrame();
    }
}

class keyFrame extends Frame {
    public keyFrame() {
        setBounds(1,2,300,400);
        setVisible(true);

        //键盘按下的监听
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode=e.getKeyCode();// 获取当前按下的键盘的码
                System.out.println(keyCode);
                if(keyCode==KeyEvent.VK_UP)
                {
                    System.out.println("你按下了UP键");
                }
            }
        });
    }
}