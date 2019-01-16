package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    static List<Integer> datas = new ArrayList<>();

    public static void main(String[] args) {

        // Thread 的數量
        int threads = 5;

        CyclicBarrier barrier = new CyclicBarrier(threads, new Runnable() {
            @Override
            public void run() {
                // 當所有執行緒都達到目標狀態時
                System.out.println("All Threads Finished: " + datas);
                System.out.println(Thread.currentThread().getName());
            }
        });

        for (int i = 0; i < threads; i++) {
            new Writer(barrier).start();
        }
    }
}

class Writer extends Thread {

    private CyclicBarrier cyclicBarrier;

    public Writer(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        try {
            // 模擬寫入數據操作(耗時), 並隨機寫入一個 1 ~ 100 的整數
            int time = new Random().nextInt(15) * 1000;
            Thread.sleep(time);
            CyclicBarrierDemo.datas.add(new Random().nextInt(100) + 1);

            System.out.printf("%s 執行完畢, 共耗時 %d 秒.\n",
                    Thread.currentThread().getName(), time / 1000);

            // 所有執行緒都在這邊等待
            cyclicBarrier.await();

            // 後續依然可以運行其他程序, 只是就各至為政.
            // code...

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
