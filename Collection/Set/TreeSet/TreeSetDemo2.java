import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2{
    public static void main(String[] args) {
        TreeSet<String> al = new TreeSet<String>();
        System.out.println(al.size());
        al.add("cccc");
        al.add("bbbbbb");
        al.add("aaaaa");
        al.add("dddddd");
        Iterator i = al.iterator();
        while(i.hasNext()){
            String e = (String)i.next();
            System.out.println(e);
        }
    }
}