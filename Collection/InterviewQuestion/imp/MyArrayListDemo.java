import java.util.Iterator;

public class MyArrayListDemo {
    public static void main(String[] args) {
        MyArrayList<String> al = new MyArrayList<>(5);
        al.add("Arman");
        al.add("Salman");
        al.add("Sayam");
        al.add("Rita");
        al.add("Gita");
        System.out.println("Size: " + al.size1());
        System.out.println("Capacity: " + al.capacity());
        System.out.println(al);

        Iterator<String> i = al.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

class MyArrayList<T> implements Iterator<T> {
    private int size1;
    private Object[] objects;
    private float growth = 0.5f; // Growth factor (50%)
    private int index = -1;
    private int next = 0;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int size1) {
        this.size1 = size1;
        objects = new Object[size1];
    }

    public void add(T obj) {
        if (index + 1 == size1) {
            int newSize = size1 + (int) (size1 * growth);
            Object[] temp = new Object[newSize];
            System.arraycopy(objects, 0, temp, 0, size1);
            size1 = newSize;
            objects = temp;
        }
        objects[++index] = obj;
    }

    public int size1() {
        return index + 1;
    }

    public int capacity() {
        return size1;
    }

    @Override
    public boolean hasNext() {
        return next <= index;
    }

    @Override
    public T next() {
        return (T) objects[next++];
    }

    @Override
    public void remove() {
        if (next <= 0) throw new IllegalStateException("next() not called yet.");
        System.arraycopy(objects, next, objects, next - 1, index - next + 1);
        objects[index--] = null;
        next--;
    }

    public Iterator<T> iterator() {
        return this;
    }

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
}
