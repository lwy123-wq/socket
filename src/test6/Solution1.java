package test6;

class Solution1 {
    public int climbStairs(int n) {
        // if(n<=2)
        // return n;
        // int a=1;
        // int b=2;
        // for(int i=0;i<=n;i++){
        //     int temp=a+b;
        //     a=b;
        //     b=temp;
        // }
        // return b;
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
