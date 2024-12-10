abstract class pen {
    abstract void write();
    abstract void refil();
}
class Pen1 extends pen{
    void write(){
        System.out.println("Write--------");
    }
    void refil(){

        System.out.println("Refil___-----");
    } 
}
public class ExampleEasy {
    public static void main(String args[]){
        Pen1 Newpen = new Pen1();
        Newpen.write();
    }
}

