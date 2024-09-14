package DuplicateNum;

public class DuplicateNo {
	
	
	public static void main(String[] args) {
		
		String name[]= {"Java","Python","Ruby","C","Python"};
		
		for(int i=0; i<name.length;i++) 
		{
			
			for(int j=i+1; j<name.length; j++) 
			{
				if (name[i].equals(name[j])) 
				{
					System.out.println("We Found Match :"+name[i]);
				}
				
			}
		}
		
	}

}
