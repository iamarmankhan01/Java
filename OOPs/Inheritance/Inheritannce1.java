
class Base {
    private int a;
    int b;
    protected int c;
    public int d;

    void geta(int x) {
        a = x;
    }

    void getbcd(int x, int y, int z) {
        b = x;
        c = y;
        d = z;
    }

    void puta() {
        System.out.println("a=" + a);
    }

    void putbcd() {
        System.out.println("b=============" + b);
        System.out.println("c=============" + c);
        System.out.println("d=============" + d);
    }
}

class Derived extends Base {
    int e, f;

    void getrf(int x, int y) {
        e = x;
        f = y;
    }

    void putef() {
        System.out.println("e=-----------:" + e);
        System.out.println("f=-----------:" + f);
    }

    void showall() {
        // System.out.println("a="+a); //error
        System.out.println("-------Method Showall----------");
        System.out.println("b=-************" + b);
        System.out.println("c=*************" + c);
        System.out.println("d=*************" + d);
        System.out.println("e=**************" + e);
        System.out.println("f=*************" + f);
    }
}

public class Inheritannce1 {
    public static void main(String[] args) {
        Base B = new Base();
        Derived D = new Derived();
        B.geta(10);
        B.getbcd(20, 30, 40);
        D.getbcd(55, 65, 75);
        D.getrf(85, 95);
        B.puta();
        B.putbcd();
        D.putbcd();
        D.putef();
        D.showall();
    }
}
