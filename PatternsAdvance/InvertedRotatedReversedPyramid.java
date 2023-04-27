package PatternsAdvance;

/**
 * InvertedRotatedReversed
 */
public class InvertedRotatedReversedPyramid {


    public static void printInvertedRotatedReversedPyramid(int line) {


        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= line; inner++) {
                
                
                
                    if (inner < outer) {
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                    
    
                

            

            }

            System.out.println();

        }
        
    }

    
    public static void main(String[] args) {
        
        printInvertedRotatedReversedPyramid(4);

    }


}