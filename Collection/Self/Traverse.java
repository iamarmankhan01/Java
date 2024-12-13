import java.util.*;

class first {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Arman Khan");
        names.add("Tabrej Khan");
        names.add("Atif ");
        names.add("Sam Khan");
        names.add("Salman Khan");

        // for Each loop:
        for (String str : names) {
            System.out.println(str + " " + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("________________________");

        // Traversing using Iterator
        Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("=============================== \t");
        // Backward Traversal of Collection
        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious()) {
            String previous = litr.previous();
            System.out.println(previous);

            System.out.println("++++++++++++++++++++++++");

            // for Each method
            names.forEach(str -> {
                System.out.println(str);
            });

            System.out.println("Shouting of element");
            TreeSet<String> set = new TreeSet<>();
            set.addAll(names);
            set.forEach(e -> {
                System.out.println(e);
            });

        }

    }
}