public class JavaAtomic {
    public static void main(String[] args) throws InterruptedException {

        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 =new Thread(pt, "t2");
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Processing count = "+pt.getCount());     
    }
}
class  ProcessingThread implements Runnable{
    private volatile int count;

    //int count;;

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Arman ");
            processSomething(i);
            count++;
        }
    }
    public int getCount(){
        return this.count;
    }
    private void processSomething(int i){
        //processing some job
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/*
 * If you will run above program, you will notice that count value varies between 5,6, 7,8. The reason is because count++ is not an atomic operation. So by the time one threads read

 */