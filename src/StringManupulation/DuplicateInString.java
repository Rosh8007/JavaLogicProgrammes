package StringManupulation;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInString 

{

	public static void main(String[] args) {
		
		
	
		
		String str="Roshan is my name Roshan NAME";
		
		String[]  sm=str.split(" ");
		
		int count=0;
		for(int i=0; i<sm.length; i++) 
		{
			for(int j=i+1; j<sm.length; j++) 
			{
				if(sm[i].equalsIgnoreCase(sm[j])) 
				{
					System.out.println(sm[i]);
					
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Number of duplicates Found:=>"+count);
	}

}

