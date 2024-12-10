
/*Exchanger is a synchronization
point at which threads can pair and swap elements within pairs. Each thread presents some object on entry to the exchange method, matches with a partner thread, and receives its partner's object on return. An Exchanger may be viewed as a bidirectional form of a SynchronousQueue.

This java program creates 2 threads passing them an exchanger and a message. Each thread prints out its own message, then exchanges it with the other thread, then prints out its new exchanged message. */


import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        Thread t1 = new MyThread(exchanger, "I like Coffee");
        Thread t2 = new MyThread(exchanger, "I like Tea");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    private Exchanger<String> exchanger;
    private String message;

    MyThread(Exchanger<String> exchanger, String message) {
        this.exchanger = exchanger;
        this.message = message;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.getName() + " Message: " + message);
            // Exchange messages with the paired thread
            message = exchanger.exchange(message);
            System.out.println(this.getName() + " Exchanged Message: " + message);
        } catch (Exception e) {
            e.printStackTrace(); // Proper exception handling
        }
    }
}
