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

void displayList(struct Node* head) {
    struct Node* current = head;

    while (current != NULL) {
        printf("Data = %d\n", current->data);
        current = current->next;
    }
}

int main() {
    int n, data;
    struct Node* head = NULL;
    struct Node* temp = NULL;

    printf("Input the number of nodes: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Invalid number of nodes\n");
        return 0;
    }

    for (int i = 1; i <= n; i++) {
        printf("Input data for node %d : ", i);
        scanf("%d", &data);

        if (head == NULL) {
            head = createNode(data);
            temp = head;
        } else {
            temp->next = createNode(data);
            temp = temp->next;
        }
    }

    printf("\nData entered in the list :\n");
    displayList(head);
    printf("\n\n\n\n\n\n");

    struct Node* current = head;
    while (current != NULL) {
        struct Node* temp = current;
        current = current->next;
        free(temp);
    }

    return 0;
}
