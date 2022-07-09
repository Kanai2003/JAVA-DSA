public class QueueUsingArray{

    public static class Queue{

        static int arr[];
        static int size;
        static int rear = -1 ;

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static boolean isFull(){
            return size== -1;
        }

        // enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Full Queue ");
                return ;
            }
            arr[++rear] = data;
        }

        // dequeue
        public static int  remove(){
            if(isEmpty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            int front = arr[0];
            for(int i =0 ; i <rear ; i++){      // time complexity =  O(n) ,  so we sholud avoid implement Queue using array
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue ");
                return -1;
            }
            return arr[0];
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