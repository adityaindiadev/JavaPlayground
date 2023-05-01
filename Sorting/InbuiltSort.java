package Sorting;
import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    

    public static void printArray(Integer array[]) {
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
    public static void main(String[] args) {

        Integer array[] = { 55, 45, 787, 365, 858, 8, 1 };
        // Arrays.sort(array);
        // printArray(array);
        // Arrays.sort(array, 2, array.length-2); //ending index is non inclusive
        Arrays.sort(array, Collections.reverseOrder());
        printArray(array);

    }
}
