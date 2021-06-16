package test6;

class Solution {
    public int mySqrt(int x) {
        if(x<=0){
            return 0;
        }
        int num=(int)Math.exp(0.5*Math.log(x));
        return (long)(num+1)*(num+1)<=x?num+1:num;
    }
}
