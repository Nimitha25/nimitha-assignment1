import java.util.Scanner;
public class IncreasingNumber {
	static boolean checkNumber(int num){
		int lastdigit;
		int secondlast;
		while(num/100>0)
		{
			lastdigit=num%10;
			secondlast=(num/10)%10;
			if(lastdigit<secondlast)
			{
				return false;
			}
			num=num/10;
		}
			lastdigit=num%10;
			secondlast=num/10;
			if(lastdigit<secondlast)
			{
				return false;
			}
	return true;
	}
	public static void main(String args[] ) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(checkNumber(n));
	}
}
