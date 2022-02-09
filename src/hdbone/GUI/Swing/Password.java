package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

// 密码框
public class Password extends JFrame {
    public Password() {
        Container container=getContentPane();

        JPasswordField jPasswordField=new JPasswordField();
        jPasswordField.setEchoChar('*');
        container.add(jPasswordField);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Password();
    }
}
