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
        String MESSAGE = in.nextLine();

        String binaryMessage = new String();
        for(char c : MESSAGE.toCharArray()) {
            String binaryChar = Integer.toBinaryString((int) c);
               
            while((binaryChar.length() % 7) != 0) {
                binaryChar = "0" + binaryChar; 
            }
            
            binaryMessage += binaryChar;
        }
        
        String unaryMessage = transformToUnary(binaryMessage);
        
        System.out.println(unaryMessage);
    }
    
    private static String transformToUnary(String binary) {
        String result = new String();
        
        while(!binary.isEmpty()) {
            char pattern = binary.charAt(0);
            
            result += getFirstBlock(pattern);
            
            do {
                result += "0";
                binary = removeFirstChar(binary);
                
                if(binary.length() == 0) break;
                
            } while(binary.charAt(0) == pattern);
            
            result += " ";
        }
        
        return result.substring(0, result.length() - 1);
    }
    
    private static String removeFirstChar(String in) {
        return in.substring(1);
    }
    
    private static String getFirstBlock(char pattern) {
        return ( pattern == '1' ) ? "0 " : "00 ";
    }
}