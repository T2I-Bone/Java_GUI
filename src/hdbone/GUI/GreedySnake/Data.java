package hdbone.GUI.GreedySnake;

import javax.swing.*;
import java.net.URL;

public class Data {
    public static URL headerURL=Data.class.getResource("./img/header.png");
    public static URL upURL=Data.class.getResource("./img/up.png");
    public static URL downURL=Data.class.getResource("./img/down.png");
    public static URL leftURL=Data.class.getResource("./img/left.png");
    public static URL rightURL=Data.class.getResource("./img/right.png");
    public static URL foodURL=Data.class.getResource("./img/food.png");
    public static URL bodyURL=Data.class.getResource("./img/body.png");
    public static ImageIcon up=new ImageIcon(upURL);
    public static ImageIcon down=new ImageIcon(downURL);
    public static ImageIcon left=new ImageIcon(leftURL);
    public static ImageIcon right=new ImageIcon(rightURL);
    public static ImageIcon food=new ImageIcon(foodURL);
    public static ImageIcon body=new ImageIcon(bodyURL);
    public static ImageIcon header=new ImageIcon(headerURL);
}
