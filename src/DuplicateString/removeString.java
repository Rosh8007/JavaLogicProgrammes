package DuplicateString;

import java.util.HashSet;

public class removeString {
    
    public static void main(String[] args) {
        
        String str = "Roshan is my Roshan is my name";
        
        removeRepetition(str);
        
    }
    
    public static void removeRepetition(String str) {
        String[] words = str.split(" ");
        String result = "";
        
        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result+=words[i] + " ";
               // System.out.println(words[i]);
            }
        }
        
        System.out.println(result);
        
//        HashSet<String> hset=new HashSet<String>();
//        
//        for (int i = 0; i < words.length; i++) {
//			 hset.add(words[i]);
//		}
//        
//        System.out.println(hset);
    }
}
