package operators;

public class XOR {

    public static void main(String[] args) {

        System.out.println(4 ^ 8); // 12
        System.out.println(Integer.toBinaryString(4)); // 100
        System.out.println(Integer.toBinaryString(8)); // 1000
        System.out.println(Integer.toBinaryString(12)); // 1100

        int a = 0b10100;
        int b = 0b11000;
        System.out.println((a ^ b) == 0b1100); // true
    }
}
