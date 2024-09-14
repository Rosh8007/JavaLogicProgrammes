package StringBasedQues;

public class subString {

	public static void main(String[] args) 
	{
		
		String str="Roshan is my name";
		

	
		for(int i=0; i<str.length(); i++) 
		{
			for(int j=i+1;j<=str.length();j++ ) 
			{
				System.out.println(str.substring(i,j));
			}
		}
	}
}
