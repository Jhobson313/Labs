package Lab12;

import java.util.Scanner;

public class RoshamboGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String playerName = selectName(scanner);
		Player user = new ScannerPlayer(scanner, playerName);
		Player opponent = selectOpponent(scanner);

		int wins = 0;
		int losses = 0;
		int noOfGames = 0;
		int ties = 0;

		do {
			Roshambo yourHand = user.generateRoshambo();
			Roshambo opponentHand = opponent.generateRoshambo();

			GameOutcome outcome = yourHand.compareAgainst(opponentHand);

			switch (outcome) {
			case WIN:
				System.out.println(yourHand + "beats" + opponentHand + ". Congrats. You win!");
				wins++;
				break;
			case TIE:
				System.out.println(yourHand + "ties" + opponentHand + ". It's a draw.");
				ties++;
				break;
			case LOSS:
				System.out.println(opponentHand + "beats" + yourHand + "." + opponent.getName() + "defeated you.");
				losses++;
				break;
			}
		} while (user.yesOrNo(scanner, "Would you like to play again"));

		System.out.println();
		System.out.println("Here your record against" + opponent.getName());
		System.out.println("Wins: " + wins + " Ties: " + ties + "Losses" + losses);
		System.out.println("Thanks for playing");
		scanner.close();

	}

	private static String selectName(Scanner scanner) {
		
		return null;
	}

	private static Player selectOpponent(Scanner scanner) {
		return null;
	}

}
