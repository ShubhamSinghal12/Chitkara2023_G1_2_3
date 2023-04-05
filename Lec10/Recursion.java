package Lec10;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ss("abc","");
//		System.out.println(stair(5,""));
		mazePath(0, 0, 3, 2,"");

	}
	public static void ss(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			ss(ques.substring(1), ans+ques.charAt(0));
			ss(ques.substring(1), ans);
		}
	}

	public static int  stair(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else if(n < 0)
		{
			return 0;
		}
		else
		{
			int c = 0;
			c += stair(n-1, ans+"1");
			c += stair(n-2, ans+"2");
			return c;
		}
		
	}

	public static void mazePath(int cr,int cc,int r,int c,String ans)
	{
		if(cr == r&&cc == c)
		{
			System.out.println(ans);
		}
		else if (cr > r || cc > c)
		{
			return;
		}
		else
		{
			mazePath(cr+1, cc, r, c, ans+"V");
			mazePath(cr, cc+1, r, c, ans+"H");
			mazePath(cr+1, cc+1, r, c, ans+"D");
		}
	}
}
