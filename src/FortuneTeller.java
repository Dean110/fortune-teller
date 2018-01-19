import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		//Program startup text.
		
		System.out.println("Welcome to WCCI Industries \'Super Awesome Fortune Teller\'");

		//Initialize and fill user data variables.
		
		System.out.println("To start I'll need your first name:");
		String userFirstName = input.nextLine();
		System.out.println("Thank you " + userFirstName + ", next I need your last name:");
		String userLastName = input.nextLine();
		System.out.println("Ok " + userFirstName + " " + userLastName + ", now to determine your fate I need to know your age:");
		int userAge = input.nextInt();
		System.out.println("What month were you born in?  Please use the month's numeric value:");
		int userBirthMonth = input.nextInt();
		System.out.println("What is your favorite ROYGBIV color?\nYou can enter help to see a list of ROYGBIV colors:");
		String favoriteColor = input.nextLine();
		System.out.println("How many siblings do you have:");
		int userSiblingCount = input.nextInt();
		System.out.println(userSiblingCount);
		

	}

}
