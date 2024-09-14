package evenLengthWorldString;

public class splitOperatorDemo {

	
	public static void main(String[] args) {
		
		String s="Roshan is my name";
		
		int count=0;
		
		for(String str:s.split(" ")) 
		{
			System.out.println(str);
			
			count++;
		}
		
		System.out.println(count);
		
		
		duplicate();
		
	}
	
	
	public static void duplicate() 
	{
		String a="Roshan is ROshan is";
		
		  String[] s =a.split(" ");
		  for(int i=0; i<s.length; i++) 
		  {
			

			  for(int j=i+1; j<s.length; j++) 
			  {
				  if(s[i].equalsIgnoreCase(s[j])) 
				  {
					  System.out.println("Duplicate is:"+s[i]);
				  }
			  }
		  }
	}
}
