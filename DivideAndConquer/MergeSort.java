package DivideAndConquer;

public class MergeSort {

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void merge(int arr[], int leftStart, int leftEnd, int rightStart, int rightEnd) {

        printArr(arr);

        System.out.println("leftStart: " + leftStart + ", leftEnd: " + leftEnd + ", rightStart: " + rightStart
                + ", rightEnd: " + rightEnd);

        int copyStart = leftStart;

        int mergedArrIndex = 0;

        int tempSize = ((leftEnd-leftStart) + (rightEnd-rightStart)) + 2;

        int tempSortedArr[] = new int[tempSize];
        

        System.out.println("On First While");

        while (leftStart <= leftEnd && rightStart <= rightEnd) {

            if (arr[leftStart] <= arr[rightStart]) {

                System.out.println("Left Executed");

                tempSortedArr[mergedArrIndex] = arr[leftStart];
                leftStart++;
                mergedArrIndex++;
            } else {

                System.out.println("Right Executed");
                tempSortedArr[mergedArrIndex] = arr[rightStart];
                rightStart++;
                mergedArrIndex++;
            }

        }

        System.out.println("On Left While");
        while (leftStart <= leftEnd) {
            System.out.println("On Left While Executing: " + leftStart);
            tempSortedArr[mergedArrIndex] = arr[leftStart];
            leftStart++;
            mergedArrIndex++;
        }

        System.out.println("On Right While");
        while (rightStart <= rightEnd) {
            System.out.println("On Right While Executing: " + rightStart);
            tempSortedArr[mergedArrIndex] = arr[rightStart];
            rightStart++;
            mergedArrIndex++;
        }

        
        System.out.println("tempSortedArr: ");
        printArr(tempSortedArr);
        System.out.println("arr: ");
        printArr(arr);

        for (int i = copyStart, j = 0; j < tempSortedArr.length; i++, j++) {
            System.out.println(i + " = " + tempSortedArr[j]);
            arr[i] = tempSortedArr[j];

            

        }

        System.out.println("after Copying tempSortedArr: ");
        printArr(arr);

    }

    public static void sort(int arr[], int start, int end) {

        if (start >= end) {

            System.out.println("Base Condition Hit:" + start + ", " + end);

            return;

        }

        int mid = (start + end) / 2;

        // for left
        sort(arr, start, mid);

        // for right
        sort(arr, mid + 1, end);

        merge(arr, start, mid, mid + 1, end);

    }

    

    public static void main(String[] args) {

        int arr[] = { 62, 28, 78, 84, 60, 45, 2, 95, 70, 22, 54, 36, 80, 10, 33, 18, 92, 6, 48, 75, 8, 64, 42, 14, 98, 26, 57, 40, 68, 87, 50, 76, 30, 72, 17, 96, 52, 38, 21, 44, 16, 56, 88, 66, 4, 90, 32, 69, 20, 12, 82, 94 };
        

        printArr(arr);
        // try {
        // sort(arr, 0, arr.length - 1);
        // } catch (Exception e) {

        // System.out.println(e);

        // printArr(arr);

        // }

        sort(arr, 0, arr.length-1);

        printArr(arr);

    }
}
