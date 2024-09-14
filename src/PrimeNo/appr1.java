package PrimeNo;

import java.util.Scanner;

public class appr1 {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give Me No :=>");
		  int  num=sc.nextInt();
		  
		  System.out.println("IS prime :- "+isPrime(num));
		  getprime(num);
		
		  
		  
	}
	public static boolean isPrime(int num) 
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
	
   public static Object getprime(int num)
	{
	   
	   System.out.println("Prime No till given digits");
	   for(int i=0; i<num; i++) 
	   {
		   if(isPrime(i)) 
		   {
			   
			   System.out.print(i +" ,");
		   }
	   }
	   
	   
		return true;
	}

}
