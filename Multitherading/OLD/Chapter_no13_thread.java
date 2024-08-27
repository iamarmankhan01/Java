/*class Arman extends Thread{
    public void run(){
        int i=0;
        while (i<100){
        System.err.println("good morning");
        i++;
        }
    }
}
class Arman2 extends Thread{
    public void run(){
        int i=0;
        while (i<100){
        System.err.println("Welcom");
        i++;
        }
    }
}

public class Chapter_no13_thread {
    public static void main(String args[]){

        Arman t = new Arman();
        Arman2 t2= new Arman2();
        t.start();
        t2.start();
    }
}
    */

class Arman extends Thread{
    public void run(){
        int i=0;
        while (i<100){
        System.err.println("good morning");
        i++;
        }
    }
}
class Arman2 extends Thread{
    public void run(){
        int i=0;
        while (i<100){
        System.err.println("Welcom");
        i++;
        }
    }
}

public class Chapter_no13_thread {
    public static void main(String args[]){

        Arman t = new Arman();
        t.setPriority(3);
        Arman2 t2= new Arman2();
        t.setPriority(9);
        System.out.println(t.getPriority());
        System.out.println(t2.getPriority());
        t.start();
        t2.start();
    }
}

