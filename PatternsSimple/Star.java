package PatternsSimple;

/**
 
* 
* * 
* * * 
* * * *

 */
public class Star {

    
    public static void main(String[] args) {
        
        int line = 4;

        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= outer; inner++) {
                
                System.out.print("* ");

            }

            System.out.println();

        }

    }

}