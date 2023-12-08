/*  COMP 006: DATA STRUCTURES AND ALGORITHMS
 *  PROGRAMMING TASK 4 - Binary Tree Traversals
 *  Leader:          Rasty Espartero
 *  Contributors:    David Geisler Mahayag       Marc Lorenz Quintana
 *                   Jhanice Pablo               Marian Facunla
 *                   Jose Mari Aguinaldo         Roanne Maye Dinglasa    */

public class ProgrammingTask4 {

    // [1] Class for the Binary Tree
    static class TreeNode {

        // [2] Variable to store char
        char data;  

        // [3] References to left and right subtrees
        TreeNode left;
        TreeNode right;

        // [4] Constructor to initialize the node with given char data
        TreeNode(char data) {  
            this.data = data;
        }
    }

    public static void main(String[] args) {

        // [5] Initialize Root
        TreeNode root = new TreeNode('A');  

        // [6] Left and Right of 'A'
        root.left = new TreeNode('B');
        root.right = new TreeNode('E');

        // [7] Left and Right of 'B'
        root.left.left = new TreeNode('C');
        root.left.right = null;

        // [8] Left and Right of 'C'
        root.left.left.left = null;
        root.left.left.right = new TreeNode('D');

        // [9] Left and Right of 'E'
        root.right.left = new TreeNode('F');
        root.right.right = new TreeNode('H');

        // [10] Left and Right 'F'
        root.right.left.left = null;
        root.right.left.right = new TreeNode('G');

        // [11] Left and Right of 'H'
        root.right.right.left = new TreeNode('I');
        root.right.right.right = new TreeNode('J');

        // [12] Print the output
        line(); System.out.println("\t\t OUTPUT"); line();
        System.out.println("\tNode   L-Subtree    R-Subtree\n"); //[note] Since we can't print a null value, we explicitly print the String null instead
        System.out.println("\t " + root.data + "\t   " + root.left.data + "\t\t" + root.right.data);
        System.out.println("\t " + root.left.data + "\t   " + root.left.left.data + "\t\t" + "null");
        System.out.println("\t " + root.left.left.data + "\t   " + "null" + "\t\t" + root.left.left.right.data);
        System.out.println("\t " + root.right.data + "\t   " + root.right.left.data + "\t\t" + root.right.right.data);
        System.out.println("\t " + root.right.left.data + "\t   " + "null" + "\t\t" + root.right.left.right.data);
        System.out.println("\t " + root.right.right.data + "\t   " + root.right.right.left.data + "\t\t" + root.right.right.right.data); line();

        // [13] [Print the Root]
        System.out.println("Root of the Tree     : " + root.data); line();

        // [14] Print traversals
        System.out.print("Preorder Traversal   : ");
        printPreorder(root);
            System.out.print("\nInorder Traversal    : ");
            printInorder(root);
                System.out.print("\nPost Order Traversal : ");
                printPostorder(root);
        System.out.println(); line();
    }

    // [15] Recursion method to print preorder traversal of the tree (Root > Left > Right)
    static void printPreorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");  // [15.1] Print the Root 
            printPreorder(node.left); // [15.2] Recursion to point and print left child
            printPreorder(node.right); // [15.3] Recursion to point and print right child; then goes back to print another parent
        }
    }

    // [16] Recursion method to print inorder traversal of the tree (Left > Root > Right)
    static void printInorder(TreeNode node) {
        if (node != null) { 
            printInorder(node.left); // [16.1] Recursion to point and print the left most descendant
            System.out.print(node.data + " "); // [16.2] Recursion to print root
            printInorder(node.right); // [16.2] Recursion to point and print right node; then goes back to point and print another left most descendant
        }
    }

    // [17] Recursion method to print postorder traversal of the tree (Left > Right > Root)
    static void printPostorder(TreeNode node) {
        if (node != null) {
            printPostorder(node.left); // [17.1] Recursion to point and print the right most descendant
            printPostorder(node.right); // [17.2] Recursion to point and print left node
            System.out.print(node.data + " "); // [17.3] Print the root; then goes back to point and print another right most descendant
        }
    }

    // [18] Method to print a separator line
    public static void line() {
        System.out.println("==========================================");
    }
}

