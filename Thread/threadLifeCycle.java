public class threadLifeCycle implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("I am From Run..");
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        threadLifeCycle tlc = new threadLifeCycle();
        Thread t = new Thread(tlc);
        t.start();

    }
}
