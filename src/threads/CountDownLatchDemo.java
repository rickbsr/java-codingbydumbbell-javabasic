package threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String[] args) {

        // Thread 的數量
        int threads = 3;

        CountDownLatch latch = new CountDownLatch(threads);

        try {
            new WriterA(latch).start();
            new WriterB(latch).start();
            new WriterC(latch).start();

            // 執行緒在此等待
            latch.await();
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WriterA extends Thread {

    private CountDownLatch latch;

    public WriterA(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // 模擬耗時操作
            Thread.sleep(7 * 1000);
            System.out.printf("%s: WriterA finished\n",
                    Thread.currentThread().getName());

            // 完成目標狀態後報備
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WriterB extends Thread {

    private CountDownLatch latch;

    public WriterB(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // 模擬耗時操作
            Thread.sleep(4 * 1000);
            System.out.printf("%s: WriterB finished\n",
                    Thread.currentThread().getName());

            // 完成目標狀態後報備
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WriterC extends Thread {

    private CountDownLatch latch;

    public WriterC(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // 模擬耗時操作
            Thread.sleep(2 * 1000);
            System.out.printf("%s: WriterC finished\n",
                    Thread.currentThread().getName());

            // 完成目標狀態後報備
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}