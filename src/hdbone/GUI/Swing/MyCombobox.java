package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

public class MyCombobox extends JFrame {
    public MyCombobox() {
        Container container=getContentPane();
        JComboBox status=new JComboBox();

        status.addItem(null);
        status.addItem("开始");
        status.addItem("中断");
        status.addItem("停止");
        container.add(status);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyCombobox();
    }
}

