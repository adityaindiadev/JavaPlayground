package PatternsAdvance.Arrays;

public class SubArrays {
    

    public static void printSubArrays(int array[]) {
        
        for (int i = 0; i < array.length; i++) {
            
           for (int j = i+1; j < array.length; j++) {
            
                System.out.print(" [ " + array[i] + ", " );

                for (int k = j; k < j+1; k++) {
                    
                    System.out.print( array[k]  + ", ");

                }

                System.out.print("] " );

           }

           System.out.println();

        }

      
    }
    


    public static void main(String[] args) {
        
        int arr[] = {2,4,3,6};

        printSubArrays(arr);

        

    }


}
