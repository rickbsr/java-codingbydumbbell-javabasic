package threads;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

    public static void main(String[] args) {

        // 學生
        String[] students = "ABCDEFGHIJ".split("");
        int computers = 5;

        // 最多就是 5 個許可
        Semaphore semaphore = new Semaphore(computers);

        for (String name : students) {
            new Student(semaphore, name).start();
        }
    }
}

class Student extends Thread {

    private final String name;
    private Semaphore semaphore;

    public Student(Semaphore semaphore, String name) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            // 取得許可
            semaphore.acquire();
            System.out.printf("學生 %s 佔用了一台電腦\n", name);

            // 耗時工作
            int time = new Random().nextInt(15) * 1000;
            Thread.sleep(time);
            semaphore.release();
            System.out.printf("學生 %s 釋放出一台電腦, 共使用 %d 秒\n", name, time / 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
