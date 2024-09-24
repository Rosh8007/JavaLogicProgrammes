package StringBasedQues;

public class p3 {

	// Reapeating first

	public static void main(String[] args) {

		     String str="Indiana";
		     char temp=' ';

				for(int i=0; i<str.length(); i++) 
				{
                      Boolean isreapeating=false;
					for(int j=0; j<str.length(); j++) 
					{
						if (i!=j&&str.charAt(i)==str.charAt(j)) {
							
							isreapeating=true;
							break;
						}
					}
					
					if (isreapeating) 
					{
					   temp = str.charAt(i);
					}
					

				}
				
				if (temp!=' ') {
					System.out.println(temp);
				} else {

					System.out.println("No duplicates");
				}

	}
}
