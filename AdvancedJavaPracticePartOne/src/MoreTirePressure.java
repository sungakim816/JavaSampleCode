/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class MoreTirePressure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rightFrontPressure, leftFrontPressure, rightRearPressure, leftRearPressure;
		boolean isGoodPressure = true;
		System.out.print("Input right front pressure: ");
		rightFrontPressure = scan.nextInt();
		if (rightFrontPressure < 35 || rightFrontPressure > 45) {
			System.out.println("Warning: pressure is out of range\n");
			isGoodPressure = false;
		}
		System.out.print("Input left front pressure: ");
		leftFrontPressure = scan.nextInt();
		if (leftFrontPressure < 35 || leftFrontPressure > 45) {
			System.out.println("Warning: pressure is out of range\n");
			isGoodPressure = false;
		}
		System.out.print("Input right rear pressure: ");
		rightRearPressure = scan.nextInt();
		if (rightRearPressure < 35 || rightRearPressure > 45) {
			System.out.println("Warning: pressure is out of range\n");
			isGoodPressure = false;
		}
		System.out.print("Input left rear pressure: ");
		leftRearPressure = scan.nextInt();
		if (leftRearPressure < 35 || leftRearPressure > 45) {
			System.out.println("Warning: pressure is out of range\n");
			isGoodPressure = false;
		}

		if ((rightFrontPressure == leftFrontPressure) && (rightRearPressure == leftRearPressure) && isGoodPressure) {
			System.out.println("Inflation is OK.");
		} else {
			System.out.println("Inflation is BAD.");
		}
		scan.close();
	}

}
