#include <stdio.h>
#include <string.h>
#include <conio.h>

int main (int argc, char *argv[]) {
    char scroll[50], new_incantation[255];
    int line;

    printf("Greetings, Apprentice Wizard! What's the name of the mystical scroll you wish to open? ");
    fgets(scroll, 50, stdin);
    strtok(scroll, "\n");

    printf("Enchant us with your new incantation: ");
    fgets(new_incantation, 255, stdin);

    printf("Ah, marvelous! Now, which line number would you like to replace? ");
    scanf("%d", &line);

    FILE *scroll_fp = fopen(scroll, "r");
    FILE *temp_scroll_fp = fopen("temp_scroll.txt", "w");

    if (scroll_fp == NULL || temp_scroll_fp == NULL) {
        printf("Alas! The mystical scroll is not within our grasp...");
        return 1;
    }

    char buffer[255];
    int line_ctr=0;

    while (fgets(buffer, 255, scroll_fp) != NULL) {
        line_ctr++;
        if (line_ctr == line) {
            fputs(new_incantation, temp_scroll_fp);
            continue;
        }
        fputs(buffer, temp_scroll_fp);
    }

    fclose(scroll_fp);
    fclose(temp_scroll_fp);

    // Replace the original scroll with the new one
    remove(scroll);
    rename("temp_scroll.txt", scroll);

    printf("\n");
    printf("Marvelous! You have replaced the incantation on line '%d' with your new mystical words.", line);

    return 0; }
