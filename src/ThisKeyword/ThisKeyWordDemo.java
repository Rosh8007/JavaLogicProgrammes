package ThisKeyword;

public class ThisKeyWordDemo {
	
	//without using this keyword but we need to keep variables,
	//in constructor and instance different.
	int x;
	int z;
	int y;
	
	public ThisKeyWordDemo(int a, int b,int c) 
	{
		x=a;
		y=b;
		z=c;
	}
	
	void display() 
	{
		System.out.println(x+":"+y+":"+z);
	}
	
	public static void main(String[] args) {
		ThisKeyWordDemo Demo=new ThisKeyWordDemo(1,2,3);
		
		Demo.display();
		
		
	}
	

}
