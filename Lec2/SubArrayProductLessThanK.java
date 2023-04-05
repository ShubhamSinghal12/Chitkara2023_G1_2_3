package Lec2;

public class SubArrayProductLessThanK {

public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int start = 0;
        int prod = 1;
        int count = 0;
        
        for(int end = 0; end < nums.length; end++)
        {
            prod *= nums[end];
            while(start <= end && prod >= k)
            {
                prod /= nums[start];
                start++;
            }
            
            count = count + end-start+1;
            
        }
        return count;
        
    }

}
