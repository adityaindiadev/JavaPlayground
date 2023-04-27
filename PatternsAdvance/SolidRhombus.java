package PatternsAdvance;

public class SolidRhombus {


    /*

    * * * * 
   * * * * 
  * * * * 
 * * * * 
* * * * 
adityagupta

     */

    public static void printSolidRhombus(int line) {


        for (int outer = 1; outer <= line; outer++) {
            
            for (int inner = 1; inner <= (line - outer) + 1; inner++) {
                

                System.out.print(" ");
               

            }

            for (int inner = 1; inner <= line; inner++) {
                

                System.out.print("* ");
               

            }

            System.out.println();

        }
        
    }

    
    public static void main(String[] args) {
        
        printSolidRhombus(4);

    }

}
