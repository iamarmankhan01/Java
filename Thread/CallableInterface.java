import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterface implements Callable{
    public Object call() throws Exception {
        System.out.println("Call method Execute..");
        return "success";
    }
    public static void main(String[] args) throws Exception {
        CallableInterface ci = new CallableInterface();
        ExecutorService es = Executors.newFixedThreadPool(10);
        for (int i = 0; i <= 10; i++) {
            Future submit = es.submit(ci);
            System.out.println(submit.get().toString()); // get() waits for result
        }

        es.shutdown();
    }
}
