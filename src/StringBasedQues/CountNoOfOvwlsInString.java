package StringBasedQues;

import java.util.Scanner;

public class CountNoOfOvwlsInString {


	public static void main(String[] args) {

		System.out.println("Give me String");
		
		Scanner sc=new  Scanner(System.in);
		
		    

		String  str=sc.nextLine();

		char[]  chars=str.toCharArray();


		int count=0;


		for (char cha:chars) {
			
			
			switch (cha)
			{
			
			case 'a': System.out.println("a found");
			case 'e':System.out.println("e found");
			case 'i':System.out.println("i found");
			case 'o':System.out.println("o found");
			case 'u':System.out.println("u found");
			
				count++;
			
				break;
				
			} 
			
		}
		
		System.out.println("Ovwel count"+count);

	}

}
