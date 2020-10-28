/* Author : M.Nimitha
 * Date : 26-10-2020
 * Desc : To replace all the consonants in the string with the next alphabet
 */
import java.util.*;

public class ReplaceConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String n = alterString(s);

	}
	public static String alterString(String n) {
		int len = n.length();
		for (int i = 0; i < len; i++)
		{
			char j = n.charAt(i);
			
			if(j == 'A' || j == 'E' || j == 'I' || j == 'O' || j == 'U' || j =='a' || j == 'e' || j == 'i' || j == 'o' || j == 'u')
			{
				System.out.print(j);
			}
			else
			{
				char ch = n.charAt(i);
				ch++;
				System.out.print(ch);
			}
		}
		return n;
	}

}
