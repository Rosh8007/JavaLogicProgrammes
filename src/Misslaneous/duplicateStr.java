package Misslaneous;

import java.util.HashSet;
import java.util.Set;

public class duplicateStr {

	public static void main(String[] args) 
	{

		String str= "Roshan is my name a is my Roshan ";

		String    arrstr[]=str.split(" ");


		Set<String> set=new HashSet<>();

		for (int i = 0; i < arrstr.length; i++) {
			
			if(!set.add(arrstr[i])) 
			{
				System.out.println("Duplicate String :->"+arrstr[i]);
			}
			
		}
		
		

	}

}
