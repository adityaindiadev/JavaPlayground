package PatternsAdvance;


/*

1 2 3 4
1 2 3
1 2
1

 */

public class InvertedNumberPyramid {
    
    public static void printInvertedNumberPyramid(int line){

        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= line+1-outer; inner++) {
                
                System.out.print( inner + " ");

            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        
        printInvertedNumberPyramid(4);

    }
    
}
