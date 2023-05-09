package Recursion;

public class SortedArray {

    public static int checkSortedArray(int array[], int length) {

        if (length == 2) {

            if (array[length - 1] < array[length - 2])
                return -1;

            else
                return 1;

        }

        if (array[length - 1] < array[length - 2]) {
            return -1;
        } else {
            int res = checkSortedArray(array, length - 1);
            return res;
        }

    }

    public static void main(String[] args) {

        // int arr[] = { 1, 3, 4, 5, 6 };
        int arr[] = { -12, -11, -10, -9, -8, -7, -6 };

        System.out.println(checkSortedArray(arr, arr.length));

    }

}
