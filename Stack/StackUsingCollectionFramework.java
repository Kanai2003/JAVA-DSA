import java.util.*;

public class StackUsingCollectionFramework{

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // PUSH operation is used to insert an element into the stack----
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

         // POP operation is uesd to dalate top most element----------
         // PEEP operation is used to return topmost value without deleting it-------
        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}