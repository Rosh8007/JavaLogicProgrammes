package ReverseWords;

public class tryAnagram {

	public static void main(String[] args) {

		String name1="MOMn";
		

     String temp="";

	

		Boolean isPalidrome=false;
		for (int i = 0; i <=name1.length()-1; i++)
		{
             temp=temp+name1.charAt(i);
		}
		if(name1.contains(temp)) 
		{
			isPalidrome=true;
		}
		
		System.out.println("Is Palindrome :"+isPalidrome);

	}

	




}


