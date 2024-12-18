import java.util.Iterator;

public class MyArrayListDemo_16 {
    public static void main(String[] args) {
        MyArrayList<String> al = new MyArrayList<>(5);

        al.add("Ariz");
        al.add("Atif");
        al.add("Saif");
        al.add("Virat");
        al.add("Dhoni");
        al.add("Reyaj");
        al.add("Reyaj");
        al.add("Reyaj");

        System.out.println("List after additions: " + al);
        System.out.println("Size: " + al.size());
        System.out.println("Capacity: " + al.capacity());

        Iterator<String> i = al.iterator();
        while (i.hasNext()) {
            String element = i.next();
            if (element.equals("Reyaj")) {
                i.remove(); // Remove duplicates of "Reyaj"
            }
        }

        System.out.println("List after removing duplicates: " + al);
        System.out.println("Size: " + al.size());
        System.out.println("Capacity: " + al.capacity());
    }
}

class MyArrayList<T> implements Iterator<T> {
    private int size;           // Current capacity
    private int index = -1;     // Last valid index
    private int nextIndex = 0;  // Iterator index
    private Object[] objects;   // Array to store elements
    private static final float GROWTH_FACTOR = 0.5f;

    public MyArrayList() {
        this.size = 10;
        objects = new Object[size];
    }

    public MyArrayList(int size) {
        this.size = size;
        objects = new Object[size];
    }

    // Add element to the list
    public void add(T obj) {
        if (index + 1 == size) {
            grow();
        }
        objects[++index] = obj;
    }

    // Grow the array when capacity is exceeded
    private void grow() {
        int newSize = size + (int) (size * GROWTH_FACTOR);
        Object[] newObjects = new Object[newSize];
        System.arraycopy(objects, 0, newObjects, 0, size);
        size = newSize;
        objects = newObjects;
    }

    // Return current number of elements
    public int size() {
        return index + 1;
    }

    // Return current capacity
    public int capacity() {
        return size;
    }

    // Convert list to string
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i <= index; i++) {
            str.append(objects[i]);
            if (i < index) str.append(", ");
        }
        str.append("]");
        return str.toString();
    }

    // Iterator methods
    @Override
    public boolean hasNext() {
        return nextIndex <= index;
    }

    @Override
    public T next() {
        return (T) objects[nextIndex++];
    }

    @Override
    public void remove() {
        if (nextIndex <= 0) {
            throw new IllegalStateException("Next must be called before remove.");
        }
        int removeIndex = --nextIndex;
        System.arraycopy(objects, removeIndex + 1, objects, removeIndex, index - removeIndex);
        objects[index--] = null; // Clear last element
    }

    public Iterator<T> iterator() {
        nextIndex = 0; // Reset iterator
        return this;
    }
}
