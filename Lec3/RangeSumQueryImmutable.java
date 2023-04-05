package Lec3;

public class RangeSumQueryImmutable {
	
	 int[] arr = null;

	    public void NumArray(int[] nums) {
	        arr = new int[nums.length+1];
	        for(int i = 1;i < arr.length;i++)
	        {
	            arr[i] = arr[i-1]+nums[i-1];
	        }
	    }
	    
	    public int sumRange(int left, int right) {
	        
	        return arr[right+1]-arr[left];
	    }

}
