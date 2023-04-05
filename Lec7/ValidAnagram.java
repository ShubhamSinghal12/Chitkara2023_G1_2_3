package Lec7;

public class ValidAnagram {
	
public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
        {
            return false;
        }
        
        int[] fa = new int[26];
        for(int i = 0; i < s.length();i++)
        {
            int fi = s.charAt(i) - 'a';
            fa[fi] += 1;
            
            fi = t.charAt(i) - 'a';
            fa[fi] -= 1;
        }
       
        
        for(int i = 0; i < fa.length; i++)
        {
            if(fa[i] != 0)
            {
                return false;
            }
        }
        return true;

}
}
