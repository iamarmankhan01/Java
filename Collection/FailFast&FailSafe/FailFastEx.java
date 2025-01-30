import java.util.ArrayList;
public class FailFastEx {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);

        for (int i : al) {
            System.out.println(i);
            if (i == 100) {
                al.add(140);
            }
        }
    }
}
