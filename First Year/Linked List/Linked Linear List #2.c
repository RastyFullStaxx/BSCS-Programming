#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

void removeDuplicates(struct Node* head) {
    if (head == NULL) {
        return;
    }

    struct Node* current = head;
    struct Node* nextUnique;

    while (current->next != NULL) {
        if (current->data == current->next->data) {
            nextUnique = current->next->next;
            free(current->next);
            current->next = nextUnique;
        } else {
            current = current->next;
        }
    }
}

void printList(struct Node* head) {
    struct Node* current = head;

    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

int main() {

    struct Node* head = createNode(89);
    struct Node* second = createNode(89);
    struct Node* third = createNode(93);
    struct Node* fourth = createNode(70);
    struct Node* fifth = createNode(70);
    struct Node* sixth = createNode(60);

    head->next = second;
    second->next = third;
    third->next = fourth;
    fourth->next = fifth;
    fifth->next = sixth;

    printf("Original linked list: \n");
    printList(head);

    removeDuplicates(head);

    printf("\nLinked list after removing duplicates: \n");
    printList(head);

    printf("\n\n\n\n\n\n\n\n");

    struct Node* current = head;
    while (current != NULL) {
        struct Node* temp = current;
        current = current->next;
        free(temp);
    }

    return 0;
}
