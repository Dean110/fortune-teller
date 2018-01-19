import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Program startup text.

		System.out.println("Welcome to WCCI Industries \'Super Awesome Fortune Teller\'");

		// Part 1
		// Initialize and fill user data variables.

		System.out.println("To start I'll need your first name:");
		String userFirstName = input.nextLine();
		System.out.println("Thank you, next I need your last name:");
		String userLastName = input.nextLine();
		System.out.println("Ok, now to determine your fate I need to know your age:");
		int userAge = input.nextInt();
		System.out.println("What month were you born in?  Please use the month's numeric value:");
		int userBirthMonth = input.nextInt();
		
		input.nextLine(); /* Clearing input cache */
		
		System.out.println("What is your favorite ROYGBIV color?\nYou can enter help to see a list of ROYGBIV colors:");
		String favoriteColor = input.nextLine();
		// Print Color List if 'Help' is entered
		if (favoriteColor.toLowerCase().equals("help")) {
			System.out.println(
					"Here is a list of colors to choose from:\nRed, Orange, Yellow, Green, Blue, Indigo, or Violet\nPlease enter one of these colors:");
			favoriteColor = input.nextLine();
		} 
		System.out.println("How many siblings do you have:");
		int userSiblingCount = input.nextInt();
		System.out.println("Thanks for your time, your fortune is inbound.");

//TESTING
System.out.println(userBirthMonth);
		System.out.println(favoriteColor);
		System.out.println(userSiblingCount);
		
		// Part 2
		// Take input and give it consequences

		// Part 3
		// Take consequences and give a fortune
	}

}
