package Arrays;

import java.util.*;

public class LargestAndSmallestInArray {

    public static void findLargestAndSmallestInArray(int array[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

            int item = array[i];

            if (largest < item) {

                largest = item;

            }

            if (smallest > item) {

                smallest = item;

            }

        }

        System.out.println("largest: " + largest + ", smallest: " + smallest);

    }

    public static void main(String[] args) {

        int arr[] = { 1000, 20, 30, -1, 40, 2000, 50, 60, 70, 5 };

        findLargestAndSmallestInArray(arr);

    }

}
