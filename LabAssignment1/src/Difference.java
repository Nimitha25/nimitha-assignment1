import java.util.Scanner;
public class Difference {
	static int calculateDifference(int n)
	{
		int sum1=(n*(n+1)*(2*n+1))/6;
		int sum2=(n*(n+1))/2;
		int sum3=(sum2*sum2);
		int Sum= (sum1-sum3);
		return -Sum;
	}

	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(calculateDifference(n));
	}

}