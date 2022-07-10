import java.util.*;

public class BinaryTree {

    static class Node{
        int data ;
        Node right ;
        Node left;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class Tree{
        static int idx = -1;

        //Building a tree---------------------
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }

        //pre-Order Traversal(1.Root , 2.Left subtree , 3.Right subtree)---------------------
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        
        // Inorder Traversal(1.left subtree , 2.Root , 3.Right Subtree)---------------
        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // postorder Traversal(1.left subtree , 2.Right subtree , 3.Root)------------
        public static void postOrder(Node root){
            if(root == null){
                return ;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        // Level-order Traersal(1.root , 2.next child , 3.next child , ......)------
        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(! q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data +" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        // Count the numbers of nodes in a tree----------------------------
        public static int countNode(Node root){
            if(root == null){
                return 0;
            }
            int leftNode = countNode(root.left);
            int rightNode = countNode(root.right);

            return leftNode + rightNode +1 ;
        }

        // Sum of tree ---------------------------------------
        public static int sumOfTree(Node root){
            if(root == null){
                return 0;
            }
            int leftSum = sumOfTree(root.left);
            int rightSum = sumOfTree(root.right);

            return leftSum + rightSum + root.data;
        }

        // Height of Tree ---------------------------------
        public static int heightOfTree(Node root){
            if(root == null){
                return 0;
            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);

            int myHeight = Math.max(leftHeight,rightHeight)+1;
            return myHeight;
        }

        //Diameter of a tree ---O(n^2)----------------------------------
        // this is not optimized way to calculate diameter try another one---------------
        // public static int diameter(Node root){
        //     if(root == null){
        //         return 0;
        //     }
        //     int dia1 = diameter(root.left);
        //     int dia2 = diameter(root.right);
        //     int dia3 = heightOfTree(root.left)+heightOfTree(root.right)+1;

        //     return Math.max(dia1,Math.max(dia2, dia3));
        // }


        // Diameter of a tree ----O(n)-------------------------------------
        // by this way we are calculation height and diameter simulteniously----- 
        static class TreeInfo{
            int height;
            int diam;
            TreeInfo(int height , int diam){
                this.height = height;
                this.diam = diam;
            }
        }
        public static TreeInfo diameter2(Node root){
            if(root == null){
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameter2(root.left);
            TreeInfo right = diameter2(root.right);
            
            int myHeight = Math.max(left.height ,right.height)+1;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.height+right.height+1;

            int myDiam = Math.max(Math.max(diam1,diam2),diam3);

            TreeInfo myInfo = new TreeInfo(myHeight,myDiam);

            return myInfo;
        }
    
    }
          
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);
        System.out.println("Main Root :\n"+root.data);

        System.out.println("Pre-Order :");
        tree.preOrder(root);

        System.out.println("\nIn-Order :");
        tree.inOrder(root);

        System.out.println("\nPost-Order :");
        tree.postOrder(root);

        System.out.println("\nLevel-Order :");
        tree.levelOrder(root);

        System.out.println("Total Number of Nodes :\n"+ tree.countNode(root));

        System.out.println("Sum of the Tree : \n"+tree.sumOfTree(root));

        System.out.println("Height of the Tree : \n"+tree.heightOfTree(root));

        // System.out.println("Diameter of the Tree : \n"+tree.diameter(root));

        
        // we are calculating height and diameter both simulteniously---------
        System.out.println("Diamater of the tree : \n"+tree.diameter2(root).diam);
        System.out.println("Height of the tree : \n"+tree.diameter2(root).height);


    }

}
