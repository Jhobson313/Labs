import java.util.Scanner;
public class AssessmentQ1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

	    int vowels = 0;
	    int a = 0;
	    int e = 0;
	    int i = 0;
	    int o = 0;
	    int u = 0;
	    
	    String myString;

	    System.out.println("Enter a string.");
	    myString = scan.nextLine();

	    while(vowels <= myString.length()-1)
	    {
	        if(myString.charAt(vowels) == 'a')
	        {
	            a ++;
	        }
	        else if(myString.charAt(vowels) == 'e')
	        {
	            e ++;
	        }
	        else if(myString.charAt(vowels) == 'i')
	        {
	            i ++;
	        }
	        else if(myString.charAt(vowels) == 'o')
	        {
	            o ++;
	        }
	        else if(myString.charAt(vowels) == 'u')
	        {
	            u ++;
	        }
	        else
	        {
	            ;
	        }

	        vowels ++;

	    }
	    System.out.println("Number of a's in string: " + a);
	    System.out.println("Number of e's in string: " + e);
	    System.out.println("Number of i's in string: " + i);
	    System.out.println("Number of o's in string: " + o);
	    System.out.println("Number of u's in string: " + u);
	    
String  str="How many vowels in this string?";   
System.out.println("No. of vowels: " + (str.length() - str.toLowerCase().replaceAll("a|e|i|o|u", "").length()));



	}

	}

