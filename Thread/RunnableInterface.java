
public class RunnableInterface implements Runnable {
    public void run(){
       for(int i=0;i<=100;i++){
        System.out.println("Task 1..");
       }
    }
    public static void main(String[] args) {
        RunnableInterface ri = new RunnableInterface();
        Thread t = new Thread(ri);
        t.start();

        for(int i=0;i<=100;i++){
        System.out.println("Task 2 .?");
       }
    }
     
}