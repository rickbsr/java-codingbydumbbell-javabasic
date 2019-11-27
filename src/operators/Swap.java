package operators;

public class Swap {

    public static void main(String[] args) {

        int a = 1, b = 2;

        // by 「額外空間法」
        int temp = a;
        a = b;
        b = temp;

        // by 「四則運算法」之「加減法」
        a = a + b;
        b = a - b;
        a = a - b;
        // 一行寫法
        a = a + b - (b = a);

        // by 「四則運算法」之「乘除法」
        a = a * b;
        b = a / b;
        a = a / b;
        // 一行寫法
        a = a * b / (b = a);

        // by 「XOR 運算法」
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        // 一行寫法
        a = (a = a ^ b) ^ (b = a ^ b);

        System.out.println("a: " + a + ", b: " + b);
    }
}
