package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 窗口监听测试
public class MyWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}
class WindowFrame extends Frame{

    public WindowFrame() {
        setVisible(true);
        setBounds(100,100,200,200);
        setBackground(Color.BLUE);
        //addWindowListener(new MyWindowListener());
        // 匿名类部类
        this.addWindowListener(new WindowAdapter() {
            // 窗口关闭
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                System.exit(0);
            }

            // 窗口激活
            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame source=(WindowFrame) e.getSource();
                source.setTitle("被激活了");
                System.out.println("windowActivated");
            }

        });
    }

}
