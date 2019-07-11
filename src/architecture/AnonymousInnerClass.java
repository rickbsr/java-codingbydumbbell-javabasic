package architecture;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        // Ex. Anonymous Inner Class
        new Thread() {
            @Override
            public void run() {
                // code...
                System.out.println("Anonymous Inner Class");
            }
        }.start();
    }
}
