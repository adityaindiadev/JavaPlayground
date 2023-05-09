package Recursion;

public class DecreasingNum {
    
    public static void printDecreasingNum(int num) {
        
        if (num == 0) {
            return;
        }

        System.out.print(num + ", ");

        printDecreasingNum(num-1);

    }
    
    public static void printIncreasingNum(int num) {
        
        if (num == 0) {
            return;
        }

        System.out.print(num + " ");

        printDecreasingNum(num-1);

    }


    public static void main(String[] args) {
        
        printDecreasingNum(5);

    }
}
