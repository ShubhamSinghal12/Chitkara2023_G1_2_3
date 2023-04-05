package Lec11;

public class RatinAMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = new int[3][3];
		maze[1][1] = 2;
		mazePath(maze, 0, 0, "");
	}
	
	public static void mazePath(int[][] maze,int r,int c,String ans)
	{
		if(r == maze.length-1 && c == maze[0].length-1)
		{
			System.out.println(ans);
			return;
		}
		else if(r < 0 || r >= maze.length || c < 0 || c>= maze[0].length|| maze[r][c] != 0)
		{
			return;
		}
		else
		{
			maze[r][c] = 1;
			
			int[] row = {0,0,1,-1};
			int[] col = {1,-1,0,0};
			String[] a = {"R","L","D","U"};
			
			for(int i = 0; i < row.length; i++)
			{
				mazePath(maze, r+row[i], c+col[i], ans+a[i]);
			}
//			mazePath(maze, r, c+1, ans+"R");
//			mazePath(maze, r, c-1, ans+"L");
//			mazePath(maze, r+1, c, ans+"D");
//			mazePath(maze, r-1, c, ans+"U");
			maze[r][c] = 0;
		}
		
	}

}
