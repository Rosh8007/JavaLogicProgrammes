
package ReverseWords;

import java.util.Iterator;
import java.util.Scanner;

public class p1 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Give input string");
		String	a=sc.nextLine();

		String rev="";
		
		for (int i = a.length()-1; i>=0; i--) {
			
		       rev=rev+a.charAt(i);
		}
		System.out.println(rev);


		if (a.equals(rev)) {
			
			System.out.println("Plindrome String");
		}
		else {
			System.out.println("Not Palindrome String");
		}

	}
}
