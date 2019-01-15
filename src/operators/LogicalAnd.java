package operators;

public class LogicalAnd {

    public static void main(String[] args) {
        int x = 0, y = 1;

        // Short-circuit(Logical) AND
        boolean b = (x != 0) && (y / x > 0);

        // 因為 (x != 0) 的結果是 false, 因此 (y / x > 0) 就不運算, 直接給予 false
        System.out.println(b);
    }
}
