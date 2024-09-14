package ReverseWords;

import java.util.Scanner;

public class PlindromeString {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		 String originalstr=sc.nextLine();
		 
		 String   rev="";
		 
		 for(int i=originalstr.length()-1;i>=0; i--) 
		 {
			 rev=rev+originalstr.charAt(i);
		 }
		 System.out.println(rev);
		 if(originalstr.contains(rev)) 
		 {
			 System.out.println("Palindrome String");
		 } 
		 else
		 {
			 System.out.println("Not Palindrome String");
		 }
		 
		 
	}

}
