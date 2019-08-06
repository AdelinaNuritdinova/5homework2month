package adelina;

import java.util.concurrent.CountDownLatch;

public class Guide extends Thread {
    CountDownLatch countDownLatch;

    public Guide(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
            public void run(){
        try {
            for(int i = 1 ; i <= 15 ; i++){
                System.out.println(i);
            }
            sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Done Work");
        countDownLatch.countDown();
    }
}
