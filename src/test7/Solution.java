package test7;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if(m==0&&n==0){}
        // System.out.println("null");
        // }else(n==0){
        //     for(int i=0;i<m;i++){
        //         System.out.println(nums1[i]);
        //     }
        // }
        for(int i=0;i!=n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);

    }
}
