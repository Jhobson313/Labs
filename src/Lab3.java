import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Learn your squares and cubes!");
		Scanner scanner = new Scanner(System.in);	// Create a Scanner named scanner
		int lastNumber;
		String choice = "y";
		do {                                       //Start a do loop to process and print table
			System.out.println();
			System.out.println("Enter an integer:");
			System.out.println();
			lastNumber = scanner.nextInt();
			for (int i = 1; i <= lastNumber; i++) {
				System.out.println("Number" + "\t" + "Squared" + "\t" + "Cubed"); //print column headings
				System.out.println("======"+"\t"+"======"+"\t"+"======");
				int square = i * i;
				int cube = i * i * i;
				System.out.println(i + "\t" + square + "\t" + cube);
			}
			System.out.println("Continue?(y/n):");
			choice = scanner.next();
			System.out.println();
		} while (choice.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
		{

		}
	}
}
