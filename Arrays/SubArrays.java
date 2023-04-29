package Arrays;

public class SubArrays {
    

    public static void printSubArrays(int array[]) {
        
        for (int first = 0; first < array.length; first++) {

            for (int second = first; second < array.length; second++) {
                
                System.out.print("[");

                for (int third = first; third <= second; third++) {

                    System.out.print(array[third]);

                    if (third != second) {
                        System.out.print(", ");
                    }
            
                }

                System.out.print("]  ");
            
            }
            System.out.println();
            
        }

      
    }
    


    public static void main(String[] args) {
        
        int arr[] = {2,4,3,6};

        printSubArrays(arr);

        

    }


}
