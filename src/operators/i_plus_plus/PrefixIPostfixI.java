package operators.i_plus_plus;

public class PrefixIPostfixI {

    public static void main(String[] args) {
    }

    static void printIPlus() {
        int i = 0;
        System.out.print(i++);
        System.out.println(i);
    }

    static void printPlusI() {
        int i = 0;
        System.out.print(++i);
        System.out.println(i);
    }

    static void testIPlus() {
        int i = 0;
        i++;
    }

    static void testPlusI() {
        int i = 0;
        ++i;
    }

    static void testIPlus2() {
        int i = 0;
        System.out.println(i++);
    }

    static void printPlusI2() {
        int i = 0;
        System.out.println(++i);
    }
}

