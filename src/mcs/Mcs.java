package mcs;

import java.util.concurrent.atomic.AtomicReference;

class Node{
    public volatile boolean locked=false;
    Node next=null;
}
public class Mcs {
    private final AtomicReference<Node> tail;
    private final ThreadLocal<Node> newNode;

    public Mcs(){
       tail=new AtomicReference<>();
       newNode=ThreadLocal.withInitial(()->new Node());

    }
    public void lock(){
        Node node=newNode.get();
        Node pre=tail.getAndSet(node);
        if(pre!=null){
            node.locked=true;
            pre.next=node;
            while (node.locked){

            }
        }
    }
    public void unlock(){
        Node node=newNode.get();
        if(node.next==null){
            if(tail.compareAndSet(node,null)){
                return;
            }

        }
        node.next.locked=false;
        node.next=null;
    }

}
class MyMcs{
    public static void main(String[] args) {

        Mcs mcs=new Mcs();
        Runnable rr=new Runnable() {
            @Override
            public void run() {
                mcs.lock();
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mcs.unlock();
            }
        };
        new Thread(rr).start();
        new Thread(rr).start();
        new Thread(rr).start();
    }
}
