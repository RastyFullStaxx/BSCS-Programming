/* 
Rasty Cannu Espartero
BSCS 1-4
Pointers
Hands on Activity #1
*/

#include <stdio.h>

int main() {
    
    // Initializing an array with five values
    int array_list[] = {18, 2, 12, 5, 14};

    // Assigning a pointer to the first element
    int* pointer1 = &array_list[0];

                /* Use pointer arithmetic to perform the following operations: */

    // a) Print the value at the third element of the array using the pointer.
    printf("Value at the third element: %d\n", *(pointer1 + 2));

    // b) Increment the pointer by 2 positions and print the value it points to.
    pointer1 += 2;
    printf("Value after increment: %d\n", *pointer1);

    // c) Subtract 1 from the value pointed by the pointer and print the result.
    (*pointer1)--;
    printf("Value after subtraction: %d\n", *pointer1);

    // d) Move the pointer back to the first element and print the value using the pointer.
    pointer1 -= 2;
    printf("Value at the first element: %d\n\n\n\n", *pointer1);

    return 0;
}
