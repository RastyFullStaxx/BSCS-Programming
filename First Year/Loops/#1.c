#include <stdio.h>

int main()
{

/*  while loop
    > checks the conditions first before executing a function if it is true

    do while loop
    > runs a function first before checking the condition   */

    int number = 0;
    int sum = 0;

/* while (number > 0)
    {
        printf("Enter a number that is more than 0: ");
        scanf("%d", &number);
        if(number > 0)
        {
            sum += number;
        }
    }
    printf("sum: %d", sum); */

// converting it into a do while


    do{
        printf("Enter a number that is more than 0: ");
        scanf("%d", &number);
        if(number > 0)
        {
            sum += number;
        }
    }while (number > 0);

    printf("sum: %d", sum);

    return 0;
}

