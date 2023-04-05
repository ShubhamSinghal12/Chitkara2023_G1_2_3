package Lec7;

public class PalindromicSubString {
	
	public int countSubstrings(String s) {
        int count=0;
        //for odd length
        for(int axis=0; axis<s.length(); axis++){
            for(int orbit=0; axis-orbit>=0 && axis+orbit<s.length(); orbit++){
                if(s.charAt(axis-orbit)==s.charAt(axis+orbit)){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        //for even length
        for(int l=0, r=1; r<s.length(); l++,r++){
            for(int orbit=0; l-orbit>=0 && r+orbit<s.length(); orbit++){
                if(s.charAt(l-orbit)==s.charAt(r+orbit)){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }

}
