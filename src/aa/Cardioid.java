package aa;

import javax.swing.*;
import java.awt.*;

public class Cardioid extends JFrame {
    private static final int WIDTH=480;
    private static final int HEIGHT=600;

    private static final int WINDOW_WIDTH= Toolkit.getDefaultToolkit().getScreenSize().width;
    private static final int WINDOW_HEIGHT=Toolkit.getDefaultToolkit().getScreenSize().height;

    public Cardioid(){
        super("❤️爱心");
        this.setBackground(Color.BLACK);
        this.setLocation((WINDOW_WIDTH-WIDTH)/2,(WINDOW_HEIGHT-HEIGHT)/2);
        this.setSize(WIDTH,HEIGHT);
        this.setLayout(getLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics graphics){
        double x,y,z;
        Image image=this.createImage(WIDTH,HEIGHT);
        Graphics graphics1=image.getGraphics();
        for(int i=0;i<100;i++) {

            for (int j = 0; j < 100; j++) {

                z = Math.PI / 45 + Math.PI / 45 * i *

                        (1 - Math.sin(Math.PI / 45 * j)) * 18;

                x = z * Math.cos(Math.PI / 45 * j) *

                        Math.sin(Math.PI / 45 * i) + WIDTH / 2;

                y = -z * Math.sin(Math.PI / 45 * j) + HEIGHT / 2;

                graphics1.setColor(Color.MAGENTA);

                graphics1.setFont(new Font("楷体", Font.BOLD, 40));//设置字体

                graphics1.drawString("love", 180, 200);//绘制字符串

                graphics1.drawString("you", 220, 240);//绘制字符串

                graphics1.setColor(Color.MAGENTA);

                graphics1.fillOval((int) x, (int) y, 2, 2);

            }
            graphics.drawImage(image,0,0,this);
        }

    }

}
class CardioidDemo {

    public static void main(String[] args) {
        new Cardioid();
    }
}
