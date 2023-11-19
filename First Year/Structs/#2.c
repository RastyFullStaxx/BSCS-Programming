#include <stdio.h>
#include <string.h>

struct Restaurant {
    char name[30];
    char address[30];
    float averageCost;
    char typeOfFood[30];
};

int main() {
    struct Restaurant restaurant;

    strcpy(restaurant.name, "The Rong Restaurant");
    strcpy(restaurant.address, "99-B Goa Kingdom, Gray Terminal Street");
    restaurant.averageCost = 5;
    strcpy(restaurant.typeOfFood, "Pinoy Kitchen");

    printf("==============================\n");
    printf("Restaurant Details:\n");
    printf("Name: %s\n", restaurant.name);
    printf("Address: %s\n", restaurant.address);
    printf("Average Cost: $%.2f\n", restaurant.averageCost);
    printf("Type of Food: %s\n", restaurant.typeOfFood);
    printf("\n==============================");
    printf("\n\n\n\n");

    return 0;
}
