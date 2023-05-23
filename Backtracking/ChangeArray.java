package Backtracking;

public class ChangeArray {
    

    public static void changeArray(int arr[], int index, int value) {
        
        if (index > arr.length-1) {
            
            return;

        }

        arr[index] = value;

        changeArray(arr, index+1, value+1);

        arr[index] -= 2;

    }


    public static void main(String[] args) {
        
        int arr[] = new int[5];

        PrintArray.printArr(arr);

        changeArray(arr, 0, 1);

        PrintArray.printArr(arr);



    }
}
