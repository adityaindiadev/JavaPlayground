package BitManupulation;

public class GetIthBit {

    public static void getIthBit(Integer num, Integer i) {

        Integer bitmask = 1;
       
        System.out.println((num & (bitmask << i)) == 0 ? 0 : 1);

    }

    public static void main(String[] args) {

        Integer num = 5;
        Integer i = 2;
        getIthBit(num, i);

    }
}
