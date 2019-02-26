/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class CheckCharge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double checkingAccountBalance, savingAccountBalance, serviceCharge = 0;
		int numChecks = 0;
		System.out.print("Enter Checking Account Balance: ");
		checkingAccountBalance = scan.nextDouble();
		System.out.print("Enter Saving Account Balance: ");
		savingAccountBalance = scan.nextDouble();
		System.out.print("How many checks you wish to write: ");
		numChecks = scan.nextInt();
		if (savingAccountBalance > 1500 || checkingAccountBalance > 1000) {
			serviceCharge = 0.15 * numChecks;
		}
		System.out.printf("Total Service Charge: %.2f", serviceCharge);
		scan.close();
	}

}
