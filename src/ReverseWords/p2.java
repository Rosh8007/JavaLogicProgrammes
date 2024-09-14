package ReverseWords;

public class p2 {
	
	
	public static void main(String[] args) {
		
		String str="Roshan";
		
		String temp="";
		
		for (int i = str.length()-1; i >=0 ; i--) {
			
			temp=temp+str.charAt(i);
			

		}
		System.out.println(temp);
		
	}

}
