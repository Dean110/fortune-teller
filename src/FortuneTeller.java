
// Version 1.1
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		// Program startup text.

		System.out.println("Welcome to WCCI Industries \'Super Awesome Fortune Teller\'");

		// Part 1
		// Initialize and fill user data variables.

		String[] userInput;
		userInput = new String[6];
		String[] userPrompts;
		userPrompts = new String[6];

		userPrompts[0] = "To start we'll need your first name:";
		userPrompts[1] = "Thank you, next we need your last name:";
		userPrompts[2] = "Ok, now to determine your fate we need to know your age:";
		userPrompts[3] = "What month were you born in?  Please use the month's numeric value:";
		userPrompts[4] = "What is your favorite ROYGBIV color?\nYou can enter help to see a list of ROYGBIV colors:";
		userPrompts[5] = "How many siblings do you have:";

		for (int i = 0; i < 6; i++) {
			System.out.println(userPrompts[i]);
			userInput[i] = (String) input.nextLine();

			if (userInput[i].equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}

			if ((i == 4) && (userInput[4].equalsIgnoreCase("help"))) {
				while (userInput[i].equalsIgnoreCase("help")) {
					System.out.println(
							"Here is a list of colors to choose from:\nRed, Orange, Yellow, Green, Blue, Indigo, or Violet\nPlease enter one of these colors:");
					userInput[i] = input.nextLine();
					if (userInput[i].equalsIgnoreCase("quit")) {
						System.out.println("Nobody likes a quitter...");
						System.exit(0);
					}
				}
			}

		}
		input.close();

		String userFirstName = userInput[0];
		String userLastName = userInput[1];
		int userAge = Integer.parseInt(userInput[2]);
		int userBirthMonth = Integer.parseInt(userInput[3]);
		String userFavoriteColor = userInput[4];
		int userSiblingCount = Integer.parseInt(userInput[5]);

		System.out.println("Thanks for your time, your fortune is inbound.");
		Thread.sleep((userSiblingCount * 1000));

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
				+ bankBalance + " in the bank, a vacation home in " + vacationHomeLocale + ",\nand travel by "
				+ transitMode + ".");

	}

}
