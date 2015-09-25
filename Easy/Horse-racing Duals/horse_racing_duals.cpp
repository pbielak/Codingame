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
    int N;
    cin >> N; cin.ignore();
    
    vector<int> strengths;
    
    for (int i = 0; i < N; i++) {
        int Pi;
        cin >> Pi; cin.ignore();
        
        strengths.push_back(Pi);
    }
    
    sort( strengths.begin(), strengths.end() );
        
    int previous = strengths[0], current = strengths[1];
    int distance = abs(previous - current);
        
    previous = current;
        
    for(int i = 2; i < strengths.size(); i++)
    {
        current = strengths[i];
            
        int currentDistance = abs(current - previous);
            
        if(distance > currentDistance) {
            distance = currentDistance;
        }
            
        previous = current;
    }

    cout << distance << endl;
}