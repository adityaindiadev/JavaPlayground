package PatternsAdvance.Arrays;

public class BinarySearch {

    public static void findItemUsingBinarySearch(int array[], int itemToSearch) {

        int start = 0;
        int end = array.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {

            mid = (start + end) / 2;

            System.out.println("start " + start +
            "end " + end);

            if (itemToSearch == array[mid]) {
                
                System.out.println(mid);

                return;

            }

            else if (itemToSearch < array[mid]) {

                end = mid - 1;

                
            } else {

                start = mid + 1;
                
            }
        }

        System.out.println(-1);

    }

    public static void main(String[] args) {

        int arr[] = { 20, 30, 40, 50, 60, 70 };

        findItemUsingBinarySearch(arr, 20);

    }

}
