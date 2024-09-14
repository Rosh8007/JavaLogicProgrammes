package StringManupulation;

public class DemoStringManp {


	public static void main(String[] args) 
	{

		String str="The rain has stopped here";

		String str1="The rain haS stopped here";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf("a"));

		System.out.println(str.indexOf('e',str.indexOf('e')+1));// to know second occurence of e

		System.out.println(str.indexOf("here"));

		System.out.println(str.indexOf("Hello"));// will give -1 Ans which shows

		System.out.println(str.equals(str1));

		System.out.println(str.equalsIgnoreCase(str1));


		//Substring
		//In between these two it will find the  
		System.out.println(str.substring(0,8));


		String ss="   Hello World    ";

		//Remove Before Space and After Space
		System.out.println(ss.trim());
		
		
		System.out.println(ss.replace(" ", "!!"));
		
		
		
		String test="Hello_World_Test_Selenium";
		
		// Split method
	
		String[] data =test.split("_");
		

		for(int i=0; i<data.length;i++) 
		{
			System.out.println(data[i]);
		}
		
		String x="Hello";
		String y="Selenium";
		
		int a=13;
		int b=53;
		
		//concadination of String meaning to merge and adding two things.
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		





	}

}
