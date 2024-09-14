package StringBasedQues;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FreqOfCharInString {

	public static void main(String[] args)
	{

		String str="Roshan is my name";

		FreqOfCharInString fstr=new FreqOfCharInString();


		fstr.getVowelCount(str);
		fstr.getfrequency(str);


	}

	private void getVowelCount(String str) 
	{

		int vowelCount=0, wordCount=0, upperCaseCount=0, lowercaseCount=0;

		for(int i=0; i<str.length(); i++) 
		{
			char c=str.charAt(i);

			switch (c)
			{
			case ' ':

			case '.':

				wordCount++;

			}

			if (str.toUpperCase().charAt(i)=='A')
			{
				vowelCount++;
			}
			else if(str.toUpperCase().charAt(i)=='E') 
			{
				vowelCount++;
			}
			else if (str.toUpperCase().charAt(i)=='I') 
			{
				vowelCount++;
			}
			else if(str.toUpperCase().charAt(i)=='O') 
			{
				vowelCount++;
			}
			else if(str.toUpperCase().charAt(i)=='U') 
			{
				vowelCount++;
			}
			if(c>=65 && c<=90) 
			{
				upperCaseCount++;
			}
			

		}
		
		System.out.println("WordCount :=>"+wordCount);
		System.out.println("VowelCount :=>"+vowelCount);
		System.out.println("UppercaseCount :=>"+upperCaseCount);
		System.out.println("LowerCase Count :=>"+lowercaseCount);
		
		System.out.println("--------------------------------------------");
	}

	private void getfrequency(String str)
	{

		TreeMap<Character, Integer> mapdata=new TreeMap<>();
		
		for(int i=0; i<str.length(); i++) 
		{
			Integer val =mapdata.get(str.charAt(i));

			if(mapdata.get(str.charAt(i)) == null)
			{
				mapdata.put((str.charAt(i)), 1);
			}
			else
			{
				mapdata.put(str.charAt(i), val++);
				
			}
		}
		
		for(Entry<Character, Integer> data: mapdata.entrySet()) 
		{
			
			System.out.println("Character :=>"+data.getKey());
			System.out.println("Frequency :=>"+data.getValue());
			System.out.println("----------------------------------------------------------------");
			
		}

		System.out.println(mapdata);
	}

}
