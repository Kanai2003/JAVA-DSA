// package LinkedList;
import java.util.*;
public class LL{
    Node head;
    
    class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    // add first------------------
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    

    // add-last---------------
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first------------------
    public void deleteFirst(String data){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        head = head.next;
    }

    // delete Last-------------
    public void deleteLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return ;
        }
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next  = null;
    }


    // reverse list ----------------------------
    public void reverse() {
        if(head == null || head.next == null){
            return ;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next =  null;
        head = prevNode;

    }

    // print list -----------------
    public void printList(){
        
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        LL list = new LL();

        list.printList();

        list.addFirst("This");
        list.printList();

        list.addLast("is");
        list.printList();

        list.addLast("a");
        list.printList();

        list.deleteLast();
        list.printList();

       list.reverse();
       list.printList();
        
    }
}