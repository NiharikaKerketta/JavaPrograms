package basics_practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String x = "ARADHYA";
		String y = "HRADAYA";
		
		char a[] = x.toCharArray();
		char b[] = y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a, b);
		
		if(result==true)
		{
			System.out.println("Strings are array");
		}
		else
		{
			System.out.println("Strings are not array");
		}
	}
}
