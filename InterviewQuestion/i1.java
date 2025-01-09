
//===============Question 1=======================
/* 
class newThread extends Thread {
    newThread() {
        super("My Thread");
        start();
    }
    public void run() {
        System.out.println(this);
    }
}
public class i1 {
    public static void main(String[] args) {
        new newThread();
    }
}
 */
//===============Question 2=======================
/* 
class Super{
    void foo(){
            System.out.println("Super");
        }
    }
    class  Subclass extends Super{
        public void foo(){
            System.out.println("Subclass");
        }
    }
    
    public class i1 {
        public static void main(String[] args) {
           Subclass s1 = new Subclass();
           s1.foo();   
    
           Super s = new Subclass();
           s.foo();
    }
}   
// Output: - Sublass , Subclass
 */
//===============Question 3=======================
/* 
class Parent {
    {
        System.out.println("A");
    }
    static {
        System.out.println("B");
    }
}
public class child extends Parent {
    {
        System.out.println("C ");
    }
    static {
        System.out.println("D ");
    }
    public static void main(String[] args) {
        child child = new child();
    }

}


///Output :  BDAC

 */
//===============Question 4=======================

/* 
    public class i1 implements Runnable {
        public void run() {
            System.out.println("Turning");
        }
    
        public static void main(String[] args) {
            try {
                Thread thread = new Thread(new i1());
                thread.start();
                // Thread state after it has started
                System.out.println(thread.getState());
            } catch (IllegalThreadStateException e) {
                System.out.println("Error: Cannot start a thread twice.");
            }
        }
    }

 */
//===============Question 5=======================

/* 
 class box{
    int width;
    int height;
    int length;
 }
 public class i1 {
    public static void main(String[] args) {
        box obj1 = new box();
        box obj2 = new box();
        obj1.height=1;
        obj1.length=2;
        obj1.width=1;
        obj2 = obj1;
        System.out.println(obj2.height);
    }
}

//Output:   1
 */
//===============Question 6 =======================

/* 
  class Super{
    void foo(){
            System.out.println("Super");
        }
    }
    class  Subclass extends Super{
        public void foo(){
            System.out.println("Subclass");
        }
    }
    
    public class i1 {
        public static void main(String[] args) {
           Super s1 = new Subclass();
           s1.foo();        
    }
}   
   
//Output:   Subclass

 */
//===============Question 7=======================

/* 
abstract class Demo {

    public int a;

    void demo() {
        a = 10;
    }

    // Abstract method without final
    abstract public void get();
}

class Test extends Demo {

    // Override the abstract method
    public void get() {
        demo(); // Initialize `a` before using
        System.out.println("a= " + a);
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.get();
    }
}


//Output a=10

*/

