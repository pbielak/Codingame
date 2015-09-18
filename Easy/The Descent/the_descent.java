import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int[] mountainHeights = new int[8];
        // game loop
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                mountainHeights[i] = mountainH;
            }

            int maxHeightIndex = getIndexOfHighestMountain(mountainHeights);
            
            if(spaceX == maxHeightIndex) System.out.println("FIRE");
            else System.out.println("HOLD");
        }
    }

    private static int getIndexOfHighestMountain(int[] heights){
        int index = -1;
        int maxHeight = Integer.MIN_VALUE;
        
        for(int i = 0; i < heights.length; i++){
            if(heights[i] > maxHeight){
                maxHeight = heights[i];
                index = i;
            }
        }
        
        return index;
    }
}