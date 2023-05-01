package Sorting;

public class CountingSort {

    public static void sort(int array[]) {

        int max = 0;

        for (int i = 0; i < array.length; i++) {

            max = Math.max(max, array[i]);

        }

        System.out.println("max: \n" + max);

        int countingArray[] = new int[max + 1];

        for (int i = 0; i < array.length; i++) {

            countingArray[array[i]]++;

        }

        printArray(countingArray, "Counting Array: ");

        int j = 0;

        for (int i = 0; i < countingArray.length; i++) {

            // System.out.print(countingArray[i]);

            // System.out.print("countingArray[i]: ");
            while (countingArray[i] != 0) {

                // System.out.print(countingArray[i]);

                array[j] = i;
                j++;
                countingArray[i] = countingArray[i] - 1;

            }

        }

    }

    public static void printArray(int array[], String msg) {
        System.out.println();
        System.out.println(msg);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int array[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        printArray(array, "Array: ");
        sort(array);
        printArray(array, "Sorted Array: ");

    }

}
