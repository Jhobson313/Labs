package Lab12;

import java.util.Scanner;

public class RockPlayer extends Player {

	public RockPlayer(String playerName) {
		super(playerName);

	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}



	private static String selectName(Scanner scanner) {
		System.out.println("Hello.What is your name?");
		return scanner.nextLine();
	}

	private static Player selectOpponent(Scanner scanner) {
		System.out.println("Do you want to play against Red or Blue?");
		String opponentChoice = scanner.nextLine().toLowerCase();

		switch (opponentChoice) {
		case "R":
			return new RandomPlayer("Red");
		case "B":
			return new RockPlayer("Blue");
		default:
			throw new IllegalArgumentException("Must type R or B");
		}
	}
}