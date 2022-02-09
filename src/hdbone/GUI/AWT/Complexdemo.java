package hdbone.GUI.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Complexdemo {
    public static void main(String[] args) {
        Frame frame=new Frame("综合练习");

        frame.setLayout(new GridLayout(2,1));
        frame.setVisible(true);
        frame.setSize(500,350);
        frame.setBackground(Color.pink);
        frame.setLocation(300,300);


        // 四个面板
        Panel panel1= new Panel(new BorderLayout());
        Panel panel2= new Panel(new GridLayout(2,1));
        Panel panel3= new Panel(new BorderLayout());
        Panel panel4= new Panel(new GridLayout(2,2));

        // 上面
        panel1.add(new Button("east1"),BorderLayout.EAST);
        panel1.add(new Button("west1"),BorderLayout.WEST);
        panel2.add(new Button("p2-1"));
        panel2.add(new Button("p2-2"));

        panel1.add(panel2,BorderLayout.CENTER);

        // 下面
        panel3.add(new Button("east2"),BorderLayout.EAST);
        panel3.add(new Button("west2"),BorderLayout.WEST);
        panel4.add(new Button("p4-1"));
        panel4.add(new Button("p4-2"));
        panel4.add(new Button("p4-3"));
        panel4.add(new Button("p4-4"));
        /*
        * for (int i=1;i<=4;i++)
        * {
        *   panel4.add(new Button("p4-"+i));
        * }
        * */
        panel3.add(panel4,BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
