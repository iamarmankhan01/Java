
class Thread1 extends Thread{
    public void run(){
        int i =5;
        while(i<40){
        System.out.println("I am arman khan--------------- ");
        System.out.println("i am learnig to the java");
        i++;
    }
}
}
class Thread2 extends Thread{
        public void run(){
            int i=5;
            while(i<40){
            System.out.println("hello i am tabrej ");
            System.out.println("i am learnig to the english");
            i++;
        }
    }
}
public class threading {
   public static void main (String args[]) {
    Thread1 t1 =new Thread1();
    Thread2 t2 = new Thread2();
    t1.start();
    t2.start();

   }
}
