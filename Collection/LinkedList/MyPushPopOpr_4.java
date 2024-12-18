import java.util.LinkedList;

public class MyPushPopOpr_4 {
    public static void main(String[] args) {
        LinkedList<String> arr1 = new LinkedList<String>();
        /* Add(String Element ) is used for adding the element to the linked list */
        arr1.add("item1");
        arr1.add("item2");
        arr1.add("item3");
        arr1.add("item4");
        System.out.println(arr1);
        arr1.push("push element");
        System.out.println("After push operation: ");
        System.out.println(arr1);
        arr1.pop();
        System.out.println("After pop operation");
        System.out.println(arr1);

    }
}
