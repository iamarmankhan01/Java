class Base{
    void msg(){
        System.out.println("Hello1");
    }
    void show(){

    }
}
class Derive extends Base{
    void msg(){  //-Overridding
        System.out.println("Hello2");
    }
}
public class polymorphism1 {
    public static void main(String[] args) {
        
    
    Derive D = new Derive();
    D.msg();
    }
}
