package ReverseWords;

public class RevWords {
	
	
	public static void main(String[] args) {
		
		
		String str="Deep chanla potta ahe";
		
		revString(str);
		
	}
	
	public static void revString(String str) 
	{
		
		String []   spt=str.split(" ");
		for(int i=spt.length-1; i>=0; i--) 
		{
		
		   System.out.println(spt[i]);	
		}
		
		
	}

}
