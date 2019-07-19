package operators;

public class Equals {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2); // false
        System.out.println(obj1.equals(obj2)); // false

        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        String s1 = "ABC";
        String s2 = "ABC";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true
    }
}
