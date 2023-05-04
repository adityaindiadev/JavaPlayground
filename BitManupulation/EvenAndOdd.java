package BitManupulation;

public class EvenAndOdd {

    public static void checkEvenAndOdd(Integer num) {

        Integer bitmask = 1;
        if ((num & bitmask) == 1) {
            System.out.println("Odd");
        } else
            System.out.println("Even");

    }

    public static void main(String[] args) {

        Integer num = 85698;
        checkEvenAndOdd(num);

    }

}
