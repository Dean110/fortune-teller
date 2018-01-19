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
		System.out.println(userLastName);
		
		

	}

}
