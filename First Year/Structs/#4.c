#include <stdio.h>

struct Employee {
    int id;
    char name[50];
    float salary;};

int main() {
    struct Employee employees[999]; 
    int numEmployees = 0;
    int choice;
    do {
        printf("Employee Management System\n");
        printf("Menu:\n");
        printf("1. Add an employee\n");
        printf("2. Display employee details\n");
        printf("3. Calculate average salary\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter employee ID: ");
                scanf("%d", &employees[numEmployees].id);
                printf("Enter employee name: ");
                scanf("%s", employees[numEmployees].name);
                printf("Enter employee salary: ");
                scanf("%f", &employees[numEmployees].salary);
                numEmployees++;
                printf("Employee added successfully!\n");
                break;
            case 2:
                printf("\nEmployee Details:\n");
                for (int i = 0; i < numEmployees; i++) {
                    printf("ID: %d\n", employees[i].id);
                    printf("Name: %s\n", employees[i].name);
                    printf("Salary: $%.2f\n", employees[i].salary);
                }
                break;
            case 3:
                if (numEmployees > 0) {
                    float totalSalary = 0;
                    for (int i = 0; i < numEmployees; i++) {
                        totalSalary += employees[i].salary;
                    }
                    float averageSalary = totalSalary / numEmployees;
                    printf("Average salary: $%.2f\n", averageSalary);
                } else {
                    printf("No employees found!\n");
                }
                break;

            case 4:
                printf("Exiting the program...\n");
                break;

            default:
                printf("Invalid choice! Please enter a valid option.\n");
                break;} printf("\n");
    } while (choice != 4);

    return 0;
}
