/*
 Once we execute the above program, you will notice the delay in output because Future get () method waits for the callable task to complete.

When you submit a Callable object to an Executor, the framework returns an object of type java. utal, concurrent. Future. This Future object is used to check the results of a Callable Use the get () method to retrieve the result of the future.
 */

import java.util.concurrent.*;

public class MyCallable1 implements Callable {

    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " Starts");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " Ends");

        //Return name of thread.
        return (Thread.currentThread().getName());
    }

}

class MyCallableTest {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        //Collection to store results
        Future list[] = new Future[10];
        for (int i = 0; i < 10; i++) {
            list[i] = executor.submit(new MyCallable1());

        }
        //print Results
        for (Future<String> future : list) {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
            }
        }
        executor.shutdown();
    }
}
