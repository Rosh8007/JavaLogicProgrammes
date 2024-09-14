package DuplicateString;

import java.util.HashSet;

public class DuplicateString {


	public static void main(String args[]) 
	{

		String arr[]= {"Roshan","Tejas","Roshan","Tejas","Sham"};

		Approach(arr);
	}

	public static void Approach(String arr[]) 
	{
		HashSet<String> set=new HashSet<String>();

		for (int i = 0; i < arr.length; i++) {
			
			if(!set.add(arr[i]))
			{
				System.out.println(arr[i]);
			}
			
		}
		
		


	}

}
