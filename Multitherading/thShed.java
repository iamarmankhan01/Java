class C extends Thread{
  public void run(){
    String n = Thread.currentThread().getName();
    for(int i=1;i<=3;i++){
     System.out.println(n);
    }
  }
}

public class thShed {
  public static void main(String[] args) {
    C t1= new C();
    C t2= new C();
    C t3= new C();

    t1.setName("thread1");
    t2.setName("thread2");
    t3.setName("thread3");

    t1.start();
    t2.start();
    t3.start();

    String n = Thread.currentThread().getName();
    for(int i=1;i<=3;i++){
     System.out.println(n);
    }
  }  
}
