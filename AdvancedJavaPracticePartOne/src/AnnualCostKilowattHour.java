
/**
 * 
 */

import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class AnnualCostKilowattHour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter cost per kilowatt-hour in cents: ");
		double cents = scan.nextDouble();
		System.out.print("Enter kilowatt-hours used per year: ");
		double kilowattHour = scan.nextDouble();
		System.out.printf("Annual cost: %.4f", (cents * kilowattHour / 100));
		scan.close();
	}

}
