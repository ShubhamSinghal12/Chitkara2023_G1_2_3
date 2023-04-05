package Lec8;

import java.util.Arrays;

public class KMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String t = "ababc";
//		int[] lps = generatelps(t);
//		System.out.println(Arrays.toString(lps));
		String s = "abababab";
		String t = "abab";
		System.out.println(s);
		System.out.println(t);
		kmp(s, t);

	}
	
	public static int[] generatelps(String t)
	{
		int[] lps = new int[t.length()];
		lps[0] = 0;
		int i = 1,j = 0;
		while(i < t.length())
		{
			if(t.charAt(i) == t.charAt(j))
			{
				lps[i] = j+1;
				j++;
				i++;
			}
			else
			{
				if(j == 0)
				{
					lps[i] = 0;
					i++;
				}
				else
				{
					j = lps[j-1];
				}
			}
		}
		return lps;
	}
	
	public static void kmp(String s,String t)
	{
		int[] lps = generatelps(t);
		int ans = -1;
		int j = 0;
		for(int i = 0; i < s.length();)
		{	
			if(s.charAt(i) == t.charAt(j))
			{
				i++;
				j++;
				if(j == t.length())
				{	
					ans = i-j;
					System.out.println(ans);
//					break;
					j = lps[j-1];
				}
			}
//			if(j == t.length())
//			{	
//				ans = i-j;
//				break;
//			}
//			if(i < s.length() && s.charAt(i)!= t.charAt(j))
			else
			{
				if(j == 0)
					i++;
				else
				{
					j = lps[j-1];
				}
			}
		}
//		System.out.println(ans);
	}
}
