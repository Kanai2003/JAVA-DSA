

public class CircularQueueUsingArray {
    public static class Queue{
        static int arr[];
        static int rear = -1;
        static int front = -1;
        static int size ;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Full Queue ");
                return;
            }
            if( front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            int value = arr[front];
            // if only 1 element is present
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1)%size;
            }
            return value;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            return arr[front];
        }
    }    

    public static void main(String[] args) {
        Queue q = new Queue(5);

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
