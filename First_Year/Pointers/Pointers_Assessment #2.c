#include <stdio.h>

int main() {

    int c_1, c_2, c_3;
    int total;
    int *ptr1, *ptr2, *ptr3;

    // Input the first number
    printf("Input the first number: ");
    scanf("%d", &c_1);

    // Input the second number
    printf("Input the second number: ");
    scanf("%d", &c_2);

    // Input the third number
    printf("Input the third number: ");
    scanf("%d", &c_3);
    printf("\n");

    // Assign pointers to the variables
    ptr1 = &c_1;
    ptr2 = &c_2;
    ptr3 = &c_3;

    // Calculate the total using pointers
    total = *ptr1 + *ptr2 + *ptr3;

    // Output the result
    printf("The sum of the entered numbers is: %d\n\n", total);

    return 0;
}
