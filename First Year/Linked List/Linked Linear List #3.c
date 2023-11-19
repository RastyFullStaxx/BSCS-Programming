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

int findMiddleElement(struct Node* head) {
    if (head == NULL) {
        printf("Empty linked list.\n");
        return -1;
    }

    struct Node* slowPtr = head;
    struct Node* fastPtr = head;

    while (fastPtr != NULL && fastPtr->next != NULL) {
        slowPtr = slowPtr->next;
        fastPtr = fastPtr->next->next;
    }

    return slowPtr->data;
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

    struct Node* head = createNode(10);
    struct Node* second = createNode(20);
    struct Node* third = createNode(30);
    struct Node* fourth = createNode(40);
    struct Node* fifth = createNode(50);
    struct Node* sixth = createNode(60);

    head->next = second;
    second->next = third;
    third->next = fourth;
    fourth->next = fifth;
    fifth->next = sixth;

    printf("============================\n");
    printf("Linked list: ");
    printList(head);

    int middleElement = findMiddleElement(head);

    if (middleElement != -1) {
        printf("Middle element: %d\n", middleElement);
    } 


    struct Node* current = head;
    while (current != NULL) {
        struct Node* temp = current;
        current = current->next;
        free(temp);
    }
    printf("============================\n\n\n\n\n\n");

    return 0;
}
