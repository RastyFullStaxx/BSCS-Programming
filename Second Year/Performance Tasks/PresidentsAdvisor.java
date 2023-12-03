package Java.DataStrucAlgo.Stacks.PerformanceTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PresidentsAdvisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // [1] Input: Get starting advisor from the user
            System.out.print("Start: ");
            int startAdvisor = scanner.nextInt();

            // [2] Check if the user wants to exit (0 indicates exit)
            if (startAdvisor == 0) {
                break;
            }

            // [3] Input: Get counting interval from the user
            System.out.print("Interval: ");
            int countingInterval = scanner.nextInt();

            // [4] Advisors: Initialize a list to represent the advisors (1 to 13)
            List<Integer> advisorsList = new ArrayList<>();
            for (int i = 1; i <= 13; i++) {
                advisorsList.add(i);
            }

            // [5] Select Advisors: Call the method to select advisors
            List<Integer> selectedAdvisors = selectAdvisors(advisorsList, startAdvisor, countingInterval);

            // [6] Output: Display the selected advisors
            System.out.print("Selected Advisors: ");
            for (int i = 0; i < selectedAdvisors.size(); i++) {
                System.out.print(selectedAdvisors.get(i));

                // Add a comma and space if it's not the last advisor
                if (i < selectedAdvisors.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("\n"); // Add a new line for better formatting
        }

        // [7] Close the Scanner to prevent resource leaks
        scanner.close();
    }

    // [8] Method to select advisors, skipping those already counted
    private static List<Integer> selectAdvisors(List<Integer> advisors, int startAdvisor, int countingInterval) {
        List<Integer> selectedAdvisors = new ArrayList<>();
        int currentIndex = startAdvisor - 1; // Adjust for 0-based indexing

        // [9] Loop to select advisors based on the counting interval
        while (selectedAdvisors.size() < 5) {
            // [10] Ensure the current index is within the bounds of the advisors list
            currentIndex %= advisors.size();

            int currentAdvisor = advisors.remove(currentIndex);
            selectedAdvisors.add(currentAdvisor);

            // [11] Update the current index for the next iteration
            currentIndex += countingInterval - 1;
        }

        return selectedAdvisors;
    }
}
