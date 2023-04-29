package Arrays;

import java.util.*;

public class MaxSubArraySumBruteForceBasic {

    public static void printMaxSubArraySum(int array[]) {

        int totalSubarrays = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int first = 0; first < array.length; first++) {

            for (int second = first; second < array.length; second++) {

                // System.out.print("[");
                int sumOfSubArray = 0;

                for (int third = first; third <= second; third++) {

                    sumOfSubArray = sumOfSubArray + array[third];

                    // System.out.print(array[third]);

                    // if (third != second) {
                    // System.out.print(", ");
                    // }

                }

                if (sumOfSubArray > max) {
                    max = sumOfSubArray;
                }

                totalSubarrays++;

                // System.out.print("] ");

                System.out.print("sumOfSubArray: " + sumOfSubArray + " |  ");

            }
            System.out.println();

        }
        System.out.println("Max Sum of Sub Array: " + max);
        System.out.println("Total SubArrays: " + totalSubarrays);

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 6 };

        printMaxSubArraySum(arr);

    }

}
