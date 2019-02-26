/**
 * 
 */


import java.util.Scanner;

/**
 * @author Sunga
 *
 */
public class LastChanceGas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tankCapacity, gageReading, milesGallon, remainingGallon;
		System.out.print("Tank Capacity: ");
		tankCapacity = scan.nextInt();
		System.out.print("Cage Reading: ");
		gageReading = scan.nextInt();
		System.out.print("Miles Per Gallon: ");
		milesGallon = scan.nextInt();
		remainingGallon = tankCapacity - (int) ((gageReading / 100.0) * tankCapacity);
		if (remainingGallon * milesGallon >= 200)
			System.out.println("Safe to Proceed ");
		else
			System.out.println("Get Gas");
		scan.close();
	}

}
