package SwappingNumbers;

public class p1 {
	
	public static void main(String[] args) {
		
		int x=12;
		int y=10;
		
//		x=x+y;
//		y=x-y;
//		
//		x=x-y;
		
		x=x^y;
		y=x^y;
		
		x=x^y;
		
		System.out.println(x);
		System.out.println(y);
	}

}
