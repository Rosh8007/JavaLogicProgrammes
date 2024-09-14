package DuplicateNum;

public class DupAlfabates {

	public static void main(String[] args) 
	{
		
		
		String s="Roshan is my name";
		
		  char[] c=s.replace(" ", "").toCharArray();
		
		for(int i=0; i<c.length; i++) 
		{
			for(int j=i+1; j<c.length; j++) 
			{
				if(c[i]==c[j]) 
				{
					System.out.println("We found Match "+c[i]);
				}
			}
		}
		
		
	}
}
