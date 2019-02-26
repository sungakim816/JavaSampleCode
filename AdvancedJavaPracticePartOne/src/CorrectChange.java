/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class CorrectChange {

	public static int[] getCorrectChange(int cents) {
		int dollar = cents / 100;
		cents = cents % 100;
		int quarter = cents / 25;
		cents = cents % 25;
		int dime = cents / 10;
		cents = cents % 10;
		int nickel = cents / 5;
		cents = cents % 5;

		return new int[] { dollar, quarter, dime, nickel, cents };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] units = new String[] { "dollar", "quarter", "dime", "nickel", "cent" };
		int cents;
		int[] change;
		System.out.print("Input the change in cents: ");
		cents = scan.nextInt();
		change = getCorrectChange(cents);
		System.out.print("Your change is: ");
		for (int i = 0; i < units.length; i++) {
			if (change[i] < 1)
				continue;
			if (change[i] > 1)
				System.out.print(change[i] + " " + units[i] + "s ");
			else
				System.out.print(change[i] + " " + units[i] + " ");
		}
		scan.close();
	}

}
