package operators;

public class Complement {

    public static void main(String[] args) {

        // 補數
        int i = 67, ci = ~i;
        System.out.println("i: " + i);
        System.out.println("~i: " + ci);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(ci));

        byte b = 1;
        System.out.println(Integer.toBinaryString(~b));
    }
}
