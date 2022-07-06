
public class UsingLinkedList{

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head = null;

        public static boolean isEmpty(){
            return head==null;
        }

        // PUSH operation is used to insert an element into the stack----
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }

        // POP operation is uesd to dalate top most element----------
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int value = head.data;
            head = head.next;
            return value;
        }

        // PEEP operation is used to return topmost value without deleting it-------
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
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