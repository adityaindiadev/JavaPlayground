package Sorting;

import java.util.*;

public class BubbleSort {

    public static void sort(int array[]) {

        int swap = 0;

        int totalLoopTurns = 0;

        for (int turn = 0; turn < array.length; turn++) {

            

            for (int j = 0; j < array.length - 1 - turn; j++) {

                totalLoopTurns++;

                // System.out.println("\nTurn: " + totalLoopTurns);

                if (array[j] > array[j + 1]) {

                    swap++;

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // System.out.println("swap: " + swap);

                }

            }

            if (swap == 0) {

                System.out.println("Array is Already Sorted !" + swap);
                return;

            }

        }

        System.out.println("Total Swaps: " + swap + "\nTotal Turns: " + totalLoopTurns);

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
