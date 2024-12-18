import java.util.LinkedList;

public class LinkedListLoop_3 {
    public static void main(String[] args) {
          /*Linked List Declaration */
        LinkedList<String> linkedlist =new LinkedList<String>();
        linkedlist.add("apple");
        linkedlist.add("Orange");
        linkedlist.add("Mango");

        /*For loop */
        System.out.println("**For Loop**");
        for(int num=0;num<linkedlist.size();num++){
            System.out.println(linkedlist.get(num));
        }

        /*Advancevfor loop */
        System.out.println("**Advance for loop**");
        for(String str: linkedlist){
            System.out.println(str);
        }

        //Using  Iterator
        System.out.println("**Iterator**");
        /*Using while loop */
        System.out.println("**While loop**");
        int num=0;
        while(linkedlist.size()>num){
            System.out.println(linkedlist.get(num));
            num++;
        }
        //Using labmda expression and function operations
        linkedlist.forEach((s) ->System.out.println(s+ "; "));
        System.out.println(" ");

        //using double colon operator in java 8

        linkedlist.forEach(System.out::println);
    }
}
