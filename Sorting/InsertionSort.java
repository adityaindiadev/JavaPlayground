package Sorting;

public class InsertionSort {
    
    public static void sort(int array[]) {

        for (int i = 0; i < array.length; i++) {

           int curr = array[i];
           int prev = i-1;

           while (prev >= 0 && array[prev] > curr) {

                array[prev + 1] = array[prev];

                prev--;

           }

           array[prev + 1] = curr;

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
