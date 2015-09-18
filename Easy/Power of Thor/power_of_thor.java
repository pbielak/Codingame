import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int thorX = initialTX;
        int thorY = initialTY;
        // game loop
        while (true) {
            int remainingTurns = in.nextInt();
            
            String directionX = "", directionY = "";
            
            if( thorX > lightX ) {
                directionX = new String("W");
                thorX--;
            }
            else if( thorX < lightX ) {
                directionX = new String("E");
                thorX++;
            }
            
            if( thorY > lightY ) {
                directionY = new String("N");
                thorY--;
            }
            else if( thorY < lightY ) {
                directionY = new String("S");
                thorY++;
            }
            
            System.out.println("" + directionY + directionX);        
        }
    }
}