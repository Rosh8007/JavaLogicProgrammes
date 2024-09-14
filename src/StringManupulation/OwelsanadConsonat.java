package StringManupulation;

public class OwelsanadConsonat {
	
	
	
	public static void main(String[] args) {
		
		
		String name="Roshanismyname";
		countVowels(name);
		
		
	}

	
	public static void countVowels(String str) 
	{
		int vowelCount=0;
		
		int consonatCount=0;
		
		for(int i=0; i<str.length(); i++) 
		{
			if(isVowel(str.charAt(i))) 
			{
				vowelCount++;
			}
			else
			{
				consonatCount++;
			}
		}
		
		System.out.println("Vowels Count:=>"+vowelCount);
		System.out.println("ConsonatCount:=>"+consonatCount);
	}


	private static boolean isVowel(char ch) {
		
	  char	chr=Character.toUpperCase(ch);
		
System.out.println(chr);
	  
	  Boolean isovel=false;
		if(chr=='A') 
		{
		
			isovel=true;
		}
		else if(chr=='E') 
		{
			isovel=true;
		}
		
		else if (chr=='O')
		{
			isovel=true;	
		}
		else if(chr=='U') 
		{
			isovel=true;
		}
		else if(chr=='I') 
		{
			isovel=true;
		}
		return isovel;
	}
	
}
