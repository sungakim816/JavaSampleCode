/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class DiscountPrices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int amountInCents, discountedPrice;
		System.out.print("Enter amount of purchases: ");
		amountInCents = scan.nextInt();
		discountedPrice = amountInCents;
		if (amountInCents > 10) {
			discountedPrice = (int) (amountInCents - (amountInCents * 0.1));
		}
		System.out.println("Discounted price: " + discountedPrice);
		scan.close();
	}

}
