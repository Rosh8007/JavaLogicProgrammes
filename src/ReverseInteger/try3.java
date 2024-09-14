package ReverseInteger;

import java.util.Arrays;

import ReverseString.StrBuffer;

public class try3 {
	
	public static void main(String[] args) {
		
		Integer a=123456;
		//approach 1
		
		System.out.println(new StringBuffer(String.valueOf(a)).reverse());
		
		 char[] c=Integer.toString(a).toCharArray();
	
		 for (int i = c.length-1; i>=0; i--) {
			
			 System.out.println(c[i]);
		}
	  
		 
		
	}

}
