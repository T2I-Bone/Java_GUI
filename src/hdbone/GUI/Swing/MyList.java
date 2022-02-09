package hdbone.GUI.Swing;

import javax.swing.*;
import java.awt.*;

// 列表框测试
public class MyList extends JFrame {
    public MyList() {
        Container container=getContentPane();

        String []contents={"one","two","three"};
        JList jList=new JList(contents);
        container.add(jList);

        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyList();
    }
}
