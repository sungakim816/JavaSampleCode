/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class OrderChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
		int boltQuantity, nutQuantity, washerQuantity, totalCost;
		System.out.print("Number of bolts: ");
		boltQuantity = scan.nextInt();
		System.out.print("Number of nuts: ");
		nutQuantity = scan.nextInt();
		System.out.print("Number of washers: ");
		washerQuantity = scan.nextInt();
		totalCost = boltQuantity * boltPrice + nutQuantity * nutPrice + washerQuantity * washerPrice;
		if (nutQuantity != boltQuantity) {
			System.out.println("\nCheck The Order");
		} else {
			System.out.println("\nOrder is OK");
		}
		System.out.println("Total cost: " + totalCost);
		scan.close();
	}

}
