import java.util.Locale.Category;

public class Animal {

    private String name;// Will show this step, as variable is declared here
    private int age;

    public Animal(String name, int age) {
        this.name = name; // When placed cursor on this.name, and pressed f3
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {

        System.out.println(name + " is sleeping.");
    }

    private void breathe() {
        System.out.println(name + " is breathing.");
    }
    private void age(){
        System.out.println( "Age is "+age);
    }

    public static void main(String[] args) {
        Animal a = new Animal("Cat", 1);
        a.eat();
        a.age();
        a.sleep();
        a.breathe();


    }

}
