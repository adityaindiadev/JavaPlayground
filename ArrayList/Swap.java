package ArrayList;

import java.util.ArrayList;

public class Swap {

    public static void swapValuesOnIndexes(ArrayList<Integer> list, int index1, int index2) {

        Integer temp = list.get(index2);

        list.set(index2, list.get(index1));
        list.set(index1, temp);

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        swapValuesOnIndexes(list, 2, 0);
        System.out.println(list);

    }

}
