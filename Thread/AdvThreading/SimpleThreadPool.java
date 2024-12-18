
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start. command =" + command);
        ProcessCommand();
        System.out.println(Thread.currentThread().getName() + "End. ");

    }

    private void ProcessCommand() {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class SimpleThreadPool {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("null" + i);
            executor.execute(worker);

        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("Finished All threads");

    }

}
