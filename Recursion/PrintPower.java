package Recursion;

public class PrintPower {

    public static int power(int num, int n) {

        if (n == 1) {

            return num;

        }

        return num * power(num, n - 1);

    }

    public static void main(String[] args) {

        System.out.println(power(3, 3));

    }
}
