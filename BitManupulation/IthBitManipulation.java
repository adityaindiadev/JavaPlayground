package BitManupulation;

public class IthBitManipulation {

    public static void getIthBit(Integer num, Integer i) {

        Integer bitmask = 1;
       
        System.out.println((num & (bitmask << i)) == 0 ? 0 : 1);

    }

    public static void setIthBit(Integer num, Integer i) {

        Integer bitmask = 1;
       
        System.out.println((num | (bitmask << i)));

    }

    public static void clearIthBit(Integer num, Integer i) {

        Integer bitmask = 1;
       
        System.out.println((num & (~(bitmask << i))));
        // return (num & (~(bitmask << i)));

    }
    public static Integer getClearIthBit(Integer num, Integer i) {

        Integer bitmask = 1;
       
        
        return (num & (~(bitmask << i)));

    }

    public static void updateIthBit(Integer num, Integer i, Integer updateNum) {

        if (updateNum == 1){
            setIthBit(num, i);
        } else {
            clearIthBit(num, i);
        }
        Integer n =  getClearIthBit(num, i);

        System.out.println("with new algo: " + ( n | (updateNum<<i)));
    }

    public static void main(String[] args) {

        Integer num = 5;
        Integer i = 2;
        getIthBit(num, i);
        setIthBit(num, 1);
        clearIthBit(num, 0);
        updateIthBit(num, i, 1);

    }
}
