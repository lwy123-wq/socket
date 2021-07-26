package aa;

class Test{
    public void dis(){
        System.out.println("ok");
    }
}
class Test1{
    public void dis1(){
        System.out.println("okkkkkkkkk");
    }
}
class TestVolatile {
       // static volatile boolean flag=true;
    static boolean flag=true;
    static Test t=null;
    public static void main(String[] args) throws InterruptedException {

        new Thread(){
            public void run(){
                int i=0;

                while (flag){
                    i++;
                }
                System.out.println(i);
                t.dis();
            }
        }.start();
        new Thread(){
            public void run(){
                t=new Test();
                flag=false;
            }
        }.start();
    }
}