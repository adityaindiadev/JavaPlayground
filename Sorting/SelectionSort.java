package Sorting;

import java.util.*;;

public class SelectionSort {
    public static void sort(int array[]) {

        for (int turn = 0; turn < array.length; turn++) {

            int currSmallItemIndex = turn;

            System.out.println("Beofore Swap: " + array[currSmallItemIndex]);

            for (int j = turn + 1; j < array.length; j++) {

                if (array[j] < array[currSmallItemIndex]) {

                    currSmallItemIndex = j;

                }

            }

            int temp = array[turn] ;
            array[turn] = array[currSmallItemIndex];
            array[currSmallItemIndex] = temp;
            System.out.println("After Swap: " + array[turn]);
        }

    }

    public static void printArray(int array[]) {
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {

        int array[] = { 55, 45, 787, 365, 858, 8, 1 };
        sort(array);
        printArray(array);

    }
}
