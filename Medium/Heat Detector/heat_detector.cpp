#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int main()
{
    int w; // width of the building.
    int h; // height of the building.
    cin >> w >> h; cin.ignore();
    int n; // maximum number of turns before game over.
    cin >> n; cin.ignore();
    int x0;
    int y0;
    cin >> x0 >> y0; cin.ignore();

    // game loop
    while (1) {
        string BOMB; // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
        cin >> BOMB; cin.ignore();

        //Combined binary search
            int left = 0;
            int right = w - 1;
            int up = 0;
            int down = h - 1;
            
            while(left <= right || up <= down) {
                x0 = (left + right) / 2;
                y0 = (up + down) / 2;
                
                //Jump to new position
                cout << x0  << " " << y0 << endl;
                
                //Get new bomb position
                cin >> BOMB; cin.ignore();
                
                if(BOMB.find("R") != -1) {
                    left = x0 + 1;
                }
                
                if(BOMB.find("L") != -1) {
                     right = x0 - 1;
                }
                
                if(BOMB.find("U") != -1) {
                    down = y0 - 1;
                }
                
                if(BOMB.find("D") != -1) {
                    up = y0 + 1;
                }
            }
    }
}