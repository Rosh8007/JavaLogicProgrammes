package ReverseInteger;

public class ty1 {

	public static void main(String[] args) {

		Integer num=1234;

		char[] c =num.toString().toCharArray();

		
		
		for(int i=c.length-1; i>=0; i--) 
		{
              System.out.print(c[i]);
		}
		
		System.out.println();
		
		appr2();
	}
	
	public static void appr2() 
	{


		int num=1234;

		int rev=0;
		
		while(num>0) 
		{
			rev=rev*10+num%10;
			
			num=num/10;
		}
		
		System.out.println(rev);
		
	
	}

}
