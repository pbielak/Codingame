import java.util.*;
import java.io.*;
import java.math.*;

/**
 * CodinGame planet is being attacked by slimy insectoid aliens.
 * <---
 * Hint:To protect the planet, you can implement the pseudo-code provided in the statement, below the player.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String enemy1 = in.next();
            int dist1 = in.nextInt(); 
            String enemy2 = in.next(); 
            int dist2 = in.nextInt(); 
			
            if(dist1 <= dist2) {
                System.out.println( enemy1 );
            }
            else {
                System.out.println( enemy2 );
            }
        }
    }
}