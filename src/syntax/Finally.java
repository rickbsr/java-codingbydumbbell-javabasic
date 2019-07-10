package syntax;

public class Finally {

    public static void main(String[] args) {
        tryByReturn();
        tryByException();
        tryByExit();
    }

    private static void tryByReturn() {
        try {
            // code...
            System.out.println("Ex. A...");
            return;
        } finally {
            System.out.println("A");
        }
    }

    private static void tryByException() {
        try {
            // code...
            System.out.println("Ex. B...");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("B");
        }
    }

    private static void tryByExit() {
        try {
            // code...
            System.out.println("Ex. C...");
            System.exit(-1);
        } finally {
            System.out.println("C");
        }
    }
}
