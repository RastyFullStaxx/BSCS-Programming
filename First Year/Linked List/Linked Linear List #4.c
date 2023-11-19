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

void insertNode(struct Node** head, int data) {
    struct Node* newNode = createNode(data);

    if (*head == NULL) {
        *head = newNode;
    } else {
        struct Node* current = *head;
        while (current->next != NULL) {
            current = current->next;
        }
        current->next = newNode;
    }
}

void splitList(struct Node* head, struct Node** oddList, struct Node** evenList) {
    struct Node* current = head;
    struct Node* odd = NULL;
    struct Node* even = NULL;

    while (current != NULL) {
        if (current->data % 2 == 0) {
            if (even == NULL) {
                even = current;
                *evenList = even;
            } else {
                even->next = current;
                even = even->next;
            }
        } else {
            if (odd == NULL) {
                odd = current;
                *oddList = odd;
            } else {
                odd->next = current;
                odd = odd->next;
            }
        }
        current = current->next;
    }

    if (odd != NULL) {
        odd->next = NULL;
    }
    if (even != NULL) {
        even->next = NULL;
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
    struct Node* head = NULL;
    insertNode(&head, 5);
    insertNode(&head, 12);
    insertNode(&head, 17);
    insertNode(&head, 40);
    insertNode(&head, 59);
    insertNode(&head, 62);

    printf("Original linked list: ");
    printList(head);

    struct Node* oddList = NULL;
    struct Node* evenList = NULL;
    splitList(head, &oddList, &evenList);

    printf("\n=================\n");
    printf("Odd list: ");
    printList(oddList);

    printf("Even list: ");
    printList(evenList);
    printf("=================\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    struct Node* current = oddList;
    while (current != NULL) {
        struct Node* temp = current;
        current = current->next;
        free(temp);
    }

    current = evenList;
    while (current != NULL) {
        struct Node* temp = current;
        current = current->next;
        free(temp);
    }

    return 0;
}
