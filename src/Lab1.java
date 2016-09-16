import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		
		String Continue = "Y";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		while (Continue.equalsIgnoreCase("Y")){
		
			System.out.println("\nEnter Length: ");		
			float Length = scanner.nextFloat();	
			System.out.println("Enter Width: ");
			float Width = scanner.nextFloat();
			float Area = Width * Length;
			System.out.println("\nArea: " + Area + " square feet.");
			float Perimeter = (2 * Length) + (2 * Width);
			System.out.println("Perimeter: " + Perimeter + " feet.");
			System.out.println("\nContinue? Press Y/N ...");
			Continue = scanner.next();
		}
		
		System.out.println("\nExiting...");
		scanner.close();
	}

}
