package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

public class MyJScroll extends JFrame{
    public MyJScroll() {
        Container container=getContentPane();
        // 文本域
        JTextArea jTextArea=new JTextArea(20,50);
        jTextArea.setText("welcome");

        // Scroll 面板
        JScrollPane scrollPane=new JScrollPane(jTextArea);

        container.add(scrollPane);
        setVisible(true);
        setBounds(100,100,300,350);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MyJScroll();
    }
}
