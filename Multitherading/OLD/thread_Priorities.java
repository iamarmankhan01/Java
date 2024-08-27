
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 1;

        while(i<100){
            System.out.println("Thank you: " + this.getName());
            i++;
        }

    }
}

public class thread_Priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Arman   (I am  high priorities)");
        MyThr1 t2 = new MyThr1("Atif");
        MyThr1 t3 = new MyThr1("Saif");
        MyThr1 t4 = new MyThr1("Sarfaraj (I lowwwwwwww)");

        t1.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
       
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
