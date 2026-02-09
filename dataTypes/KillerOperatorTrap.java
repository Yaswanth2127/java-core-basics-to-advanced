package dataTypes;

public class KillerOperatorTrap {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 2;

        int result = a++ + (++b << c) - b-- * a-- ^ ++c;
        System.out.println(result);

    }
}
