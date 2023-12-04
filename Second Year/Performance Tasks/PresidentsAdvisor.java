/*  COMP 006: DATA STRUCTURES AND ALGORITHMS
 *  PROGRAMMING TASK 3 - CASE STUDY: PRESIDENT'S ADVISORS
 *  Leader:          Rasty Espartero
 *  Contributors:    David Geisler Mahayag       Marc Lorenz Quintana
 *                   Jhanice Pablo               Marian Facunla
 *                   Jose Mari Aguinaldo         Roanne Maye Dinglasa 
 * 
 *       USING LINKEDLIST (Tried to mimic arraylist performance)        */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PresidentsAdvisor {

    // [1] Main method where the program execution starts
    public static void main(String[] args) {

        // [2] Instantiate the scanner object to accept user input
        Scanner scanner = new Scanner(System.in);

        // [3] Display initial message
        lineBreak();
        System.out.println("Programming Task 3: Case Problem\n\tPresident's Advisors");

        outerLoop: while (true) {

            // [5] Input: Get starting adviser from the user with validation
            int startAdviser;

            do {
                lineBreak();
                System.out.print("Start: \t\t");
                startAdviser = scanner.nextInt();
                if (startAdviser > 13) {
                    System.out.println("\n   Error: Invalid Start Adviser\n    Enter value between 1 to 13 \n\t    or 0 to exit\n\t  * * * * * * * *\n");
                } else if (startAdviser == 0) {
                    System.out.println("\nExiting..\n");
                    break outerLoop; // Use labeled break to exit the outer loop
                }
            } while (startAdviser < 1 || startAdviser > 13);

            // [7] Input: Get counting interval from the user with validation
            int interval;
            do {
                System.out.print("Interval: \t");
                interval = scanner.nextInt();
                if (interval > 100) {
                    System.out.println("\n     Error: Invalid interval\n   Enter value between 1 to 100\n\t  * * * * * * * *\n");
                }
            } while (interval > 100);

            // [8] Store Integers 1 to 13 to the queues using for loop
            Queue<Integer> advisers = new LinkedList<>();
            for (int i = 1; i <= 13; i++) {
                advisers.offer(i);
            }

            // [9] Select advisers: Call method and pass on the arguments
            Queue<Integer> chosenAdvisers = selectAdvisers(advisers, startAdviser, interval);

            // [10] Output: Display the selected advisers
            System.out.print("Chosen Advisers: ");
            while (!chosenAdvisers.isEmpty()) {
                System.out.print(chosenAdvisers.poll());

                // [11] Add a comma and space if it's not the last adviser
                if (!chosenAdvisers.isEmpty()) {
                    System.out.print(", ");
                }
            }
            System.out.println(""); // [12] Add a new line for better formatting
        }

        scanner.close(); // [13] Close the Scanner outside the loop
    }

    // [14] Method to select advisers, skipping those already counted
    private static Queue<Integer> selectAdvisers(Queue<Integer> advisers, int startAdviser, int interval) {

        // [15] Initialize a queue to store the selected advisers
        Queue<Integer> chosenAdvisers = new LinkedList<>();

        // [16] Adjust for 0-based indexing
        startAdviser--;

        // [17] Loop to select advisers based on the counting interval
        while (chosenAdvisers.size() < 5) {

            // [18] Skip advisers who have already been counted
            for (int i = 1; i < interval; i++) {
                advisers.offer(advisers.poll());
            }

            // [19] Add the current adviser to the selected list
            chosenAdvisers.offer(advisers.poll());
        }

        return chosenAdvisers; // [20] Return the selected advisers
    }

    // [21] Utility method to print a line break
    static void lineBreak() {
        System.out.println("=================================");
    }
}
