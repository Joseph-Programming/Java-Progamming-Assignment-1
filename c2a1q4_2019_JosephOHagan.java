package c2a1_2019_JosephOHagan;

import java.util.Scanner; //imported scanner class

public class  c2a1q4_2019_JosephOHagan {
	
	//creating arrays for questions, people being asked and % values for yes answers. each element in the % array is set to (0) for use with the method later
	static String[] question = {"Have you seen the latest James Bond movie? ", "Have you seen the latest Avengers movie? ", "Have you seen the latest Terminator movie? " };
	static String[] surveyQuestionee = {"Person 1","Person 2", "Person 3"};
	static int[] percentageYes = {0,0,0};

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); //creating the scanner object to read user inputs and initialising it to "input"
		
		for (int i=0; i<surveyQuestionee.length; i++) { //for loop going through each questionee and printing out who is answering the questions
			
			System.out.println(surveyQuestionee[i]);
			
			for ( int j=0; j<question.length; j++) {//nested for loop within so that for each iteration of the for loop above, this for loop kicks in and will ask all 3 questions to each person.
				
				System.out.println(question[j]); //printing the question we are currently passing through in our loop at point [j]
				String userInput = input.nextLine(); //initialises user input for each question into the String userInput
				
				if (userInput.equals("yes")) {//if the users input is a "yes" it will increment the above array by 1 for each question asked. we are not account for the "no" as this information is not relevant since we are only posting the results for people who say yes
					percentageYes[j]++;
				}
			}
		}

		System.out.println("-------------------");
		System.out.println("TIME FOR THE RESULTS!"); // a little bit of println flare to make the console look more appealing
		System.out.println("-------------------");
		
		for (int i=0; i <surveyQuestionee.length; i++) {// for loop to output the % results for each question (uses the question array and the percentageMethod values being returned)
			
			System.out.println(question[i] + percentageMethod(percentageYes[i]) + "% Said yes!"); //prints out each question followed by calling the method created below, followed by the text " "% Said yes!"
		}
	}

	static int percentageMethod(int percentage) { //method used to calculate the survey results
		
		return (percentage * 100) / 3; //this takes the array value at "i" within the array, multiplies them by 100 then divides by the number of people in the survey
	}
}