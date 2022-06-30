package music;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MusicThread extends Thread{
    @Override
    public void run() {
        //播放音乐
        System.out.println("开始播放");
        //表示音乐文件
        File f = new File("https://vd4.bdstatic.com/mda-nfgfd50ghazb9cr6/720p/h264/1655463682529488559/mda-nfgfd50ghazb9cr6.mp4?v_from_s=hkapp-haokan-tucheng&auth_key=1655734430-0-0-fcfb6d831607dcef0f60e76c97e30a89&bcevod_channel=searchbox_feed&pd=1&cd=0&pt=3&logid=2630535247&vid=6015649928247301928&abtest=102599_2-102777_5-102784_2-102836_2-17451_2-3000232_1&klogid=2630535247");
        //第三方jar包  Player类

        try {
            Player p = new Player(new FileInputStream(f));//参数：文件输入流对象
            // p.play();
        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }

    }
}

