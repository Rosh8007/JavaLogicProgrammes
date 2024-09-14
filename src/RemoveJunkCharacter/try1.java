package RemoveJunkCharacter;

public class try1 {
    
    public static void main(String[] args) {
        
        String str = "!@#$%^&*()_+=Roshan!@#$%^&*()_+=";
        
        String junk = "!@#$%^&*()_+=";
        
        String temp = "";
        char[] ch = junk.toCharArray();
        
        
        
        for (int i = 0; i < str.length(); i++) 
        {
            boolean isJunk = false;
            for (int j = 0; j < ch.length; j++) {
                if (str.charAt(i) == ch[j]) {
                    isJunk = true;
                    break;
                }
            }
            if (!isJunk) {
                temp = temp + str.charAt(i);
            }
        }
        
        System.out.println(temp);
    }
}
