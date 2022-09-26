package org.example.ch15;

import java.util.concurrent.CountDownLatch;

class SomeThreadCD extends Thread{
    private CountDownLatch latch;

    public SomeThreadCD(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread running with thread name "+Thread.currentThread().getName());
        System.out.println("Thread execution completed");
        System.out.println("*************************");
        latch.countDown();
        System.out.println("************countdown*************");
    }

}

public class CountDown {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(4);
        SomeThreadCD thread1 = new SomeThreadCD(latch);
        SomeThreadCD thread2 = new SomeThreadCD(latch);
        SomeThreadCD thread3 = new SomeThreadCD(latch);
        SomeThreadCD thread4 = new SomeThreadCD(latch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        try {
            latch.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("I am in main thread");

    }

}
