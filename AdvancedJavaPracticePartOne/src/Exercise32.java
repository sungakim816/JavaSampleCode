
/**
 * 
 */

import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;
		double sum = 0;
		System.out.println("sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + .... + 1.0/N");
		System.out.print("Enter N: ");
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			sum += (1.0 / i);
		}
		System.out.println("Sum: " + sum);
		scan.close();
	}
}
