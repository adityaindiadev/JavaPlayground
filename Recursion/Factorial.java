package Recursion;

public class Factorial {

    public static int printFactorial(int num) {

        if (num == 0) {

            return 1;
        }

        num = num * printFactorial(num - 1);

        return num;
    }

    public static void main(String[] args) {

        System.out.println(printFactorial(4));

    }

}
