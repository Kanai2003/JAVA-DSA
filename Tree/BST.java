import java.util.*;

//search time == O(hight of tree)
public class BST {

    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    // Build the Binary search tree--------------------------------------
    public static Node insert(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data>data){
            root.left = insert(root.left , data);
        }else{
            root.right = insert(root.right , data);
        }
        return root;
    }

    // Print the whole tree with inorderSequence---------------------
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //search any element ----------------------------------------
    public static boolean search (Node root ,int  data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }else if (root.data > data){
            return search(root.left , data);
        }else{
            return search(root.right, data);
        }
    }

    // Delete a number or value from the tree-----------------------------
    public static Node delete(Node root , int data){
        if(root.data>data){
            root.left = delete(root.left, data);
        }else if(root.data<data){
            root.right = delete(root.right, data);
        }else{
            //case-1: leaf root
            if(root.left == null && root.right == null){
                return null;
            }
            //case-2 : only one child
            if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
            //case-3: has both child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data); 
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){   //Find out left most node in right subtree
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


    // to print all the values in a range------------------------------
    public static void printInRange(Node root , int x , int y){
        if(root == null){
            return ;
        }
        if(root.data>=x && root.data<=y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }else if(root.data >= y){
            printInRange(root.left, x, y);
        }else{
            printInRange(root.right, x, y);
        }
    }


     //root to leaf  all paths--------------------------------
     public static void printPath(ArrayList<Integer> path){
        for(int i = 0 ; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path) {
        if(root == null){
            return ;
        }
        path.add(root.data);
        //leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }else{   //non-leaf
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int value[] = {3,7,2,6,1,4,5};
        Node root = null;
        for(int i = 0 ; i<value.length ; i++){
            root = insert(root, value[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root, 6)){
            System.out.println("found :)");
        }else{
            System.out.println("not found :(");
        }

        delete(root,5);
        delete(root, 3);
        inorder(root);

        System.out.println();
        printInRange(root, 5, 7);

        System.out.println();
        ArrayList<Integer> path = new ArrayList<Integer>();
        printRoot2Leaf(root,path);
    }
}
