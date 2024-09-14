package StringBasedQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingStringDemo 
{

	public static void main(String[] args) 
	{

		String str="RAM";

		char[] ch=str.toCharArray();

		Arrays.sort(ch);

		//Converting char value into String

		System.out.println( String.valueOf(ch));
		
		//Converting Char value into String
		String st=new String(ch);

		System.out.println(st);


		// Approach2

		ArrayList<Character> list=new ArrayList<Character>();

		for(int i=0; i<=str.length()-1; i++) 
		{
			list.add(str.charAt(i));
		}

		Collections.sort(list);

		System.out.println(list);
	}

}
