package hdbone.GUI.GreedySnake;

import javax.swing.*;

// 主类
public class StartGame {
    public static void main(String[] args) {
        JFrame jFrame= new JFrame();

        jFrame.setBounds(10,10,900,720);
        jFrame.setResizable(false);//窗口大小不可变
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        jFrame.add(new GamePanel());

        jFrame.setVisible(true);

    }
}
