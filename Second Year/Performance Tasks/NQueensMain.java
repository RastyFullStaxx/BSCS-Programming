package Java.DataStrucAlgo.Stacks.PerfomanceTask1;

import java.util.Scanner;
import java.util.Stack;

public class NQueensMain {
    public static void main(String[] args) {

        // [1] Instantiate the scanner object to take in inputs
        Scanner objScanner = new Scanner(System.in);

        // [2] Prompt the user to assign a value for n
        System.out.println(); lineBreak();
        System.out.print("\t\t  Chess Board Creation Phase\n\nEnter the value of n: ");
        int n = objScanner.nextInt();

        // [2.1] Reaffirm the inputted value
        System.out.println(); asteriskBreak();
        System.out.printf("*   Creating... | Successfully Created a %d x %d chessboard!  *%n", n, n);
        asteriskBreak(); System.out.println(); lineBreak();
        
        int initialRowIndex;
        int initialColIndex;

        // Use a do-while loop to ensure the user enters valid indices
        do {

            // [3] Prompt the user to enter the first queen's row index
            System.out.printf("\t\tInitial Queen Row & Column Index\n\t\t\tLimit is (%d)%n", n);
            System.out.printf("%nEnter Row: ", n);
            initialRowIndex = objScanner.nextInt();

            // [3.1] Prompt the user to enter the first queen's column index
            System.out.printf("Enter Column: ", n);
            initialColIndex = objScanner.nextInt();

            if (initialRowIndex > n || initialColIndex > n) {
                System.out.println("\n\tERROR: Invalid indices. Please enter valid values \n\t\twithin the chessboard size.\n\n\t\t\t* * * * * *\n");
            }

        } while (initialRowIndex > n || initialColIndex > n);

        // [4] Initialize a 2D array for the chess board using the value of n
        int[][] chessBoard = new int[n][n];

        // [5] Call nQueenSolver method to find the solution
        Stack<nQueenPosition> solution = nQueenSolver(chessBoard, n, initialColIndex, initialRowIndex);

        // [6] Close scanner object outside the loop
        objScanner.close();

        // [7] Check if a solution is found and print accordingly
        if (solution != null) {
            System.out.println(); lineBreak();
            System.out.println("\t\t\tSolution Found:\n");
            printSolution(solution);
            System.out.println(); lineBreak(); System.out.println();
        } else {
            System.out.println("No solution found.");
        }
    }


    // [8] Define the nQueenPosition class that'll store the current nQueen position
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

    // [9] Define the class for conflict scanner class (haveConflict)
    private static boolean haveConflict(int[][] chessBoard, nQueenPosition position) {

        // Get the stored current position to prepare for conflict detection
        int row = position.getRow();
        int col = position.getCol();

        // Scan for conflict in the same row
        for (int i = 0; i < col; i++) {
            if (chessBoard[row - 1][i] == 1) {
                return true;
            }
        }

        // Scan for conflict in the upper diagonals
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 1) {
                return true;
            }
        }

        // Scan for conflict in the lower diagonals
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 1) {
                return true;
            }
        }

        return false;
    }

    // [10] Create the method that'll determine possible solutions
    private static Stack<nQueenPosition> nQueenSolver(int chessBoard[][], int n, int initialColIndex, int initialRowIndex) {

        // [10.1] Instantiate a stack object to implicitly store a queen's row and column position in the chessboard
        Stack<nQueenPosition> stack = new Stack<>();

        // [10.2] Indicates whether there is a solution or not
        boolean success = false;

        // [10.3] Initialize the first queen's position to the stack
        stack.push(new nQueenPosition(initialRowIndex, initialColIndex));

        // [10.4] Retrieve the most recent position [row and col index] and initialize it as the current placement
        while (!success && !stack.isEmpty()) {
            nQueenPosition currentPosition = stack.peek();  // currentPosition used the constructor of nQueenPosition

            // [10.5] Pass on the chessboard and currentPosition to check for existing conflict
            if (haveConflict(chessBoard, currentPosition)) {
                // [10.6] Conflict detected: Backtrack
                while (!stack.isEmpty() && (currentPosition.getCol() == n || haveConflict(chessBoard, currentPosition))) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        currentPosition = stack.peek();
                        currentPosition.setCol(currentPosition.getCol() + 1);
                    }
                }
            } else if (stack.size() == n) {
                // [10.7] Solution found: Set success to true
                success = true;
            } else {
                // [10.8] No conflict, push information for the next choice
                int nextColIndex = currentPosition.getCol() + 1;
                stack.push(new nQueenPosition(stack.size() + 1, nextColIndex));
            }
        }

        return success ? stack : null;
    }

    // [11] Print solution
    static void printSolution(Stack<nQueenPosition> stack) {
        for (nQueenPosition position : stack) {
            System.out.println("Queen: Row \t" + position.getRow() + "\t||\t Column \t" + position.getCol());
        }
    }

    // Design only
    static void lineBreak() {
        System.out.println("=============================================================");
    }
    static void asteriskBreak() {
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
