import java.util.*;

public class QueueUsingCollectionFramework {
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>(); 
    // Queue<Integer> q = new ArrayDeque<>();

    //search in google , diff. of LinkedList & ArrayDeque & why interface and class are different
    

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(! q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
