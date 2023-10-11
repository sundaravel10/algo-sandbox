package binarytree;

public class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }

    public static void printInOrder(Node node){
        if(node == null) return;

        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        BinaryTree.printInOrder(tree.root);
    }
}

