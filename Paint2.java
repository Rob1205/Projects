import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's height
        do {
        try {	
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();
        wallHeight = Double.parseDouble(wallHeightString);
        if(wallHeight<=0) {
        	System.out.println("Invalid Height.");
        } else {
        	validHeight = true;
        }
        }
        catch(NumberFormatException e) {
        	System.out.println("Do not enter a String. " + e.getMessage());
        }
        finally {
        	System.out.println();
        } while(!validHeight);


        // Prompt user to input wall's width
        do {
        try {
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();
        wallWidthString = scnr.hasNextLine();
        wallWidth=Double.parseDouble(wallWidthString);
        if(wallWidth <= 0) {
        	System.out.println("Invalid Width.");
        } else {
        	validWidth = true;
        }
        }
        catch(NumberFormatException e) {
        	System.out.println("Do not enter a String. " + e.getMessage());
        }
        finally {
        	System.out.println();
        }
        }while(!validWidth);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  “ + wallArea + “ square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        cansNeededd = Math.ceil(gallonsPaintNeeded);
        Systems.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
