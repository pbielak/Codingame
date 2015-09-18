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
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.

            if(coordX < (road - 1)) {
                adjustSpeed(speed, gap);
            }
            else if(coordX == (road - 1)) {
                System.out.println("JUMP");
            }
            else {
                if(speed > 0) System.out.println("SLOW");
            }
        }
    }

    
    private static void adjustSpeed(int currentSpeed, int gap){
        if( currentSpeed > (gap + 1) ) {
                System.out.println("SLOW");
            }
            else if( currentSpeed < (gap + 1) ) {
                System.out.println("SPEED");
            }
            else {
                System.out.println("WAIT");
            }
    }
}