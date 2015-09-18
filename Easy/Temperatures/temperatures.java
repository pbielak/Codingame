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
        int N = in.nextInt(); // the number of temperatures to analyse
        
        if(N == 0) {
            System.out.println("0");
        }
        else {
            in.nextLine();
            String TEMPS = in.nextLine(); // the N temperatures expressed as integers ranging from -273 to 5526
            
            String[] temps = TEMPS.split(" ");
            
            ArrayList<Integer> temperatures = new ArrayList<Integer>();
            
            for(String T : temps) {
                temperatures.add(Integer.parseInt(T));
            }
            
            temperatures.add(0);
            Collections.sort(temperatures);
            
            
            int zeroIndexInList = temperatures.indexOf(0);
            
            if(zeroIndexInList == 0) {
                System.out.println("" + temperatures.get(zeroIndexInList + 1));
            }
            else if(zeroIndexInList == (temperatures.size() - 1)) {
                System.out.println("" + temperatures.get(zeroIndexInList - 1));
            }
            
            else {
                int leftElement = Math.abs(temperatures.get(zeroIndexInList - 1));
                int rightElement = Math.abs(temperatures.get(zeroIndexInList + 1));
                
                if( leftElement >= rightElement ) {
                    System.out.println("" + rightElement);
                }
                else {
                    System.out.println("" + leftElement);
                }
            }
         }
    }
}