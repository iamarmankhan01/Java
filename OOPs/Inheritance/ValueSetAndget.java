class Base {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am base and setting x now ");
        this.x = x;
    }

    public void printMe() {
        System.out.println("Hell i am Constructor");
    }
}

class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class ValueSetAndget{
    public static void main(String args[]) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        Derived c = new Derived();
        c.setY(43);
        System.out.println(c.getY());
    }

}
