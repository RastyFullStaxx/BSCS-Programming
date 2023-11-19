#include <stdio.h>

void addNumbers(int *int_1, int *int_2, int *total) {
    *total = *int_1 + *int_2;
}

int main() {
    int int_1, int_2, total;

    // Input the first number
    printf("Input the first number: ");
    scanf("%d", &int_1);

    // Input the second number
    printf("Input the second number: ");
    scanf("%d", &int_2);

    // Call the addNumbers function
    addNumbers(&int_1, &int_2, &total);

    // Output the result
    printf("The sum of %d and %d is %d\n\n", int_1, int_2, total);

    return 0;
}
