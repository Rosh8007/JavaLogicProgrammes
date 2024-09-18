package StringMethods;

public class rev {
	
	
	public static void main(String[] args) {
		
		//Approach 1
		String s="welcome";
		
		String rev="";
		 for(int i=s.length()-1; i>=0; i--) 
		 {
			 rev=rev+s.charAt(i);
		 }
		 
		 System.out.println(rev);
		 
		 //Approach 2
		 
		String s1="welcome";
		
		String rev2="";

		 char ch[] =s1.toCharArray();
		 
		 for(int i=s1.length()-1; i>=0; i--) 
		 {
			 rev2=rev2+ch[i];
		 }
		 
		 System.out.println("Approach 2 :"+rev2);
	}

}
