
import java.util.Arrays;

public class ArraysSort1 {

    public static void main(String[] args) {

        // Creating an array of Emp objects
        Emp[] e = new Emp[]{
            new Emp(10),
            new Emp(5),
            new Emp(12),
            new Emp(1)
        };

        // Sorting the array using Arrays.sort()
        Arrays.sort(e);

        // Printing sorted array
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].id);
        }

        // Searching for an element in the sorted array
        Emp e1 = new Emp(5);
        int p = Arrays.binarySearch(e, e1);
        System.out.println("Position of 5 = " + p);
    }
}

// Employee class implementing Comparable
class Emp implements Comparable<Emp> {

    int id;

    Emp(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Emp e) {
        System.out.println("compareTo called");
        if (this.id > e.id) {
            return 1;
        } else if (this.id < e.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
