package PatternsAdvance;

public class TrianglePattern01 {
    
    public static void printTrianglePattern01(int line){

        boolean num = true;
        

        for (int outer = 1; outer <= line; outer++) {

            if ((outer % 2) == 0) {
                    
                num = false;
            }
            else{
                num = true;
            }
            
            for (int inner = 1; inner <= outer; inner++) {

                
                
                System.out.print( (num ? 1 : 0) + " ");
                // System.out.print( num + " ");
                num = !num;
        
            

                

                

            }

            System.out.println();

        }
    }

    public static void main(String[] args) {
        
        printTrianglePattern01(5);

    }

}
