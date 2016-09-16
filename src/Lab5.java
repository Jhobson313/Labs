import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String ContinuePrompt = "y";
		int counter = 1;

		do {
			System.out.println("How many sides do your dice have? ");
			int UserInput = scanner.nextInt();
			int answer1 = randomInteger(1, UserInput);

			System.out.println("\nRoll #" + counter);
			System.out.println(answer1);
			int answer2 = randomInteger(1, UserInput);
			System.out.println(answer2);

			if (answer1 == 1 && answer2 == 1) {
				System.out.println("\nSNAKE EYES!");
			}

			if ((answer1 + answer2 == 7) || (answer1 + answer2 == 11)) {
				System.out.println("\nCRAPS!");
			}

			if (answer1 == 6 && answer2 == 6) {
				System.out.println("\nBOX CARS!!");
			}

			System.out.println("\nDo you want to continue? (y/n): ");
			ContinuePrompt = scanner.next();
			counter++;
		}

		while (ContinuePrompt.equalsIgnoreCase("y"));
		scanner.close();
		System.out.println("\nExiting...");

	}

	public static int randomInteger(int min, int max) {
		int randomNum = min + (int) (Math.random() * ((max - min) + 1));
		return randomNum;
	}

}