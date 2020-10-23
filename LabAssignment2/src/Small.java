import java.util.Arrays;
import java.util.Scanner;
public class Small {
	public int getSecondSmallest(int[] a) {
		Arrays.sort(a);;
		return a[1];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Small m= new Small();
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(m.getSecondSmallest(arr));
	}
}

