package ArrayList;

import java.util.ArrayList;

public class MultiDimension {
    
    public static void printArrayList(ArrayList<ArrayList<Integer>> list) {
        
        for (int i = 0; i < list.size(); i++) {
            
            for (int j = 0; j < list.get(i).size(); j++) {
                
                ArrayList<Integer> nestedList = list.get(i);

                System.out.print(nestedList.get(j) + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(9);
        list3.add(10);
        list3.add(11);
        list3.add(12);

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        printArrayList(mainlist);
    }

}
