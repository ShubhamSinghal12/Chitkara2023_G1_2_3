package Lec2;

public class MaxSubarraySumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,-7,8,2,-5,9,4,-10};
		sumK(arr, 3);

	}
	
	public static int sumK(int[] arr,int k)
	{
		int start = 0;
		int end = k-1;
		int sum = 0;
		
		for(int i = start; i<= end; i++)
		{
			sum += arr[i];
		}
		int maxSum = sum;
		
		for(end = k; end < arr.length; end++)
		{
			sum = sum + arr[end] - arr[start];
			start++;
			if(sum > maxSum)
			{
				maxSum = sum;
			}
		}
		
		System.out.println(maxSum);
		return maxSum;
	}

}
