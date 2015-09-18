#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

void adjustSpeed(int currentSpeed, int gap); 
 
int main()
{
    int road; // the length of the road before the gap.
    scanf("%d", &road);
    int gap; // the length of the gap.
    scanf("%d", &gap);
    int platform; // the length of the landing platform.
    scanf("%d", &platform);

    // game loop
    while (1) {
        int speed; // the motorbike's speed.
        scanf("%d", &speed);
        int coordX; // the position on the road of the motorbike.
        scanf("%d", &coordX);

        
        if(coordX < (road - 1)) {
            adjustSpeed(speed, gap);
        }
        else if(coordX == (road - 1)) {
            printf("JUMP\n");
        }
        else {
            if(speed > 0){
              printf("SLOW\n");  
            } 
        }
    }
    
    return 0;
}

void adjustSpeed(int currentSpeed, int gap){
        if( currentSpeed > (gap + 1) ) {
            printf("SLOW\n");
        }
        else if( currentSpeed < (gap + 1) ) {
			printf("SPEED\n");
        }
        else {
            printf("WAIT\n");
        }
    }
