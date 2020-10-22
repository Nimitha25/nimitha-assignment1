import java.util.Scanner;
public class Cube 
{
	 static int sumOfCubes(int number)
	 {
		 int sum=0;
			while(number!=0)
			{
		 		int digit=number%10;
		 		sum=sum+(digit*digit*digit);
		 		number=number/10;
			}
			return sum;
	}
		public static void main(String[] args)
		{
			 System.out.println("Enter any number: ");
		     Scanner sc=new Scanner(System.in);
		     int number=sc.nextInt();
		     System.out.println(sumOfCubes(number));
			}
	}
