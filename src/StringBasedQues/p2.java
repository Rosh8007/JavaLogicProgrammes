package StringBasedQues;

public class p2 {


	public static void main(String[] args) {


		String str="swiss";

		char  ch[]=str.toCharArray();
		char temp=' ';
		for (int i = 0; i < ch.length; i++) {
			
		  Boolean	isreapeating=true;
			
			for (int j = 0; j < ch.length; j++) {
				
				if (i!=j && (ch[i]==ch[j])) {
					
					isreapeating=false;
					break;
				}
			}
			
			if (isreapeating) {
				 temp = ch[i];
				break;
			}
			
		}
		if (temp!=' ') {
			
			System.out.println("First Reapeating digit :"+temp);
		}
		
		else 
		{
			System.out.println("No Repetation found");
		}

	}
}
