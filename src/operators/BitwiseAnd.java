package operators;

public class BitwiseAnd {

    public static void main(String[] args) {
        int x = 0, y = 1;

        // Bitwise AND
        boolean b = (x != 0) & (y / x > 0); // ArithmeticException

        // 即使 (x != 0) 的結果是 false, 還是會判斷 (y / x > 0), 因此會出現 Exception
        System.out.println(b);
    }
}
