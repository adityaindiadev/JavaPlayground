package PatternsAdvance.Arrays;

import java.util.*;

public class LargestInArray {
    

    public static void findLargestInArray(int array[]) {

        int largest = Integer.MIN_VALUE;
        
        
        for (int i = 0; i < array.length; i++) {

            int item = array[i];
            
            if (largest < array[i+1]) {
                
                largest = array[i+1];

            }

        }

        System.out.println(largest + largest);
        

    }
    


    public static void main(String[] args) {
        
        int arr[] = {20,30,40,50,60,70};

        findLargestInArray(arr);

        

    }

}
