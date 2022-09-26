//copy paste start for tutorials

package org.example.ch15;

import java.util.Random;

class RunCounter implements Runnable{
    private int threadNo;

    public RunCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i = 0; i <9; i++){
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The value of i is: "+i+" and the thread number is: "+threadNo);
        }
    }
}

public class Runners {
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new RunCounter(1));
        Thread thread2 = new Thread(new RunCounter(2));
        thread1.start();
        thread2.start();

        new Thread (new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for(int i=0; i<100; i++){
                    Runners.counter++;
                    System.out.println("anaon: " + counter);
                }
                System.out.println("just to show we can thread with no handle (anon)...");
            }
        }).start();

    }

}

