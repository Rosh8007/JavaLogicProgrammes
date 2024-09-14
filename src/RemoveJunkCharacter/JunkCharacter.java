package RemoveJunkCharacter;

public class JunkCharacter {

	
	public static void main(String[] args) {
		
		String str="@##$Selenium%#%With**&&Java###Testing@@@";
		
		  str  =str.replaceAll("[^a-zA-Z0-9]", " ");
		 
		 System.out.println(str);
	}
}
