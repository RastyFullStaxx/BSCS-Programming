#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Student {
    int rollNumber;
    char name[50];
    int age;
    float gpa;
    struct Student* next;
};

struct Student* createNode(int rollNumber, char name[], int age, float gpa) {
    struct Student* newNode = (struct Student*)malloc(sizeof(struct Student));
    newNode->rollNumber = rollNumber;
    strcpy(newNode->name, name);
    newNode->age = age;
    newNode->gpa = gpa;
    newNode->next = NULL;
    return newNode;
}

void addStudent(struct Student** head, int rollNumber, char name[], int age, float gpa) {
    struct Student* newNode = createNode(rollNumber, name, age, gpa);

    if (*head == NULL) {
        *head = newNode;
    } else {
        struct Student* current = *head;
        while (current->next != NULL) {
            current = current->next;
        }
        current->next = newNode;
    }

    printf("Student added successfully!\n");
}

void displayStudents(struct Student* head) {
    if (head == NULL) {
        printf("No students enrolled.\n");
        return;
    }

    printf("Enrolled Students:\n");
    struct Student* current = head;

    while (current != NULL) {
        printf("Roll Number: %d | Name: %s | Age: %d | GPA: %.2f\n",
               current->rollNumber, current->name, current->age, current->gpa);
        current = current->next;
    }
}

void searchStudent(struct Student* head, int rollNumber) {
    if (head == NULL) {
        printf("No students enrolled.\n");
        return;
    }

    struct Student* current = head;
    while (current != NULL) {
        if (current->rollNumber == rollNumber) {
            printf("Student Found:\n");
            printf("Roll Number: %d | Name: %s | Age: %d | GPA: %.2f\n",
                   current->rollNumber, current->name, current->age, current->gpa);
            return;
        }
        current = current->next;
    }

    printf("Student not found.\n");
}

int main() {
    struct Student* head = NULL;
    int choice, rollNumber, age;
    char name[50];
    float gpa;

    printf("==============================================\n");
    printf("Student Enrollment System\n");
    printf("1. Add a new student\n");
    printf("2. Display enrolled students\n");
    printf("3. Search for a student by roll number\n");
    printf("4. Exit\n");
    printf("==============================================\n");

    while (1) {
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter Roll Number: ");
                scanf("%d", &rollNumber);
                printf("Enter Name: ");
                scanf("%s", name);
                printf("Enter Age: ");
                scanf("%d", &age);
                printf("Enter GPA: ");
                scanf("%f", &gpa);
                addStudent(&head, rollNumber, name, age, gpa);
                break;
            case 2:
                displayStudents(head);
                break;
            case 3:
                printf("Enter Roll Number to search: ");
                scanf("%d", &rollNumber);
                searchStudent(head, rollNumber);
                break;
            case 4:
                printf("Thank you for using the Student Enrollment System!\n\n\n\n\n\n\n\n");
                exit(0);
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}
