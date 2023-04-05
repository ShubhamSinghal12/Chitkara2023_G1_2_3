package Lec6;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate {
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> L = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
          if(nums[Math.abs(nums[i])-1]<0){
              L.add(Math.abs(nums[i]));
          }
            else{
                nums[Math.abs(nums[i])-1]= nums[Math.abs(nums[i])-1]*-1;
            }
            
        }
        return L;
    }

}
