package aa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(9999);
        ExecutorService executor= Executors.newCachedThreadPool();
        while (true){
            Socket s=ss.accept();
            //executor.submit(new MyRun(s));
        }
    }

}
/*
class MyRun implements Runnable {
    Socket s;

    public MyRun(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            InputStream in= s.getInputStream();
            byte[] bytes=new byte[1024];
            int len=in.read(bytes);
            System.out.println(new String(bytes));
            OutputStream out=s.getOutputStream();
            out.write("hello".getBytes(StandardCharsets.UTF_8));
            out.flush();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}*/
