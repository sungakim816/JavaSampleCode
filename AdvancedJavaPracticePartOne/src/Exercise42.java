/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise42 {

	/**
	 * @param args
	 */

	public static void showMonthlyPaymentResult(double initialBalance, double monthlyInterest, double monthlyPayment) {
		double remainingBalance = initialBalance, totalPayment = 0, finalPayment;
		int monthCount = 0;
		while ((remainingBalance - monthlyPayment) >= 0) {
			remainingBalance += (remainingBalance * monthlyInterest);
			remainingBalance -= monthlyPayment;
			totalPayment += monthlyPayment;
			++monthCount;
			System.out.println(
					"Month: " + monthCount + " balance: " + remainingBalance + " total payments: " + totalPayment);
		}
		++monthCount;
		finalPayment = remainingBalance;
		totalPayment += finalPayment;
		System.out.println(
				"Month: " + monthCount + " Final Payment: " + finalPayment + " Total Payment: " + totalPayment);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double initialBalance, monthlyPayment, monthlyInterest;
		System.out.print("Enter initial Balance: ");
		initialBalance = scan.nextDouble();
		System.out.print("Enter monthly Interest(in percent): ");
		monthlyInterest = scan.nextDouble();
		System.out.print("Enter monthly payment: ");
		monthlyPayment = scan.nextDouble();
		monthlyInterest = monthlyInterest / 100;
		System.out.println();
		showMonthlyPaymentResult(initialBalance, monthlyInterest, monthlyPayment);
		scan.close();
	}

}
