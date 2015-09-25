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
        int w = in.nextInt(); // width of the building.
        int h = in.nextInt(); // height of the building.
        int n = in.nextInt(); // maximum number of turns before game over.
        int x0 = in.nextInt();
        int y0 = in.nextInt();

        // game loop
        while (true) {
            String BOMB = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            
            //Combined binary search
            int left = 0;
            int right = w - 1;
            int up = 0;
            int down = h - 1;
            
            while(left <= right || up <= down) {
                x0 = (left + right) / 2;
                y0 = (up + down) / 2;
                
                //Jump to new position
                System.out.println("" + x0 + " " + y0);
                
                //Get new bomb position
                BOMB = in.next();
                
                if(BOMB.contains("R")) {
                    left = x0 + 1;
                }
                
                if(BOMB.contains("L")) {
                     right = x0 - 1;
                }
                
                if(BOMB.contains("U")) {
                    down = y0 - 1;
                }
                
                if(BOMB.contains("D")) {
                    up = y0 + 1;
                }
            }
        }
    }
}