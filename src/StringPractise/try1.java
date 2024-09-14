package StringPractise;

public class try1 {

	public static void main(String[] args) {

		String s="Roshan";

		char[]  ch =s.toCharArray();
		
		
		int count=0;
		for(int i=0; i<ch.length; i++) 
		{
			 char c=Character.toUpperCase(ch[i]);
			 
			if(c=='A'|c=='E'|c=='I'|c=='O'|c=='U') 
			{
				count++;
			}
		}
		
		System.out.println(count);

		countOwel();
	}
	
	public static void countOwel() 
	{
		String s="Roshan is my name";

		char[]  ch =s.toCharArray();
		
		
		int count=0;
		
		for(int i=0; i<ch.length; i++) 
		{
			 char c=Character.toUpperCase(ch[i]);
			 
			if(c=='A') 
			{
				System.out.println("A Found");
				count++;
			}
			else if (c=='E')
			{
				System.out.println("E Found");
				count++;
			}
			else if (c=='I')
			{
				System.out.println("I Found");
				count++;
			}
			else if (c=='O')
			{
				System.out.println("O Found");
				count++;
			}
			else if (c=='U')
			{
				System.out.println("U Found");
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}
	

}
