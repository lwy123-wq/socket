package aa;


import java.util.concurrent.atomic.AtomicInteger;

public class MyRun implements Runnable{

    public  AtomicInteger b;
    ThreadLocal<Integer> c=new ThreadLocal<>();

    public MyRun(AtomicInteger b, ThreadLocal<Integer> c) {
        this.b = b;
        this.c = c;
    }

    @Override
    public void run() {
        b.set(b.getAndAdd(100));
        System.out.println(b.get());
        c.set(1);
        c.set(c.get()+1);

    }
}
class Test2{
    public static void main(String[] args) {
        MyRun r=new MyRun(new AtomicInteger(1),new ThreadLocal<>());

        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        t1.start();
        t2.start();
    }
}

