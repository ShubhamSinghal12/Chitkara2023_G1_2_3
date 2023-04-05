package Lec7;

public class LongestPalindromicSubString {
	
public String longestPalindrome(String s) {
        
        int maxSize = 1;
        String ans = s.charAt(0)+"";
        //Odd
        for(int i = 0; i < s.length(); i++)
        {
            int left = i-1;
            int right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
            {
                left--;
                right++;
            }
            int size = right-left-1;
            if(size > maxSize)
            {
                maxSize = size;
                ans = s.substring(left+1,right);
            }
            
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
            {
                left--;
                right++;
            }
            size = right-left-1;
            if(size > maxSize)
            {
                maxSize = size;
                ans = s.substring(left+1,right);
            }
        }
        
        return ans;
    }

}
