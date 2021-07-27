package single;

public class T3 {
    public static void main(String[] args) {
        //System.out.println(t3.hashCode());
    }
}
class T4 extends Thread{
    public T4 t4=null;
    public T4 run1(){
        if(t4==null){
            t4=new T4();
        }
        return t4;
    }
}
