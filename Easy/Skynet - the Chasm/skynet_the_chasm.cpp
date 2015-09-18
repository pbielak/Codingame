#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
 
 void adjustSpeed(int currentSpeed, int gap);
 
int main()
{
    int road; // the length of the road before the gap.
    cin >> road; cin.ignore();
    int gap; // the length of the gap.
    cin >> gap; cin.ignore();
    int platform; // the length of the landing platform.
    cin >> platform; cin.ignore();

    // game loop
    while (1) {
        int speed; // the motorbike's speed.
        cin >> speed; cin.ignore();
        int coordX; // the position on the road of the motorbike.
        cin >> coordX; cin.ignore();

        if(coordX < (road - 1)) {
            adjustSpeed(speed, gap);
        }
        else if(coordX == (road - 1)) {
            cout << "JUMP\n";
        }
        else {
            if(speed > 0) {
                cout << "SLOW\n";
            }
        }

        
    }
}

void adjustSpeed(int currentSpeed, int gap) {
    if( currentSpeed > (gap + 1) ) {
        cout << "SLOW\n";
    }
    else if( currentSpeed < (gap + 1) ) {
        cout << "SPEED\n";
    }
    else {
        cout << "WAIT\n";
    }
}