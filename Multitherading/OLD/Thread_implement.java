

class Runnable1 implements Runnable{
    public void run(){
        int i=0;
        while (i<50){
        System.out.println("Hello i am stranger");
        i++;
        }
    }
}

class Runnable2 implements Runnable{
    public void run(){
        int i=0;
        while (i<50){
        System.out.println("Hello i am 0000000000000000000000");
        i++;
        }
    }
}
public class Thread_implement {
    public static void main (String args[]) {
        Runnable1 st1 =new Runnable1();
        Thread load1 = new Thread(st1);
        Runnable2 st2 =new Runnable2();
        Thread load2 = new Thread(st2);
        load1.start();
        load2.start();

    }
}
