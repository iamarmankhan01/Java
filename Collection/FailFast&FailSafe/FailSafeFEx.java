import java.util.concurrent.CopyOnWriteArrayList;
public class FailSafeFEx {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);

        for (int i : al) {
            System.out.println(i);
            if (i == 100) {
                al.add(140);
            }
        }
        System.out.println(al);
    }
}
