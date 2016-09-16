import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
//
public class FillArrays {
	//
	public static void main(String[]args){
		
		int[]array = new int[6];
		int[]array2 = new int[6];
		//
		Arrays.fill(array,1);
		Arrays.fill(array2,1);
		//
		System.out.println(Arrays.equals(array, array2));
		// correct way to make arrays equal 
		System.out.println(array == array2);
		// wrong way
		for (int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}for (int i =0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
