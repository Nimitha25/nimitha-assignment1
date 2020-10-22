import java.util.Scanner;

public class Fibonacci {
	static int fib(int n)
	{
		int a=1,b=1;
		int c;
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		return b;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
   System.out.println(fib(n));
		}
	}

}

