package BitManupulation;

public class BitwiseOperators {

    static StringBuilder printBinary(Integer[] binary, Integer id) {
        // Iteration over array

        StringBuilder binaryNum = new StringBuilder("");
        for (int i = id - 1; i >= 0; i--){
            System.out.print(binary[i] + "");
            
            binaryNum.append(binary[i].toString());
        }

        System.out.println();
        return binaryNum;
    }

    // Function converting decimal to binary
    public static void decimalToBinary(Integer num) {
        // Creating and assigning binary array size
        Integer[] binary = new Integer[35];
        Integer id = 0;

        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }

        // Print Binary
        printBinary(binary, id);
    }

    public static void printBitwiseOperators(Integer num1, Integer num2) {

        
        System.out.println("\n" + num1 + ", " + num2);
        decimalToBinary(num1);
        
        decimalToBinary(num2);

        System.out.println(num1 + " AND " + num2 + ": " + (num1 & num2));
        System.out.println(num1 + " OR " + num2 + ": " + (num1 | num2));
        System.out.println(num1 + " XOR " + num2 + ": " + (num1 ^ num2));
        System.out.println(num1 + " 1's Compliment: " + (~num1));
        System.out.println(num1 + " Left Shift << "  + (num1 << 2));
        System.out.println(num2 + " Left Shift >> " + (num2 >> 2));
        

    }

    public static void main(String[] args) {
        Integer number1 = 5;
        Integer number2 = 6;

        printBitwiseOperators(number1, number2);
    }

}
