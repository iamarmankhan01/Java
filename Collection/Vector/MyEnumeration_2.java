
import java.util.Enumeration;
import java.util.Vector;
public class MyEnumeration_2{
    public static void main(String[] args) {
        Vector<String> lang = new Vector<String>();
        Enumeration<String> en = null;
        lang.add("Java");
        lang.add("JSP");
        lang.add("Eervlet");
        lang.add("EJB");
        lang.add("PHP");
        lang.add("PERL");
        en =lang.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());     
        }

    }
}