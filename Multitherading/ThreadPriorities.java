// class MyTh extends Thread{
//     public MyTh (String name){
//         super(name);
//     }
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("Thank you "+this.getName());
//         }
//     }
// }
// public class ThreadPriorities {
//  public static void main(String[] args) {
//     MyTh t1=new MyTh("Arman khan");
//     MyTh t2=new MyTh("zam");
//     MyTh t3=new MyTh("Programmer");
//     t1.setPriority(Thread.MIN_PRIORITY);
//     t2.setPriority(Thread.MIN_PRIORITY);
//     t3.setPriority(Thread.MAX_PRIORITY);
//     t1.start();
//     t2.start();
//     t3.start();
//  }   
// }



class MyTh extends Thread{
   public MyTh(String name){
      super(name);
   }
   public void run(){
      for(int i=1;i<=10;i++){
         System.out.println("Thank you"+this.getName());
      }
   }
}

public class ThreadPriorities {
 public static void main(String[] args) {
    MyTh t1=new MyTh("Arman khan");
    MyTh t2=new MyTh("zam");
    MyTh t3=new MyTh("Programmer");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
 }   
}
