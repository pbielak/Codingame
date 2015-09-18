#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * CodinGame planet is being attacked by slimy insectoid aliens.
 * <---
 * Hint:To protect the planet, you can implement the pseudo-code provided in the statement, below the player.
 **/
int main()
{

    while (1) {
        string enemy1; 
        cin >> enemy1; cin.ignore();
        int dist1; 
        cin >> dist1; cin.ignore();
        string enemy2; 
        cin >> enemy2; cin.ignore();
        int dist2; 
        cin >> dist2; cin.ignore();

        if(dist1 <= dist2) {
             cout << enemy1 << endl;
        }
        else {
            cout << enemy2 << endl;
        }
    }
}