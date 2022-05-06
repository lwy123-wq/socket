package single;

import java.util.concurrent.atomic.AtomicInteger;

public class Single  {

    private static AtomicInteger tmp=new AtomicInteger(0);
    private static Single single=null;
/*
    public Single  run(){
        tmp.compareAndSet(0,1);
        if(single==null){
            single=new Single();
           // single=new AtomicReference<Single>();
        }
        tmp.compareAndSet(1,0);
        System.out.println(single.hashCode());
        return single;
    }
*/
    private Single(){
    }

    public static Single getInstance(){

        tmp.compareAndSet(0,1);
        if(single==null){
            single=new Single();
            // single=new AtomicReference<Single>();
        }
        tmp.compareAndSet(1,0);
        System.out.println(single.hashCode());
        return single;
    }
}
class T1{
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Single.getInstance();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Single.getInstance();
            }
        }).start();

    }
}
