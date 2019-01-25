package operators;

public class AndOr {

    public static void main(String[] args) {
        // And
        System.out.println(11 & 9); // 9
        System.out.println(Integer.toBinaryString(11)); // 1011
        System.out.println(Integer.toBinaryString(9)); // 1001

        int a = 0b10100;
        int b = 0b11000;
        System.out.println((a & b) == 0b10000); // true

        // Or
        System.out.println(4 | 8); // 12
        System.out.println(Integer.toBinaryString(4)); // 1011
        System.out.println(Integer.toBinaryString(8)); // 1001
        System.out.println(Integer.toBinaryString(12)); // 1001

        int c = 0b10100;
        int d = 0b11000;
        System.out.println((c | d) == 0b11100); // true
    }
}
