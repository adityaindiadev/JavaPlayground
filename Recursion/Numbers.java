package Recursion;

public class Numbers {
    
    public static void printDecreasingNum(int num) {
        
        if (num == 0) {
            return;
        }

        System.out.print(num + ", ");

        printDecreasingNum(num-1);

    }
    
    public static void printIncreasingNum(int num) {
        
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }

        printIncreasingNum(num-1);
        System.out.print(num + " ");

    }


    public static void main(String[] args) {
        
        printIncreasingNum(5);

    }
}
