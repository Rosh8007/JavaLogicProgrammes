package Misslaneous;

public class StringDemo {
	
	
	String s="Roshan";
	
	String str=new String("Roshan");
	
	public static void main(String[] args) {
		
		StringDemo d=new StringDemo();
		System.out.println(d.s);
		System.out.println(d.str);
		
		System.out.println(d.s==d.str);// compairs object
		
		System.out.println(d.s.equals(d.str));// compairs contend 
	}

}
