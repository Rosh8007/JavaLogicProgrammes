package evenLengthWorldString;

public class evenLengthWorldSt {
	
	public static void main(String[] args) {
		
		String str="my name is roshan aware";
		
		for(String st:str.split(" ")) 
		{
			System.out.println(st);
			if(st.length()%2==0) 
			{
				System.out.println("Even String:=> "+st);
			}
		}
		
		 
	}

}
