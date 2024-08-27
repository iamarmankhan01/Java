class A extends Thread{
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                System.out.println("Arman Khan");
                Thread.sleep(1000);
                }
        } catch (InterruptedException i) {
            // TODO: handle exception
        }
      
    }
}

public class Extend {

    public static void main(String[] args) throws InterruptedException {
        A t=new A();
        t.start();

        for(int i=1;i<=5;i++){
            System.out.println("Sam Khan");
            Thread.sleep(1000);
            }
    }
}


//////////////===================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


// class Mythread1 extends Thread{
//     public void run(){
//       int i=1;
//       while (i<40) {
//         System.out.println("Hello i am java");
//         i++;
        
//       }  
//     }
// }
// class Mythread2 extends Thread{
// public void run(){
//   int i = 1;
//   while (i<10) {
//     System.out.println("Hello I am python");
//     i++;
//   }
// }
// }
// public class Extend {

//     public static void main(String[] args) throws InterruptedException {
//        Mythread1 t1=new Mythread1();
//        Mythread2 t2=new Mythread2();
//        t1.start();
//        t2.start(); 
//     }
// }