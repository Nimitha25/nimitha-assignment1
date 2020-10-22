import java.util.Scanner;

public class Sum {
	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;
	}
  public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(calculateSum(n));
	}

}

