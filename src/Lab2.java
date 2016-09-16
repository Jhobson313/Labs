import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Would you like to play a game? (y/n)");

		String y = scanner.next();
		if (y.equalsIgnoreCase("y")) {
			System.out.println("Excellent!\n"
					+ " You are walking across a field and you encounter a fire-breathing dragon!");
			System.out.println("What would you do?\n "
					+ "(Enter and face the beast! or Run away!)");
			String answer = scanner.next();
			System.out.println(answer);
			if (answer.equalsIgnoreCase("Enter")) {
				System.out.println("You approach the dragon.\n "
						+ "You see that he has __ heads.(enter 1,2,3)");
			} else {
				System.out.println("Coward!");
			}
			;
			int heads = scanner.nextInt();

			switch (heads) {
			case 1:
				heads = (1);
				break;
			case 2:
				heads = (2);
				break;
			case 3:
				heads = (3);
				break;
			}
			System.out.println("No one has ever faced a " + heads
					+ " headed dragon before! Choose your weapon.(enter slingshot or sword or bow and arrow)");
			{
				String weapon = scanner.next();
				switch (weapon) {
				case "slingshot":
					weapon.equals("slingshot");
					break;
				case "sword":
					weapon.equals("sword");
					break;
				case "bow":
					weapon.equals("bow");
					break;
				}
				System.out.println("Armed with your " + weapon
						+ " you approach the dragon.\n"
						+ " You can feel its fiery breath as you get closer.\n"
						+ " It stares at you with its __ eyes. (enter red or blue):");
				String eyes = scanner.next();
				switch (eyes) {
				case "red":
					answer.equals("red");
					break;
				case "blue":
					answer.equals("blue");
					break;
				}
				System.out.println("Oh thank goodness! " + eyes
						+ "-eyed dragons are friendly. "
						+ "You pet it and become friends. "
						+ "You name the dragon" + "\t"
						+ " enter a name");
				String name = scanner.nextLine();
				System.out.println(name + " and Toothless live happily after!");

				System.out.println("The End");
			}
		}else {
			System.out.println("Coward!");
		}
	}
}