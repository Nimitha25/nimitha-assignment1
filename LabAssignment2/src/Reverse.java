/**
 * Description: To find the reverse of an array in a sorted order
 * Author: M.L.Nimitha
 * date:23-10-2020 
 */import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Reverse {
	public int reverseNumber(int n)
	{
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String x=sb.toString();
		return Integer.parseInt(x);
	}
	public String sortArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=reverseNumber(arr[i]);
		}
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}
	public static void main(String args[] ) {
	}
}

