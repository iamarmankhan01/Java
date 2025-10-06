public class SynchronizationEx implements Runnable {
    public synchronized void printNums(){
       for (int i = 1; i <= 10; i++) {
        System.out.println(Thread.currentThread().getName()+" ==>  "+i);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
       }
    }

    public void run(){
        printNums();
    }
    public static void main(String[] args) {
        SynchronizationEx s = new SynchronizationEx();
        Thread t = new Thread(s);
        t.setName("I am Thread 1 ");
        t.start();

        Thread t1 = new Thread(s);
        t1.setName("I am Thread 2 ");
        t1.start();
    }
    
}
