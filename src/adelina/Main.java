package adelina;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Guide(countDownLatch);

        countDownLatch.await();
        System.out.println("done");

    }
}