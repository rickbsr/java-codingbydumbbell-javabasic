package operators;

public class Ternary {

    public static void main(String[] args) {

        int i = 1;
        System.out.println(i++ == 1 ? "A" : "B"); // A
        int j = 1;
        System.out.println(++j == 1 ? "A" : "B"); // B
    }
}
