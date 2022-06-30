package music;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class MeteorFly extends JFrame {
    int AppletWidth, AppletHeight;
    final int MAX = 6; // (~)流星的个数
    final int SLEEP = 2; // 流星飞行的速度（数值越大，速度越慢）
    final int COLORLV = 1; // (~)色阶（可改变光晕大小）
    final int SIZE = 3 ; // (~)流星大小
    private MyPanel panel;
    public MeteorFly() {
        panel = new MyPanel();
        this.setTitle("LOVE");
        this.getContentPane().add(panel);
        this.setSize(AppletWidth, AppletHeight); // 创建窗体
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                //声明一个File对象
                File mp3 = new File("nv.mp3");
                //创建一个输入流
                FileInputStream fileInputStream = null;

                try {
                    fileInputStream = new FileInputStream(mp3);
                    //创建一个缓冲流
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                    //创建播放器对象，把文件的缓冲流传入进去
                    Player player = new Player(fileInputStream);
                    //调用播放方法进行播放
                    player.play();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new MeteorFly();
    }

    class MyPanel extends JPanel implements Runnable {
        Meteor p[];
        BufferedImage OffScreen;
        Graphics drawOffScreen;
        Thread pThread;
        Font drawFont = new Font("Arial",0,28);
        public MyPanel() {
            //setBackground(Color.black); //窗体初始化
            AppletWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
            AppletHeight = Toolkit.getDefaultToolkit().getScreenSize().height-200;
            p = new Meteor[MAX];
            for (int i = 0; i < MAX; i++) {
                p[i] = new Meteor();
            }
            OffScreen = new BufferedImage(AppletWidth, AppletHeight,
                    BufferedImage.TYPE_INT_BGR);
            drawOffScreen = OffScreen.getGraphics();
            pThread = new Thread(this);
            pThread.start();

            new Thread(){
                @Override
                public void run() {
                    try {
                        sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    str1 = "我们与星星约会，圆满";
                    while(true){
                        try {
                            sleep(150);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        pos++;
                        if (pos > str1.length() - 1) {
                            pos = str1.length() - 1;
                            break;
                        }
                    }
                }
            }.start();

        }
        int pos = 0;
        String str1 = "                                                                   ";
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponents(g);
            g.drawImage(OffScreen, 0, 0, this);
            g.setColor(Color.pink);
            g.setFont(new Font("宋体", Font.BOLD, 50));
            g.drawString(str1.substring(0,pos+1),260,700);
        }
        @Override
        public void run() {
            while (true) {
                for (int i = 0; i < MAX; i++) {
                    drawOffScreen.setColor(p[i].color); // RGB颜色
                    drawOffScreen.fillOval(p[i].x, p[i].y, SIZE, SIZE);
                    p[i].x += p[i].mx;
                    p[i].y += p[i].my;
                    int x = p[i].x;
                    int y = p[i].y;
                    int R = p[i].color.getRed(); // 提取颜色
                    int G = p[i].color.getGreen();
                    int B = p[i].color.getBlue();
                    while (true) {
                        if (R ==0 && G ==0 && B ==0 ) {
                            break;
                        }
                        R -= COLORLV; // 尾部颜色淡化
                        if (R <0 ) {
                            R =0 ;
                        }
                        G -= COLORLV;
                        if (G <0 ) {
                            G =0 ;
                        }
                        B -= COLORLV;
                        if (B < 0) {
                            B =0 ;
                        }
                        Color color = new Color(R, G, B);
                        x -= p[i].mx; // 覆盖尾部
                        y -= p[i].my;
                        drawOffScreen.setColor(color);
                        drawOffScreen.fillOval(x, y, SIZE, SIZE);
                    }
                    if (x > AppletWidth || y > AppletHeight) { // 流星飞出窗口，重置流星
                        p[i].reset();
                    }
                }
                repaint();
                try {
                    Thread.sleep(SLEEP);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    class Meteor { // 流星类
        int x, y; // 流星的位置
        int mx, my; // 下落速度
        Color color; // 流星颜色
        Random r = new Random();
        public Meteor() {
            reset();
        }
        public void reset() {
            int rand = (int) (Math.random() *100 ); //随机生成流星出现位置
            if (rand >35 ) {
                x = (int) (Math.random() *600 );
                y = 0;
            } else {
                y = (int) (Math.random() * 150);
                x =0 ;
            }
            mx = r.nextInt(2)+2; //随机生成下落速度和角度
            my = 1;
            color = new Color(
                    // 随机颜色
                    (new Double(Math.random() *128 )).intValue() +128 ,
                    (new Double(Math.random() *128 )).intValue() +128 ,
                    (new Double(Math.random() * 128)).intValue() + 128);
        }
    }
}
