package adelina;

import java.util.concurrent.CountDownLatch;

public class Guide extends Thread {
    CountDownLatch countDownLatch;

    @Override
            public void run(){
        try {
            countDownLatch.await();
            System.out.println("done");
            for(int i = 1 ; i <= 15 ; i++){
                System.out.println(i);
            }
            sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Done Work");

    }
}
