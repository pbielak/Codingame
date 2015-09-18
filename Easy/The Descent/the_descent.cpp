#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int getIndexOfHighestMountain(int* heights); 
 
int main()
{

    // game loop
    while (1) {
        int spaceX;
        int spaceY;
        cin >> spaceX >> spaceY; cin.ignore();
        
        int mountainHeights[8];
        
        for (int i = 0; i < 8; i++) {
            int mountainH; // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
            cin >> mountainH; cin.ignore();
            
            mountainHeights[i] = mountainH;
        }

        int maxHeightIndex = getIndexOfHighestMountain(mountainHeights);
            
        if(spaceX == maxHeightIndex) cout << "FIRE" << endl;
        else cout << "HOLD" << endl;       
    }
    
}

int getIndexOfHighestMountain(int* heights){
    int index = -1;
    int maxHeight = -666;
        
    for(int i = 0; i < 8; i++){
        if(heights[i] > maxHeight){
            maxHeight = heights[i];
            index = i;
        }
    }
        
    return index;
}