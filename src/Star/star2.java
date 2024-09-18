package Star;

import java.util.Iterator;

public class star2 {

	
	public static void main(String[] args) {
		

//		   *
//		  **
//		 ***
//		****

		
		
		
		
		for (int i =1; i<=4; i++) 
		{
		  for (int j =3; j >=i; j--) 
		  {
			  System.out.print(" ");
		  }
		  for (int m = 1; m<=i; m++) 
			{
			   System.out.print("*");
			   System.out.print(" ");      
			}	
			   
			   System.out.println();
			}
		
		}
		
		
	}

