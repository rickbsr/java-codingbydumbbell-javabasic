package operators;

public class Swap {

    public static void main(String[] args) {

        int a = 1, b = 2;

        // by 額外空間
        int temp = a;
        a = b;
        b = temp;

        // by 加減
        a = a + b;
        b = a - b;
        a = a - b;
        // 一行寫法
        a = a + b - (b = a);

        // by 乘除
        a = a * b;
        b = a / b;
        a = a / b;
        // 一行寫法
        a = a * b / (b = a);

        // by XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        // 一行寫法
        a = (a = a ^ b) ^ (b = a ^ b);

        System.out.println("a: " + a + ", b: " + b);
    }
}
