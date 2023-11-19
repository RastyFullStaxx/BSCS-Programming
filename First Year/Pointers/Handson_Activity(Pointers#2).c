/* 
Rasty Cannu Espartero
BSCS 1-4
Pointers
Hands on Activity #2
*/

#include <stdio.h>

    // Write the 'multiplyByTwo" function
    void multiplyByTwo(int* arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] *= 2;
        }
}

int main() {

    // Initializing an array with five values
    int array_list[] = {18, 2, 12, 5, 14};

    // Get the size of the array
    int size = sizeof(array_list) / sizeof(array_list[0]);

    // Call the 'multiplyByTwo' function
    multiplyByTwo(array_list, size);

    // Print the modified array
    printf("The modified values of the array_list are: \n");
    for (int i = 0; i < size; i++) {
        printf("%d ", array_list[i]);
    }
    printf("\n\n");

    return 0;
}