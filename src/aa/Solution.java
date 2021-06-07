package aa;

public class Solution {
    public static void main(String[]args){
        int[] a=new int[]{2,7,11,15};
        int[] bb=Solution.twoSum(a,9);
        for (int i = 0; i <bb.length; i++) {
            System.out.print(bb[i]+" ");
        }

    }
    public static int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int[] b=new int[2];
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    b[0]=i;
                    b[i+1]=j;
                }
            }
        }
        return b;
    }
}
