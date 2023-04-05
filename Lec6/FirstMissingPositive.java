package Lec6;

public class FirstMissingPositive {

public static int firstMissingPositive(int[] nums) {
		
		boolean flag = true;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == 1) {
        		flag = false;
        	}
        }
        if(flag) {
        	return 1;
        }
        
		// if(nums.length == 1) {
		// 	if(nums[0] != 1) {
		// 		return 1;
		// 	} else {
		// 		return 2;
		// 	}
		// }
        
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] <= 0 || nums[i] > nums.length) {
        		nums[i] = 1;
        	}
        }
        
       for(int i = 0; i < nums.length; i++) {
    	   int val = Math.abs(nums[i]);
    	   if(nums[val - 1] > 0) {
    		   nums[val - 1] *= -1;
    	   }
       }
       
       for(int i = 0; i < nums.length; i++) {
    	   if(nums[i] > 0) {
    		   return i + 1;
    	   }
       }
        
        return nums.length+1;
    }
}
