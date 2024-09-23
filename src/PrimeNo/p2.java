package PrimeNo;

public class p2 {
	
	
	public static void main(String[] args) {
		
		
		int num=12;
		
		int count=0;
		
		for(int i=1; i<=num; i++) 
		{
			if(num%i==0) 
			{
				count++;
			}
		}
		if (count==2) {
			
			System.out.println("We Have a prime no");
		}else {
			System.out.println("Not a prime no");
		}
		
	}

}
