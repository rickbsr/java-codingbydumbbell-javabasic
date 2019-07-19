package threads;

public class Synchronized {

    public static void main(String[] args) {
        // SynchronizedAndGeneral
        testTAG();

        // SynchronizedAndSynchronized
        testSAS();

        // SynchronizedAndSynchronized
        testSASS();
    }

    static final SynchronizedAndGeneral tag = new SynchronizedAndGeneral();

    private static void testTAG() {
        new Thread(() -> tag.synchronizedMethod()).start();
        new Thread(() -> tag.callMethod()).start();
    }

    static final SynchronizedAndSynchronized sas = new SynchronizedAndSynchronized();

    private static void testSAS() {
        new Thread(() -> sas.synchronizedMethod()).start();
        new Thread(() -> sas.callMethod()).start();
    }

    static final SynchronizedAndStaticSynchronized sass = new SynchronizedAndStaticSynchronized();

    private static void testSASS() {
        new Thread(() -> sass.synchronizedMethod()).start();
        new Thread(() -> sass.callMethod()).start();
    }
}

class SynchronizedAndGeneral {
    public synchronized void synchronizedMethod() {
        System.out.println("Start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

    public void callMethod() {
        System.out.println("Call");
    }
}

class SynchronizedAndSynchronized {
    public synchronized void synchronizedMethod() {
        System.out.println("Start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

    public synchronized void callMethod() {
        System.out.println("Call");
    }
}

class SynchronizedAndStaticSynchronized {
    public synchronized void synchronizedMethod() {
        System.out.println("Start");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

    public static synchronized void callMethod() {
        System.out.println("Call");
    }
}