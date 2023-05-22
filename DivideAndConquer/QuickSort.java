package DivideAndConquer;

public class QuickSort {

    public static void quickSort(int arr[], int start, int end) {

        System.out.println("start: " + start + ", " + "end: " + end);

        printArr(arr);

        if (start >= end) {

            System.out.println("base Condition: " + start + ", " + end);
            return;
        }

        int i = start-1;
        int j = start;

        int pivot = arr[end];                           

        while (j < end) {

            System.out.println("j: " + j);
            System.out.println("i in loop: " + i);

            if (arr[j] <= pivot) {

                i++;
                System.out.println("i in loop Incremented: " + i);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

            j++;

            

        }
        System.out.println("i outer: " + i);
        i++;
        System.out.println("i outer Incremented: " + i);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // for Left
        quickSort(arr, start, i - 1);

        // for right
        quickSort(arr, i + 1, end);

    }

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int arr[] = { 62, 28, 78, 84, 60, 45, 2, 95, 70, 22, 54, 36, 80, 10, 33, 18, 92, 6, 48, 75, 8, 64, 42, 14, 98, 26, 57, 40, 68, 87, 50, 76, 30, 72, 17, 96, 52, 38, 21, 44, 16, 56, 88, 66, 4, 90, 32, 69, 20, 12, 82, 94 };

        try {
            quickSort(arr, 0, arr.length - 1);
        } catch (Exception e) {

            System.out.println(e);

            printArr(arr);

        }

        printArr(arr);

    }
}
