import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;


        //constructor for Node class;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;

    // creating two constructors one is default and one with single parameter of root value;

    public BinaryTree(int data){
        root = new Node(data);
    }
    public BinaryTree(){
        root = null;
    }

    //implementing insert functionality;
    public void insert(Node node, int data){
        if(data < node.data){
            if(node.left != null){
                insert(node.left, data);
            }else{
                node.left = new Node(data);
            }
        }else if(data > node.data){
            if(node.right != null){
                insert(node.right, data);
            }else{
                node.right = new Node(data);
            }
        }
    }

    // implementing traversing algorithms preOrder;

    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + "->");
        preOrder(node.left);
        preOrder(node.right);
    }

    // implementing traversing algorithms inOrder;
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + "->");
        inOrder(node.right);
    }

    // implementing traversing algorithms postOrder;
    public void postOrder(Node node){
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "->");
    }


    //implementing BFS levelOrderTraversal;
    public void levelOrderTraversal(Node node){
        if(node == null)return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(q.iterator().hasNext()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                Node temp = q.poll();


                assert temp != null;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                System.out.print(temp.data + "->");
            }
        }

    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(20);
        tree.insert(root,5);
        tree.insert(root, 25);
        tree.insert(root, 22);
        tree.insert(root, 15);
        tree.insert(root, 11);
        tree.insert(root, 6);

        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        System.out.println();
        System.out.println();
        tree.levelOrderTraversal(root);

    }
}
