import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        Boolean validHeight = true;
        Boolean validWidth = true;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
        	validHeight = true;
        	try {
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();
        
        if (!scnr.hasNextDouble()) {
        	scnr.next();
        	continue;
        }
        
        wallHeight = scnr.nextDouble();
        if(!(wallHeight > 0)) {
        	throw new Exception("You have entered Invalid Height");
        }
       }catch (Exception e){
    	   System.out.println("Exception Occured --> " + e.getMessage());
    	   validHeight = false;
       }
      }
      while (!validHeight);  

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
        	validWidth = true;
        	try {
        
        System.out.println("Enter wall width (feet): ");
        wallHeight = scnr.nextDouble();
        
        if(!scnr.hasNextDouble());
        scnr.next();
        continue;
       }
        	wallWidth = scnr.nextDouble();)

if(!(wallWidth > 0)) {
	throw new Exception("You have entered Invalid Width");
	}
   }catch(Exception e) {
	   System.out.println("Exception Occured --> " + e.getMessage());
	   validWidth = false;
   }
    }
    while(!validWidth);
       

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:" + wallArea + "square feet");
        System.out.println("Wall area:  square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonspaintneeded + " gallons");

    }
}
