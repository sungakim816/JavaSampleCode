/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class HarmonicMean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter X: ");
		double x = scan.nextDouble();
		System.out.print("Enter Y: ");
		double y = scan.nextDouble();
		double h = 2.0 / (1.0 / x + 1.0 / y);
		System.out.println("Arithmetic mean: " + (x + y) / 2);
		System.out.println("Harmonic mean: " + h);
		scan.close();
	}

}
