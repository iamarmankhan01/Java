public class Non_SynchronizationEx implements Runnable {

    public void printNums() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ==> " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void run() {
        printNums();
    }
    public static void main(String[] args) {
        Non_SynchronizationEx s = new Non_SynchronizationEx();

        Thread t = new Thread(s);
        t.setName("Thread 1");
        t.start();

        Thread t1 = new Thread(s);
        t1.setName("Thread 2");
        t1.start();
    }
}
