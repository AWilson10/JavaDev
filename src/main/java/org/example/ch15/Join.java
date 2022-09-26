package org.example.ch15;

public class Join {
    public int counter = 0;

    public static void main(String[] args) {
        Join app = new Join();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    app.counter++;
                }
                System.out.println("thread 1 finished");
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                for (int i = 0; i < 1000; i++) {
                    app.counter++;
                }
                System.out.println("thread 2 finished");

            }
        });
        thread1.start();
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("main thread finished");
        System.out.println("The value of counter: " + app.counter);
    }

}
