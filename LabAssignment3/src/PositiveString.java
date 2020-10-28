/* Author : M.Nimitha
 * Date : 26-10-2020
 * Desc : To check if the given string is positive or not
 */
	import java.util.*;
	public class PositiveString {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
	        System.out.print(checkPositiveString(str));
		}
	

		private static boolean checkPositiveString(String str) 
		{
			// TODO Auto-generated method stub
			for(int i=0;i<str.length()-1;i++)
	        {
		         if(str.charAt(i+1)<str.charAt(i))
		         return false; 
	        }

			return true;
		}
	

	}

