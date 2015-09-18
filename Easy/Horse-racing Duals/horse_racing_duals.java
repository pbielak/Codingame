import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        List<Integer> strengths = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {
            int current = in.nextInt();
            strengths.add(current);
        }
        
        Collections.sort( strengths );
        
        int previous = strengths.get(0);
		int	current = strengths.get(1);
        int distance = Math.abs(previous - current);
        
        previous = current;
		
        for(int i = 2; i < strengths.size();i++)
        {
            current = strengths.get(i);
            int currentDistance = Math.abs(current - previous);
            
            if(distance > currentDistance) {
                distance = currentDistance;
            }
            
            previous = current;
        }

        System.out.println(distance);
    }
}