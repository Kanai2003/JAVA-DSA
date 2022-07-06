import java.util.*;

public class StackUsingArrayList {
    
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static  boolean isEmpty(){
            return list.size()==0;
        }

        // PUSH operation is used to insert an element into the stack----
        public static void push(int data){
            list.add(data);
        }

        // POP operation is uesd to dalate top most element----------
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int value = list.remove(list.size()-1);
            return value;
        }

        // PEEP operation is used to return topmost value without deleting it-------
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return  list.get(list.size() -1);
        }
    }



    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(! stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
