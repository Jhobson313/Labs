package co.grandcircus.triangle;
import java.util.Scanner;
import java.util.InputMismatchException;

public class triangleApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Triangle myShape = new Triangle();
		myShape.base =5.5;
		myShape.height =6.6;
		//
		System.out.println("area of triangle:\t");
		System.out.println(myShape.getArea());
		//
		Triangle triangle2 = new Triangle();
		
		System.out.println("enter the base of the triangle" );
		triangle2.base = scanner.nextDouble();

		System.out.println("enter the height of the triangle" );
		triangle2.height = scanner.nextDouble();
		//
		System.out.println(triangle2.getArea());
		//
		String aString = myShape.toString();
		System.out.println(Triangle.getCombinedArea(myShape , triangle2));
		
	}

}
