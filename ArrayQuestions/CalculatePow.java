
/*
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
 */
public class CalculatePow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// N contains negative or not 1/(x) pow (n)
		
		double x=2.0000;
		int n=2;
		boolean negative = n<0;
		double ans=1;
		
		while(n>0){
			if(n%2==0){
				x=x*x;
				n=n/2;
			}
			else{
				ans*=x;
				n=n-1;
			}
		}
		System.out.println(ans);
		if(negative) {System.out.println(1/ans);
		return;
		
		}
		
		
		

	}

}
