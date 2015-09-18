import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    private static ArrayList<Letter> pattern;
    private static Scanner in = new Scanner(System.in);
    private static int L;
    private static int H;
    private static String T;

    public static void main(String args[]) {
        
        readParameters();
        
        initPattern();
        readLetterPatterns();
        
        printInputTextInASCIIForm();
    }
    
    private static void readParameters() {
        L = in.nextInt(); // WIDTH of letters
        in.nextLine();
        
        H = in.nextInt(); // HEIGHT of letters
        in.nextLine();
        
        T = in.nextLine(); // ORIGINAL text
        T = T.toLowerCase();
    }
    
    private static void initPattern() {
        pattern = new ArrayList<Letter>();
        
        for(int i = 0; i < 27; i++) {
            pattern.add(new Letter());
        }
    }
    
    private static void readLetterPatterns() {
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            
            Iterator<Letter> it = pattern.iterator();
            
            for(int j = 0; j < ROW.length(); j += L) {
                String letter_row = ROW.substring(j, j + L);
                it.next().addRow(letter_row);
            }
        }

    }
    
    private static void printInputTextInASCIIForm() {
        for(int i = 0; i < H; i++) {
            for(char c : T.toCharArray()) {
                if( (c >= 'a' && c <= 'z') ) {
                    System.out.print(pattern.get((int) c - 97).getRow(i));
                } 
                else {
                    System.out.print(pattern.get(26).getRow(i));
                }
            }
            
            System.out.println("");
        }
    }
}

class Letter {
    private ArrayList<String> asciiForm;
    
    public Letter() {
        asciiForm = new ArrayList<String>();
    }
    
    public void addRow(String row){
        asciiForm.add(row);
    }
    
    public String getRow(int index) {
        return asciiForm.get(index);
    }
}