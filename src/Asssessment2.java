
public class Asssessment2 {

	public static void main(String[] args) {
		
	}
	
	public static String reverse(String word) {
		String flippedWord = "";
		int length = word.length();
		for (int i = length - 1; i >= 0; i--) {
			/**
			 * @param length is how to index the word and print out in reverse using i--
			 * @param charAt is used to locate a string 
			 */
			char letter = word.charAt(i);
			flippedWord = flippedWord + letter;
		}
		return flippedWord;
		}
	

}
