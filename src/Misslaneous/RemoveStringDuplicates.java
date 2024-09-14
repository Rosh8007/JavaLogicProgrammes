package Misslaneous;

public class RemoveStringDuplicates {

	
	
	public static void main(String[] args) {
		
		String arr= "Roshan is my name Roshan is not mu name";
		
		
		  String str[]=arr.split(" ");
		  
		  String temp="";
		  
		  for(int i=0; i<=str.length-1;i++) 
		  {
			 for (int j = i+1; j < str.length; j++) {
				
				 if (str[i].equals(str[j])) {
					
					 temp=temp+str[i]+ " ";
				}
			}
		  }	
		  
		  System.out.println(temp);
		  
	}
	
}
