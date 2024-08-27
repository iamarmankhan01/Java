class MyThr extends Thread{
    public MyThr(String name){
    super(name);
    } 
    public void run(){
        System.out.println("Thank you");
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyThr t1= new MyThr("Arman Khan");
        MyThr t2= new MyThr("Tabrej Khan");
        t1.start();
        t2.start();
        System.out.println("The id of thread t is "+t1.getId());
        System.out.println("The name is "+t1.getName());
        System.out.println("The id of thread t is "+t2.getId());
        System.out.println("The name is "+t2.getName());
        
    }
}
