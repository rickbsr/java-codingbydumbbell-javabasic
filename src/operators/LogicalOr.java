package operators;

public class LogicalOr {

    public static void main(String[] args) {
        int x = 0, y = 1;

        // Short-circuit(Logical) OR
        boolean b = (x == 0) || (y / x > 0);

        // 因為 (x == 0) 的結果是 true, 因此 (y / x > 0) 就不運算, 直接給予 true
        System.out.println(b);
    }
}
