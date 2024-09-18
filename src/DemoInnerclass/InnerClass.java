package DemoInnerclass;

public class InnerClass {
	
	int x=5;
	
	class InnerDemo
	{
		
		int  y=10;
		public int DemoData() 
		{
			return x;
		}
	}
	
	public static void main(String[] args) {
		
		
		InnerClass in=new InnerClass();
		
		   InnerClass.InnerDemo  demoin=in.new InnerDemo();
		
		System.out.println(demoin.DemoData());
		System.out.println(demoin.y);
	}

}
