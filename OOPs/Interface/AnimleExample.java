
//________________________MONKEY - Jumping - eating- etc_________________________

class Monkey{
    void jump(){
        System.out.println("Jumping----");
    }
    void bite(){
        System.out.println("Biting -----");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir---");
    }
    public void eat(){
        System.out.println("eating-");  
    }
    public void sleep(){
        System.out.println("Cat sleeping");
    }
}
public class AnimleExample {
    public static void main(String args[]){
        Human Arman =new Human();
        Arman.eat();
    }
}



