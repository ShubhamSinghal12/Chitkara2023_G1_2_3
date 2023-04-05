package Lec13;

import java.util.Stack;

public class SumOfSubarrayMinimums {
	
	public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();
        long ans = 0;
        int mod = 1000000007;
        for(int i = 0; i < arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                int mid = st.pop();
                int ps = -1;
                if(!st.isEmpty())
                {
                    ps = st.peek();
                }
                long lp = mid-ps;
                int rp = i - mid;
                
                ans += (lp*rp*arr[mid])%mod;
            }
            st.push(i);
        }
        while(!st.isEmpty())
            {
                int mid = st.pop();
                int ps = -1;
                if(!st.isEmpty())
                {
                    ps = st.peek();
                }
                long lp = mid-ps;
                int rp = arr.length - mid;
                
                ans += (lp*rp*arr[mid])%mod;
            }
        return (int)(ans%mod);
        
    }

}
