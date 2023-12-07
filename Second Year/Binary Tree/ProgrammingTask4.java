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
        line();
        System.out.println("\t\t OUTPUT");
        line();
        System.out.println("       Node   L-Subtree    R-Subtree\n");
        printOutputs(root);
        line();

        // [13] [Print the Root]
        System.out.println("Root of the Tree     : " + root.data);
        line();

        // [14] Print traversals
        System.out.print("Preorder Traversal   : ");
        printPreorder(root);

        System.out.print("\nInorder Traversal    : ");
        printInorder(root);

        System.out.print("\nPost Order Traversal : ");
        printPostorder(root);
        System.out.println();
        line();
    }

    // [15] Method to print information about the nodes in the tree
    static void printOutputs(TreeNode node) {
        if (node != null) {

            // [16] Print current node
            System.out.print("\t" + node.data + "\t");

            // [17] Print left subtree
            if (node.left != null) {
                System.out.print(node.left.data + " ");
            } else {
                System.out.print("null");
            }

            // [18] Print right subtree
            if (node.right != null) {
                System.out.println("\t     " + node.right.data);
            } else {
                System.out.println("\t     null");
            }

            // [19] Print left and right subtrees for specific nodes
            printOutputs(node.left);
            printOutputs(node.right);
        }
    }

    // [20] Method to print preorder traversal of the tree
    static void printPreorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }

    // [21] Method to print inorder traversal of the tree
    static void printInorder(TreeNode node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    }

    // [22] Method to print postorder traversal of the tree
    static void printPostorder(TreeNode node) {
        if (node != null) {
            printPostorder(node.left);
            printPostorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // [23] Method to print a separator line
    public static void line() {
        System.out.println("==========================================");
    }
}

