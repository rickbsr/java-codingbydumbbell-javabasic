package operators;

public class PostfixUnary {

    static int i, a, sum;

    public static void main(String[] args) {

        // postfix
        i = 1;
        System.out.println(i++ == 1); // true
        System.out.println("i = " + i); // i = 2

        // unary
        i = 1;
        System.out.println(++i == 1); // false
        System.out.println("i = " + i); // i = 2

        // Exam 1
        a = 5;
        sum = 0;
        sum = a++ + ++a + a;
        System.out.println("a = " + a); // 7
        System.out.println("sum = " + sum); // 19

        // Exam 2
        a = 5;
        sum = 0;
        sum = a++ +1;
        System.out.println("a = " + a); // 6
        System.out.println("sum = " + sum); // 6
    }
}
