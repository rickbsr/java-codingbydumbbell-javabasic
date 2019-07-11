package architecture;

public class AnonymousInnerClassFinal {

    public static void main(String[] args) {

    }

public void someMethod() {
    int x = 10;
    Object obj = new Object() {
        public String toString() {
            return String.valueOf(x);
        }
    };
    System.out.println(obj.toString());
}
}
