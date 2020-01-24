package c2a1_2019_JosephOHagan;

import java.util.Scanner; //imported scanner class

public class  c2a1q1_2019_JosephOHagan {
	
	public static void main(String []args) {
		
		
		while (true) {//while loop to keep prompting the user for their inputs until "exit" is typed.
			
			System.out.println("Enter your text to be reversed (type exit to cancel):"); //Prints this line of text
		
			Scanner input = new Scanner(System.in); //setting up our scanner and initialising it to "read"
			String userInput = input.nextLine(); //takes the user input then initialises this value to the string "userInput". 
		
			if(userInput.equals("exit")) {//if the user input is equal to "exit", the following code within the if statement will apply.
				
				System.out.println("Thanks for playing!"); //prints this line
				System.exit(0); //terminates the program
			}
			
			StringBuilder reversedInput = new StringBuilder(userInput); //intialises the value of the string "userInput" to the StringBuilder object "reversedInput"
			
		
			System.out.println("Your sentence reversed is: " + reversedInput.reverse().toString()); //Prints this line + takes the value of "reversedInput", reverses it with the reverse method and outputs this as a string.
			}
		}
	}