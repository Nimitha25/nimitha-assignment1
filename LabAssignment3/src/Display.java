
/* Author : M.Nimitha
 * Date : 26-10-2020
 * Desc : To display number of words, lines and characters in a text
 */
import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
				String s = sc.nextLine();
				int r = calculateWords(s);

	}
	public static int calculateWords(String r) {
		
		int words = 0, character = 0, line = 0;
		for(int i = 0; i < r.length(); i++)
		{
			if(r.charAt(i) == ' ')
			{
				line++;
			}
			character++;
		}
		System.out.println("characters = " + character + " words = " + words + " Lines = " + line);
		return line;
	}

}
