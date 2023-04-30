package Arrays;

public class ReverseArray {

    public static void reverseAnArray(int arr[]) {

        // int start = 0;
        // int end = arr.length-1;

        // while (start < end) {

        // int temp = arr[start];
        // arr[start] = arr[end];
        // arr[end] = temp;

        // start++;
        // end--;

        // }

        for (int start = 0, end = arr.length - 1; start < arr.length / 2; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        }

    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6, 7, 9, 55 };

        reverseAnArray(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    }

}
