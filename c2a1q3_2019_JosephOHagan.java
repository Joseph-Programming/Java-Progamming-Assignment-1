package c2a1_2019_JosephOHagan;

import java.util.Scanner; //imported scanner class

public class c2a1q3_2019_JosephOHagan {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); //creating the scanner object to read user inputs and initialising it to "input"
		double total = 0; //to be used later to store the total.
		int valueConverted = 0; //to be used later to store the value of the converted char to int.
		
		System.out.println("Please enter a string: ");
		String userInput = input.nextLine(); //takes user input and stores the values in userInput
		System.out.println("Please enter an integer: ");
		int userInt = Integer.parseInt(input.nextLine()); //takes the user input and converts the string to an integer then stores the values in userInt
		System.out.println("Please enter a double: ");
		double userDouble = Double.parseDouble(input.nextLine()); //takes the users input and converts the string to an double then stores the value in userDouble

		for(int i=0; i<userInput.length(); i++) { //for loop to pass through each character of the users input.
			
			char value = userInput.charAt(i); //store the values of each iteration into the char data type
			valueConverted = findPosition(value); //we then pass the data contained within "value" to our method, have it returned and then initialise it to the int valueConverted
		    total += valueConverted; //we add the value converted iteration to "total", loop around and add the next iteration on top and this repeats until the loop is finished 
			}
		
	    total += (userInt + userDouble); //we then take the users int input, double input and add them to the existing total carried forward from the for loop. 
	    System.out.println("Your result is: dad" + total); //lastly we print our result
	    }

	private static int findPosition(char value) {// this is our method we created to find out the position and numerical values of our user input.
		
		char inputLetter = Character.toLowerCase(value); //converts the char values to lowercase letters so we do not have deal with uppercase.
		int obtainAsciiValue = inputLetter; //we then convert the char into an int
		
		if (obtainAsciiValue >= 48 && obtainAsciiValue <= 57) { //if the int value matches the Ascii values for 0-9 (0 being 48 on the ascii table) then we -48 to give the int as normal
			
			return obtainAsciiValue - 48; //we stop here and return the values for the numbers (0-9)
		}//otherwise if it is not a number 0-9 we continue through the method code block.
		
		int position = obtainAsciiValue -96; //we then assign that the position of this int is the Ascii value of the character then take away 96 from this Ascii position (e.g "c" = 99 on the Ascii table therefor we will initialise the int position to 3)
		 
		if (position < 0 || position >= 27) { //if statement for the special characters, as we -96 (take away 96) from anything that is not a number, we are left with special characters and letters. If the Ascii table value for the positions is < 0 or >= 27 we default/initialise it to 0. 
			
			position = 0; //special characters are initalised to 0 if they meet our arguments.
		}
		
		return position; //we then pass the int position value back up to our method and return the value to where the method was being called.
		}
	}