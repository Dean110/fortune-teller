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
		String userFavoriteColor = input.nextLine();
		// Print Color List if 'Help' is entered
		if (userFavoriteColor.toLowerCase().equals("help")) {
			System.out.println(
					"Here is a list of colors to choose from:\nRed, Orange, Yellow, Green, Blue, Indigo, or Violet\nPlease enter one of these colors:");
			userFavoriteColor = input.nextLine();
		}
		System.out.println("How many siblings do you have:");
		int userSiblingCount = input.nextInt();
		System.out.println("Thanks for your time, your fortune is inbound.");

		// Part 2
		// Take input and give it consequences

		// Retirement Years
		int oddAge = 42;
		int evenAge = 21;
		int retirementYears;

		if (userAge % 2 == 1) {
			retirementYears = oddAge;
		} else {
			retirementYears = evenAge;
		}

		// Vacation Home Location (userSiblingCount)
		String vacationHomeLocale;
		if (userSiblingCount == 0) {
			vacationHomeLocale = "Maui, Hawaii";
		} else if (userSiblingCount == 1) {
			vacationHomeLocale = "Juno, Alaska";
		} else if (userSiblingCount == 2) {
			vacationHomeLocale = "Singapore, Thailand";
		} else if (userSiblingCount == 3) {
			vacationHomeLocale = "Brisbane, Australia";
		} else if (userSiblingCount > 3) {
			vacationHomeLocale = "Paris, France";
		} else {
			vacationHomeLocale = "Pomeroy, Ohio";
		}

		// Mode of Transportation (userFavoriteColor)
		String transitMode;

		switch (userFavoriteColor.toLowerCase()) {
		case "red":
			transitMode = "a Mustang";
			break;
		case "orange":
			transitMode = "bicycle";
			break;
		case "yellow":
			transitMode = "bus";
			break;
		case "green":
			transitMode = "a Prius";
			break;
		case "blue":
			transitMode = "row boat";
			break;
		case "indigo":
			transitMode = "a chariot pulled by corgis";
			break;
		case "violet":
			transitMode = "river barge";
			break;
		default:
			transitMode = "foot";
		}

		// Bank Balance (userBirthMonth)
		double bankBalance;
		if ((userBirthMonth >= 1) && (userBirthMonth <= 4)) {
			bankBalance = 452396.04;
		} else if ((userBirthMonth >= 5) && (userBirthMonth <= 8)) {
			bankBalance = 952396.03;
		} else if ((userBirthMonth >= 9) && (userBirthMonth <= 12)) {
			bankBalance = 252397.03;
		} else
			bankBalance = -52.01;

		// Part 3
		// Take consequences and give a fortune

		System.out.println(userFirstName + " " + userLastName + " will retire in " + retirementYears + " years with "
				+ bankBalance + " in the bank, a vacation home in " + vacationHomeLocale + ", \nand travel by "
				+ transitMode + ".");
	}

}
