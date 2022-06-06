/*
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.
Input: m = 3, n = 7
Output: 28
 */
public class UniquePaths {

	public static void main(String[] args) {
		
		int m=3;
		int n=7;
		System.out.println(uniquePathRecursion(0,0,m-1,n-1));
	}
	public static int uniquePathRecursion(int r,int c,int m,int n){
		if(r==m && c==n){
			return 1;
		}
		if(r>m || r<0 || c>n ||c<0){
			return 0;
		}
		return uniquePathRecursion(r-1,c,m,n) + uniquePathRecursion(r,c+1,m,n);
	}

}
