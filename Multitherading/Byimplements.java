// class B implements Runnable{
//     public void run(){
//      for(int i=1;i<=5;i++){
//         System.out.println("My child Thread");
//      }
//     }
// }

// public class Byimplements {
//     public static void main(String[] args) {
//         B r=new B();
//         Thread t= new Thread(r);
//         t.start();
//         for(int i=1;i<=5;i++){
//             System.out.println("Main Thread");
//          }
//     }
// }


class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("I am thread 1");
        }
    }
}
class Runnable2 implements Runnable {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("I am thread 2");
        }
    }
}
public class Byimplements {
    public static void main(String[] args) {
       Runnable1 b1= new Runnable1();
       Thread  t1 = new Thread(b1);
       Runnable2 b2= new Runnable2();
       Thread  t2 = new Thread(b2);
       t1.start();
       t2.start();

    }
}
