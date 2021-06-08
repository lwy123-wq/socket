package test;

public class Solution1 {
    public boolean isPalindrome(int x) {
        int tmp=x,aa=1;
        if(x<0)
            return false;
        while(tmp>=10){
            aa=aa*10;
            tmp=tmp/10;
        }
        while(x!=0){
            if(x%10!=x/aa){
                return false;
            }
            x=x%aa/10;
            aa/=100;
        }
        return true;
    }

}
