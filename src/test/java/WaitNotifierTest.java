import org.example.*;

public class WaitNotifierTest {

    public static void main1(String[] args) throws InterruptedException {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter1").start();

        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter2").start();

        Notifier notifier1 = new Notifier(msg);
        Notifier notifier2 = new Notifier(msg);
        new Thread(notifier1, "notifier1").start();
        new Thread(notifier2, "notifier2").start();
        System.out.println("All the threads are started");
    }


    public static void main(String[] args) {
        Data data = new Data();
        Thread sender = new Thread(new Sender(data));
        Thread receiver = new Thread(new Receiver(data));

        sender.start();
        receiver.start();
    }

    public static void mainX (String[] args) throws Exception {
        Caller call = new Caller();
        System.out.println("Caller object created");
        Runner run = new Runner();
        System.out.println("Runner object created");
        Closer close = new Closer();
        System.out.println("Closer object created");
        call.call();
        run.run();
        close.close();
    }

}