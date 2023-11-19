package Third_Year;

import java.util.Stack;

public class nQueensMain {
    public static void main(String[] args) {
        int n = 5; // You can change the value of n as needed
        solveNQueens(n);
    }

    public static void solveNQueens(int n) {
        Stack<QueenPlacement> stack = new Stack<>();
        boolean success = false;

        // Push the first choice onto the stack
        stack.push(new QueenPlacement(1, 1));

        while (!success && !stack.isEmpty()) {
            QueenPlacement currentChoice = stack.peek();

            // Check for conflicts
            if (hasConflict(stack)) {
                // Pop elements off the stack until no conflict or stack is empty
                while (!stack.isEmpty() && (currentChoice.column == n || hasConflict(stack))) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        currentChoice = stack.peek();
                        currentChoice.column++;
                    }
                }
            } else if (stack.size() == n) {
                // Solution found
                success = true;
            } else {
                // Push the next choice onto the stack
                stack.push(new QueenPlacement(stack.size() + 1, 1));
            }
        }

        // Print the result
        if (success) {
            System.out.println("Solution found:");
            for (QueenPlacement placement : stack) {
                System.out.println("Row: " + placement.row + ", Column: " + placement.column);
            }
        } else {
            System.out.println("No solution found.");
        }
    }

    private static boolean hasConflict(Stack<QueenPlacement> stack) {
        QueenPlacement currentChoice = stack.pop();
        for (QueenPlacement previousChoice : stack) {
            if (currentChoice.isConflict(previousChoice)) {
                stack.push(currentChoice);
                return true;
            }
        }
        stack.push(currentChoice);
        return false;
    }
}
