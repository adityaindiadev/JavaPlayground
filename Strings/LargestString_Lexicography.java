package Strings;

public class LargestString_Lexicography {
    

    public static void findLargestString(String array[]) {

        String largest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            
            if (largest.compareToIgnoreCase(array[i]) < 0) {
                
                largest = array[i];

            }
            

        }

        System.out.println("Largest String is: " + largest);

    }


    public static void main(String[] args) {
        
        String arr[] = {"mango", "banana", "apple", "watemelon"};

        findLargestString(arr);

    }
}
