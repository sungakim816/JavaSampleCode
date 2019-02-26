/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise35 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x;
		int n = 0;
		System.out.print("X^N\n\nEnter X: ");
		x = scan.nextDouble();
		System.out.print("Enter n: ");
		n = scan.nextInt();
		if (n < 0) {
			System.out.println("n must be positive integer");
		} else {
			System.out.println(x + " raised to the power of " + n + " is " + Math.pow(x, n));
		}
		scan.close();
	}

}
