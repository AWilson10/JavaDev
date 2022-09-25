package org.example;

public class Data {
    private String packet;

    // True if receiver should wait
    // False if sender should wait
    private boolean receiver_wait = true;

    public synchronized String receive() {
        System.out.println("Receiver method start. Receiver_wait state: " + receiver_wait);
        while (receiver_wait) {
            try {
                System.out.println("Receiver waiting");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted");
            }
        }
        receiver_wait = true;
        System.out.println("receiver_wait set to true");
        String returnPacket = packet;
        notifyAll();
        System.out.println("Receiver method end  " + returnPacket);
        return returnPacket;
    }

    public synchronized void send(String packet) {
        System.out.println("Sender method start. receiver_wait state is: " + receiver_wait);
        while (!receiver_wait) {
            try {
                System.out.println("Sender waiting");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread Interrupted");
            }
        }
        receiver_wait = false;
        System.out.println("receiver_wait set false");

        this.packet = packet;
        notifyAll();
        System.out.println("Sender method end");
    }
}