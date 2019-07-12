package strings;

public class StringPool {

    static String ss1 = "ABC";
    static String ss2 = new String("ABC");

    public static void main(String[] args) {

        // String Pool
        String s1 = "ABC";
        String s2 = "ABC";
        System.out.println(s1 == s2); //true

        String s3 = new String("ABC");
        System.out.println(s1 == s3); // false

        // static
        System.out.println(s1 == ss1); // true
        System.out.println(s2 == ss2); // false
        System.out.println(s1 == ss2); // false
        System.out.println(ss1 == ss2); // false

        // intern
        String s4 = s3.intern();
        System.out.println(s1 == s4); // true
        System.out.println(s3 == s4); // false
    }
}
