package Lec20;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static int LIS(int[] nums,int i)
	{
		if(i >= nums.length)
		{
			return 0;
		}
		else
		{
			int maxLIS = 0;
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[j] > nums[i])
				{
					maxLIS = Math.max(maxLIS, LIS(nums,j));
				}
			}
			return maxLIS+1;
		}
	}
	
	
	public static int LIS(int[] nums,int i,int[] dp)
	{
		if(i >= nums.length)
		{
			return 0;
		}
		else if(dp[i] != 0)
		{
			return dp[i];
		}
		else
		{
			int maxLIS = 0;
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[j] > nums[i])
				{
					maxLIS = Math.max(maxLIS, LIS(nums,j,dp));
				}
			}
			return dp[i] = maxLIS+1;
		}
	}
	
	public static int LISBU(int[] nums)
	{
		int[] dp = new int[nums.length+1];
		dp[nums.length] = 0;
		
		for(int i = nums.length-1; i>= 0; i--)
		{
			int maxLIS = 0;
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[j] > nums[i])
				{
					maxLIS = Math.max(maxLIS, dp[j]);
				}
			}
			dp[i] = maxLIS+1;
		}
		int max = 0;
		for(int i = 0; i < nums.length; i++)
			max = Math.max(max, dp[i]);
		return max;
	}
	
	
	

}
