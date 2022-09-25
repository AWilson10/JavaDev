package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private Data load;

    // standard constructors
    public Receiver(Data data) {
        this.load = data;
    }
    public void run() {
        for(String receivedMessage = load.receive();
            !"End".equals(receivedMessage);
            receivedMessage = load.receive()) {

            System.out.println("packet received: " + receivedMessage);

            // ...
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(0, 1));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted " + e);
            }
        }
    }
}