package aa;

class Solution15 {

    public int[] countBits(int n) {
        int[] bits=new int[n+1];
        for(int i=0;i<=n;i++){
            bits[i]=bitcount(i);
        }
        return bits;
    }
    public int bitcount(int x){
        int ones=0;
        while(x>0){
            x=x&(x-1);
            ones++;
        }

        return ones;
    }
}
