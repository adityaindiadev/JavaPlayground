// import java.util.*;

public class TypePromotion {
    
   public static void main(String[] args) {
    byte b = 4;
    char c = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.44;


    System.out.println( "Output: " + (((f *b ) + (i % c) - ( d * s ))) );

    System.out.println( "check Data Type: " + ((Object)((f *b ) + (i % c) - ( d * s ))).getClass().getSimpleName() );

    System.out.println("Type Casting To Int: " + ((int)((f *b ) + (i % c) - ( d * s ))) );


    //check Data Type
    // System.out.println( ((Object)b).getClass().getSimpleName()) ;

   }

}
