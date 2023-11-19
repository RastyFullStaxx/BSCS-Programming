#include <stdio.h>
#include <string.h>

#define sub 5
#define studs 100

struct Student {
    int id;
    char name[50];
    int age;
    char grade[10];
    int marks[sub];
};

int main() {
    struct Student students[studs];
    int sumOfStudents = 0;
    int selection;

    do {
        printf("==============================");
        printf("\nStudent Database Management\n");
        printf("Menu:\n");
        printf("1. Add a student\n");
        printf("2. Search for a student\n");
        printf("3. Display all students\n");
        printf("4. Exit\n");
        printf("==============================");
        printf("\nEnter your choice: ");
        scanf("%d", &selection);

        switch (selection) {
            case 1:
                printf("Enter student ID: ");
                scanf("%d", &students[sumOfStudents].id);
                printf("Enter student name: ");
                getchar(); // Clear the input buffer
                fgets(students[sumOfStudents].name, sizeof(students[sumOfStudents].name), stdin);
                students[sumOfStudents].name[strcspn(students[sumOfStudents].name, "\n")] = '\0'; // Remove trailing newline character
                printf("Enter student age: ");
                scanf("%d", &students[sumOfStudents].age);
                printf("Enter student grade: ");
                scanf("%s", students[sumOfStudents].grade);
                printf("Enter marks for %d subjects:\n", sub);
                for (int i = 0; i < sub; i++) {
                    printf("Subject %d: ", i + 1);
                    scanf("%d", &students[sumOfStudents].marks[i]);
                }
                sumOfStudents++;
                printf("Student added successfully!\n");
                break;

            case 2:
                if (sumOfStudents > 0) {
                    int searchId;
                    printf("Enter student ID to search: ");
                    scanf("%d", &searchId);
                    int found = 0;
                    for (int i = 0; i < sumOfStudents; i++) {
                        if (students[i].id == searchId) {
                            printf("Student Details:\n");
                            printf("ID: %d\n", students[i].id);
                            printf("Name: %s\n", students[i].name);
                            printf("Age: %d\n", students[i].age);
                            printf("Grade: %s\n", students[i].grade);
                            printf("Marks:");
                            for (int j = 0; j < sub; j++) {
                                printf(" %d", students[i].marks[j]);
                            }
                            printf("\n");
                            found = 1;
                            break;
                        }
                    }
                    if (!found) {
                        printf("Student not found!\n");
                    }
                } else {
                    printf("No students found!\n");
                }
                break;

            case 3:
                if (sumOfStudents > 0) {
                    printf("Student Details:\n");
                    for (int i = 0; i < sumOfStudents; i++) {
                        printf("ID: %d\n", students[i].id);
                        printf("Name: %s\n", students[i].name);
                        printf("Age: %d\n", students[i].age);
                        printf("Grade: %s\n", students[i].grade);
                        printf("Marks:");
                        for (int j = 0; j < sub; j++) {
                            printf(" %d", students[i].marks[j]);
                        }
                        printf("\n");
                    }
                } else {
                    printf("No students found!\n");
                }
                break;

            case 4:
                printf("Exiting the program...\n");
                break;

            default:
                printf("Invalid selection! Please enter a valid option.\n");
                break;
        }

        printf("\n");
    } while (selection != 4);

    return 0;
}
