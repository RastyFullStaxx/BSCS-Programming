/* 
Rasty Cannu Espartero
BSCS 1-4
Pointers
Hands on Activity #4
*/

#include <stdio.h>

#define SIZE 10

float c_Average(int* arr, int size) {
    int sum = 0;
    int i;

    for (i = 0; i < size; i++) {
        sum += *(arr + i);              // Dereference the pointer to access the value at each index
    }

    return (float)sum / size;           // Calculate the average
}

int main() {
    int data[SIZE];
    int i;

    printf("Enter ten integers:\n");

    // Read input from the user and store it in the array
    for (i = 0; i < SIZE; i++) {
        scanf("%d", &data[i]);
    }

    // Calculate the average using the c_Average function
    float average = c_Average(data, SIZE);

    // Display the average value
    printf("\nAverage: %.2f\n\n", average);

    return 0;
}
