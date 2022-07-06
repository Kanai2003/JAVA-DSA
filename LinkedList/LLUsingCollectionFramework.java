// package LinkedList;
import java.util.*;

public class LLUsingCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("String");
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        list.get(1);
        list.get(2);

        for (int i = 0; i< list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println("-> null");

        list.removeFirst();                 // removeFirst is same as delete function on first
        System.out.println(list); 

        list.removeLast();              // removeLast is same as delete function on last
        System.out.println(list);

        list.remove(1);             // delete or remove an list element by it's index number
        System.out.println(list);
    }
}
