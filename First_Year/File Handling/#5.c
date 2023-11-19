#include <stdio.h>
#include <string.h>
#include <conio.h>

int main (int argc, char *argv[]) {
    char spellbook[50], incantation[255];
    int num_incantations;

    printf("Greetings, young sorcerer! What shall be the name of your magical spellbook? ");
    fgets(spellbook, 50, stdin);
    strtok(spellbook, "\n");

    printf("How many powerful incantations will you scribe within the spellbook? ");
    scanf("%d", &num_incantations);
    getchar();

    FILE *spellbook_fp = fopen(spellbook, "a");

    printf("\n");
    printf("Enchant the world with your mystical words:\n");
    for (int i = 0; i < num_incantations; i++) {
        printf("> ");
        fgets(incantation, 255, stdin);

        fputs(incantation, spellbook_fp);
    }

    fclose(spellbook_fp);

    spellbook_fp = fopen(spellbook, "r");

    printf("\n");
    printf("Behold! The incantations within your magical spellbook, %s, are:\n", spellbook);
    while (fgets(incantation, 255, spellbook_fp) != NULL) {
        printf("%s", incantation);
    }
    
    fclose(spellbook_fp);

    return 0;
}
