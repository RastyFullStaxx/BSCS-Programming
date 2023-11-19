#include <stdio.h>

int main() {

    int n;

    // Input the number of elements
    printf("Input the number of elements to store in the array: ");
    scanf("%d", &n);

    int arrayList1[n];

    // Input the elements of the array
    printf("\nInput %d number of elements in the array: \n", n);
    for (int i = 0; i < n; i++) {
        printf("element - %d: ", i);
        scanf("%d", &arrayList1[i]);
    }

    // Print the elements using a pointer
    printf("\nThe elements you entered are: ");
    for (int i = 0; i < n; i++) {
        printf("element - %d: %d\n", i, *(arrayList1 + i));
    }

    printf("\n\n\n");

    return 0;
}
