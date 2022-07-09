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
    }

}
