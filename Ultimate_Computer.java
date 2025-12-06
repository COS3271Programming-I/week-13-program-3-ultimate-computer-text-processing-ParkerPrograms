package Ultimate_Computer;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ultimate_Computer {
	static Scanner userinput = new Scanner(System.in);
	public static int getInt(String message) {
		int response;
		String dummy;
		while (1 == 1) {
			try {
				System.out.print(message);
				response = userinput.nextInt();
				if ((response < 10 ) && (response >= 0)) {
					return response;
				}
			} catch (InputMismatchException e) {
				dummy = userinput.nextLine();
				continue;
			}
		}
	}
	public static void main(String[] args) {
		int menu_answer = 10;
		System.out.println("Welcome to the ULTIMATE COMPUTER");
		while (menu_answer != 0) {
			//menu
			System.out.println("\n1) Display App\n2) Text Art App\n3) Encouragement App"
					+ "\n4) Oppish App\n5) Calculator App\n6) Binary Calculator App"
					+ "\n7) Dice App\n8) Fibonacci App\n9) Double Factorial App"
					+ "\n0) Quit\n");
			//get valid user input
			menu_answer = getInt("Enter a number from the menu: ");
			//call the correct method from other files
			if (menu_answer == 1) {
				Display_App display = new Display_App();
				display.display();
			}
			if (menu_answer == 2) {
				Text_Art_App art = new Text_Art_App();
				art.art();
			}
			if (menu_answer == 3) {
				Encouragement_App encourage = new Encouragement_App();
				encourage.encourage();
			}
			if (menu_answer == 4) {
				Oppish oppish = new Oppish();
				oppish.oppish();
			}
			if (menu_answer == 5) {}
			if (menu_answer == 6) {}
			if (menu_answer == 7) {}
			if (menu_answer == 8) {}
			if (menu_answer == 9) {}
		}
		System.out.println("\nThanks for using the ULTIMATE COMPUTER");
	}
}

