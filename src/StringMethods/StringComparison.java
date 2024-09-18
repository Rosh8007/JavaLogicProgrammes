package StringMethods;

public class StringComparison {
	
	
	
	public static void main(String[] args) {
		
		String s="welcome";
		String s2="welcome";
		
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println(s==s2);//True
		System.out.println(s.equals(s2));//True
		
		
		String s3=new String("Welcome");
		String s4=new String("Welcome");
		
		System.out.println(s3==s4);//false //== compares Objects.when we use new keyword we are creating new object so s3 is diff from s4
		System.out.println(s3.equals(s4));//True //equals() compares values of objects.
	}

}
