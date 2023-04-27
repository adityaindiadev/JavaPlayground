package PatternsAdvance.Arrays;

public class LinearSearch {


    public static void findItemUsingLinearSearch(int array[], int itemToSearch) {
        
        
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] == itemToSearch) {
                
                System.out.println("Item Found at Index: " + i);
                return;

            }

        }

        System.out.println("Not Found");
        

    }
    


    public static void main(String[] args) {
        
        int arr[] = {20,30,40,50,60,70};

        findItemUsingLinearSearch(arr, 33);

        

    }

}
