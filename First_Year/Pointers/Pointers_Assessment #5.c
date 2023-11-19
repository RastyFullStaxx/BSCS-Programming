#include <stdio.h>

void SORT(int *array_1, int int_1) {
    int int_2, int_3, check;

    for (int_2 = 0; int_2 < int_1-1; int_2++) {
        for (int_3 = 0; int_3 < int_1-int_2-1; int_3++) {
            if (*(array_1 + int_3) > *(array_1 + int_3 + 1)) {
                // Swap elements
                check = *(array_1 + int_3);
                *(array_1 + int_3) = *(array_1 + int_3 + 1);
                *(array_1 + int_3 + 1) = check;
            }
        }
    }
}

int main() {
    int int_1, int_2;

    // Input the number of elements
    printf("Input the number of elements to store in the array: ");
    scanf("%d", &int_1);

    int array_1[int_1];

    // Input the elements of the array
    printf("\nInput %d number of elements in the array:\n", int_1);
    for (int_2 = 0; int_2 < int_1; int_2++) {
        printf("element - %d: ", int_2+1);
        scanf("%d", &array_1[int_2]);
    }

    // Sort the array
    SORT(array_1, int_1);

    // Print the sorted array
    printf("\nThe elements in the array after sorting:\n");
    for (int_2 = 0; int_2 < int_1; int_2++) {
        printf("element - %d: %d\n", int_2+1, array_1[int_2]);
    }

    printf("\n\n");

    return 0;
}
