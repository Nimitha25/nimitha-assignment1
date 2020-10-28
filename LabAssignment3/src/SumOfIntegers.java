
/* Author : M.Nimitha
 * Date : 26-10-2020
 * Desc : To display sum of all integers
 */
import java.util.*;

public class SumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the intgers");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens())
			//Method to check availability of token
		{
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("Sum of the integers " + sum);
		

	}

}
