/*  COMP 006: DATA STRUCTURES AND ALGORITHMS
 *  PROGRAMMING TASK 2 - CASE STUDY: N-Queens Problem
 *  Leader:          Rasty Espartero
 *  Contributors:    David Geisler Mahayag       Marc Lorenz Quintana
 *                   Jhanice Pablo               Marian Facunla
 *                   Jose Mari Aguinaldo         Roanne Maye Dinglasa    */

import java.util.Stack;

public class ChessBoard {

    private int size; // This stores the size of the chessboard (rows and columns)

    // Arrays to store the indices and visual representation of the solution
    private int[] indices;
    private char[][] visual;

    // Constructor to initialize the size of the ChessBoard
    public ChessBoard(int size) {
        this.size = size; // Assigning the provided size parameter to the size instance variable
        this.indices = new int[size];
        this.visual = new char[size][size];
    }

    // Method to solve the N-Queens problem
    public void solveNQueens() {
        Stack<Integer> stack = new Stack<>(); // Initializes a stack to keep track of the rows where queens are placed.
        boolean success = false; // Initializes a boolean variable success to false, means a solution has not been found yet.
        int currentRow = 1; // Initializes a variable currentRow to 1, representing the current row being considered.

        while (currentRow > 0) { // Initiates a while loop that continues as long as currentRow is greater than 0.
            // This loop is the main solving loop for placing queens on the ChessBoard.
            if (isValid(stack, currentRow)) { // Checks if placing a queen in the current row is valid by calling the
                                               // isValid method.
                stack.push(currentRow); // If the placement is valid, the current row is pushed onto the stack.
                indices[stack.size() - 1] = currentRow; // Store the index in the indices array

                currentRow = 1; // Resets currentRow to 1 to move on to the next row.

                // Checks if all queens are successfully placed (the stack size equals
                // the size of the ChessBoard). If true, sets success to true and breaks
                // out of the loop.
                if (stack.size() == size) {
                    success = true;
                    break;
                }
            } else { // If placing a queen in the current row is not valid
                currentRow++; // Increment currentRow to consider the next row if it is less than or equal to size
                // If currentRow exceeds the size of the ChessBoard, backtracks by popping
                // the last row from the stack and increments it to explore other
                // possibilities.
                if (currentRow > size) {
                    currentRow = stack.pop() + 1;
                }
            }
        }

        populateVisualRepresentation(); // Populate the visual representation array
        printResult(stack, success); // Display the value of stack and success
    }

    // Method to populate the visual representation array
    private void populateVisualRepresentation() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                visual[i][j] = (j + 1 == indices[i]) ? 'Q' : '-';
            }
        }
    }

    // Method to check if placing a queen at a specific position is valid
    private boolean isValid(Stack<Integer> stack, int currentRow) {
        int currentCol = stack.size() + 1; // Calculates the current column for the queen being considered.
        // It is equal to the size of the stack (number of queens placed) plus 1.

        for (int i = 0; i < stack.size(); i++) { // Initiates a loop to iterate through the queens already placed on
            // the board.
            int queenRow = stack.get(i); // Retrieves the row position of the queen at index i from the stack.
            int queenCol = i + 1; // Calculates the column position of the queen at index i. It is equal to i + 1
            // because columns are 1-indexed.

            // Checks for conflicts. If the queen being considered has the same row as any
            // previously placed queen or is on the same diagonal, it returns false
            // indicating that placing a queen in the current position is not valid.
            // queenRow == currentRow: Checks if the queens are in the same row.
            // Math.abs(queenRow - currentRow) == Math.abs(queenCol - currentCol): Checks
            // if the queens are on the same diagonal.
            if (queenRow == currentRow || Math.abs(queenRow - currentRow) == Math.abs(queenCol - currentCol)) {
                return false; // Returns false if a conflict is found.
            }
        }

        return true; // Returns true if no conflicts are found after checking all previously placed
        // queens.
    }

    // Method to print the result of the N-Queens problem
    private void printResult(Stack<Integer> stack, boolean success) {
        if (success) { // Checks if a solution to the N-Queens problem is found (success is true).
            System.out.println("\t\t       SOLUTION FOUND!\n"); // Prints a success message indicating that a solution
            // is found.
            // Print indices
            System.out.println("Indices:");
            for (int i = 0; i < size; i++) {
                System.out.println("\t\t    Row: " + (i + 1) + "     Column: " + indices[i]);
            }

            // Print visual representation
            System.out.println("\nVisual:");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("\t " + visual[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else { // If no solution is found (success is false)
            System.out.println("NO SOLUTION FOUND!\n"); // Prints a message indicating that no solution is found.
        }
    }
}
