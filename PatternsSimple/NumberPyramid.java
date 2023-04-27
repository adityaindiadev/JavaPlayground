package PatternsSimple;

/*
 

1 
1 2 
1 2 3 
1 2 3 4 

 */

public class NumberPyramid {
    
    public static void main(String[] args) {
        
        int line = 4;

        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= outer; inner++) {
                
                System.out.print(inner + " ");

            }

            System.out.println();

        }

    }

}
