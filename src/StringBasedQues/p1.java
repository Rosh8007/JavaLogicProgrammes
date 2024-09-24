package StringBasedQues;

import java.util.Iterator;

public class p1 {

	

	    public static void main(String[] args) {
	        String str = "swiss";

	        char temp = ' ';
	        boolean isRepeated = false;

	        for (int i = 0; i < str.length(); i++) {
	            isRepeated = false;
	            for (int j = 0; j < str.length(); j++) {
	                if (i != j && str.charAt(i) == str.charAt(j)) {
	                    isRepeated = true;
	                    break;  
	                }
	            }
	            if (!isRepeated) {
	                temp = str.charAt(i);
	                break; 
	            }
	        }

	        if (temp != ' ') {
	            System.out.println("First non-repeated character: " + temp);
	        } else {
	            System.out.println("No non-repeated character found.");
	        }
	    }
	

	}

