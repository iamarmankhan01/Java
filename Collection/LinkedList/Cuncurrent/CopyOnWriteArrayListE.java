
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListE {

    public static void main(String args[]) {
        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");
        try {
            ArrayListTh1 alt1 = new ArrayListTh1(al);
            Thread tt1 = new Thread(alt1);
            ArrayListTh2 alt2 = new ArrayListTh2(al);
            Thread tt2 = new Thread(alt2);
            tt1.setPriority(10);
            tt1.start();
            tt2.start();
            tt1.join();
            tt2.join();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        System.out.println(al);
    }
}

class ArrayListTh1 implements Runnable {

    CopyOnWriteArrayList<String> al;

    ArrayListTh1(CopyOnWriteArrayList<String> al) {
        this.al = al;
    }

    public void run() {
        Iterator il = al.iterator();
        while (il.hasNext()) {
            try {
                String str = (String) il.next();
                System.out.println("Name : " + str);
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println("Exception in reading: " + ex);
                System.exit(0);
            }
        }
    }
}

class ArrayListTh2 implements Runnable {

    CopyOnWriteArrayList<String> al;

    ArrayListTh2(CopyOnWriteArrayList<String> al) {
        this.al = al;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                al.add("first");
                al.add("second");
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
