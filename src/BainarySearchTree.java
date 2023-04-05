public class BainarySearchTree {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root;

    public BainarySearchTree(){
        root = null;
    }
    public BainarySearchTree(int data){
        this.root = new Node(data);
    }

    public void insert(int data){
        root = insert_recursive(root, data);
    }

    private Node insert_recursive(Node root, int data) {
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data){
            root.left = insert_recursive(root.left, data);
        }else if(data > root.data){
            root.right = insert_recursive(root.right, data);
        }
        return root;
    }

    public void inorder(){
        inorder_recursive(root);
    }

    private void inorder_recursive(Node root) {
        if(root == null){
            return;
        }
        inorder_recursive(root.left);
        System.out.print(root.data + "->");
        inorder_recursive(root.right);
    }

    public boolean search(int key){
        root = searchRec(root, key);
        return root != null;
    }

    private Node searchRec(Node root, int key) {
        if(root == null || root.data == key){
            return root;
        }
        if(key < root.data){
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);

    }

    public static void main(String[] args) {
        BainarySearchTree tree = new BainarySearchTree(50);
        BainarySearchTree root = new BainarySearchTree();
        root.insert(30);
        root.insert(10);
        root.insert(5);
        root.insert(5);
        root.insert(89);
        root.insert(23);
        System.out.println(root.search(23));
        root.inorder();
        System.out.println();
        tree.insert(40);
        tree.insert(20);
        tree.insert(20);
        tree.insert(10);
        tree.insert(60);
        tree.insert(55);
        tree.insert(65);
        tree.insert(95);
        tree.inorder();
        boolean res = tree.search(55);
        System.out.println(res);
        res = tree.search(99);
        System.out.println(res);



    }
}
