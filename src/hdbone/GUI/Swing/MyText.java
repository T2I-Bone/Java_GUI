package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

public class MyText extends JFrame {
    public MyText() {
        Container container=getContentPane();
        JTextField textField1=new JTextField("hello");
        JTextField textField2=new JTextField("world");

        container.add(textField1,BorderLayout.WEST);
        container.add(textField2,BorderLayout.EAST);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new MyText();
    }
}
