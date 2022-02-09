package hdbone.GUI.AWT;

import java.awt.*;

public class MyPaint {
    public static void main(String[] args) {
        new Paint().loadFrame();
    }
}

// 画笔测试
class Paint extends Frame{
    public void loadFrame()
    {
        setBounds(200,200,600,400);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawOval(100,100,100,100);// 空心圆
        g.fillOval(200,150,200,200);// 实心圆
        g.setColor(Color.GREEN);
        g.drawRect(450,200,100,100);

        // 画笔用完，需要将它还原成最初的颜色（黑色）
    }
}
