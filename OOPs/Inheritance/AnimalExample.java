
class Animal {
    public void walk() {
        System.out.println("Dog is walking ");
    }

    public void run() {
        System.out.println("Dog is running");
    }

    public void stop() {
        System.out.println("Dog stop");
    }

}

class Dog extends Animal {
    public void blackDog() {

        walk();
    }

    public void whiteDog() {
        run();

    }

    public void blueDog() {
        stop();
    }
}

public class AnimalExample {
    public static void main(String args[]) {
        // Animal A1 = new Animal();
        Dog d = new Dog();
        d.blackDog();
        d.blueDog();

    }
}
