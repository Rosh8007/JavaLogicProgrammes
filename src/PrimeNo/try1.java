package PrimeNo;

import java.util.Scanner;

public class try1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Give Me NO");
		int num=sc.nextInt();
		Boolean val=isPrime(num);
		getprimenum(num);
		
		if(val==true)
		{
			System.out.println("No Is prime No");
		}	
		else 
		{
			System.out.println("No Is Not Prime No");
		}
	}

	public static Boolean isPrime(int num) 
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2; i<num; i++) 
		{
			if(num%i==0) 
			{
				return false;
			}
		}
		return true;
	}
	
	public static void getprimenum(int num) 
	{
		
		for(int i=0; i<=num; i++)
		{
			if(isPrime(i)) 
			{
				System.out.print(i+" ");
			}
		}
	}
	
	
}
