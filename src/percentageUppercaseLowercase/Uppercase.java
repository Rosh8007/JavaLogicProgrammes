package percentageUppercaseLowercase;

public class Uppercase {

	
	public static void main(String[] args) 
	{
		
		String str="R";
		
		getPercentage(str);
		
	}
	
	public static void getPercentage(String str) 
	{
		
		int Uppercase=0;
		int lowercase=0;
		int digits=0;
		int specChar=0;
		int space=0;
		
		for(int i=0; i<str.length(); i++) 
		{
			char ch= str.charAt(i);
			
			//System.out.println(ch);
			
			if(Character.isUpperCase(ch)) 
			{
			   Uppercase++;	
			 
			}
			
			else if (Character.isLowerCase(ch))
			{
				lowercase++;
			}
			else if (Character.isDigit(ch))
			{
				digits++;
			}
			else if (ch==' ')
			{
				space++;
			}
			
			String sp="@#$%^&*()!:;><?{}[]|";
		    char	sppp[]=sp.toCharArray();
			for (char spp : sppp) 
			{
				if(ch==spp) 
				{
					specChar++;
				}
			}
	
			

			
			


		}
		
		double UppercasePerCentage=(Uppercase*100)/str.length();
		double lowercasePercentage=(lowercase*100)/str.length();
		double digitsPercentage=(digits*100)/str.length();
		double specCharPercentage=(specChar*100)/str.length();

		System.out.println("Uppercaser Percentage:=>"+UppercasePerCentage);
		System.out.println("LowerCase Percentage:=>"+lowercasePercentage);
		System.out.println("DigitsPercentage:=>"+digitsPercentage);
		System.out.println("SpecialChar :=>"+specCharPercentage);
		System.out.println("Space :=>"+(space*100)/str.length());
	}
	

}
