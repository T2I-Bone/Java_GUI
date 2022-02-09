package hdbone.GUI.AWT;

import java.awt.*;

public class MyBorderLayout {
    public static void main(String[] args) {
        Frame frame=new Frame("BorderLayout");
        Button east=new Button("East");
        Button west=new Button("West");
        Button north=new Button("North");
        Button south=new Button("South");
        Button center=new Button("Center");

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);

    }

}
