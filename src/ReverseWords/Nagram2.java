package ReverseWords;

import java.util.Arrays;

public class Nagram2 {

	public static void main(String[] args) {

		String str1="Roshan";
		String str="oahsnR";


		char[] fst	=str1.toCharArray();
		char[] snd=	str.toCharArray();


		Arrays.sort(fst);
		Arrays.sort(snd);

		Boolean	val=Arrays.equals(fst, snd);
		
		if(val==true) 
		{
			System.out.println("Given String is Anagram");
			
		}
		else
		{
			System.out.println("Given String is not Anagram");
		}

	}

}
