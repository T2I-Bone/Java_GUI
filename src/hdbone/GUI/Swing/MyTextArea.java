package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

public class MyTextArea extends JFrame {
    public MyTextArea() {
        Container container=getContentPane();

        TextArea textArea=new TextArea("hello Swing");
        container.add(textArea);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyTextArea();
    }
}
