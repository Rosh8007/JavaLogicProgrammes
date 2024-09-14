package ReverseString;

public class reverseWordsInString {
	
	
	public static void main(String[] args) {
		
		String str="Roshan is My Name";
		
          String  str1=str.replace(" ","");
          
          System.out.println(str1);
         
		char ch[]=str1.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) 
		{
			System.out.print(ch[i]);
		}
	}

}
