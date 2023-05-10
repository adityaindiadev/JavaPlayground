package Recursion;

public class FirstOccurance {
    

    public static int checkFirstOccurance(int array[], int key, int index) {
        
        if (index == array.length) {
            return -1;
        }
        
        if (array[index] == key) {
            
            return index;

        }


        return checkFirstOccurance(array, key, index+1);
        
        

    }


    public static void main(String[] args) {
        
        int arr[] = { 1, 3, 4, 5, 6 };

        System.out.println(checkFirstOccurance(arr, 5, 0));
        


    }
}
