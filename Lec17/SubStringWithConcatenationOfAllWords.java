package Lec17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubStringWithConcatenationOfAllWords {

public List<Integer> findSubstring(String s, String[] words) {
        
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < s.length() - words[0].length()*words.length+1; i++)
        {
            if(check(s,i,words,map))
            {
                ans.add(i);
            }
        }
        return ans;
    }
    
    public boolean check(String s, int i,String[] words,HashMap<String,Integer> map)
    {
        int wl = words[0].length();
        HashMap<String,Integer> rmap = new HashMap<>(map);
        for(int j = i;j < i + wl*words.length; j += wl)
        {
            String ns = s.substring(j,j+wl);
            if(rmap.getOrDefault(ns,0) != 0)
            {
                rmap.put(ns,rmap.get(ns)-1);
            }
            else
            {
                return false;
            }
            
        }
        return true;
    }
    
}
