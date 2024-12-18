import java.util.LinkedList;

public class LinkedListExample_1{
    public static void main(String[] args) {
        /*Linked List Declaration */
        LinkedList<String> linkedList =new LinkedList<String>();
        /*Add(String Element ) is used for adding the element to the linked list */
        linkedList.add("item1");
        linkedList.add("item5");
        linkedList.add("item3");
        linkedList.add("item6");
        linkedList.add("item2");

        /*Display Linked List Content */
        System.out.println("Linked List Content: "+linkedList);

        /*Add First and Last Element */
        linkedList.addFirst("First item");
        linkedList.addLast("Last item");
        System.out.println("LinkedList Content after addition: "+linkedList);
        /*This is how to get and set Values */
        Object firstvar = linkedList.get(0);
        System.out.println("First Element: "+firstvar);
        linkedList.set(0, "Changed first item");
        Object firstvar2=linkedList.get(0);
        System.out.println("First Element after update by set method : "+firstvar2);

        /*Remove first and last element */
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: "+linkedList);
        
        /*Add to a position and remove from a position */
        linkedList.add(0,"Newly added item");
        linkedList.remove(2);
        System.out.println("Final Content: "+linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


    }

}