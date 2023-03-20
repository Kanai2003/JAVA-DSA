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




    //to get sixe of a tree-----------------------
    public static int size(Node root  ){
        if (root == null){
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }


    //find maximum value of a tree------------------
    public static int maximum(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
    }

    //find minimum value of a tree---------------
    public static int minimum(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left),minimum(root.right)));
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
    //print preorder -------------------
    public static void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.left);
    }

    //print post order ----------------------
    public static void postorder(Node root){
        if(root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    //print data level order------------------------
    public static void levelOrder(Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            System.out.print(curr.data + " ");
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }


    //print left view of a tree-------------------
    // public static void leftView(Node root){
    //     leftViewUtil(root,1);
    // }
    // public static void leftViewUtil(Node root, int level){
    //     if(root == null){
    //         return ;
    //     }
    //     if(list.get(level) == null){
    //         list.add(root);
    //     }
    //     leftViewUtil(root.left, List, level+1);
    //     leftViewUtil(root.right, List, level+1);
    // }    


    //return total height of a tree-----------------
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }

    //return total sum value of a tree----------------
    public static int sumOfTree(Node root){
        if(root == null){
            return 0;
        }
        return root.data+sumOfTree(root.left)+sumOfTree(root.right);
    }

    // Diameter of a tree ----O(n)-------------------------------------
    // by this way we are calculation height and diameter simulteniously----- 
    public static class TreeInfo{
        int height;
        int diameter;
        TreeInfo(int height,int diam){
            this.height = height;
            this.diameter = diam;
        }
    }
    public static TreeInfo heightDiameter(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left = heightDiameter(root.left);
        TreeInfo right = heightDiameter(root.right);
        int height = Math.max(left.height,right.height)+1;
        int dim1 = left.diameter, dim2 = right.diameter, dim3 = left.height+right.height+1;
        int diameter = Math.max(dim1,Math.max(dim2,dim3));
        return new TreeInfo(height, diameter);
    }

    public static void main(String[] args) {
        int value[] = {3,7,2,6,1,4,5};
        Node root = null;
        for(int i = 0 ; i<value.length ; i++){
            root = insert(root, value[i]);
        }
        inorder(root);
        

        // delete(root,5);
        // delete(root, 3);
        // inorder(root);
        // System.out.println();
        // printInRange(root, 5, 7);

        // System.out.println();
        // ArrayList<Integer> path = new ArrayList<Integer>();
        // printRoot2Leaf(root,path);


        System.out.println();
        System.out.println("Size: "+ size(root) );
        System.out.println("Max: "+ maximum(root) );
        System.out.println("Min: "+ minimum(root) );
        System.out.println("Level Order :");
        levelOrder(root);

        // System.out.println("Left View: "+leftView(root););
        
        System.out.println("Height : "+height(root));
        
        System.out.println("Sum of tree : "+sumOfTree(root));

        TreeInfo heightDiameter = heightDiameter(root);
        System.out.println("Height : "+heightDiameter.height+"\nDiameter : "+heightDiameter.diameter);
        
    }
}
