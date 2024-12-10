class Number {
    int n, tabb, i;

    Number(int x) {
        n = x;
        System.out.println("The table is ");
    }

    void printtable() {
        for (i = 1; i <= 10; i++) {
            tabb = i * n;
            System.out.println(tabb);
        }

    }

}

public class Constructor2 {
    public static void main(String[] args) {
        Number t1 = new Number(6);
        t1.printtable();

    }
}
