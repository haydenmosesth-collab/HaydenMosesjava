package genericclassbinarytree;

import java.util.LinkedList;
import java.util.Queue;

// Generic Node class for Binary Tree
class Node<T> {
    T data;
    Node<T> left, right;

    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Generic Binary Tree class
class BinaryTree<T> {
    Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    // Depth-First Search: Preorder Traversal (Root -> Left -> Right)
    public void preorderTraversal(Node<T> node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.data).append(" ");
        preorderTraversal(node.left, sb);
        preorderTraversal(node.right, sb);
    }

    // Depth-First Search: Inorder Traversal (Left -> Root -> Right)
    public void inorderTraversal(Node<T> node, StringBuilder sb) {
        if (node == null) return;
        inorderTraversal(node.left, sb);
        sb.append(node.data).append(" ");
        inorderTraversal(node.right, sb);
    }

    // Depth-First Search: Postorder Traversal (Left -> Right -> Root)
    public void postorderTraversal(Node<T> node, StringBuilder sb) {
        if (node == null) return;
        postorderTraversal(node.left, sb);
        postorderTraversal(node.right, sb);
        sb.append(node.data).append(" ");
    }

    // Breadth-First Search: Level Order Traversal
    public String levelOrderTraversal() {
        if (root == null) {
            return "Tree is empty";
        }
        StringBuilder sb = new StringBuilder();
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<T> temp = queue.poll();
            sb.append(temp.data).append(" ");
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return sb.toString().trim();
    }
}

// Main Driver Class to Execute Test Cases
public class GenericClassBinaryTree {
    public static void main(String[] args) {
        System.out.println("=== BINARY TREE TRAVERSAL TEST CASES ===\n");

        // Test Case 1: Normal (given requirement)
        BinaryTree<Integer> t1 = new BinaryTree<>();
        t1.root = new Node<>(10);
        t1.root.left = new Node<>(5);
        t1.root.right = new Node<>(20);
        StringBuilder sb1 = new StringBuilder();
        t1.preorderTraversal(t1.root, sb1);
        System.out.println("Test Case 1 (Normal): Preorder = " + sb1.toString().trim());

        // Test Case 2: Breadth-first check
        BinaryTree<Integer> t2 = new BinaryTree<>();
        t2.root = new Node<>(10);
        t2.root.left = new Node<>(5);
        t2.root.right = new Node<>(20);
        System.out.println("Test Case 2 (BFS check): Level Order = " + t2.levelOrderTraversal());

        // Test Case 3: Multi-level tree 10(5(2,8),20)
        BinaryTree<Integer> t3 = new BinaryTree<>();
        t3.root = new Node<>(10);
        t3.root.left = new Node<>(5);
        t3.root.right = new Node<>(20);
        t3.root.left.left = new Node<>(2);
        t3.root.left.right = new Node<>(8);
        StringBuilder sb3 = new StringBuilder();
        t3.preorderTraversal(t3.root, sb3);
        System.out.println("Test Case 3 (Multi-level): Preorder = " + sb3.toString().trim());

        // Test Case 4: Single node tree
        BinaryTree<Integer> t4 = new BinaryTree<>();
        t4.root = new Node<>(100);
        StringBuilder sb4 = new StringBuilder();
        t4.preorderTraversal(t4.root, sb4);
        System.out.println("Test Case 4 (Single node): All traversals = " + sb4.toString().trim());

        // Test Case 5: Left-skewed tree (30 -> 20 -> 10)
        BinaryTree<Integer> t5 = new BinaryTree<>();
        t5.root = new Node<>(30);
        t5.root.left = new Node<>(20);
        t5.root.left.left = new Node<>(10);
        StringBuilder sb5_pre = new StringBuilder();
        StringBuilder sb5_post = new StringBuilder();
        t5.preorderTraversal(t5.root, sb5_pre);
        t5.postorderTraversal(t5.root, sb5_post);
        System.out.println("Test Case 5 (Left-skewed): Preorder = " + sb5_pre.toString().trim() + ", Postorder = " + sb5_post.toString().trim());

        // Test Case 6: Right-skewed tree (10 -> 20 -> 30)
        BinaryTree<Integer> t6 = new BinaryTree<>();
        t6.root = new Node<>(10);
        t6.root.right = new Node<>(20);
        t6.root.right.right = new Node<>(30);
        StringBuilder sb6_in = new StringBuilder();
        t6.inorderTraversal(t6.root, sb6_in);
        System.out.println("Test Case 6 (Right-skewed): Inorder = " + sb6_in.toString().trim() + ", BFS = " + t6.levelOrderTraversal());

        // Test Case 7: Empty tree
        BinaryTree<Integer> t7 = new BinaryTree<>();
        System.out.println("Test Case 7 (Empty tree): Output: " + t7.levelOrderTraversal());

        // Test Case 8: Generic String tree
        BinaryTree<String> t8 = new BinaryTree<>();
        t8.root = new Node<>("M");
        t8.root.left = new Node<>("B");
        t8.root.right = new Node<>("X");
        StringBuilder sb8 = new StringBuilder();
        t8.preorderTraversal(t8.root, sb8);
        System.out.println("Test Case 8 (Generic String): Preorder = " + sb8.toString().trim());

        // Test Case 9: Generic Character tree
        BinaryTree<Character> t9 = new BinaryTree<>();
        t9.root = new Node<>('D');
        t9.root.left = new Node<>('B');
        t9.root.right = new Node<>('F');
        StringBuilder sb9 = new StringBuilder();
        t9.preorderTraversal(t9.root, sb9);
        System.out.println("Test Case 9 (Generic Character): Preorder = " + sb9.toString().trim());

        // Test Case 10: Full 7-node tree (BFS)
        BinaryTree<Integer> t10 = new BinaryTree<>();
        t10.root = new Node<>(1);
        t10.root.left = new Node<>(2);
        t10.root.right = new Node<>(3);
        t10.root.left.left = new Node<>(4);
        t10.root.left.right = new Node<>(5);
        t10.root.right.left = new Node<>(6);
        t10.root.right.right = new Node<>(7);
        System.out.println("Test Case 10 (Full 7-node BFS): Level Order = " + t10.levelOrderTraversal());
    }
}