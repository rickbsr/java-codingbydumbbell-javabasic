package strings;

public class CompareTo {

    public static void main(String[] args) {

        // 相同的回傳 0, Ex1
        System.out.println("A".compareTo("A"));

        // 不同, 回傳首位不同字 Unicode 的差值, Ex2
        System.out.println("A".compareTo("C"));

        // Ex3
        System.out.println("AA".compareTo("AC"));

        // 若前面全部相同, 只有長度不同, 回傳長度差異, Ex4
        System.out.println("A".compareTo("AAA"));
    }
}
