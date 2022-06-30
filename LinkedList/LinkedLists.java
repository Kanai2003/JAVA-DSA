package LinkedList;
/** Some Propaties of LinkedList =>
        1. Variable size
        2. Non-contiguous Memory
        3. insert in O(1)
        4. Search in O(n)

First node of LinkedList is called as "Head". 
Last node of LinkedList is called as "Tail".

LinkList => 
    1. Singular 
    2. Double ended ()
    3. Circular (Head and tail is connected to each other) . That means it has not any null node


*/


public class LinkedLists {
    Node head;
    private int size;            // we are creating a veriable which will help us to calculate size of the linked list

    LinkedLists(){                 //by this constructor we are asigning 0 as a size 
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add-first---------------------
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head  = newNode ; 
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add-last----------------------
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null ){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    //delete-first----------------
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty ");
            return;
        }
        size--;
        head = head.next;
    }

    //delete-last---------------
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty ");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;  //if head.next = null -> last.Next = null
        while (lastNode.next != null){    
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    //print------------------
    public void printList(){
        if(head == null){
            System.out.println("List is empty ");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Return size-----------------------------
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
    
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
    }
}
