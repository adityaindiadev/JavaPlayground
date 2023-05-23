package DivideAndConquer;



public class SearchInRotatedSortedArray {

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static int search(int arr[], int start, int end, int key) {

        int found = -1;

        if (start > end) {

            System.out.println("Base Hit: " + start +", " + end);

            return -1;
        }

        int mid = (start + end) / 2;

        System.out.println("Start: " + start +", " + "End: " + end);

        System.out.println("Mid: " + mid);
        

        if (arr[mid] == key) {

            System.out.println("Found");
            return mid;
        }

        if (arr[mid] >= arr[start]) {

            System.out.println("Left");

            if (key >= arr[start] && key < arr[mid]) {
                System.out.println("Left > Left");
                found = search(arr, start, mid - 1, key);
            } else {

                System.out.println("Left > Right");
                found = search(arr, mid + 1, end, key);
            }

        }

        else {
            System.out.println("Right");

            if (key <= arr[end] && key > arr[mid]) {
                System.out.println("Right > Right");
                found = search(arr, mid + 1, end, key);
            }

            else {
                System.out.println("Right > Left");
                found = search(arr, start, mid - 1, key);
            }

        }

        return found;

    }

    public static void main(String[] args) {

        int arr[] = { 121, 123, 124, 126, 129, 132, 134, 135, 137, 139, 141, 142, 144, 146, 147, 148, 149, 150, 152, 154, 155, 157, 159, 161, 163, 166, 169, 32, 36, 39, 42, 47, 51, 54, 58, 63, 68, 73, 78, 83, 88, 93, 97, 100, 104, 107, 111, 114, 116, 118 };
        printArr(arr);
        System.out.println(search(arr, 0, arr.length - 1, 118));

    }

}
