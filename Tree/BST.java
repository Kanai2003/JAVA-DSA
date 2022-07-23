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

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

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
            //case-3: has bost child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data); 
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
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
    }
}
