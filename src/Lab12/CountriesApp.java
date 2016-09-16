package Lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menuChoice;
		String yesNo = "y";
		String addCountry = null;

		System.out.println("Welcome to the Countries Maintenance Application!");
		

		CountriesTextFile country = new CountriesTextFile();
		List<String> countryList = new ArrayList<>();
		System.out.println("Enter Country: ");
		addCountry = sc.next();
		
		countryList.add(addCountry);

		country.writeCountryList(countryList);
		}
	}