#include <stdio.h>
#include <string.h>

struct inputzz
{
    char inputzz[30];
};

int main(){

    char temp[30];

    printf("Enter a word hihi: ");
    scanf("%s", &temp);

    struct inputzz palinedrome1;  

    strcpy(palinedrome1.inputzz, temp);
    printf("Entered word: %s ", palinedrome1.inputzz);

    //Reversing the inputted word
    strrev(palinedrome1.inputzz);
    printf("\nReversed Format: %s ", palinedrome1.inputzz);

    //Checking the whether it is a palindrome
    if (strnicmp(palinedrome1.inputzz, temp, 30) == 0){
        printf("\nPalindrome");
    } else {
    printf("\nNot a palindrome"); } 

    //Count a specific character from a string
    char chrc;
    int count = 0; 

    printf("\n\nEnter the character you wanted to search: ");
    scanf(" %c", &chrc);
    
    for(int i=0;palinedrome1.inputzz[i] != '\0';i++){
        if (palinedrome1.inputzz[i] == chrc){ 
            count++;
        }
    }
    printf("The number of times this \"%c\" occured: %d\n\n\n", chrc, count);

    return 0;
}