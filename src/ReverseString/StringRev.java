package ReverseString;

public class StringRev {
	
	

	public static void main(String[] args) {
		
		String str="Roshan";
		
	   appr();
		
		int l=str.length();
		
		String rev=" ";
		
		for (int i = l-1; i >=0; i--) 
		{
			
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println("Reverse of String:-"+rev);
	   
	}
	
	public static void appr() 
	{
		String apr="Roshan is my name";
		
		  char[]   c=apr.replace(" ","").toCharArray();
		  
		  for(int i=c.length-1; i>=0; i--) 
		  {
			   System.out.println(c[i]);
		  }
		
	}

}
