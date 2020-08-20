class Node{
    int item;
    Node left, right;

    public Node(int key) {
        item = key;
        left = right = null;
    }
}
public class Que8 {
    Node root;

    Que8() {
        root = null;
    }

    void postorder(Node node) {
        if (node == null)
            return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.item + "->");
    }

    void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.item + "->");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.item + "->");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        Que8 tree = new Que8();
        tree.root = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right = new Node(1);
        tree.root.left.left = new Node(9);
        tree.root.left.right = new Node(4);
        tree.root.right.right = new Node(6);
        tree.root.right.left = new Node(5);

        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("\n\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\n\nPostorder traversal");
        tree.postorder(tree.root);
    }
}



