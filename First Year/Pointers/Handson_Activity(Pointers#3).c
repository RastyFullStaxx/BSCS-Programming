/* 
Rasty Cannu Espartero
BSCS 1-4
Pointers
Hands on Activity #3
*/

#include <stdio.h>

// write a funcrtion called 'swapPointers'
void swapPointers

// Inside the function, swap the values of the two pointers.
(int** ptr1, int** ptr2) {
    int* temp = *ptr1;
    *ptr1 = *ptr2;
    *ptr2 = temp;
}

int main() {

    // Initialize Two Integer Variables
    int integer_1 = 2;
    int integer_2 = 11;

    // Assign Two Pointers
    int* ptrA = &integer_1;
    int* ptrB = &integer_2;

    // Before: Print the values of ptrA and ptrB
    printf("Before swapping:\n");
    printf("ptrA: %d\n", *ptrA);
    printf("ptrB: %d\n", *ptrB);

    // Call the 'swapPoint
    swapPointers(&ptrA, &ptrB);

    // After: Print the swapped values of ptrA and ptrB
    printf("\nAfter swapping:\n");
    printf("ptrA - %d\n", *ptrA);
    printf("ptrB - %d\n", *ptrB);
    printf("\n\n");

    return 0;
}
