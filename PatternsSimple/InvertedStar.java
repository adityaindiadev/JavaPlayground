package PatternsSimple;

/*
 
    ****
    ***
    **
    *

 */

public class InvertedStar {
    
    public static void main(String[] args) {
        
        int line = 4;

        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= (line - outer) + 1; inner++) {
                
                System.out.print("* ");

            }

            System.out.println();

        }

    }

}
