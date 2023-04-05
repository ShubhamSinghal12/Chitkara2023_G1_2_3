package Lec5;

public class MaxSumCircularSubArray {
	
	public int maxSubarraySumCircular(int[] nums) {
        int kans = maxSubArray(nums);
        if(kans < 0)
            return kans;
        int ts = 0;
        for(int i = 0; i < nums.length; i++)
        {
            ts += nums[i];
            nums[i] *= -1;
        }
        int x = maxSubArray(nums);
        int cans = ts+x;
        return Math.max(kans,cans);
        
            
    }   
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            if(sum > maxSum)
            {
                maxSum = sum;
            }
            
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return maxSum;
        
    }

}
