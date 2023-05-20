package ArrayList;

import java.util.ArrayList;

public class ArrayListExample {
    
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        System.out.println(list.get(1));

        list.remove(2);
        System.out.println(list);

        list.set(2, 12);
        System.out.println(list);

        System.out.println(list.contains(12));

        list.add(0, 0);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("Iterating ArrayList Ascending");
        for (int i = 0; i < list.size(); i++) {
            
            System.out.print(list.get(i) + ", ");

        }
        System.out.println("Iterating ArrayList");

        System.out.println("Iterating ArrayList Descending");
        for (int i = list.size()-1; i >= 0; i--) {
            
            System.out.print(list.get(i) + ", ");

        }
        
    }

    
}
