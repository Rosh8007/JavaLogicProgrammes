package ReverseWords;

public class anagram {

	public static void main(String[] args) {



		String a="RAM";

		String b="MAr";

		char[]  a1=a.toCharArray();
		char[] b1=b.toCharArray();


		int count=0; 
		
		for(int i=0; i<a.length(); i++)
		{		
		for(int j=b.length()-1;j>=0 ; j--) 
		{
			if(Character.toUpperCase(a.charAt(i))==Character.toUpperCase(b.charAt(j))) 
			{
				count++;
			}
			
		}
		
		
		}

		if(count==a.length()) 
		{
			System.out.println("Anagram");
		}
		else 
		{
			System.out.println("Not anagram");
		}
		
appr2();
	}
	
	public static void appr2() 
	{
		String a="RAM";
		String b="mar";
		
		String c="";
		
		for(int i=a.length()-1; i>=0; i--) 
		{
			c=c+b.charAt(i);
		}
		
		
		
		if(a.equalsIgnoreCase(c)) 
		{
			System.out.println("Angram");
		}
		else {
			System.out.println("No");
		}
	}
}
