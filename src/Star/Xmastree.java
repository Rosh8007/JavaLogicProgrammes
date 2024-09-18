package Star;

public class Xmastree {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		for (int i = 0; i <=4; i++) 
		{
			
			
			for (int k = 3; k >=i ; k--)
			{
			   System.out.print(" ");	
			}
			for (int j =1; j<=i; j++) {
				
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		

}
}