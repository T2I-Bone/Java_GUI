package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JFrame {
    public MyJPanel()
    {
        Container container=getContentPane();
        // hgap 和 wgap ： height gap 间距
        container.setLayout(new GridLayout(2,2,10,10));
        JPanel jPanel1=new JPanel(new GridLayout(1,3));
        JPanel jPanel2=new JPanel(new GridLayout(1,4));
        JPanel jPanel3=new JPanel(new GridLayout(1,2));
        JPanel jPanel4=new JPanel(new GridLayout(2,3));

        jPanel1.add(new Button("1"));
        jPanel1.add(new Button("2"));
        jPanel1.add(new Button("3"));

        jPanel2.add(new Button("1"));
        jPanel2.add(new Button("2"));
        jPanel2.add(new Button("3"));
        jPanel2.add(new Button("4"));

        jPanel3.add(new Button("1"));
        jPanel3.add(new Button("2"));

        jPanel4.add(new Button("1"));
        jPanel4.add(new Button("2"));
        jPanel4.add(new Button("3"));
        jPanel4.add(new Button("4"));
        jPanel4.add(new Button("5"));
        jPanel4.add(new Button("6"));

        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanel3);
        container.add(jPanel4);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new MyJPanel();
    }
}
