#include <stdio.h>
#include <stdlib.h>
#include <string.h>


struct Student {
    char name[50];
    int score;
    struct Student* next;
};


struct Student* createNode(char name[], int score) {
    struct Student* newNode = (struct Student*)malloc(sizeof(struct Student));
    strcpy(newNode->name, name);
    newNode->score = score;
    newNode->next = NULL;
    return newNode;
}


char* findHighestScore(struct Student* head) {
    if (head == NULL) {
        return NULL;
    }

    struct Student* current = head;
    int highestScore = current->score;
    char* highestScoreName = current->name;

    while (current != NULL) {
        if (current->score > highestScore) {
            highestScore = current->score;
            highestScoreName = current->name;
        }
        current = current->next;
    }

    return highestScoreName;
}

int main() {

    struct Student* head = createNode("Qwerty", 80);
    struct Student* second = createNode("Razzy", 79);
    struct Student* third = createNode("Resp", 78);
    struct Student* fourth = createNode("Rasty", 99);


    head->next = second;
    second->next = third;
    third->next = fourth;

 
    char* highestScoreName = findHighestScore(head);

    if (highestScoreName != NULL) {
        printf("Student with the highest score: %s\n", highestScoreName);
    } else {
        printf("No student records found.\n");
    }

    struct Student* current = head;
    while (current != NULL) {
        struct Student* temp = current;
        current = current->next;
        free(temp);
    } printf("\n\n\n\n\n");

    return 0;
}
