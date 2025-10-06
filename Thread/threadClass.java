public class threadClass extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Task 1");
        }
    }
    public static void main(String[] args) {
        threadClass tc = new threadClass();
        tc.start();
        for (int i = 0; i <= 100; i++) {
            System.out.println("Task 2");
        }
    }
}
