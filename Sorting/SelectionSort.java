package Sorting;

public class SelectionSort {
    public static void sort(int array[]) {

        for (int turn = 0; turn < array.length; turn++) {

            for (int j = 0; j < array.length - 1 - turn; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

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
