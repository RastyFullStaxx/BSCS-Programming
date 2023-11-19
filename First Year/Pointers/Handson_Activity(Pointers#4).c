/* 
Rasty Cannu Espartero
BSCS 1-4
Pointers
Hands on Activity #4
*/

#include <stdio.h>

int addition(int a, int b) {
    return a + b;}

int subtraction(int a, int b) {
    return a - b;}

int multiplication(int a, int b) {
    return a * b;}

int division(int a, int b) {
    return a / b;}

int main() {
    int input_1, input_2;
    int user_c;

    // Define an array of function pointers
    int (*operations[])(int, int) = {addition, subtraction, multiplication, division};

    printf("Enter two numbers: ");
    scanf("%d %d", &input_1, &input_2);

    printf("\nSelect an operation by selecting a number from 1 to 4:\n");
    printf("1. Addition\n");
    printf("2. Subtraction\n");
    printf("3. Multiplication\n");
    printf("4. Division\n\n");
    printf("Enter your choice: ");
    scanf("%d", &user_c);

    if (user_c >= 1 && user_c <= 4) {
        int (*s_operation)(int, int) = operations[user_c - 1];
        int result = s_operation(input_1, input_2);
        printf("\nResult: %d\n\n\n", result); } else {
        printf("Invalid choice\n");}

    return 0;
}
