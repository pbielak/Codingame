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
        int N = in.nextInt(); // Number of elements which make up the association table.
        in.nextLine();
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        in.nextLine();
        
        Map<String, String> mimeTypes = new HashMap<String, String>();
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            
            mimeTypes.put(EXT.toLowerCase(), MT);
            
            in.nextLine();
        }
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            
            String extension = getExtensionOf(FNAME);
            
            if(extension == "UNKNOWN") System.out.println(extension);
            
            else {
                String mimeType = mimeTypes.get(extension);
            
                if(mimeType == null) System.out.println("UNKNOWN");
                else System.out.println(mimeType);
            }
        }
    }
    
    private static String getExtensionOf(String filename) {
        int indexOfDot = getIndexOfDot(filename);
        
        final int NOT_FOUND = -1;
        if(indexOfDot == NOT_FOUND || indexOfDot == (filename.length() - 1)) {
            return "UNKNOWN";
        }
        
        String extension = separateExtension(filename, indexOfDot);
        
        return extension.toLowerCase();
    }
    
    private static int getIndexOfDot(String filename) {
        return filename.lastIndexOf(".");
    }
    
    private static String separateExtension(String filename, int indexOfDot) {
        return filename.substring(indexOfDot + 1);
    }
}