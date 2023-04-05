package Lec3;

import java.util.HashMap;

public class SubArraySumEqualsK {
	
	public int subarraySum(int[] nums, int k) {

	       HashMap<Integer,Integer> map = new HashMap<>();
	        int sum = 0;
	        map.put(0,1);
	        int count = 0;
	        for(int i = 0;i < nums.length; i++)
	        {
	            sum += nums[i];
	            int b = sum-k;
	            count += map.getOrDefault(b,0);
	            map.put(sum,map.getOrDefault(sum,0)+1);
	        }
	        return count;
	        
	        
	        
	        
//	         int[] arr = new int[nums.length+1];
	        
	        
//	         for(int i = 1;i < arr.length; i++)
//	         {
//	             arr[i] = arr[i-1]+nums[i-1];
//	         }
	        
//	         int count = 0;
//	         for(int a = 1; a < arr.length; a++)
//	         {
//	             int b = arr[a]-k;
//	             for(int j = 0; j < a; j++)
//	             {
//	                 if(arr[j] == b)
//	                 {
//	                     count++;
//	                 }
//	             }
//	         }
//	         return count;
	        
	    }
}
