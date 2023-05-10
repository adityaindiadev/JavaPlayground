package Recursion;

public class LastOccurance {

    public static int checkLastOccurance(int array[], int key, int index, int foundIndex) {

        if (index == array.length) {
            return foundIndex;
        }

        if (array[index] == key) {

            return checkLastOccurance(array, key, index + 1, index);

        }

        return checkLastOccurance(array, key, index + 1, foundIndex);

    }

    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 5, 5 };

        System.out.println(checkLastOccurance(arr, 5, 0, -1));

    }

}
