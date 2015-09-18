import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    private static List<Defibrillator> defibrillators = new ArrayList<Defibrillator>();

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next(); // user longitude
        in.nextLine();
        
        String LAT = in.next(); // user latitude
        in.nextLine();
        
        int N = in.nextInt();
        in.nextLine();
        
        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            
            String[] defiInfo = DEFIB.replaceAll(",", ".").split(";");
            
            defibrillators.add(new Defibrillator(Integer.parseInt(defiInfo[0]), defiInfo[1], defiInfo[2], defiInfo[3], Double.parseDouble(defiInfo[4]), Double.parseDouble(defiInfo[5])));
            
        }
        
        Point user = new Point(Double.parseDouble(LON.replaceAll(",", ".")), Double.parseDouble(LAT.replaceAll(",", ".")));


        double distance = Double.POSITIVE_INFINITY;
        String defiName = "";
        
        for(Defibrillator defi : defibrillators) {
            
            double currentDistance = defi.getDistanceTo(user);
            if(currentDistance < distance) {
                distance = currentDistance;
                defiName = defi.getName();
            }
        }
        
        System.out.println(defiName);
    }
}


/*
    A number identifying the defibrillator
    Name
    Adress
    Contact Phone number
    Longitude (degrees)
    Latitude (degrees)
*/
class Defibrillator {
    private int id;
    private String name;
    private String adress;
    private String phoneNumber;
    private double longitude; //already radians
    private double latitude;
    
    public Defibrillator(int id, String name, String adress, String phoneNumber, double longitude, double latitude) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.longitude = Math.toRadians( longitude );
        this.latitude = Math.toRadians( latitude);
    }
    
    
    public String getName() {
        return name;
    }
    
    public double getDistanceTo(Point user) {
        double x = (user.longitude - this.longitude) * Math.cos((user.latitude + this.latitude) / 2);
        
        double y = user.latitude - this.latitude;
        
        double distance = Math.sqrt(x*x + y*y) * 6371;
        
        return distance;
    }
    
    public String toString() {
        return "" + id + " == " + name + " == " + adress + " == " + phoneNumber + " == "  + longitude + " == " + latitude;
    }
}

class Point {
    public double longitude; // already radians
    public double latitude;
    
    public Point(double x, double y) {
        this.longitude = Math.toRadians(x);
        this.latitude = Math.toRadians(y);
    }
}    