/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String firstWord, secondWord;
		int numDots;
		System.out.print("Enter the first word: ");
		firstWord = scan.nextLine();
		System.out.print("Enter the second word: ");
		secondWord = scan.nextLine();
		numDots = 30 - (firstWord.length() + secondWord.length());
		for (int i = 0; i < numDots; i++) {
			firstWord += ".";
		}
		System.out.println(firstWord + secondWord);
		scan.close();
	}

}
