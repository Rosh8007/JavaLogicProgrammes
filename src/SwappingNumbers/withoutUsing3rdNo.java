package SwappingNumbers;

public class withoutUsing3rdNo {
	
	
	public static void main(String[] args) {
		
		int x=5;
		int y=10;
		
//	int t;
		
//		t=x;
//		x=y;
//		y=t;	
		
		
//		x=x+y;
//		y=x-y;
//		x=x-y;
//		
		
		
//		x=x*y;
//		y=x/y;
//		x=x/y;
		
		
	//	4. Using XOR Operator
		
		x= x^y;
		y=x^y;
		x=x^y;
		System.out.println(x);
		
		System.out.println(y);
		
	}

}
