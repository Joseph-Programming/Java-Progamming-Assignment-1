package c2a1_2019_JosephOHagan;

import java.util.Scanner; //imported scanner class

	public class  c2a1q2_2019_JosephOHagan {
		
	    public static void main(String[] args) {
	        
	        Scanner input = new Scanner(System.in); //creating the scanner object to read user inputs and initialising it to "input"
	        int startNum = -1; //these int variables will store the start and end index of our substring, they will also be used to keep our while loops in check.
	        int endNum = -1;
	        
	        System.out.println("Enter a word: ");
			String	wordResult = input.nextLine(); //Storing user input for string into "wordResult" variable
	        
			System.out.println("Enter the first index: ");
	        
			while (startNum == -1) { //first while loop used to check for valid inputs for the start index
				
				String firstIndex = input.nextLine(); //taking the user numerical input and initialising it to firstIndex
				startNum = Integer.parseInt(firstIndex); //converting the users string input to an integer and initialising the values to startNum

				if (startNum >= wordResult.length()) {//if statement to check the user input is valid by checking if the startNum is greater than or equal to the length of the string
					
					System.out.print("Index is not in range, please try again: ");
					startNum = -1; //if the users input is seen as invalid then the loop resets as the value for the while loop remains -1 therefor it must loop again.
				}
				
				continue; //ends the while loop and tells the code to continue to the next code block outside of the loop.
			}
		
			System.out.println("Enter the last index : ");
			
			while (endNum == -1) {//second while loop used to check for valid inputs (repeated process of above while loop)
				
				String endIndex = input.nextLine(); //same process as the above while loop but now for the ending index
				endNum = Integer.parseInt(endIndex);
				
				if (endNum < startNum || endNum >= wordResult.length() ) {//only difference compared to above is that this if statements is checking if the users numerical input is less than the starting number or greater than/equal too the length of the wordresult string. 
					
					System.out.print("Last index number must be <= length of your chosen word but also > your first index: ");
					endNum = -1; //if the users input is seen as invalid then the loop resets as the value for the while loop remains -1 therefor it must loop again.
					}
				
				continue; //ends the while loop and tells the code to continue to the next code block outside of the loop.
			}

	        //Array is created for the characters, called "characterArray" which reads and stores the substring as a character array
	        //getChars method is being used to copy character from the string into the array.
	        // 4 arguments happen within the getChars method
	        //-First is the start index "startNum"
	        //-Second is the ending index "endNum"
	        //-Third is the character array to store the sub array 
	        //-Fourth is the starting index of the character array we are banking.
	        char[] characterArray = new char[endNum - startNum + 1];
	        wordResult.getChars(startNum, endNum + 1, characterArray, 0);
	        
	        //the values of the array are converted to string and then printed
	        System.out.println("Here is your substring: " + String.valueOf(characterArray));
	        }
	    }