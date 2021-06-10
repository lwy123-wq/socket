package test3;

import com.sun.org.apache.xerces.internal.impl.dtd.DTDGrammar;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        return set.size();
    }


    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,5,3,3,4};
        System.out.println(Solution.removeDuplicates(a));

    }
}
