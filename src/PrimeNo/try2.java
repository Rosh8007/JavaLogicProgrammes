package PrimeNo;

import java.util.Scanner;

public class try2 {

	public static void main(String[] args) 
	{
		
		System.out.println("Give me no :-");
		Scanner sc=new Scanner(System.in);
		    long num=sc.nextLong();
		
		
		System.out.println("Is No Prime :-"+isPrime(num));
		primeno(num);
		
		
	}
	
	public static Boolean isPrime(Long num) 
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
	
	public static void primeno(Long num) 
	{
		
		System.out.println("Prime no that We Found");
		
		
		for(long i=(long)0; i<num; i++) 
		{
			if(isPrime(i)) 
			{
				System.out.print(i+",");
				
			}
		}
		
	}
}
