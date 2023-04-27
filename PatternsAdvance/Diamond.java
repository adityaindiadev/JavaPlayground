package PatternsAdvance;

/*

      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *

       */

public class Diamond {


    public static void printDiamond(int line) {


            for (int outer = 1; outer <= line; outer++) {

                for (int spaces = 1; spaces <= (line - outer); spaces++) {
                    
                    System.out.print("  ");

                }

                for (int star = 1; star <= ((2*outer) - 1); star++) {
                    
                    System.out.print("* ");

                }

                System.out.println();
                
                
            }

            for (int outer = line-1; outer >= 1; outer--) {

                for (int spaces = 1; spaces <= (line - outer); spaces++) {
                    
                    System.out.print("  ");

                }

                for (int star = 1; star <= ((2*outer) - 1); star++) {
                    
                    System.out.print("* ");

                }

                System.out.println();
                
                
            }

        }
        
    

    
    public static void main(String[] args) {
        
        printDiamond(5);

    }

}
