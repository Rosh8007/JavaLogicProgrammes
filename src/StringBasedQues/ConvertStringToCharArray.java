package StringBasedQues;

import java.util.Scanner;

public class ConvertStringToCharArray {
	// relook this code 

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();


		char[] chararray=str.toCharArray();

		for(int i=0; i<chararray.length; i++) 
		{

			String s="";

			while(i<chararray.length && chararray[i]!=' ') 
			{
				s=s+chararray[i];

				i++;
			}

			if(s.length()>0) 
			{
				System.out.println(s+s.length());
			}

		}


	}

}
