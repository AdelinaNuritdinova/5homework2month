package adelina;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(15);
        for (int i = 1; i <= 15; i++) {
            Guide guide = new Guide(countDownLatch, i);
            guide.start();
        }
        countDownLatch.await();
        System.out.println("Группа собрана");
        System.out.println("Экскурсия началась");

    }
}