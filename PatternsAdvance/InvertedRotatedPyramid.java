package PatternsAdvance;

/*
      * 
    * * 
  * * * 
* * * * 

 */

public class InvertedRotatedPyramid {

    public static void printInvertedRotatedPyramid(int line) {


        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= line; inner++) {
                
                if (inner <= (line - outer) ) {

                    System.out.print("  ");
                    
                } else {
                    
                    System.out.print("* ");

                }

            }

            System.out.println();

        }
        
    }

    
    public static void main(String[] args) {
        
        printInvertedRotatedPyramid(4);

    }

}
