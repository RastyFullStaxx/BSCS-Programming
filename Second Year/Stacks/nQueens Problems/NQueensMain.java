package Java.DataStrucAlgo.Stacks.PerfomanceTaskOne;
import java.util.Scanner;   // [0] Import scanner util to get user input
import java.util.Stack;     // [0] Import scanner stack util to solve the problem

public class NQueensMain {
    public static void main(String[] args) {

        // [1] Instantiate the scanner object to take in inputs
        Scanner objScanner = new Scanner(System.in);

        // [2] Prompt the user to assign a value for n
        System.out.print("Chess Board Creation Phase\nEnter the value of n: ");
            int n = objScanner.nextInt();
        // [2.1] Reaffirm the inputted value
        System.out.printf("\nCreating... | Successfully created a %d x %d chess board.%n%n", n, n);

        // [3] Prompt the user to enter the first queen's row index
        System.out.printf("Enter the row index for the initial queen's placement\nLimit is %d: ", n);
            int initialRowIndex = objScanner.nextInt();
        // [3.1] Prompt the user to enter the first queen's column index
        System.out.printf("%nEnter the column index for the initial queen's placement\nLimit is %d: ", n);
            int initialColIndex = objScanner.nextInt();

        // [4] Initialize a 2D array for the chess board using the value of n
        int[][] chessBoard = new int[n][n];

        // [] Close scanner object
        objScanner.close();
    }

    // [5] Define the nQueenPosition class that'll store the current nQueen position
    static class nQueenPosition {
        // Variables
        int row;
        int col;
            // Constructors
            nQueenPosition(int row, int col) {
                this.row = row;
                this.col = col;
            }
                // Accessors 
                public int getRow() {
                    return row;
                }
                public int getCol() {
                    return col;
                }
                    // Mutators
                    public void setRow(int row) {
                        this.row = row;
                    }       
                    public void setCol(int col) {
                        this.col = col;
                    }
    }

    // [6] Define the class for conflict scanner class (haveConflict)
    private static boolean haveConflict(int[][] chessBoard, nQueenPosition position) {

        // Get the stored current position to prepare for conflict detection 
        int row = position.getRow();
        int col = position.getCol();

            // Scan for conflict in the same row 

            // Scan for conflict in the column  

            // Scan for conflict in the upper diagonals
                
            // Scan for conflict in the lower diagonals

        return true;
    }

    // [] Create the method that'll determine possible solutions
    private static int nQueenSolver(int n, int initialColIndex, int initialRowIndex) {

        // [] Instantiate a stack object to implicitly store a queen's row and column position in the chessboard
        Stack<nQueenPosition> stack = new Stack<>();

        // [] Indicates whether there is a solution or not
        boolean success = false;

        // [] Initialize the first queen's position to the stack
        stack.push(new nQueenPosition(initialRowIndex, initialColIndex));

        // Retrieve the most recent position [row and col index] and initialize it as the current placement
        while (!success && !stack.isEmpty()) {
            nQueenPosition currentPosition = stack.peek();  // currentPosition used the constructor of nQueenPosition

            // Pass on the chessboard and currentPosition to check for existing conflict

        }



        return 0; 
    }

    // Print solution  
    static void printSolution() {

    }

}










