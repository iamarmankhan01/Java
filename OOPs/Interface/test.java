class Monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}

interface BasicAnmial{
    void eat();
    void sleep();
}
class human extends Monkey implements BasicAnmial{
    void speak(){
        System.out.println("Hello dear");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleep");
    }
}
public class test {

public static void main(String args[]){
  human H1 = new human();
  H1.bite();
  H1.eat();
  H1.sleep();
   

}

}