package test4;

class Solution1{
    public int maxSubArray(int[] nums) {
        int sum=0;
        int res=nums[0];
        for(int x:nums){
            sum=Math.max(sum+x,x);
            res=Math.max(sum,res);
        }
        return res;
    }
}
