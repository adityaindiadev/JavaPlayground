package Recursion;

public class SumNaturals {
    
    public static int printSumNaturals(int num) {

        if (num == 1) {

            return 1;
        }

        num = num + printSumNaturals(num - 1);

        return num;
    }

    public static void main(String[] args) {

        System.out.println(printSumNaturals(5));

    }

}
