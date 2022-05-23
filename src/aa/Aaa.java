package aa;

import java.util.HashSet;

public class Aaa {
    public static void main(String[] args) {
        HashSet<Integer> map=new HashSet<>();
        map.add(111);
        boolean aa=map.add(111);
        System.out.println(aa);
        System.out.println(Aaa.aa(1,6));

    }
    public static int aa(int a,int c){
        if(a==1){
          a=2;
        }
        return a+c;
    }
}
