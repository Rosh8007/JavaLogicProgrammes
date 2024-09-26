package DuplicateNum;
import java.util.ArrayList;
import java.util.List;

public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(40);
        list.add(3);
        list.add(3);
        list.add(20);

        System.out.print("Unique Numbers are : ");
        
        
        List<Integer> uniqueList = new ArrayList<>();
        
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            
            if (count == 1) {
                uniqueList.add(list.get(i));
            }
        }
        
       
        for (int unique : uniqueList) {
            System.out.print(unique + " ");
        }
    }
}
