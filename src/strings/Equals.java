package strings;

public class Equals {

    public static void main(String[] args) {

        // 物件
        Object o1 = new Object(), o2 = new Object();
        System.out.println(o1.equals(o2)); // false

        // 字串
        String s1 = new String("AAA"), s2 = new String("AAA");
        System.out.println(s1.equals(s2)); // true
    }
}
