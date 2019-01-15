package operators;

public class Shift {

    public static void main(String[] args) {

        // 右移運算
        System.out.println(4 >> 2); // 1
        System.out.println(4 >> 3); // 0

        // 左移運算
        System.out.println(1 << 2); // 4
        System.out.println(1 << 3); // 8

        // 無負號右移運算
        System.out.println(-1 >>> 1); // 2147483647
        System.out.println(-1 >>> 2); // 1073741823
        System.out.println(-1 ^ -2147483648); // 2147483647
        System.out.println(-1 ^ -2147483648 >> 1); // 1073741823
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
    }
}
