/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise40 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double orderWeight = 1, shippingCost = 3;
		double costForExtraPound = 0.25;
		while (true) {
			System.out.print("Weight of order(pounds): ");
			orderWeight = scan.nextInt();
			if (orderWeight < 1) {
				break;
			} else if (orderWeight > 10) {
				shippingCost += (orderWeight - 10) * costForExtraPound;
				System.out.println("Shipping cost: $" + shippingCost);
				shippingCost = 3;
			} else {
				System.out.println("Shipping cost: $" + shippingCost);
			}
		}
		System.out.println("Bye.");
		scan.close();

	}

}
