class Series {
    int a, d, n;

    void getdata(int x, int y, int z) {
        a = x;
        d = y;
        n = z;
    }

    void putdata() {
        System.out.println("a=" + a);
        System.out.println("d=" + d);
        System.out.println("n=" + n);
    }
}

class APSeries extends Series {
    int T, i;

    void printAP() {
        System.out.println("AP Series");
        for (i = 0; i < n; i++) {
            T = a * (i * d);
            System.out.println(T);
        }
        System.out.println("End of ap series");
    }
}

class GPSeries extends Series {
    int T, i;

    void printGP() {
        System.out.println("GP Series");
        for (i = 0; i < n; i++) {
            T = (int) (a * Math.pow(d, i));
            System.out.println(T);
        }
        System.out.println("End of GP Series");
    }

}

public class Ingeritance2 {
    public static void main(String[] args) {
        APSeries ap = new APSeries();
        GPSeries gp = new GPSeries();
        ap.getdata(10, 20, 5);
        ap.putdata();
        ap.printAP();
        gp.getdata(4, 07, 20);
        gp.putdata();
        gp.printGP();

    }
}
