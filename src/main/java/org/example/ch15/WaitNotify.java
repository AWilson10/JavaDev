package org.example.ch15;

public class WaitNotify {
    static public int balance = 0;
    public void withdraw(int amount){
        synchronized (this){

            if(balance <= 0){
                try {
                    System.out.println("Waiting for balance updation");
                    wait();
                    System.out.println("balance: " + balance);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful and the current balance is: "+balance);
    }
    public void deposit(int amount){
        System.out.println("We are depositing the amount");
        balance = balance + amount;
        synchronized (this){
            notify();
        }
    }

    public static void main(String[] args) {
        WaitNotify app = new WaitNotify    ();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                app.withdraw(1000);

            }
        });
        thread1.setName("Thread1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                app.deposit(2000);

            }
        });
        thread2.setName("Thread");
        thread2.start();

    }

}