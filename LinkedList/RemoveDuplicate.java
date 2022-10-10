import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}

class Remove_Duplicate_From_LL
{
    Node head;  
    Node temp;
	public void addToTheLast(Node node) 
	{

	  if (head == null) 
	  {
	    head = node;
	    temp = node;
	  }
	  else{
	      temp.next = node;
	      temp = node;
	  }
	}

      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
	/* Drier program to test above functions */
	public static void main(String args[])
    {
       
        
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		  
		 while(t>0)
         {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
		//llist.printList();	
        Solution g = new Solution();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }
}

class Solution
{
    public Node removeDuplicates(Node head) 
    {
        //Base cases, if head is null or head.next is null, simply return head of LinkedList
        if(head==null || head.next==null){
            return head;
        }

        HashSet<Integer> hs=new HashSet<>();
        
        //Create 2 Node pointers prev and curr,prev will point towards to nodes which are considered in our answer,
        //curr is used to traverse the given LinkedList
        Node prev=head;
        Node curr=head;
        hs.add(head.data);
        while(curr!=null){
            //HashSet will contains unique values only, so if a value is not present in it, we consider it in our answer
            if(!hs.contains(curr.data)){
                prev.next=curr;
                prev=prev.next;
            }
            
            hs.add(curr.data);
            curr=curr.next;
        }

        prev.next=null;
        return head;
    }
}
