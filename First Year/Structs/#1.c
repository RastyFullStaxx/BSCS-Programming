#include <stdio.h>
#include <string.h>
#include <ctype.h>

struct inputzz
{
    char inputzz[30];
};

int vowels(const char* index){

    int count = 0;
    for (int i=0;index[i] != '\0'; i++){
        char idx = tolower(index[i]);
        if (idx=='a'||idx=='e'||idx=='i'||idx=='o'||idx=='u'){
            count++;} }
    return count;
}

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

    //Counting the Vowels
    int vowelzz = vowels(temp);
    printf("\nThe number of vowels found: %d ", vowelzz);
    printf("\n\n\n");


    return 0;
}