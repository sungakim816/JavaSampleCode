/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word;
		System.out.print("Enter a word: ");
		word = scan.nextLine();
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word);
		}
		scan.close();
	}

}
