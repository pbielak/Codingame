#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
int main()
{
    int lightX; // the X position of the light of power
    int lightY; // the Y position of the light of power
    int initialTX; // Thor's starting X position
    int initialTY; // Thor's starting Y position
    scanf("%d%d%d%d", &lightX, &lightY, &initialTX, &initialTY);
    
    int thorX = initialTX;
    int thorY = initialTY;

    // game loop
    while (1) {
        int remainingTurns;
        scanf("%d", &remainingTurns);

       
        if( thorY > lightY ) {
            printf("%s","N");
            thorY--;
        }
        else if( thorY < lightY ) {
            printf("%s","S");
            thorY++;
        }
        
        if( thorX > lightX ) {
            printf("%s","W");
            thorX--;
        }
        else if( thorX < lightX ) {
            printf("%s","E");
            thorX++;
        }
        
        printf("\n");
    }

    return 0;
}