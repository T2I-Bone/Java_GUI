package hdbone.GUI.GreedySnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

// 游戏的面板
// 一个格子是25×25

public class GamePanel extends JPanel implements KeyListener, ActionListener{


    boolean isStart=false;// 游戏开始
    boolean isfail=false;//游戏失败
    private Snake snake;
    private int foodx;
    private int foody;// 食物的坐标
    private int score;
    Random random =new Random();
    public GamePanel()
    {
        this.setFocusable(true);// 获取焦点事件
        this.addKeyListener(this);// 获取键盘的监听事件
        timer.start();// 游戏开始 定时器就启动
        snake=new Snake();
        foodx=25+25* random.nextInt(34);
        foody=75+25* random.nextInt(24);
        score=0;// 积分
    }


    // 定时器(事件监听) 固定的时间 来刷新 1s 10次

    Timer timer=new Timer(100,this);//100 ms
    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStart&&!isfail)
        {
            if(snake.snakex[0]==foodx&&snake.snakey[0]==foody)
            {
                snake.len++;// 长度加1
                score+=10;
                foodx=25+25* random.nextInt(34);
                foody=75+25* random.nextInt(24);
            }
            for(int i=snake.len-1;i>0;i--)
            {
                snake.snakex[i]=snake.snakex[i-1];// 后一节变成前一节的位置
                snake.snakey[i]=snake.snakey[i-1];
            }
            // 转向
            if(snake.dir.equals("Right"))
            {
                snake.snakex[0]+=25;
                // 边界
                if(snake.snakex[0]>850) snake.snakex[0]=25;
            }
            else if(snake.dir.equals("Left"))
            {
                snake.snakex[0]-=25;
                // 边界
                if(snake.snakex[0]<25) snake.snakex[0]=850;
            }
            else if(snake.dir.equals("Down"))
            {
                snake.snakey[0]+=25;
                // 边界
                if(snake.snakey[0]>650) snake.snakey[0]=75;
            }
            else if(snake.dir.equals(("Up")))
            {
                snake.snakey[0]-=25;
                // 边界
                if(snake.snakey[0]<75) snake.snakey[0]=650;
            }

            // 判定是否撞到自己（撞到了就失败）
            for(int i=1;i<snake.len;i++)
            {
                if(snake.snakex[i]== snake.snakex[0]&&snake.snakey[i]==snake.snakey[0])
                {
                    isfail=true;
                }
            }
            repaint();
        }
    }

    // 键盘监听（按压）
    @Override
    public void keyPressed(KeyEvent e) {
        int keycode=e.getKeyCode();
        // 按下空格键
        if(keycode==KeyEvent.VK_SPACE)
        {
            if(isfail)
            {
                isfail=false;
                snake=new Snake();
                foodx=25+25* random.nextInt(34);
                foody=75+25* random.nextInt(24);
                score=0;// 积分
            }
            else
                isStart=!isStart;// 取反（两种状态相互转化）
            repaint();//一定要重画呀
        }
        if(keycode==KeyEvent.VK_UP&& !snake.dir.equals("Down"))
        {
            snake.dir="Up";
        }
        else if(keycode==KeyEvent.VK_DOWN&& !snake.dir.equals("Up"))
        {
            snake.dir="Down";
        }
        else if(keycode==KeyEvent.VK_LEFT&& !snake.dir.equals("Right"))
        {
            snake.dir="Left";
        }
        else if(keycode==KeyEvent.VK_RIGHT&& !snake.dir.equals("Left"))
        {
            snake.dir="Right";
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}


    // 定义蛇的结构
    class Snake{
        int len;
        int []snakex=new int [600];// x坐标
        int []snakey=new int [500];// y坐标
        String dir;
        public Snake()
        {
            this.len=3;
            this.dir="Right";//初始方向
            snakex[0]=100;snakey[0]=100;// 头
            snakex[1]=75;snakey[1]=100;// body1
            snakex[2]=50;snakey[2]=100;// body2
        }

    }
    // 绘制面板
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);// 清屏
        this.setBackground(Color.WHITE);
        Data.header.paintIcon(this,g,25,11);
        g.fillRect(25,75,850,600);

        // 画积分
        g.setColor(Color.BLACK);
        g.setFont(new Font(null,Font.BOLD,18));
        g.drawString("长度:"+snake.len,750,20);
        g.drawString("分数:"+score,750,60);

        // 画食物
        Data.food.paintIcon(this,g,foodx,foody);
        // 画蛇的头
        if(snake.dir.equals("Right"))
            Data.right.paintIcon(this,g,snake.snakex[0],snake.snakey[0]);
        else if(snake.dir.equals("Left"))
            Data.left.paintIcon(this,g,snake.snakex[0],snake.snakey[0]);
        else if(snake.dir.equals("Up"))
            Data.up.paintIcon(this,g,snake.snakex[0],snake.snakey[0]);
        else if(snake.dir.equals("Down"))
            Data.down.paintIcon(this,g,snake.snakex[0],snake.snakey[0]);
        // 画蛇的身体
        for(int i=1;i< snake.len;i++) {
            Data.body.paintIcon(this, g, snake.snakex[i], snake.snakey[i]);
        }
         if(isStart==false)
        {
            g.setColor(Color.WHITE);
            g.setFont(new Font(null,Font.BOLD,50));
            g.drawString("按下空格开始游戏",280,300);
        }
        if(isfail==true)
        {
            g.setColor(Color.red);
            g.setFont(new Font(null,Font.BOLD,50));
            g.drawString("游戏失败,按下空格重新开始",200,200);
        }
    }
}
