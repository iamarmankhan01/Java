import java.io.*;

// Node class
class Node {
    Integer data;
    Node next;
}

// Iterator Interface
interface MyIterator {
    boolean hasNext();

    Integer next();
}

// MyLinkedList class
class MyLinkedList implements MyIterator {
    private Node start = null;
    private Node current, iteratorNode;

    public MyIterator myiterator() {
        iteratorNode = start;
        return this;
    }

    public boolean hasNext() {
        return iteratorNode != null;
    }

    public Integer next() {
        if (iteratorNode == null) return null;
        Integer data = iteratorNode.data;
        iteratorNode = iteratorNode.next;
        return data;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public void addFirst(Integer o) {
        Node newNode = new Node();
        newNode.data = o;
        newNode.next = start;
        start = newNode;
    }

    public void addLast(Integer o) {
        Node newNode = new Node();
        newNode.data = o;
        newNode.next = null;
        if (start == null) {
            start = newNode;
        } else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Integer removeFirst() {
        if (start == null) return null;
        Integer data = start.data;
        start = start.next;
        return data;
    }

    public Integer removeLast() {
        if (start == null) return null;
        if (start.next == null) {
            Integer data = start.data;
            start = null;
            return data;
        }
        Node temp = start;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Integer data = temp.next.data;
        temp.next = null;
        return data;
    }

    public void sortAscending() {
        for (Node i = start; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.data > j.data) {
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public void reverse() {
        Node prev = null, current = start, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        start = prev;
    }

    public boolean search(int x) {
        Node temp = start;
        while (temp != null) {
            if (temp.data == x) return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean searchAndReplace(int x, int y) {
        Node temp = start;
        while (temp != null) {
            if (temp.data == x) {
                temp.data = y;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        MyIterator iterator = myiterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

// Main class
public class MyListAsign {
    public static void main(String[] args) throws IOException {
        MyLinkedList list = new MyLinkedList();
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add First\n2. Add Last\n3. Remove First\n4. Remove Last");
            System.out.println("5. Display\n6. Sort Ascending\n7. Reverse\n8. Search");
            System.out.println("9. Search and Replace\n10. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter number to add at first: ");
                    list.addFirst(Integer.parseInt(sc.readLine()));
                    break;
                case 2:
                    System.out.print("Enter number to add at last: ");
                    list.addLast(Integer.parseInt(sc.readLine()));
                    break;
                case 3:
                    System.out.println("Removed First: " + list.removeFirst());
                    break;
                case 4:
                    System.out.println("Removed Last: " + list.removeLast());
                    break;
                case 5:
                    System.out.println("List Content:");
                    list.display();
                    break;
                case 6:
                    list.sortAscending();
                    System.out.println("List Sorted in Ascending Order.");
                    break;
                case 7:
                    list.reverse();
                    System.out.println("List Reversed.");
                    break;
                case 8:
                    System.out.print("Enter number to search: ");
                    int searchNum = Integer.parseInt(sc.readLine());
                    System.out.println("Found: " + list.search(searchNum));
                    break;
                case 9:
                    System.out.print("Enter number to search: ");
                    int oldNum = Integer.parseInt(sc.readLine());
                    System.out.print("Enter new number to replace: ");
                    int newNum = Integer.parseInt(sc.readLine());
                    if (list.searchAndReplace(oldNum, newNum)) {
                        System.out.println("Replaced successfully.");
                    } else {
                        System.out.println("Number not found.");
                    }
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
