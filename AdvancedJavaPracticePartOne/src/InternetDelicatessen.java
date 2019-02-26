/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class InternetDelicatessen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String nameOfItem;
		double priceOfItem, totalCost, shippingFee, overnightDeliveryFee = 5;
		int isOvernightDelivery;
		System.out.print("Enter the Item: ");
		nameOfItem = scan.nextLine();
		System.out.print("Enter the price: ");
		priceOfItem = scan.nextDouble();
		System.out.print("Overnight Delivery (0 == no, 1 == yes): ");
		isOvernightDelivery = scan.nextInt();
		if (priceOfItem >= 10) {
			shippingFee = 3;
		} else {
			shippingFee = 2;
		}
		if (isOvernightDelivery == 1) {
			shippingFee += overnightDeliveryFee;
		}
		totalCost = priceOfItem + shippingFee;

		System.out.println("\nInvoice:");
		System.out.println(nameOfItem + " " + priceOfItem);
		System.out.println("shipping " + shippingFee);
		System.out.println("Total Cost " + totalCost);

		scan.close();

	}

}
