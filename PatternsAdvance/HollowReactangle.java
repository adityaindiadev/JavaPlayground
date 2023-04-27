package PatternsAdvance;

/**
* * * * * 
*       * 
*       * 
*       * 
* * * * * 
 */
public class HollowReactangle {

    public static void printHollowRectangle(int rows, int cols) {


        for (int rowNumber = 1; rowNumber <= rows; rowNumber++) {
            
            for (int colNumber = 1; colNumber <= cols; colNumber++) {
                
                // System.out.print("* ");

                if (rowNumber == 1 || rowNumber == rows || colNumber == 1 || colNumber == cols) {
                    System.out.print( "* ");
                }

                else{
                    System.out.print(  "  ");
                }

            }

            System.out.println();

        }
        
    }

    
    public static void main(String[] args) {
        
        
        printHollowRectangle(5, 5);

    }

}