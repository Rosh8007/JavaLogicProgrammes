package ConverStrTOSmall;

import java.util.Arrays;

public class Demo {


	public static void main(String[] args) {

		//convert everything into lowercase

		String str="India Is MY CounTry";

		char[]   ch=str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			char  lowercase=Character.toLowerCase(ch[i]);
			
			System.out.print(lowercase);
		}
		
		 System.out.println();
		 
		 //Approach 2
		
		 String lowcase=str.toLowerCase();
		 System.out.println(lowcase);
		 
		 //Approach3
		 
		String upcase=str.toUpperCase();

		System.out.println(upcase);
		
		
		 
		
	}

}
