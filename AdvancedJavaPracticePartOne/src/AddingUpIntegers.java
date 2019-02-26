/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class AddingUpIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0, numIntegers;
		System.out.print("How many integers will be added: ");
		numIntegers = scan.nextInt();
		for (int i = 0; i < numIntegers; i++) {
			System.out.print("Enter an integer: ");
			sum += scan.nextInt();
		}
		System.out.println("Total sum is " + sum);
		scan.close();
	}

}
