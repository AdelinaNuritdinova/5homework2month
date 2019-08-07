package adelina;

import java.util.concurrent.CountDownLatch;

public class Guide extends Thread {
    CountDownLatch countDownLatch;
    int humans;

    public Guide(CountDownLatch countDownLatch, int humans) {
        this.countDownLatch = countDownLatch;
        this.humans = humans;
    }

    @Override
            public void run(){
        try {
            System.out.println(humans);
            countDownLatch.countDown();
            if(humans < 15){


//            for(int i = 1 ; i <= 15 ; i++){
//                System.out.println(i);

            }
            countDownLatch.await();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
//        System.out.println("Done Work");

    }
}
