/*
 How CountDownLatch works in Java->
CountDowntatch works in latch principle, main thread will wait until Gate is open. One thread waits for n number of threads specified while creating CountDownlatch in Java. Any thread, usually main thread of application,which calls CountDownLatch,await() will wait until count reaches zero or its interrupted by another Thread. All other thread are required to do count down by calling CountDownLatch. countDown () once they are completed or ready to the job. as soon as count reaches zero, Thread awaiting starts running. One of the disadvantage of CountDownlatch is that its not reusable once count reaches to zero you can not use CountDownLatch any more, but don't worry Java concurrency API has another concurrent utility called CyclicBarrier for such requirements.
 */

 /*
  * 
CountDownLatch======>>>>>>>

This is a more advanced type of synchronization that can be done with concurrenct package.Consider the example where a Organziation needs to recruite 3 Java Developers. For this HR Manager has asked 3 Tech Leads to take interview.The HR Manager wants to distribute the Offer letter only after all the 3 Java Developers have been recruited. In Threading terminology the HR Manger should wait till 3 Java Developers have been recruited.
 */
import java.util.concurrent.CountDownLatch;

public class HRManager {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        TechLead techLead1 = new TechLead(countDownLatch, "Arman");
        TechLead TechLead2 = new TechLead(countDownLatch, "Sam");
        TechLead TechLead3 = new TechLead(countDownLatch, "Aman");

        techLead1.start();
        TechLead2.start();
        TechLead3.start();

        try {
            System.out.println("Hr Manager waiting for recruitment to complete..");
            countDownLatch.await();
            System.out.println("Distribute offer Letter");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class TechLead extends Thread {

    CountDownLatch countDownLatch;

    public TechLead(CountDownLatch countDownLatch, String name) {
        super(name);
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : recruted");

        countDownLatch.countDown();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : Dead");

    }

}
