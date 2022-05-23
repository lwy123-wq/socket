package aa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution12 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        HashSet<Integer> map=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++ ){
            map.add(nums[i]);
        }
        for(int j=1;j<nums.length+1;j++){

            if(map.add(j)==true){
                list.add(j);

            }
        }
        return list;
    }
}