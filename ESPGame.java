/*
* Class: CMSC203 CRN 22502
* Instructor: Dr. David Kuijt
* Description: Read the file of colors and display, user guesses colors three times, and 
*    print out results. Also read in user name, description and due date, then print them out.
* Due: 09/23/2024
* Platform/compiler: Eclipse IDE
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or
* any source. I have not given my code to any student.
* Print your Name here: Alex Kim
*/

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class ESPGame 
{	           
	public static void main(String[] args)	
	{     	   
		final String COLOR_BLACK   = "Black";
		final String COLOR_WHITE   = "White";
		final String COLOR_GRAY    = "Gray";
		final String COLOR_SILVER  = "Silver";
		final String COLOR_MAROON  = "Maroon";
		final String COLOR_RED     = "Red";
		final String COLOR_PURPLE  = "Purple";
		final String COLOR_FUCHSIA = "Fuchsia";
		final String COLOR_GREEN   = "Green";
		final String COLOR_LIME    = "Lime";
		final String COLOR_OLIVE   = "Olive";
		final String COLOR_YELLOW  = "Yellow";
		final String COLOR_NAVY    = "Navy";
		final String COLOR_BLUE    = "Blue";
		final String COLOR_TEAL    = "Teal";
		final String COLOR_AQUA    = "Aqua";
		
		Random rand = new Random();
    	Scanner myScanner = new Scanner(System.in);
	    
	    System.out.println("CMSC203 Assignment1: Test your ESP skills!");
	    System.out.println("Enter the filename: ");

	    try {
	    	String myFilename = myScanner.nextLine();
	        Scanner inputFile = new Scanner(new File(myFilename));

	        System.out.println("There are sixteen colors from a file:");
	       
   	        // Read until the end of the file
	        while (inputFile.hasNext()) 
	        {
	            String str = inputFile.nextLine();
	    	    System.out.println(str);
	        }
	       
	        // Close the file
	        inputFile.close();	 
		} catch (Exception ex) {
            ex.printStackTrace();
        }
	    
	    int totalCorrectGuess = 0;
    	System.out.println();
	       
	    // Repeat for 3 times
	    for (int i = 1; i <= 3; i++) {
	        System.out.println("Round " + i + "\n");
	    	System.out.println("I am thinking of a color.");
	    	System.out.println("Is it one of list of colors above?");

	    	// Get guessed color name from user
	    	System.out.println("Enter your guess: ");
	        String guessedColor = myScanner.nextLine();
	           
	        // Validate user input. If invalid, try again.	           
	        if (!guessedColor.matches("[a-zA-Z]*"))
	        {
		    	System.out.println("[ERROR] Invalid input. Try again.");
		    	System.out.println("Enter your guess: ");
		        guessedColor = myScanner.nextLine();
	        }	          
	        
	        // Generate a random color between 1 and 16
	        // Since rand returns 0 to 15, add 1
	        int colorIndex = rand.nextInt(16) + 1;
	        String colorName = "";
	           
	        System.out.println();

	        if (colorIndex == 1) {colorName = COLOR_BLACK;}
	        else if (colorIndex == 2) {colorName = COLOR_WHITE;}
	        else if (colorIndex == 3) {colorName = COLOR_GRAY;}
	        else if (colorIndex == 4) {colorName = COLOR_SILVER;}
	        else if (colorIndex == 5) {colorName = COLOR_MAROON;}
	        else if (colorIndex == 6) {colorName = COLOR_RED;}
	        else if (colorIndex == 7) {colorName = COLOR_PURPLE;}
	        else if (colorIndex == 8) {colorName = COLOR_FUCHSIA;}
	        else if (colorIndex == 9) {colorName = COLOR_GREEN;}
	        else if (colorIndex == 10) {colorName = COLOR_LIME;}
	        else if (colorIndex == 11) {colorName = COLOR_OLIVE;}
	        else if (colorIndex == 12) {colorName = COLOR_YELLOW;}
	        else if (colorIndex == 13) {colorName = COLOR_NAVY;}
	        else if (colorIndex == 14) {colorName = COLOR_BLUE;}
	        else if (colorIndex == 15) {colorName = COLOR_TEAL;}
	        else if (colorIndex == 16) {colorName = COLOR_AQUA;}
		       
		    // If matches, increase totalCorrectGuess
		    if (guessedColor.equalsIgnoreCase(colorName)) {
		        totalCorrectGuess++;
		    } 
		       
		    System.out.println("I was thinking of " + colorName + ".");
	    }
	       
	    // Print Game Over message and results 
	    System.out.println("Game Over");
	    System.out.println("You guessed " + totalCorrectGuess + " out of 3 colors correctly.");

	    // Get user name, description and due date
	    System.out.println("Enter your name: ");
	    String myName = myScanner.nextLine();
	    System.out.println("Describe yourself: ");
	    String myDesc = myScanner.nextLine();
	    System.out.println("Due Date: ");
	    String dueDate = myScanner.nextLine();
	       
	    // Print user name, description and due date
	    System.out.println("User Name: " + myName);
	    System.out.println("User Description: " + myDesc);
	    System.out.println("Date: " + dueDate);  	
	      
	    myScanner.close();
	}
}
