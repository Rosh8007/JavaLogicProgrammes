package StringMethods;

public class Demo {


	public static void main(String[] args) {
		String s="Welcome";

		System.out.println(s.length());//7
		System.out.println("Welcome".length());//7


		//concat Method:Joins 2 Strings

		String s1="Welcome";
		String s2="to java";
		String s3="Automation";

		System.out.println(s1+s2+s3);

		System.out.println(s1.concat(s2));

		System.out.println(s1.concat(s2).concat(s3));

		System.out.println(s1.concat(s2+s3));


		//Trim();  Remove spaces from left and right of string

		String str="   Welcome   ";
		System.out.println(str.trim());
		System.out.println(str.trim().length());

		//charAt();
		s="welcome";
		System.out.println(s.charAt(2));

		//contains(): returns Boolean value

		System.out.println(s.contains("e"));//true
		System.out.println(s.contains("E"));//false: WhyFalse : cause Contains Method is Case sensitive
		System.out.println(s.contains("Welme"));//returns false : as We need sequence of charter in right sequence

		//Equals Methods and Equals Ignorecase()- compare Strings

		s1="welcome";
		s2="welcome";

		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals("Welcome"));//false :Case Sensitive

		System.out.println(s1.equalsIgnoreCase("Welcome"));//true :NOT a Case Sensitive

		//replace(); we can replace character or sequence of characters in string

		s1="welcome to selenium with java selenium with python selenium with c#";

		System.out.println(s1.replace('e', 'A'));

		System.out.println(s1.replace("selenium", "playwright"));

		//subString(); :- it returns substring from main String();
		//starting index stars with 0
		//ending index stars with 1
		s1="welcome";
		System.out.println(s1.substring(0,3));


		//toUppercase, to lowercase();

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		//Split() : break down string in multiple parts using delimiter:@." ",
		//* % ^ & ( ) : this can not be used as delimiter

		s="abc@gmail.com";

		String	a[]=s.split("@");
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		
		s="$12,34,5,63";
	
		System.out.println(s.replace("$"," "));
		System.out.println(s.replace("$"," ").replace(",", ""));
		
	}

}
