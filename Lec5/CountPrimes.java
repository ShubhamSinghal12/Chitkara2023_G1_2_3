package Lec5;

public class CountPrimes {

public int countPrimes(int n) {
        
        boolean[] ans = new boolean[n];
        int count = 0;
        for(int i = 2;i < n; i++)
        {
            if(ans[i] == false)
            {
                count++;
                for(int j = 2*i; j < n; j += i)
                {
                    ans[j] = true;
                }
            }
        }
        return count;
        
    }
}
