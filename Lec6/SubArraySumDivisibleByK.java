package Lec6;

public class SubArraySumDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;
        int sum  =0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = (sum+nums[i])%k;
            if(sum < 0)
                sum += k;
            ans += count[sum];
            count[sum]++;
        }
        return ans;
        
        
    }
}
