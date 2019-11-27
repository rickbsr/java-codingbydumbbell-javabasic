package operators.i_plus_plus;

public class DiffIPlusAndPlusI {

    public static void main(String[] args) {
        // diff between ++i and i++
        System.out.println(timingIPlus() - timingPlusI());
    }

    static long timingIPlus() {
        long time = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i == 0) time = System.currentTimeMillis();
            if (i == Integer.MAX_VALUE - 1) time = System.currentTimeMillis() - time;
        }
        return time;
    }

    static long timingPlusI() {
        long time = 0;
        for (int i = 0; i < Integer.MAX_VALUE; ++i) {
            if (i == 0) time = System.currentTimeMillis();
            if (i == Integer.MAX_VALUE - 1) time = System.currentTimeMillis() - time;
        }
        return time;
    }
}
