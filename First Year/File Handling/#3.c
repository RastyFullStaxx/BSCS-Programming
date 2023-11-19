#include <stdio.h>
#include <stdbool.h>
#include <ctype.h>
#include <string.h>

int main(int argc, char *argv[]) {
    char filename[50];
    char name[50];

    printf("Hello! What's your name? ");
    scanf("%s", name);
    printf("Nice to meet you, %s!\n", name);

    printf("Input the file name to be opened: ");
    scanf("%s", filename);
    strtok(filename, "\n");

    FILE *filePointer = fopen(filename, "r");

    if (filePointer == NULL) {
        printf("File not found!");
        return 1;
    }

    int wordCount = 0, charCount = 0, c;
    bool whitespace = true;

    printf("\n");
    printf("The content of the file %s is:\n", filename);

    while (true) {
        c = fgetc(filePointer);

        if (feof(filePointer)) break;

        printf("%c", c);

        charCount++;
        if (whitespace && !isspace(c)) {
            wordCount++;
            whitespace = false;
        } else if (!whitespace && isspace(c)) {
            whitespace = true;
        }
    }

    fclose(filePointer);

    printf("\n\n");
    printf("====================================================\n");
    printf("The number of words in the file %s is: %d\n", filename, wordCount);
    printf("The number of characters in the file %s is: %d\n", filename, charCount);
    printf("====================================================\n\n\n\n\n\n\n\n\n");
    return 0;
}
