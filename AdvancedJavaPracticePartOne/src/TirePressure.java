/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class TirePressure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rightFrontPressure, leftFrontPressure, rightRearPressure, leftRearPressure;
		System.out.print("Input right front pressure: ");
		rightFrontPressure = scan.nextInt();
		System.out.print("Input left front pressure: ");
		leftFrontPressure = scan.nextInt();
		System.out.print("Input right rear pressure: ");
		rightRearPressure = scan.nextInt();
		System.out.print("Input left rear pressure: ");
		leftRearPressure = scan.nextInt();
		if ((rightFrontPressure == leftFrontPressure) && (rightRearPressure == leftRearPressure)) {
			System.out.println("Inflation is OK.");
		} else {
			System.out.println("Inflation is BAD.");
		}
		scan.close();

	}

}
