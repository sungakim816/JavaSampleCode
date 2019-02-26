/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class Exercise38 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int initialMile, finalMile, gallonOfGas;
		double milesPerGallon;
		System.out.println("Miles Per Gallon Program");
		while (true) {
			System.out.print("Initial mile: ");
			initialMile = scan.nextInt();
			if (initialMile < 0) {
				break;
			}
			System.out.print("Final mile: ");
			finalMile = scan.nextInt();
			System.out.print("Gallons: ");
			gallonOfGas = scan.nextInt();
			milesPerGallon = (finalMile - initialMile + 0.0) / gallonOfGas;
			System.out.println("Miles per Gallon: " + milesPerGallon + "\n");
		}
		System.out.println("Bye.");
		scan.close();
	}

}
